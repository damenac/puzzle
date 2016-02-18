package fr.inria.diverse.melange.ui.builder;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.sle.common.utils.ModelUtils;
import fr.inria.diverse.melange.eclipse.EclipseProjectHelper;
import fr.inria.diverse.melange.metamodel.melange.Element;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.Metamodel;
import fr.inria.diverse.melange.metamodel.melange.ModelType;
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace;
import fr.inria.diverse.melange.ui.builder.AbstractBuilder;
import fr.inria.diverse.melange.ui.builder.LanguageVO;
import fr.inria.diverse.melange.ui.vos.AbstractCompositionTreeNode;
import fr.inria.diverse.melange.ui.vos.CompositionGraph;
import fr.inria.diverse.melange.ui.vos.CompositionStatementVO;
import fr.inria.diverse.melange.ui.vos.CompositionTreeLeaf;
import fr.inria.diverse.melange.ui.vos.CompositionTreeNode;
import fr.inria.diverse.puzzle.adl.language.puzzle.Binding;
import fr.inria.diverse.puzzle.adl.language.puzzle.LanguageBinding;
import fr.inria.diverse.puzzle.match.impl.PuzzleMatch;
import fr.inria.diverse.puzzle.match.vo.MatchingDiagnostic;
import fr.inria.diverse.sle.puzzle.merge.impl.PuzzleMerge;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelUtil;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.pde.internal.core.natures.PDE;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Builder for the action: Analyze Family.
 * Loads the input and performs the delegation to the corresponding plug-in.
 * 
 * @author David Mendez-Acuna
 */
@SuppressWarnings("all")
public class LanguageModulesCompositionBuilder extends AbstractBuilder {
  @Inject
  private EclipseProjectHelper eclipseHelper;
  
  private IProject targetProject;
  
