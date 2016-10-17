package fr.inria.diverse.melange.ui.builder;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import fr.inria.diverse.k3.sle.common.utils.ModelUtils;
import fr.inria.diverse.melange.metamodel.melange.Aspect;
import fr.inria.diverse.melange.metamodel.melange.Element;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.Metamodel;
import fr.inria.diverse.melange.metamodel.melange.ModelType;
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace;
import fr.inria.diverse.melange.ui.builder.AbstractBuilder;
import fr.inria.diverse.melange.ui.vos.AbstractCompositionTreeNode;
import fr.inria.diverse.melange.ui.vos.CompositionGraph;
import fr.inria.diverse.melange.ui.vos.CompositionStatementVO;
import fr.inria.diverse.melange.ui.vos.CompositionTreeLeaf;
import fr.inria.diverse.melange.ui.vos.CompositionTreeNode;
import fr.inria.diverse.melange.ui.vos.LanguageVO;
import fr.inria.diverse.puzzle.engine.AbstractSyntaxCompositionEngine;
import fr.inria.diverse.puzzle.engine.SemanticsCompositionEngine;
import fr.inria.diverse.puzzle.language.binding.Binding;
import fr.inria.diverse.puzzle.language.binding.LanguageBinding;
import fr.inria.diverse.puzzle.match.impl.PuzzleMatch;
import fr.inria.diverse.puzzle.match.vo.MatchingDiagnostic;
import fr.inria.diverse.puzzle.match.vo.MatchingDiagnosticItem;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import javax.inject.Inject;
import org.autorefactor.ui.OverlappingAspectsVO;
import org.autorefactor.ui.OverridingAspectsVO;
import org.autorefactor.ui.RefactoringPatternVO;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
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
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.pde.internal.core.natures.PDE;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Builder for the action: Analyze Family.
 * Loads the input and performs the delegation to the corresponding plug-in.
 * 
 * @author David Mendez-Acuna
 */
@SuppressWarnings("all")
public class ComposeLanguageModulesBuilder extends AbstractBuilder {
  @Inject
  @Extension
  private AbstractSyntaxCompositionEngine _abstractSyntaxCompositionEngine;
  
