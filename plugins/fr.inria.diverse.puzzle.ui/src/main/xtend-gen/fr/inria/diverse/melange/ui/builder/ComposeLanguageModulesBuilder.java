package fr.inria.diverse.melange.ui.builder;

import com.google.common.base.Objects;
import com.google.inject.Provider;
import fr.inria.diverse.commons.asm.shade.DirectoryShader;
import fr.inria.diverse.commons.asm.shade.ShadeRequest;
import fr.inria.diverse.commons.asm.shade.filter.Filter;
import fr.inria.diverse.commons.asm.shade.relocation.Relocator;
import fr.inria.diverse.commons.asm.shade.relocation.SimpleRelocator;
import fr.inria.diverse.commons.asm.shade.resource.ResourceTransformer;
import fr.inria.diverse.k3.sle.common.utils.ModelUtils;
import fr.inria.diverse.melange.eclipse.EclipseProjectHelper;
import fr.inria.diverse.melange.metamodel.melange.Aspect;
import fr.inria.diverse.melange.metamodel.melange.Element;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.Metamodel;
import fr.inria.diverse.melange.metamodel.melange.ModelType;
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace;
import fr.inria.diverse.melange.ui.builder.AbstractBuilder;
import fr.inria.diverse.melange.ui.builder.EcoreQueries;
import fr.inria.diverse.melange.ui.builder.PuzzleXbaseInterpreter;
import fr.inria.diverse.melange.ui.builder.RefactoringPatternsBuilder;
import fr.inria.diverse.melange.ui.vos.AbstractCompositionTreeNode;
import fr.inria.diverse.melange.ui.vos.CompositionGraph;
import fr.inria.diverse.melange.ui.vos.CompositionStatementVO;
import fr.inria.diverse.melange.ui.vos.CompositionTreeLeaf;
import fr.inria.diverse.melange.ui.vos.CompositionTreeNode;
import fr.inria.diverse.melange.ui.vos.LanguageVO;
import fr.inria.diverse.puzzle.language.binding.Binding;
import fr.inria.diverse.puzzle.language.binding.LanguageBinding;
import fr.inria.diverse.puzzle.match.impl.PuzzleMatch;
import fr.inria.diverse.puzzle.match.vo.MatchingDiagnostic;
import fr.inria.diverse.puzzle.match.vo.MatchingDiagnosticItem;
import fr.inria.diverse.sle.puzzle.merge.impl.PuzzleMerge;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import org.autorefactor.ui.OverlappingAspectsVO;
import org.autorefactor.ui.OverridingAspectsVO;
import org.autorefactor.ui.RefactoringPatternVO;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.CoreException;
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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.pde.internal.core.natures.PDE;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtend.core.xtend.XtendFunction;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtend.core.xtend.XtendTypeDeclaration;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
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
  private EclipseProjectHelper eclipseHelper;
  
  @Inject
  @Extension
  private EcoreQueries _ecoreQueries;
  
  @Inject
  @Extension
  private PuzzleXbaseInterpreter puzzleXbaseInterpreter;
  
  @Inject
  private Provider<IEvaluationContext> contextProvider;
  
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
      ArrayList<OverlappingAspectsVO> overlappingAspects = new ArrayList<OverlappingAspectsVO>();
      ArrayList<OverridingAspectsVO> overridingAspects = new ArrayList<OverridingAspectsVO>();
      ArrayList<RefactoringPatternVO> refactoringPatterns = new ArrayList<RefactoringPatternVO>();
      EList<Binding> _binding = bindingSpace.getBinding();
      AbstractCompositionTreeNode compositionTree = this.calculateCompositionTree(_binding, modelTypingSpace);
      LanguageVO composedLanguage = this.evaluateCompositionTree(compositionTree, overlappingAspects, overridingAspects, refactoringPatterns);
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
        final MatchingDiagnostic comparison = _instance.match(requiringLanguage.metamodel, providingLanguage.metamodel);
        LanguageVO mergedLanguage = new LanguageVO();
        this.launchAbstractSyntaxComposition(mergedLanguage, requiringLanguage, providingLanguage, comparison);
        this.launchSemanticsComposition(mergedLanguage, requiringLanguage, providingLanguage, comparison, overlappingAspects, overridingAspects, refactoringPatterns);
        return mergedLanguage;
      } else {
        return null;
      }
    }
  }
  
  /**
   * Executes the composition of the abstract syntax of the languages in the parameters.
   */
  public void launchAbstractSyntaxComposition(final LanguageVO mergedLanguage, final LanguageVO requiringLanguage, final LanguageVO providingLanguage, final MatchingDiagnostic comparison) {
    PuzzleMerge _instance = PuzzleMerge.getInstance();
    EPackage recalculatedRequiredInterface = _instance.recalculateRequiredInterface(requiringLanguage.requiredInterface, comparison, "merged", providingLanguage.requiredInterface);
    PuzzleMerge _instance_1 = PuzzleMerge.getInstance();
    final EPackage mergedPackage = _instance_1.mergeAbstractSyntax(providingLanguage.metamodel, providingLanguage.providedInterface, 
      requiringLanguage.metamodel, requiringLanguage.requiredInterface, comparison, recalculatedRequiredInterface, "CompleteDSLPckg");
    PuzzleMerge _instance_2 = PuzzleMerge.getInstance();
    EPackage recalculatedProvidedInterface = _instance_2.recalculateProvidedInterface(requiringLanguage.providedInterface, providingLanguage.providedInterface);
    mergedLanguage.name = "CompleteDSL";
    mergedLanguage.mergedPackage = "CompleteDSLPckg";
    mergedLanguage.metamodel = mergedPackage;
    mergedLanguage.requiredInterface = recalculatedRequiredInterface;
    mergedLanguage.providedInterface = recalculatedProvidedInterface;
  }
  
  /**
   * Executes the composition of the semantics of the languages in the parameters.
   */
  public void launchSemanticsComposition(final LanguageVO mergedLanguage, final LanguageVO requiringLanguage, final LanguageVO providingLanguage, final MatchingDiagnostic comparison, final ArrayList<OverlappingAspectsVO> overlappingAspects, final ArrayList<OverridingAspectsVO> overridingAspects, final ArrayList<RefactoringPatternVO> refactoringPatterns) {
    try {
      InputOutput.<String>println("launchSemanticsComposition");
      for (final Aspect _providingAspect : providingLanguage.aspects) {
        mergedLanguage.aspects.add(_providingAspect);
      }
      for (final Aspect _requiringAspect : requiringLanguage.aspects) {
        {
          boolean repeated = false;
          JvmTypeReference _aspectTypeRef = _requiringAspect.getAspectTypeRef();
          String _qualifiedName = _aspectTypeRef.getQualifiedName();
          int _lastIndexOf = _qualifiedName.lastIndexOf(".");
          boolean _notEquals = (_lastIndexOf != (-1));
          if (_notEquals) {
            EClass _aspectedClass = _requiringAspect.getAspectedClass();
            String requiringAspectClassName = _aspectedClass.getName();
            for (final Aspect _providingAspect_1 : providingLanguage.aspects) {
              JvmTypeReference _aspectTypeRef_1 = _providingAspect_1.getAspectTypeRef();
              String _qualifiedName_1 = _aspectTypeRef_1.getQualifiedName();
              int _lastIndexOf_1 = _qualifiedName_1.lastIndexOf(".");
              boolean _notEquals_1 = (_lastIndexOf_1 != (-1));
              if (_notEquals_1) {
                EClass _aspectedClass_1 = _providingAspect_1.getAspectedClass();
                String providingAspectedClassName = _aspectedClass_1.getName();
                boolean _equals = requiringAspectClassName.equals(providingAspectedClassName);
                if (_equals) {
                  repeated = true;
                  InputOutput.<String>println(("Overlapping aspect: " + providingAspectedClassName));
                  final OverlappingAspectsVO overlappingAspect = new OverlappingAspectsVO(_providingAspect_1, providingAspectedClassName, _requiringAspect, requiringAspectClassName);
                  JvmTypeReference _aspectTypeRef_2 = _providingAspect_1.getAspectTypeRef();
                  String _identifier = _aspectTypeRef_2.getIdentifier();
                  String _replace = _identifier.replace(".", "/");
                  String _plus = (_replace + ".java");
                  overlappingAspect.rightFile = _plus;
                  JvmTypeReference _aspectTypeRef_3 = _requiringAspect.getAspectTypeRef();
                  String _identifier_1 = _aspectTypeRef_3.getIdentifier();
                  String _replace_1 = _identifier_1.replace(".", "/");
                  String _plus_1 = (_replace_1 + ".java");
                  overlappingAspect.leftFile = _plus_1;
                  overlappingAspects.add(overlappingAspect);
                }
              }
            }
            for (final Aspect _providingAspect_2 : providingLanguage.aspects) {
              JvmTypeReference _aspectTypeRef_4 = _providingAspect_2.getAspectTypeRef();
              String _qualifiedName_2 = _aspectTypeRef_4.getQualifiedName();
              int _lastIndexOf_2 = _qualifiedName_2.lastIndexOf(".");
              boolean _notEquals_2 = (_lastIndexOf_2 != (-1));
              if (_notEquals_2) {
                EClass _aspectedClass_2 = _providingAspect_2.getAspectedClass();
                final String providingAspectedClassName_1 = _aspectedClass_2.getName();
                boolean _and = false;
                EClass _aspectedClass_3 = _requiringAspect.getAspectedClass();
                boolean _notEquals_3 = (!Objects.equal(_aspectedClass_3, null));
                if (!_notEquals_3) {
                  _and = false;
                } else {
                  EClass _aspectedClass_4 = _requiringAspect.getAspectedClass();
                  EList<EClass> _eSuperTypes = _aspectedClass_4.getESuperTypes();
                  final Function1<EClass, Boolean> _function = new Function1<EClass, Boolean>() {
                    @Override
                    public Boolean apply(final EClass _superType) {
                      String _name = _superType.getName();
                      return Boolean.valueOf(_name.equals(providingAspectedClassName_1));
                    }
                  };
                  Iterable<EClass> _filter = IterableExtensions.<EClass>filter(_eSuperTypes, _function);
                  boolean _isEmpty = IterableExtensions.isEmpty(_filter);
                  boolean _not = (!_isEmpty);
                  _and = _not;
                }
                if (_and) {
                  final OverridingAspectsVO overridingAspect = new OverridingAspectsVO(_providingAspect_2, providingAspectedClassName_1, _requiringAspect, requiringAspectClassName);
                  JvmTypeReference _aspectTypeRef_5 = _providingAspect_2.getAspectTypeRef();
                  String _identifier_2 = _aspectTypeRef_5.getIdentifier();
                  String _replace_2 = _identifier_2.replace(".", "/");
                  String _plus_2 = (_replace_2 + ".java");
                  overridingAspect.baseFile = _plus_2;
                  JvmTypeReference _aspectTypeRef_6 = _requiringAspect.getAspectTypeRef();
                  String _identifier_3 = _aspectTypeRef_6.getIdentifier();
                  String _replace_3 = _identifier_3.replace(".", "/");
                  String _plus_3 = (_replace_3 + ".java");
                  overridingAspect.leftFile = _plus_3;
                  overridingAspects.add(overridingAspect);
                }
              }
            }
          }
          mergedLanguage.aspects.add(_requiringAspect);
        }
      }
      String _name = requiringLanguage.metamodel.getName();
      mergedLanguage.oldNamespaces.add(_name);
      String _name_1 = providingLanguage.metamodel.getName();
      mergedLanguage.oldNamespaces.add(_name_1);
      for (final Aspect _aspect : mergedLanguage.aspects) {
        {
          boolean _notEquals = (!Objects.equal(mergedLanguage.requiredInterface, null));
          if (_notEquals) {
            EList<EClassifier> _eClassifiers = mergedLanguage.requiredInterface.getEClassifiers();
            for (final EClassifier _requiredClassifier : _eClassifiers) {
              {
                String _name_2 = requiringLanguage.metamodel.getName();
                String _name_3 = _requiredClassifier.getName();
                String _name_4 = mergedLanguage.requiredInterface.getName();
                String _name_5 = _requiredClassifier.getName();
                RefactoringPatternVO pattern = RefactoringPatternsBuilder.buildMetaclassReferencePattern(_name_2, _name_3, _name_4, _name_5);
                boolean _contains = refactoringPatterns.contains(pattern);
                boolean _not = (!_contains);
                if (_not) {
                  refactoringPatterns.add(pattern);
                }
              }
            }
            EList<EClassifier> _eClassifiers_1 = mergedLanguage.requiredInterface.getEClassifiers();
            for (final EClassifier _requiredClassifier_1 : _eClassifiers_1) {
              {
                String _name_2 = providingLanguage.metamodel.getName();
                String _name_3 = _requiredClassifier_1.getName();
                String _name_4 = mergedLanguage.requiredInterface.getName();
                String _name_5 = _requiredClassifier_1.getName();
                RefactoringPatternVO pattern = RefactoringPatternsBuilder.buildMetaclassReferencePattern(_name_2, _name_3, _name_4, _name_5);
                boolean _contains = refactoringPatterns.contains(pattern);
                boolean _not = (!_contains);
                if (_not) {
                  refactoringPatterns.add(pattern);
                }
              }
            }
          }
          EList<EClassifier> _eClassifiers_2 = mergedLanguage.metamodel.getEClassifiers();
          for (final EClassifier _requiredClassifier_2 : _eClassifiers_2) {
            {
              String _name_2 = requiringLanguage.requiredInterface.getName();
              String _name_3 = _requiredClassifier_2.getName();
              String _name_4 = mergedLanguage.metamodel.getName();
              String _name_5 = _requiredClassifier_2.getName();
              RefactoringPatternVO pattern = RefactoringPatternsBuilder.buildMetaclassReferencePattern(_name_2, _name_3, _name_4, _name_5);
              boolean _contains = refactoringPatterns.contains(pattern);
              boolean _not = (!_contains);
              if (_not) {
                refactoringPatterns.add(pattern);
              }
            }
          }
          boolean _and = false;
          boolean _and_1 = false;
          boolean _and_2 = false;
          JvmTypeReference _aspectTypeRef = _aspect.getAspectTypeRef();
          boolean _notEquals_1 = (!Objects.equal(_aspectTypeRef, null));
          if (!_notEquals_1) {
            _and_2 = false;
          } else {
            JvmTypeReference _aspectTypeRef_1 = _aspect.getAspectTypeRef();
            JvmType _type = _aspectTypeRef_1.getType();
            boolean _notEquals_2 = (!Objects.equal(_type, null));
            _and_2 = _notEquals_2;
          }
          if (!_and_2) {
            _and_1 = false;
          } else {
            JvmTypeReference _aspectTypeRef_2 = _aspect.getAspectTypeRef();
            String _identifier = _aspectTypeRef_2.getIdentifier();
            boolean _notEquals_3 = (!Objects.equal(_identifier, null));
            _and_1 = _notEquals_3;
          }
          if (!_and_1) {
            _and = false;
          } else {
            JvmTypeReference _aspectTypeRef_3 = _aspect.getAspectTypeRef();
            JvmType _type_1 = _aspectTypeRef_3.getType();
            Resource _eResource = _type_1.eResource();
            boolean _notEquals_4 = (!Objects.equal(_eResource, null));
            _and = _notEquals_4;
          }
          if (_and) {
            IProject _project = this.targetProject.getProject();
            IWorkspace _workspace = _project.getWorkspace();
            final IWorkspaceRoot ws = _workspace.getRoot();
            final DirectoryShader shader = new DirectoryShader();
            final ShadeRequest request = new ShadeRequest();
            final ArrayList<Relocator> relocators = new ArrayList<Relocator>();
            final String sourceEmfNamespace = "FSM";
            final String targetEmfNamespace = "FSM";
            JvmTypeReference _aspectTypeRef_4 = _aspect.getAspectTypeRef();
            String _qualifiedName = _aspectTypeRef_4.getQualifiedName();
            JvmTypeReference _aspectTypeRef_5 = _aspect.getAspectTypeRef();
            String _simpleName = _aspectTypeRef_5.getSimpleName();
            String _plus = ("." + _simpleName);
            final String sourceAspectNamespace = _qualifiedName.replace(_plus, "");
            final String targetAspectNamespace = mergedLanguage.name;
            JvmTypeReference _aspectTypeRef_6 = _aspect.getAspectTypeRef();
            JvmType _type_2 = _aspectTypeRef_6.getType();
            Resource _eResource_1 = _type_2.eResource();
            EList<EObject> _contents = _eResource_1.getContents();
            EObject _get = _contents.get(0);
            if ((_get instanceof XtendFile)) {
              JvmTypeReference _aspectTypeRef_7 = _aspect.getAspectTypeRef();
              JvmType _type_3 = _aspectTypeRef_7.getType();
              Resource _eResource_2 = _type_3.eResource();
              EList<EObject> _contents_1 = _eResource_2.getContents();
              EObject _get_1 = _contents_1.get(0);
              XtendFile xtendFile = ((XtendFile) _get_1);
              try {
                EcoreUtil.resolveAll(xtendFile);
              } catch (final Throwable _t) {
                if (_t instanceof IllegalStateException) {
                  final IllegalStateException e = (IllegalStateException)_t;
                  InputOutput.<String>println("Crying because of indexing");
                } else {
                  throw Exceptions.sneakyThrow(_t);
                }
              }
              List<MatchingDiagnosticItem> _items = comparison.getItems();
              for (final MatchingDiagnosticItem _mapping : _items) {
                {
                  EObject _input = _mapping.getLeft();
                  EObject _output = _mapping.getRight();
                  boolean _and_3 = false;
                  if (!(_input instanceof EClassifier)) {
                    _and_3 = false;
                  } else {
                    _and_3 = (_output instanceof EClassifier);
                  }
                  if (_and_3) {
                    String _name_2 = ((EClassifier) _input).getName();
                    EClassifier sourceClass = this._ecoreQueries.searchClassByName(mergedLanguage.metamodel, _name_2);
                    String _name_3 = ((EClassifier) _output).getName();
                    EClassifier targetClass = this._ecoreQueries.searchClassByName(mergedLanguage.metamodel, _name_3);
                    RefactoringPatternVO pattern = new RefactoringPatternVO();
                    String _qualifiedName_1 = this._ecoreQueries.getQualifiedName(sourceClass);
                    pattern.setSourcePattern(_qualifiedName_1);
                    String _qualifiedName_2 = this._ecoreQueries.getQualifiedName(targetClass);
                    String _replace = _qualifiedName_2.replace(sourceAspectNamespace, targetAspectNamespace);
                    pattern.setTargetPattern(_replace);
                    boolean _contains = refactoringPatterns.contains(pattern);
                    boolean _not = (!_contains);
                    if (_not) {
                      refactoringPatterns.add(pattern);
                    }
                    boolean _and_4 = false;
                    if (!(_input instanceof EClass)) {
                      _and_4 = false;
                    } else {
                      _and_4 = (_output instanceof EClass);
                    }
                    if (_and_4) {
                      EClass _inputClass = ((EClass) _input);
                      EClass _outputClass = ((EClass) _output);
                      List<EReference> incomingReferences = CollectionLiterals.<EReference>newArrayList();
                      this._ecoreQueries.getIncomingReferences(_inputClass, requiringLanguage.metamodel, incomingReferences);
                      for (final EReference _eRequiringReference : incomingReferences) {
                        {
                          String _name_4 = _inputClass.getName();
                          String _name_5 = _eRequiringReference.getName();
                          String _name_6 = _outputClass.getName();
                          String _name_7 = _eRequiringReference.getName();
                          RefactoringPatternVO referenceCallPattern = RefactoringPatternsBuilder.buildReferenceCallPattern(_name_4, _name_5, _name_6, _name_7);
                          boolean _contains_1 = refactoringPatterns.contains(referenceCallPattern);
                          boolean _not_1 = (!_contains_1);
                          if (_not_1) {
                            refactoringPatterns.add(referenceCallPattern);
                          }
                        }
                      }
                    }
                  }
                  EList<XtendTypeDeclaration> _xtendTypes = xtendFile.getXtendTypes();
                  for (final XtendTypeDeclaration _typeDeclaration : _xtendTypes) {
                    JvmTypeReference _aspectTypeRef_8 = _aspect.getAspectTypeRef();
                    String _identifier_1 = _aspectTypeRef_8.getIdentifier();
                    this.buildPatternsByType(_typeDeclaration, refactoringPatterns, requiringLanguage, mergedLanguage, _input, _output, _identifier_1);
                  }
                }
              }
              for (final String _MetamodelNamespace : mergedLanguage.oldNamespaces) {
                {
                  RefactoringPatternVO pattern = RefactoringPatternsBuilder.buildNamespacePattern(_MetamodelNamespace, targetAspectNamespace);
                  boolean _contains = refactoringPatterns.contains(pattern);
                  boolean _not = (!_contains);
                  if (_not) {
                    refactoringPatterns.add(pattern);
                  }
                }
              }
              final StringBuilder projectPathTmp = new StringBuilder();
              final StringBuilder projectNameTmp = new StringBuilder();
              ws.accept(
                new IResourceVisitor() {
                  @Override
                  public boolean visit(final IResource resource) throws CoreException {
                    if ((resource instanceof IFile)) {
                      URI _locationURI = ((IFile)resource).getLocationURI();
                      final String resourcePath = _locationURI.getPath();
                      boolean _and = false;
                      JvmTypeReference _aspectTypeRef = _aspect.getAspectTypeRef();
                      boolean _notEquals = (!Objects.equal(_aspectTypeRef, null));
                      if (!_notEquals) {
                        _and = false;
                      } else {
                        JvmTypeReference _aspectTypeRef_1 = _aspect.getAspectTypeRef();
                        String _identifier = _aspectTypeRef_1.getIdentifier();
                        boolean _notEquals_1 = (!Objects.equal(_identifier, null));
                        _and = _notEquals_1;
                      }
                      if (_and) {
                        JvmTypeReference _aspectTypeRef_2 = _aspect.getAspectTypeRef();
                        final String currentAspectIdentifier = _aspectTypeRef_2.getIdentifier();
                        String _replace = currentAspectIdentifier.replace(".", "/");
                        final String toBeMatched = (_replace + ".java");
                        boolean _endsWith = resourcePath.endsWith(toBeMatched);
                        if (_endsWith) {
                          IProject _project = ((IFile)resource).getProject();
                          URI _locationURI_1 = _project.getLocationURI();
                          final String projectPath = _locationURI_1.getPath();
                          int _length = projectPathTmp.length();
                          boolean _equals = (_length == 0);
                          if (_equals) {
                            projectPathTmp.append(projectPath);
                          }
                          int _length_1 = projectNameTmp.length();
                          boolean _equals_1 = (_length_1 == 0);
                          if (_equals_1) {
                            IProject _project_1 = ((IFile)resource).getProject();
                            String _name = _project_1.getName();
                            projectNameTmp.append(_name);
                          }
                        }
                      }
                      return false;
                    }
                    return true;
                  }
                });
              final String sourceAspectFolder = (projectPathTmp + "/xtend-gen/");
              final File sourceFolderFile = new File(sourceAspectFolder);
              URI _locationURI = this.targetProject.getLocationURI();
              String _path = _locationURI.getPath();
              final String targetAspectFolder = (_path + "/xtend-gen/");
              boolean _and_3 = false;
              boolean _notEquals_5 = (!Objects.equal(sourceFolderFile, null));
              if (!_notEquals_5) {
                _and_3 = false;
              } else {
                boolean _exists = sourceFolderFile.exists();
                _and_3 = _exists;
              }
              if (_and_3) {
                final File targetFolderFile = new File(targetAspectFolder);
                String _string = sourceAspectNamespace.toString();
                String _string_1 = targetAspectNamespace.toString();
                SimpleRelocator _simpleRelocator = new SimpleRelocator(_string, _string_1, null, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList()));
                relocators.add(_simpleRelocator);
                String _string_2 = sourceEmfNamespace.toString();
                String _string_3 = targetEmfNamespace.toString();
                SimpleRelocator _simpleRelocator_1 = new SimpleRelocator(_string_2, _string_3, null, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList()));
                relocators.add(_simpleRelocator_1);
                RefactoringPatternVO namespaceRefactoringPattern = new RefactoringPatternVO();
                String _string_4 = sourceAspectNamespace.toString();
                namespaceRefactoringPattern.setSourcePattern(_string_4);
                String _string_5 = targetAspectNamespace.toString();
                namespaceRefactoringPattern.setTargetPattern(_string_5);
                boolean _contains = refactoringPatterns.contains(namespaceRefactoringPattern);
                boolean _not = (!_contains);
                if (_not) {
                  refactoringPatterns.add(namespaceRefactoringPattern);
                }
                request.setInputFolders(Collections.<File>unmodifiableSet(CollectionLiterals.<File>newHashSet(sourceFolderFile)));
                request.setOutputFolder(targetFolderFile);
                request.setFilters(Collections.<Filter>unmodifiableList(CollectionLiterals.<Filter>newArrayList()));
                request.setRelocators(relocators);
                ArrayList<ResourceTransformer> _arrayList = new ArrayList<ResourceTransformer>();
                request.setResourceTransformers(_arrayList);
                shader.shade(request);
              }
              for (final OverlappingAspectsVO _overlappingAspect : overlappingAspects) {
                {
                  JvmTypeReference _aspectTypeRef_8 = _aspect.getAspectTypeRef();
                  String _identifier_1 = _aspectTypeRef_8.getIdentifier();
                  JvmTypeReference _aspectTypeRef_9 = _overlappingAspect.leftAspect.getAspectTypeRef();
                  String _identifier_2 = _aspectTypeRef_9.getIdentifier();
                  boolean _equals = _identifier_1.equals(_identifier_2);
                  if (_equals) {
                    JvmTypeReference _aspectTypeRef_10 = _aspect.getAspectTypeRef();
                    String _identifier_3 = _aspectTypeRef_10.getIdentifier();
                    String _replace = _identifier_3.replace(".", "/");
                    String _plus_1 = (sourceAspectFolder + _replace);
                    String _plus_2 = (_plus_1 + ".java");
                    _overlappingAspect.leftFile = _plus_2;
                    String _string_6 = targetAspectNamespace.toString();
                    String _plus_3 = (targetAspectFolder + _string_6);
                    String _plus_4 = (_plus_3 + "/");
                    JvmTypeReference _aspectTypeRef_11 = _aspect.getAspectTypeRef();
                    String _identifier_4 = _aspectTypeRef_11.getIdentifier();
                    JvmTypeReference _aspectTypeRef_12 = _aspect.getAspectTypeRef();
                    String _identifier_5 = _aspectTypeRef_12.getIdentifier();
                    int _lastIndexOf = _identifier_5.lastIndexOf(".");
                    int _plus_5 = (_lastIndexOf + 1);
                    String _substring = _identifier_4.substring(_plus_5);
                    String _replace_1 = _substring.replace(".", "/");
                    String _plus_6 = (_plus_4 + _replace_1);
                    String _plus_7 = (_plus_6 + ".java");
                    _overlappingAspect.mergedFile = _plus_7;
                  }
                  JvmTypeReference _aspectTypeRef_13 = _aspect.getAspectTypeRef();
                  String _identifier_6 = _aspectTypeRef_13.getIdentifier();
                  JvmTypeReference _aspectTypeRef_14 = _overlappingAspect.rightAspect.getAspectTypeRef();
                  String _identifier_7 = _aspectTypeRef_14.getIdentifier();
                  boolean _equals_1 = _identifier_6.equals(_identifier_7);
                  if (_equals_1) {
                    JvmTypeReference _aspectTypeRef_15 = _aspect.getAspectTypeRef();
                    String _identifier_8 = _aspectTypeRef_15.getIdentifier();
                    String _replace_2 = _identifier_8.replace(".", "/");
                    String _plus_8 = (sourceAspectFolder + _replace_2);
                    String _plus_9 = (_plus_8 + ".java");
                    _overlappingAspect.rightFile = _plus_9;
                    String _string_7 = targetAspectNamespace.toString();
                    String _plus_10 = (targetAspectFolder + _string_7);
                    String _plus_11 = (_plus_10 + "/");
                    JvmTypeReference _aspectTypeRef_16 = _aspect.getAspectTypeRef();
                    String _identifier_9 = _aspectTypeRef_16.getIdentifier();
                    JvmTypeReference _aspectTypeRef_17 = _aspect.getAspectTypeRef();
                    String _identifier_10 = _aspectTypeRef_17.getIdentifier();
                    int _lastIndexOf_1 = _identifier_10.lastIndexOf(".");
                    int _plus_12 = (_lastIndexOf_1 + 1);
                    String _substring_1 = _identifier_9.substring(_plus_12);
                    String _replace_3 = _substring_1.replace(".", "/");
                    String _plus_13 = (_plus_11 + _replace_3);
                    String _plus_14 = (_plus_13 + ".java");
                    _overlappingAspect.mergedFile = _plus_14;
                  }
                }
              }
              for (final OverridingAspectsVO _overridingAspect : overridingAspects) {
                {
                  JvmTypeReference _aspectTypeRef_8 = _aspect.getAspectTypeRef();
                  String _identifier_1 = _aspectTypeRef_8.getIdentifier();
                  JvmTypeReference _aspectTypeRef_9 = _overridingAspect.leftAspect.getAspectTypeRef();
                  String _identifier_2 = _aspectTypeRef_9.getIdentifier();
                  boolean _equals = _identifier_1.equals(_identifier_2);
                  if (_equals) {
                    JvmTypeReference _aspectTypeRef_10 = _aspect.getAspectTypeRef();
                    String _identifier_3 = _aspectTypeRef_10.getIdentifier();
                    String _replace = _identifier_3.replace(".", "/");
                    String _plus_1 = (sourceAspectFolder + _replace);
                    String _plus_2 = (_plus_1 + ".java");
                    _overridingAspect.leftFile = _plus_2;
                  }
                  JvmTypeReference _aspectTypeRef_11 = _aspect.getAspectTypeRef();
                  String _identifier_4 = _aspectTypeRef_11.getIdentifier();
                  JvmTypeReference _aspectTypeRef_12 = _overridingAspect.baseAspect.getAspectTypeRef();
                  String _identifier_5 = _aspectTypeRef_12.getIdentifier();
                  boolean _equals_1 = _identifier_4.equals(_identifier_5);
                  if (_equals_1) {
                    JvmTypeReference _aspectTypeRef_13 = _aspect.getAspectTypeRef();
                    String _identifier_6 = _aspectTypeRef_13.getIdentifier();
                    String _replace_1 = _identifier_6.replace(".", "/");
                    String _plus_3 = (sourceAspectFolder + _replace_1);
                    String _plus_4 = (_plus_3 + ".java");
                    _overridingAspect.baseFile = _plus_4;
                    String _string_6 = targetAspectNamespace.toString();
                    String _plus_5 = (targetAspectFolder + _string_6);
                    String _plus_6 = (_plus_5 + "/");
                    JvmTypeReference _aspectTypeRef_14 = _aspect.getAspectTypeRef();
                    String _identifier_7 = _aspectTypeRef_14.getIdentifier();
                    JvmTypeReference _aspectTypeRef_15 = _aspect.getAspectTypeRef();
                    String _identifier_8 = _aspectTypeRef_15.getIdentifier();
                    int _lastIndexOf = _identifier_8.lastIndexOf(".");
                    int _plus_7 = (_lastIndexOf + 1);
                    String _substring = _identifier_7.substring(_plus_7);
                    String _replace_2 = _substring.replace(".", "/");
                    String _plus_8 = (_plus_6 + _replace_2);
                    String _plus_9 = (_plus_8 + ".java");
                    _overridingAspect.mergedFile = _plus_9;
                  }
                }
              }
            }
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void buildPatternsByType(final XtendTypeDeclaration _typeDeclaration, final ArrayList<RefactoringPatternVO> refactoringPattern, final LanguageVO leftLanguage, final LanguageVO result, final EObject _input, final EObject _output, final String aspectIdentifier) {
    EList<XtendMember> _members = _typeDeclaration.getMembers();
    for (final XtendMember _member : _members) {
      boolean _and = false;
      if (!(_member instanceof XtendField)) {
        _and = false;
      } else {
        _and = ((_input instanceof EClass) && (_output instanceof EClass));
      }
      if (_and) {
        String requiredTypeQualifiedName = this._ecoreQueries.getQualifiedName(((EClassifier) _input));
        JvmTypeReference _type = ((XtendField) _member).getType();
        String currentTypeQualifiedName = _type.getQualifiedName();
        boolean _or = false;
        boolean _equals = Objects.equal(currentTypeQualifiedName, null);
        if (_equals) {
          _or = true;
        } else {
          boolean _equals_1 = currentTypeQualifiedName.equals("null");
          _or = _equals_1;
        }
        if (_or) {
          JvmTypeReference _type_1 = ((XtendField) _member).getType();
          String _string = _type_1.toString();
          JvmTypeReference _type_2 = ((XtendField) _member).getType();
          String _string_1 = _type_2.toString();
          int _indexOf = _string_1.indexOf("#");
          int _plus = (_indexOf + 1);
          JvmTypeReference _type_3 = ((XtendField) _member).getType();
          String _string_2 = _type_3.toString();
          int _length = _string_2.length();
          int _minus = (_length - 1);
          String _substring = _string.substring(_plus, _minus);
          currentTypeQualifiedName = _substring;
        }
        boolean _equals_2 = currentTypeQualifiedName.equals(requiredTypeQualifiedName);
        if (_equals_2) {
          String _name = ((EClassifier) _input).getName();
          String _name_1 = ((XtendField) _member).getName();
          String _name_2 = ((EClassifier) _output).getName();
          List<RefactoringPatternVO> variablePatterns = RefactoringPatternsBuilder.buildVariablesPattern(_name, _name_1, _name_2);
          final Procedure1<RefactoringPatternVO> _function = new Procedure1<RefactoringPatternVO>() {
            @Override
            public void apply(final RefactoringPatternVO pattern) {
              boolean _contains = refactoringPattern.contains(pattern);
              boolean _not = (!_contains);
              if (_not) {
                refactoringPattern.add(pattern);
              }
            }
          };
          IterableExtensions.<RefactoringPatternVO>forEach(variablePatterns, _function);
        }
      } else {
        boolean _and_1 = false;
        if (!(_member instanceof XtendFunction)) {
          _and_1 = false;
        } else {
          _and_1 = ((_input instanceof EOperation) && (_output instanceof EOperation));
        }
        if (_and_1) {
          EClass _eContainingClass = ((EOperation) _input).getEContainingClass();
          String requiringClassName = _eContainingClass.getName();
          EClass _eContainingClass_1 = ((EOperation) _output).getEContainingClass();
          String providingClassName = _eContainingClass_1.getName();
          InputOutput.<String>println(("(_input as EOperation): " + ((EOperation) _input)));
          XExpression _expression = ((XtendFunction) _member).getExpression();
          boolean _notEquals = (!Objects.equal(_expression, null));
          if (_notEquals) {
            XExpression _expression_1 = ((XtendFunction) _member).getExpression();
            EList<XExpression> _expressions = ((XBlockExpression) _expression_1).getExpressions();
            for (final XExpression _currentExpressionStatement : _expressions) {
              {
                IEvaluationContext evaluationContext = this.contextProvider.get();
                QualifiedName _create = QualifiedName.create("baseLanguage");
                evaluationContext.newValue(_create, leftLanguage);
                QualifiedName _create_1 = QualifiedName.create("input");
                evaluationContext.newValue(_create_1, _input);
                QualifiedName _create_2 = QualifiedName.create("output");
                evaluationContext.newValue(_create_2, _output);
                QualifiedName _create_3 = QualifiedName.create("providingClassName");
                evaluationContext.newValue(_create_3, providingClassName);
                QualifiedName _create_4 = QualifiedName.create("requiringClassName");
                evaluationContext.newValue(_create_4, requiringClassName);
                QualifiedName _create_5 = QualifiedName.create("aspects");
                evaluationContext.newValue(_create_5, result.aspects);
                QualifiedName _create_6 = QualifiedName.create("refactoringPatterns");
                evaluationContext.newValue(_create_6, refactoringPattern);
                QualifiedName _create_7 = QualifiedName.create("function");
                evaluationContext.newValue(_create_7, ((XtendFunction) _member));
                ClassLoader _systemClassLoader = URLClassLoader.getSystemClassLoader();
                this.puzzleXbaseInterpreter.setClassLoader(_systemClassLoader);
                this.puzzleXbaseInterpreter.evaluate(_currentExpressionStatement, evaluationContext, CancelIndicator.NullImpl);
              }
            }
          }
        }
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
    org.eclipse.emf.common.util.URI genModelURI = org.eclipse.emf.common.util.URI.createFileURI(genModelLocation);
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
}