  /**
   * Compose the language modules referenced in the melange and puzzle scripts given in the parameters
   */
  public String composeLanguageModules(final Resource puzzleResource, final Resource melangeResource, final IProject project, final IProgressMonitor monitor) {
    try {
      EList<EObject> _contents = puzzleResource.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents);
      final LanguageBinding bindingSpace = ((LanguageBinding) _head);
      EList<EObject> _contents_1 = melangeResource.getContents();
      EObject _head_1 = IterableExtensions.<EObject>head(_contents_1);
      final ModelTypingSpace modelTypingSpace = ((ModelTypingSpace) _head_1);
      EcoreUtil.resolveAll(modelTypingSpace);
      String _name = project.getName();
      String _plus = (_name + ".");
      String _plus_1 = (_plus + "composedLanguage");
      NullProgressMonitor _nullProgressMonitor = new NullProgressMonitor();
      IProject _createEclipseProject = this.eclipseHelper.createEclipseProject(_plus_1, 
        Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(JavaCore.NATURE_ID, PDE.PLUGIN_NATURE)), 
        Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(JavaCore.BUILDER_ID, PDE.MANIFEST_BUILDER_ID, PDE.SCHEMA_BUILDER_ID)), 
        Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("src-gen", "xtend-gen")), 
        Collections.<IProject>unmodifiableList(CollectionLiterals.<IProject>newArrayList()), 
        Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("fr.inria.diverse.k3.al.annotationprocessor.plugin")), 
        Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList()), 
        Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList()), _nullProgressMonitor);
      this.targetProject = _createEclipseProject;
      String answer = "Puzzle diagnostic: \n\n";
      EList<Binding> _binding = bindingSpace.getBinding();
      AbstractCompositionTreeNode compositionTree = this.calculateCompositionTree(_binding, modelTypingSpace);
      LanguageVO composedLanguage = this.evaluateCompositionTree(compositionTree);
      this.serializeEcoreFiles(composedLanguage);
      GenModel gen = this.serializeGenmodelFiles(composedLanguage);
      this.generateCode(gen);
      this.targetProject.refreshLocal(IResource.DEPTH_INFINITE, null);
      return answer;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Computes a composition tree according to a set of composition statements (binding between language modules)
   */
  public AbstractCompositionTreeNode calculateCompositionTree(final List<Binding> statements, final ModelTypingSpace modelTypingSpace) {
    ArrayList<CompositionStatementVO> statementsLeft = new ArrayList<CompositionStatementVO>();
    AbstractCompositionTreeNode compositionTree = null;
    ArrayList<Language> bindedLanguages = new ArrayList<Language>();
    for (final Binding _statement : statements) {
      {
        CompositionStatementVO _compositionStatementVO = new CompositionStatementVO(_statement);
        statementsLeft.add(_compositionStatementVO);
        EList<Element> _elements = modelTypingSpace.getElements();
        final Function1<Element, Boolean> _function = new Function1<Element, Boolean>() {
          @Override
          public Boolean apply(final Element element) {
            boolean _and = false;
            if (!(element instanceof Language)) {
              _and = false;
            } else {
              EList<ModelType> _requires = ((Language) element).getRequires();
              final Function1<ModelType, Boolean> _function = new Function1<ModelType, Boolean>() {
                @Override
                public Boolean apply(final ModelType req) {
                  String _name = req.getName();
                  String _left = _statement.getLeft();
                  return Boolean.valueOf(_name.equals(_left));
                }
              };
              boolean _exists = IterableExtensions.<ModelType>exists(_requires, _function);
              _and = _exists;
            }
            return Boolean.valueOf(_and);
          }
        };
        Element _findFirst = IterableExtensions.<Element>findFirst(_elements, _function);
        final Language requiringLanguage = ((Language) _findFirst);
        boolean _contains = bindedLanguages.contains(requiringLanguage);
        boolean _not = (!_contains);
        if (_not) {
          bindedLanguages.add(requiringLanguage);
        }
        EList<Element> _elements_1 = modelTypingSpace.getElements();
        final Function1<Element, Boolean> _function_1 = new Function1<Element, Boolean>() {
          @Override
          public Boolean apply(final Element element) {
            boolean _and = false;
            boolean _and_1 = false;
            if (!(element instanceof Language)) {
              _and_1 = false;
            } else {
              boolean _notEquals = (!Objects.equal(requiringLanguage, element));
              _and_1 = _notEquals;
            }
            if (!_and_1) {
              _and = false;
            } else {
              EList<ModelType> _implements = ((Language) element).getImplements();
              final Function1<ModelType, Boolean> _function = new Function1<ModelType, Boolean>() {
                @Override
                public Boolean apply(final ModelType impl) {
                  String _name = impl.getName();
                  String _right = _statement.getRight();
                  return Boolean.valueOf(_name.equals(_right));
                }
              };
              boolean _exists = IterableExtensions.<ModelType>exists(_implements, _function);
              _and = _exists;
            }
            return Boolean.valueOf(_and);
          }
        };
        Element _findFirst_1 = IterableExtensions.<Element>findFirst(_elements_1, _function_1);
        final Language providingLanguage = ((Language) _findFirst_1);
        boolean _contains_1 = bindedLanguages.contains(providingLanguage);
        boolean _not_1 = (!_contains_1);
        if (_not_1) {
          bindedLanguages.add(providingLanguage);
        }
      }
    }
    CompositionGraph graph = new CompositionGraph(bindedLanguages, statements, modelTypingSpace);
    for (final Language bindedLanguage : bindedLanguages) {
      boolean _equals = Objects.equal(compositionTree, null);
      if (_equals) {
        CompositionTreeLeaf leaf = new CompositionTreeLeaf(graph, bindedLanguage);
        compositionTree = leaf;
      } else {
        if ((compositionTree instanceof CompositionTreeLeaf)) {
          CompositionTreeLeaf currentLeaf = ((CompositionTreeLeaf) compositionTree);
          CompositionTreeLeaf newLeaf = new CompositionTreeLeaf(graph, bindedLanguage);
          CompositionTreeNode node = new CompositionTreeNode(graph);
          boolean _depends = graph.depends(currentLeaf.language, bindedLanguage);
          if (_depends) {
            node._requiring = currentLeaf;
            node._providing = newLeaf;
          } else {
            node._requiring = newLeaf;
            node._providing = currentLeaf;
          }
          compositionTree = node;
        } else {
          CompositionTreeNode currentNode = ((CompositionTreeNode) compositionTree);
          currentNode.addNode(bindedLanguage);
        }
      }
    }
    return compositionTree;
  }
  
  /**
   * Executes the composition of a set of languages indexed in a composition
   * tree given in the parameter.
   */
  public LanguageVO evaluateCompositionTree(final AbstractCompositionTreeNode tree) {
    if ((tree instanceof CompositionTreeLeaf)) {
      CompositionTreeLeaf leaf = ((CompositionTreeLeaf) tree);
      LanguageVO language = new LanguageVO();
      String _name = leaf.language.getName();
      language.name = _name;
      Metamodel _syntax = leaf.language.getSyntax();
      String _ecoreUri = _syntax.getEcoreUri();
      EPackage _loadEcoreResource = ModelUtils.loadEcoreResource(_ecoreUri);
      language.metamodel = _loadEcoreResource;
      EList<ModelType> _requires = leaf.language.getRequires();
      int _size = _requires.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        EList<ModelType> _requires_1 = leaf.language.getRequires();
        ModelType _get = _requires_1.get(0);
        String _ecoreUri_1 = ((ModelType) _get).getEcoreUri();
        EPackage _loadEcoreResource_1 = ModelUtils.loadEcoreResource(_ecoreUri_1);
        language.requiredInterface = _loadEcoreResource_1;
      }
      EList<ModelType> _implements = leaf.language.getImplements();
      int _size_1 = _implements.size();
      boolean _greaterThan_1 = (_size_1 > 0);
      if (_greaterThan_1) {
        EList<ModelType> _implements_1 = leaf.language.getImplements();
        ModelType _get_1 = _implements_1.get(0);
        String _ecoreUri_2 = ((ModelType) _get_1).getEcoreUri();
        EPackage _loadEcoreResource_2 = ModelUtils.loadEcoreResource(_ecoreUri_2);
        language.providedInterface = _loadEcoreResource_2;
      }
      return language;
    } else {
      if ((tree instanceof CompositionTreeNode)) {
        CompositionTreeNode compositionNode = ((CompositionTreeNode) tree);
        LanguageVO requiringLanguage = this.evaluateCompositionTree(compositionNode._requiring);
        LanguageVO providingLanguage = this.evaluateCompositionTree(compositionNode._providing);
        PuzzleMatch _instance = PuzzleMatch.getInstance();
        final MatchingDiagnostic comparison = _instance.match(requiringLanguage.metamodel, providingLanguage.metamodel);
        PuzzleMerge _instance_1 = PuzzleMerge.getInstance();
        EPackage recalculatedRequiredInterface = _instance_1.recalculateRequiredInterface(requiringLanguage.requiredInterface, comparison, "merged", providingLanguage.requiredInterface);
        PuzzleMerge _instance_2 = PuzzleMerge.getInstance();
        final EPackage mergedPackage = _instance_2.mergeAbstractSyntax(providingLanguage.metamodel, providingLanguage.providedInterface, 
          requiringLanguage.metamodel, requiringLanguage.requiredInterface, comparison, recalculatedRequiredInterface, "CompleteDSLPckg");
        LanguageVO mergedLanguage = new LanguageVO();
        mergedLanguage.name = "CompleteDSL";
        mergedLanguage.mergedPackage = "CompleteDSLPckg";
        mergedLanguage.metamodel = mergedPackage;
        mergedLanguage.requiredInterface = recalculatedRequiredInterface;
        return mergedLanguage;
      } else {
        return null;
      }
    }
  }
  
  /**
   * Serializes the .ecore files corresponding to the language in the parameter
   * A language is composed of three different .ecore files: the metamodel, the provided interface and the required interface.
   * 
   * @param language
   * 		The value object containing the information of the language whose .ecore files will be serialized.
   */
  public void serializeEcoreFiles(final LanguageVO language) {
    IProject _project = this.targetProject.getProject();
    IPath _location = _project.getLocation();
    String mergedProjectName = _location.toString();
    boolean _notEquals = (!Objects.equal(language.providedInterface, null));
    if (_notEquals) {
      String providedInterfaceMergedLocation = (((mergedProjectName + 
        "/composition-gen/") + language.name) + "-Provided.ecore");
      ModelUtils.saveEcoreFile(providedInterfaceMergedLocation, language.providedInterface);
    }
    boolean _notEquals_1 = (!Objects.equal(language.providedInterface, null));
    if (_notEquals_1) {
      String providedInterfaceMergedLocation_1 = (((mergedProjectName + 
        "/composition-gen/") + language.name) + "MT.ecore");
      ModelUtils.saveEcoreFile(providedInterfaceMergedLocation_1, language.providedInterface);
    }
    boolean _notEquals_2 = (!Objects.equal(language.requiredInterface, null));
    if (_notEquals_2) {
      String requiredInterfaceMergedLocation = (((mergedProjectName + 
        "/composition-gen/") + language.name) + "-Required.ecore");
      EList<EClassifier> _eClassifiers = language.requiredInterface.getEClassifiers();
      String _plus = ("serializeEcoreFiles.recalculatedRequiredInterface: " + _eClassifiers);
      InputOutput.<String>println(_plus);
      ModelUtils.saveEcoreFile(requiredInterfaceMergedLocation, language.requiredInterface);
    }
    boolean _notEquals_3 = (!Objects.equal(language.metamodel, null));
    if (_notEquals_3) {
      String metamodelMergedLocation = (((mergedProjectName + 
        "/composition-gen/") + language.name) + ".ecore");
      language.metamodelSerializationPath = metamodelMergedLocation;
      ModelUtils.saveEcoreFile(metamodelMergedLocation, language.metamodel);
    }
  }
  
  /**
   * Serializes the .genmodel file corresponding to the language in the parameter.
   * This genmodel file contains the packages of the metamodel and the required interface if any.
   * 
   * TODO: Throw an exception where the metamodel serialization path is null. That is an error!
   * 
   * @param language
   * 			The value object containing the information of the language whose .genmodel file will be serialized.
   */
  public GenModel serializeGenmodelFiles(final LanguageVO language) {
    try {
      boolean _notEquals = (!Objects.equal(language.metamodelSerializationPath, null));
      if (_notEquals) {
        IProject _project = this.targetProject.getProject();
        IPath _location = _project.getLocation();
        String mergedProjectName = _location.toString();
        String genmodelMetamodelMergedLocation = (((mergedProjectName + 
          "/composition-gen/") + language.name) + ".genmodel");
        IProject _project_1 = this.targetProject.getProject();
        String _name = _project_1.getName();
        return this.generateGenmodelFile(language.metamodel, language.metamodelSerializationPath, genmodelMetamodelMergedLocation, _name, 
          language.name, language.mergedPackage);
      }
      return null;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Generates the corresponding GenModel file for an ecore package in the parameter
   * @param ePackage
   * @throws IOException
   */
  private GenModel generateGenmodelFile(final EPackage rootPackage, final String ecoreLocation, final String genModelLocation, final String projectName, final String languageName, final String basePackage) throws IOException {
    GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
    genModel.setComplianceLevel(GenJDKLevel.JDK80_LITERAL);
    genModel.setEditDirectory((("/" + projectName) + ".edit/src"));
    genModel.setEditPluginID((projectName + ".edit"));
    genModel.setEditorDirectory((("/" + projectName) + ".editor/src"));
    genModel.setEditorPluginID((projectName + ".editor"));
    genModel.setModelDirectory((("/" + projectName) + "/src-gen"));
    genModel.setModelPluginID(projectName);
    genModel.setOperationReflection(true);
    genModel.setTestsDirectory((("/" + projectName) + ".tests/src"));
    genModel.setTestsPluginID((projectName + ".tests"));
    EList<String> _foreignModel = genModel.getForeignModel();
    Path _path = new Path(ecoreLocation);
    String _lastSegment = _path.lastSegment();
    _foreignModel.add(_lastSegment);
    genModel.setModelName(languageName);
    genModel.setRootExtendsInterface("org.eclipse.emf.ecore.EObject");
    Set<EPackage> _singleton = Collections.<EPackage>singleton(rootPackage);
    genModel.initialize(_singleton);
    genModel.setCanGenerate(true);
    EList<GenPackage> _genPackages = genModel.getGenPackages();
    GenPackage _get = _genPackages.get(0);
    GenPackage genPackage = ((GenPackage) _get);
    String _nsPrefix = rootPackage.getNsPrefix();
    char _charAt = _nsPrefix.charAt(0);
    String _string = Character.valueOf(_charAt).toString();
    String _upperCase = _string.toUpperCase();
    String _nsPrefix_1 = rootPackage.getNsPrefix();
    String _nsPrefix_2 = rootPackage.getNsPrefix();
    int _length = _nsPrefix_2.length();
    String _substring = _nsPrefix_1.substring(1, _length);
    String genModelPrefix = (_upperCase + _substring);
    genPackage.setPrefix(genModelPrefix);
    URI genModelURI = URI.createFileURI(genModelLocation);
    XMIResourceImpl genModelResource = new XMIResourceImpl(genModelURI);
    EList<EObject> _contents = genModelResource.getContents();
    _contents.add(genModel);
    genModelResource.save(Collections.EMPTY_MAP);
    genModel.reconcile();
    genModel.setCanGenerate(true);
    genModel.setValidateModel(true);
    return genModel;
  }
  
  public void generateCode(final GenModel genModel) {
    genModel.reconcile();
    genModel.setCanGenerate(true);
    genModel.setValidateModel(true);
    final Generator generator = GenModelUtil.createGenerator(genModel);
    BasicMonitor.Printing _printing = new BasicMonitor.Printing(System.out);
    generator.generate(genModel, 
      GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, _printing);
  }
}