  @Inject
  @Extension
  private SemanticsCompositionEngine _semanticsCompositionEngine;
  
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
      IProject _createEclipseProject = this.createEclipseProject(_plus_1, 
        Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(JavaCore.NATURE_ID, PDE.PLUGIN_NATURE)), 
        Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(JavaCore.BUILDER_ID, PDE.MANIFEST_BUILDER_ID, PDE.SCHEMA_BUILDER_ID)), 
        Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("src-gen", "xtend-gen")), 
        Collections.<IProject>unmodifiableList(CollectionLiterals.<IProject>newArrayList()), 
        Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("fr.inria.diverse.k3.al.annotationprocessor.plugin", "fr.inria.diverse.puzzle.annotations")), 
        Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("CompleteDSL")), 
        Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList()), _nullProgressMonitor);
      this.targetProject = _createEclipseProject;
      String answer = "Puzzle diagnostic: \n\n";
      ArrayList<OverlappingAspectsVO> overlappingAspects = new ArrayList<OverlappingAspectsVO>();
      ArrayList<OverridingAspectsVO> overridingAspects = new ArrayList<OverridingAspectsVO>();
      ArrayList<RefactoringPatternVO> refactoringPatterns = new ArrayList<RefactoringPatternVO>();
      EList<Binding> _binding = bindingSpace.getBinding();
      AbstractCompositionTreeNode compositionTree = this.calculateCompositionTree(_binding, modelTypingSpace);
      LanguageVO composedLanguage = this.evaluateCompositionTree(compositionTree, overlappingAspects, overridingAspects, refactoringPatterns);
      this.serializeEcoreFiles(composedLanguage);
      GenModel gen = this.serializeGenmodelFiles(composedLanguage);
      this.generateCode(gen);
      this._semanticsCompositionEngine.executeRefactorings(overlappingAspects, overridingAspects, refactoringPatterns);
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
                  boolean _and = false;
                  String _name = req.getName();
                  String _left = _statement.getLeft();
                  boolean _equals = _name.equals(_left);
                  if (!_equals) {
                    _and = false;
                  } else {
                    String _name_1 = req.getName();
                    String _name_2 = ((Language) element).getName();
                    boolean _contains = _name_1.contains(_name_2);
                    _and = _contains;
                  }
                  return Boolean.valueOf(_and);
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
                  boolean _and = false;
                  String _name = impl.getName();
                  String _right = _statement.getRight();
                  boolean _equals = _name.equals(_right);
                  if (!_equals) {
                    _and = false;
                  } else {
                    String _name_1 = impl.getName();
                    String _name_2 = ((Language) element).getName();
                    boolean _contains = _name_1.contains(_name_2);
                    _and = _contains;
                  }
                  return Boolean.valueOf(_and);
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
        AbstractCompositionTreeNode _addNode = compositionTree.addNode(bindedLanguage);
        compositionTree = _addNode;
      }
    }
    return compositionTree;
  }
  
  /**
   * Executes the composition of a set of languages indexed in a composition
   * tree given in the parameter.
   */
  public LanguageVO evaluateCompositionTree(final AbstractCompositionTreeNode tree, final ArrayList<OverlappingAspectsVO> overlappingAspects, final ArrayList<OverridingAspectsVO> overridingAspects, final ArrayList<RefactoringPatternVO> refactoringPatterns) {
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
      EList<Aspect> _semantics = leaf.language.getSemantics();
      boolean _notEquals = (!Objects.equal(_semantics, null));
      if (_notEquals) {
        EList<Aspect> _semantics_1 = leaf.language.getSemantics();
        for (final Aspect _aspect : _semantics_1) {
          language.aspects.add(_aspect);
        }
      }
      return language;
    } else {
      if ((tree instanceof CompositionTreeNode)) {
        CompositionTreeNode compositionNode = ((CompositionTreeNode) tree);
        LanguageVO requiringLanguage = this.evaluateCompositionTree(compositionNode._requiring, overlappingAspects, overridingAspects, refactoringPatterns);
        LanguageVO providingLanguage = this.evaluateCompositionTree(compositionNode._providing, overlappingAspects, overridingAspects, refactoringPatterns);
        PuzzleMatch _instance = PuzzleMatch.getInstance();
        final MatchingDiagnostic comparison = _instance.match(requiringLanguage.requiredInterface, providingLanguage.providedInterface);
        InputOutput.<String>println("Printing match");
        List<MatchingDiagnosticItem> _items = comparison.getItems();
        for (final MatchingDiagnosticItem item : _items) {
          EObject _left = item.getLeft();
          String _plus = ("MatchingDiagnosticItem: " + _left);
          String _plus_1 = (_plus + " -> ");
          EObject _right = item.getRight();
          String _plus_2 = (_plus_1 + _right);
          InputOutput.<String>println(_plus_2);
        }
        LanguageVO mergedLanguage = new LanguageVO();
        this._abstractSyntaxCompositionEngine.launchAbstractSyntaxComposition(mergedLanguage, requiringLanguage, providingLanguage, comparison);
        this._semanticsCompositionEngine.launchSemanticsComposition(mergedLanguage, requiringLanguage, providingLanguage, comparison, overlappingAspects, overridingAspects, refactoringPatterns, this.targetProject);
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
  
  /**
   * Generates the code associated to a generated model given in the parameter
   */
  public void generateCode(final GenModel genModel) {
    genModel.reconcile();
    genModel.setCanGenerate(true);
    genModel.setValidateModel(true);
    final Generator generator = GenModelUtil.createGenerator(genModel);
    BasicMonitor.Printing _printing = new BasicMonitor.Printing(System.out);
    generator.generate(genModel, 
      GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, _printing);
  }
  
  /**
   * Wololo, wololo wololo.
   */
  private IProject createEclipseProject(final String name, final Iterable<String> natures, final Iterable<String> builders, final Iterable<String> srcFolders, final Iterable<IProject> referencedProjects, final Iterable<String> requiredBundles, final Iterable<String> exportedPackages, final Iterable<String> extensions, final IProgressMonitor monitor) {
    try {
      monitor.beginTask("", 10);
      monitor.subTask(("Creating project " + name));
      final IWorkspace workspace = ResourcesPlugin.getWorkspace();
      IWorkspaceRoot _root = workspace.getRoot();
      final IProject project = _root.getProject(name);
      IPath previousProjectLocation = null;
      boolean _exists = project.exists();
      if (_exists) {
        IPath _location = project.getLocation();
        previousProjectLocation = _location;
        SubProgressMonitor _subProgressMonitor = new SubProgressMonitor(monitor, 1);
        project.delete(true, true, _subProgressMonitor);
      }
      final IJavaProject javaProject = JavaCore.create(project);
      final IProjectDescription description = workspace.newProjectDescription(name);
      description.setLocation(previousProjectLocation);
      SubProgressMonitor _subProgressMonitor_1 = new SubProgressMonitor(monitor, 1);
      project.create(description, _subProgressMonitor_1);
      final ArrayList<IClasspathEntry> classpathEntries = CollectionLiterals.<IClasspathEntry>newArrayList();
      boolean _isEmpty = IterableExtensions.isEmpty(referencedProjects);
      boolean _not = (!_isEmpty);
      if (_not) {
        description.setReferencedProjects(((IProject[])Conversions.unwrapArray(referencedProjects, IProject.class)));
        final Function1<IProject, IClasspathEntry> _function = new Function1<IProject, IClasspathEntry>() {
          @Override
          public IClasspathEntry apply(final IProject it) {
            IPath _fullPath = it.getFullPath();
            return JavaCore.newProjectEntry(_fullPath);
          }
        };
        Iterable<IClasspathEntry> _map = IterableExtensions.<IProject, IClasspathEntry>map(referencedProjects, _function);
        Iterables.<IClasspathEntry>addAll(classpathEntries, _map);
      }
      description.setNatureIds(((String[])Conversions.unwrapArray(natures, String.class)));
      final Function1<String, ICommand> _function_1 = new Function1<String, ICommand>() {
        @Override
        public ICommand apply(final String buildName) {
          ICommand _newCommand = description.newCommand();
          final Procedure1<ICommand> _function = new Procedure1<ICommand>() {
            @Override
            public void apply(final ICommand it) {
              it.setBuilderName(buildName);
            }
          };
          return ObjectExtensions.<ICommand>operator_doubleArrow(_newCommand, _function);
        }
      };
      Iterable<ICommand> _map_1 = IterableExtensions.<String, ICommand>map(builders, _function_1);
      description.setBuildSpec(((ICommand[])Conversions.unwrapArray(_map_1, ICommand.class)));
      SubProgressMonitor _subProgressMonitor_2 = new SubProgressMonitor(monitor, 1);
      project.open(_subProgressMonitor_2);
      SubProgressMonitor _subProgressMonitor_3 = new SubProgressMonitor(monitor, 1);
      project.setDescription(description, _subProgressMonitor_3);
      final Consumer<String> _function_2 = new Consumer<String>() {
        @Override
        public void accept(final String src) {
          final IFolder container = project.getFolder(src);
          try {
            boolean _exists = container.exists();
            boolean _not = (!_exists);
            if (_not) {
              SubProgressMonitor _subProgressMonitor = new SubProgressMonitor(monitor, 1);
              container.create(false, true, _subProgressMonitor);
            }
            IPath _fullPath = container.getFullPath();
            IClasspathEntry _newSourceEntry = JavaCore.newSourceEntry(_fullPath);
            classpathEntries.add(0, _newSourceEntry);
          } catch (final Throwable _t) {
            if (_t instanceof CoreException) {
              final CoreException e = (CoreException)_t;
              System.out.println("Couldn\'t update project classpath");
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        }
      };
      srcFolders.forEach(_function_2);
      Path _path = new Path("org.eclipse.jdt.launching.JRE_CONTAINER");
      IClasspathEntry _newContainerEntry = JavaCore.newContainerEntry(_path);
      classpathEntries.add(_newContainerEntry);
      Path _path_1 = new Path("org.eclipse.pde.core.requiredPlugins");
      IClasspathEntry _newContainerEntry_1 = JavaCore.newContainerEntry(_path_1);
      classpathEntries.add(_newContainerEntry_1);
      final IFolder binFolder = project.getFolder("bin");
      SubProgressMonitor _subProgressMonitor_4 = new SubProgressMonitor(monitor, 1);
      binFolder.create(false, true, _subProgressMonitor_4);
      SubProgressMonitor _subProgressMonitor_5 = new SubProgressMonitor(monitor, 1);
      javaProject.setRawClasspath(((IClasspathEntry[])Conversions.unwrapArray(classpathEntries, IClasspathEntry.class)), _subProgressMonitor_5);
      IPath _fullPath = binFolder.getFullPath();
      SubProgressMonitor _subProgressMonitor_6 = new SubProgressMonitor(monitor, 1);
      javaProject.setOutputLocation(_fullPath, _subProgressMonitor_6);
      this.createManifest(name, requiredBundles, exportedPackages, monitor, project);
      this.createPluginXml(project, extensions, monitor);
      this.createBuildProperties(project, srcFolders, monitor);
      return project;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        System.out.println("Unexpected exception while generating new project");
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return null;
  }
  
  private void createManifest(final String name, final Iterable<String> requiredBundles, final Iterable<String> exportedPackages, final IProgressMonitor monitor, final IProject project) throws CoreException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Manifest-Version: 1.0");
    _builder.newLine();
    _builder.append("Bundle-ManifestVersion: 2");
    _builder.newLine();
    _builder.append("Bundle-Name: ");
    _builder.append(name, "");
    _builder.newLineIfNotEmpty();
    _builder.append("Bundle-SymbolicName: ");
    _builder.append(name, "");
    _builder.append(";singleton:=true");
    _builder.newLineIfNotEmpty();
    _builder.append("Bundle-Version: 0.1.0");
    _builder.newLine();
    {
      boolean _isEmpty = IterableExtensions.isEmpty(requiredBundles);
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("Require-Bundle: ");
        {
          boolean _hasElements = false;
          for(final String b : requiredBundles) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",\n  ", "");
            }
            _builder.append(b, "");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isEmpty_1 = IterableExtensions.isEmpty(exportedPackages);
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("Export-Package: ");
        {
          boolean _hasElements_1 = false;
          for(final String p : exportedPackages) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",\n  ", "");
            }
            _builder.append(p, "");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("Bundle-RequiredExecutionEnvironment: JavaSE-1.7");
    _builder.newLine();
    final String content = _builder.toString();
    final IFolder metaInf = project.getFolder("META-INF");
    SubProgressMonitor _subProgressMonitor = new SubProgressMonitor(monitor, 1);
    metaInf.create(false, true, _subProgressMonitor);
    this.createFile("MANIFEST.MF", metaInf, content, monitor);
  }
  
  private void createPluginXml(final IProject project, final Iterable<String> extensions, final IProgressMonitor monitor) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<?eclipse version=\"3.0\"?>");
    _builder.newLine();
    _builder.append("<plugin>");
    _builder.newLine();
    {
      for(final String e : extensions) {
        _builder.append(e, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</plugin>");
    _builder.newLine();
    final String content = _builder.toString();
    this.createFile("plugin.xml", project, content, monitor);
  }
  
  private void createBuildProperties(final IProject project, final Iterable<String> srcFolders, final IProgressMonitor monitor) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("source.. = ");
    {
      boolean _hasElements = false;
      for(final String f : srcFolders) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",\\n  ", "");
        }
        _builder.append(f, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("bin.includes = META-INF/,\\");
    _builder.newLine();
    _builder.append("  ");
    _builder.append(".");
    _builder.newLine();
    final String content = _builder.toString();
    this.createFile("build.properties", project, content, monitor);
  }
  
  private IFile createFile(final String name, final IContainer container, final String content, final IProgressMonitor monitor) {
    Path _path = new Path(name);
    final IFile f = container.getFile(_path);
    InputStream stream = null;
    try {
      String _charset = f.getCharset();
      byte[] _bytes = content.getBytes(_charset);
      ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
      stream = _byteArrayInputStream;
      boolean _exists = f.exists();
      if (_exists) {
        f.setContents(stream, true, true, monitor);
      } else {
        f.create(stream, true, monitor);
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        System.out.println("Error while creating new IFile");
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    monitor.worked(1);
    return f;
  }
}
