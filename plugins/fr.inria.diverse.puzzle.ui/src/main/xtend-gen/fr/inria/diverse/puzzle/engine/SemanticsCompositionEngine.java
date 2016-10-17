package fr.inria.diverse.puzzle.engine;

import com.google.common.base.Objects;
import com.google.inject.Provider;
import fr.inria.diverse.commons.asm.shade.DirectoryShader;
import fr.inria.diverse.commons.asm.shade.ShadeRequest;
import fr.inria.diverse.commons.asm.shade.filter.Filter;
import fr.inria.diverse.commons.asm.shade.relocation.Relocator;
import fr.inria.diverse.commons.asm.shade.relocation.SimpleRelocator;
import fr.inria.diverse.commons.asm.shade.resource.ResourceTransformer;
import fr.inria.diverse.melange.eclipse.EclipseProjectHelper;
import fr.inria.diverse.melange.metamodel.melange.Aspect;
import fr.inria.diverse.melange.ui.builder.RefactoringPatternsBuilder;
import fr.inria.diverse.melange.ui.vos.LanguageVO;
import fr.inria.diverse.puzzle.engine.EcoreQueries;
import fr.inria.diverse.puzzle.engine.PuzzleXbaseInterpreter;
import fr.inria.diverse.puzzle.match.vo.MatchingDiagnostic;
import fr.inria.diverse.puzzle.match.vo.MatchingDiagnosticItem;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.function.Consumer;
import javax.inject.Inject;
import org.autorefactor.ui.OverlappingAspectsVO;
import org.autorefactor.ui.OverridingAspectsVO;
import org.autorefactor.ui.PrepareApplyRefactoringsJob;
import org.autorefactor.ui.PropertiesSetVO;
import org.autorefactor.ui.RefactoringPatternVO;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.JavaCore;
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

/**
 * Builder for the action: Analyze Family.
 * Loads the input and performs the delegation to the corresponding plug-in.
 * 
 * @author David Mendez-Acuna
 */
@SuppressWarnings("all")
public class SemanticsCompositionEngine {
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
  
  private Hashtable<String, IJavaElement> cacheJavaElements = new Hashtable<String, IJavaElement>();
  
  /**
   * Executes the composition of the semantics of the languages in the parameters.
   */
  public void launchSemanticsComposition(final LanguageVO mergedLanguage, final LanguageVO requiringLanguage, final LanguageVO providingLanguage, final MatchingDiagnostic comparison, final ArrayList<OverlappingAspectsVO> overlappingAspects, final ArrayList<OverridingAspectsVO> overridingAspects, final ArrayList<RefactoringPatternVO> refactoringPatterns, final IProject targetProject) {
    try {
      this.targetProject = targetProject;
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
      InputOutput.<String>println("All aspects");
      for (final Aspect _aspect : mergedLanguage.aspects) {
        EClass _aspectedClass = _aspect.getAspectedClass();
        String _plus = ("Aspect: " + _aspectedClass);
        InputOutput.<String>println(_plus);
      }
      InputOutput.<String>println("Overriding aspects");
      for (final OverridingAspectsVO _aspect_1 : overridingAspects) {
        EClass _aspectedClass_1 = _aspect_1.baseAspect.getAspectedClass();
        String _plus_1 = ("Aspect: " + _aspectedClass_1);
        String _plus_2 = (_plus_1 + " - ");
        EClass _aspectedClass_2 = _aspect_1.leftAspect.getAspectedClass();
        String _plus_3 = (_plus_2 + _aspectedClass_2);
        InputOutput.<String>println(_plus_3);
      }
      InputOutput.<String>println("Overlapping aspects");
      for (final OverlappingAspectsVO _aspect_2 : overlappingAspects) {
        EClass _aspectedClass_3 = _aspect_2.rightAspect.getAspectedClass();
        String _plus_4 = ("Aspect: " + _aspectedClass_3);
        String _plus_5 = (_plus_4 + " - ");
        EClass _aspectedClass_4 = _aspect_2.leftAspect.getAspectedClass();
        String _plus_6 = (_plus_5 + _aspectedClass_4);
        InputOutput.<String>println(_plus_6);
      }
      String _name = requiringLanguage.metamodel.getName();
      mergedLanguage.oldNamespaces.add(_name);
      String _name_1 = providingLanguage.metamodel.getName();
      mergedLanguage.oldNamespaces.add(_name_1);
      for (final Aspect _aspect_3 : mergedLanguage.aspects) {
        {
          EList<EClassifier> _eClassifiers = mergedLanguage.metamodel.getEClassifiers();
          for (final EClassifier _requiredClassifier : _eClassifiers) {
            String _name_2 = _requiredClassifier.getName();
            EClassifier _searchClassByName = this._ecoreQueries.searchClassByName(requiringLanguage.requiredInterface, _name_2);
            boolean _notEquals = (!Objects.equal(_searchClassByName, null));
            if (_notEquals) {
              String _name_3 = requiringLanguage.metamodel.getName();
              String _name_4 = _requiredClassifier.getName();
              String _name_5 = mergedLanguage.metamodel.getName();
              String _name_6 = _requiredClassifier.getName();
              RefactoringPatternVO pattern = RefactoringPatternsBuilder.buildMetaclassReferencePattern(_name_3, _name_4, _name_5, _name_6);
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
          JvmTypeReference _aspectTypeRef = _aspect_3.getAspectTypeRef();
          boolean _notEquals_1 = (!Objects.equal(_aspectTypeRef, null));
          if (!_notEquals_1) {
            _and_2 = false;
          } else {
            JvmTypeReference _aspectTypeRef_1 = _aspect_3.getAspectTypeRef();
            JvmType _type = _aspectTypeRef_1.getType();
            boolean _notEquals_2 = (!Objects.equal(_type, null));
            _and_2 = _notEquals_2;
          }
          if (!_and_2) {
            _and_1 = false;
          } else {
            JvmTypeReference _aspectTypeRef_2 = _aspect_3.getAspectTypeRef();
            String _identifier = _aspectTypeRef_2.getIdentifier();
            boolean _notEquals_3 = (!Objects.equal(_identifier, null));
            _and_1 = _notEquals_3;
          }
          if (!_and_1) {
            _and = false;
          } else {
            JvmTypeReference _aspectTypeRef_3 = _aspect_3.getAspectTypeRef();
            JvmType _type_1 = _aspectTypeRef_3.getType();
            Resource _eResource = _type_1.eResource();
            boolean _notEquals_4 = (!Objects.equal(_eResource, null));
            _and = _notEquals_4;
          }
          if (_and) {
            IProject _project = targetProject.getProject();
            IWorkspace _workspace = _project.getWorkspace();
            final IWorkspaceRoot ws = _workspace.getRoot();
            final DirectoryShader shader = new DirectoryShader();
            final ShadeRequest request = new ShadeRequest();
            final ArrayList<Relocator> relocators = new ArrayList<Relocator>();
            final String sourceEmfNamespace = "FSM";
            final String targetEmfNamespace = "FSM";
            JvmTypeReference _aspectTypeRef_4 = _aspect_3.getAspectTypeRef();
            String _qualifiedName = _aspectTypeRef_4.getQualifiedName();
            JvmTypeReference _aspectTypeRef_5 = _aspect_3.getAspectTypeRef();
            String _simpleName = _aspectTypeRef_5.getSimpleName();
            String _plus_7 = ("." + _simpleName);
            final String sourceAspectNamespace = _qualifiedName.replace(_plus_7, "");
            final String targetAspectNamespace = mergedLanguage.name;
            JvmTypeReference _aspectTypeRef_6 = _aspect_3.getAspectTypeRef();
            JvmType _type_2 = _aspectTypeRef_6.getType();
            Resource _eResource_1 = _type_2.eResource();
            EList<EObject> _contents = _eResource_1.getContents();
            EObject _get = _contents.get(0);
            if ((_get instanceof XtendFile)) {
              JvmTypeReference _aspectTypeRef_7 = _aspect_3.getAspectTypeRef();
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
                    String _name_7 = ((EClassifier) _input).getName();
                    EClassifier sourceClass = this._ecoreQueries.searchClassByName(mergedLanguage.metamodel, _name_7);
                    String _name_8 = ((EClassifier) _output).getName();
                    EClassifier targetClass = this._ecoreQueries.searchClassByName(mergedLanguage.metamodel, _name_8);
                    RefactoringPatternVO pattern_1 = new RefactoringPatternVO();
                    String _qualifiedName_1 = this._ecoreQueries.getQualifiedName(sourceClass);
                    pattern_1.setSourcePattern(_qualifiedName_1);
                    String _qualifiedName_2 = this._ecoreQueries.getQualifiedName(targetClass);
                    String _replace = _qualifiedName_2.replace(sourceAspectNamespace, targetAspectNamespace);
                    pattern_1.setTargetPattern(_replace);
                    boolean _contains_1 = refactoringPatterns.contains(pattern_1);
                    boolean _not_1 = (!_contains_1);
                    if (_not_1) {
                      refactoringPatterns.add(pattern_1);
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
                          String _name_9 = _inputClass.getName();
                          String _name_10 = _eRequiringReference.getName();
                          String _name_11 = _outputClass.getName();
                          String _name_12 = _eRequiringReference.getName();
                          RefactoringPatternVO referenceCallPattern = RefactoringPatternsBuilder.buildReferenceCallPattern(_name_9, _name_10, _name_11, _name_12);
                          boolean _contains_2 = refactoringPatterns.contains(referenceCallPattern);
                          boolean _not_2 = (!_contains_2);
                          if (_not_2) {
                            refactoringPatterns.add(referenceCallPattern);
                          }
                        }
                      }
                    }
                  }
                  EList<XtendTypeDeclaration> _xtendTypes = xtendFile.getXtendTypes();
                  for (final XtendTypeDeclaration _typeDeclaration : _xtendTypes) {
                    JvmTypeReference _aspectTypeRef_8 = _aspect_3.getAspectTypeRef();
                    String _identifier_1 = _aspectTypeRef_8.getIdentifier();
                    this.buildPatternsByType(_typeDeclaration, refactoringPatterns, requiringLanguage, mergedLanguage, _input, _output, _identifier_1);
                  }
                }
              }
              for (final String _MetamodelNamespace : mergedLanguage.oldNamespaces) {
                {
                  RefactoringPatternVO pattern_1 = RefactoringPatternsBuilder.buildNamespacePattern(_MetamodelNamespace, mergedLanguage.mergedPackage);
                  boolean _contains_1 = refactoringPatterns.contains(pattern_1);
                  boolean _not_1 = (!_contains_1);
                  if (_not_1) {
                    refactoringPatterns.add(pattern_1);
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
                      JvmTypeReference _aspectTypeRef = _aspect_3.getAspectTypeRef();
                      boolean _notEquals = (!Objects.equal(_aspectTypeRef, null));
                      if (!_notEquals) {
                        _and = false;
                      } else {
                        JvmTypeReference _aspectTypeRef_1 = _aspect_3.getAspectTypeRef();
                        String _identifier = _aspectTypeRef_1.getIdentifier();
                        boolean _notEquals_1 = (!Objects.equal(_identifier, null));
                        _and = _notEquals_1;
                      }
                      if (_and) {
                        JvmTypeReference _aspectTypeRef_2 = _aspect_3.getAspectTypeRef();
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
              URI _locationURI = targetProject.getLocationURI();
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
                boolean _contains_1 = refactoringPatterns.contains(namespaceRefactoringPattern);
                boolean _not_1 = (!_contains_1);
                if (_not_1) {
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
                  JvmTypeReference _aspectTypeRef_8 = _aspect_3.getAspectTypeRef();
                  String _identifier_1 = _aspectTypeRef_8.getIdentifier();
                  JvmTypeReference _aspectTypeRef_9 = _overlappingAspect.leftAspect.getAspectTypeRef();
                  String _identifier_2 = _aspectTypeRef_9.getIdentifier();
                  boolean _equals = _identifier_1.equals(_identifier_2);
                  if (_equals) {
                    JvmTypeReference _aspectTypeRef_10 = _aspect_3.getAspectTypeRef();
                    String _identifier_3 = _aspectTypeRef_10.getIdentifier();
                    String _replace = _identifier_3.replace(".", "/");
                    String _plus_8 = (sourceAspectFolder + _replace);
                    String _plus_9 = (_plus_8 + ".java");
                    _overlappingAspect.leftFile = _plus_9;
                    String _string_6 = targetAspectNamespace.toString();
                    String _plus_10 = (targetAspectFolder + _string_6);
                    String _plus_11 = (_plus_10 + "/");
                    JvmTypeReference _aspectTypeRef_11 = _aspect_3.getAspectTypeRef();
                    String _identifier_4 = _aspectTypeRef_11.getIdentifier();
                    JvmTypeReference _aspectTypeRef_12 = _aspect_3.getAspectTypeRef();
                    String _identifier_5 = _aspectTypeRef_12.getIdentifier();
                    int _lastIndexOf = _identifier_5.lastIndexOf(".");
                    int _plus_12 = (_lastIndexOf + 1);
                    String _substring = _identifier_4.substring(_plus_12);
                    String _replace_1 = _substring.replace(".", "/");
                    String _plus_13 = (_plus_11 + _replace_1);
                    String _plus_14 = (_plus_13 + ".java");
                    _overlappingAspect.mergedFile = _plus_14;
                  }
                  JvmTypeReference _aspectTypeRef_13 = _aspect_3.getAspectTypeRef();
                  String _identifier_6 = _aspectTypeRef_13.getIdentifier();
                  JvmTypeReference _aspectTypeRef_14 = _overlappingAspect.rightAspect.getAspectTypeRef();
                  String _identifier_7 = _aspectTypeRef_14.getIdentifier();
                  boolean _equals_1 = _identifier_6.equals(_identifier_7);
                  if (_equals_1) {
                    JvmTypeReference _aspectTypeRef_15 = _aspect_3.getAspectTypeRef();
                    String _identifier_8 = _aspectTypeRef_15.getIdentifier();
                    String _replace_2 = _identifier_8.replace(".", "/");
                    String _plus_15 = (sourceAspectFolder + _replace_2);
                    String _plus_16 = (_plus_15 + ".java");
                    _overlappingAspect.rightFile = _plus_16;
                    String _string_7 = targetAspectNamespace.toString();
                    String _plus_17 = (targetAspectFolder + _string_7);
                    String _plus_18 = (_plus_17 + "/");
                    JvmTypeReference _aspectTypeRef_16 = _aspect_3.getAspectTypeRef();
                    String _identifier_9 = _aspectTypeRef_16.getIdentifier();
                    JvmTypeReference _aspectTypeRef_17 = _aspect_3.getAspectTypeRef();
                    String _identifier_10 = _aspectTypeRef_17.getIdentifier();
                    int _lastIndexOf_1 = _identifier_10.lastIndexOf(".");
                    int _plus_19 = (_lastIndexOf_1 + 1);
                    String _substring_1 = _identifier_9.substring(_plus_19);
                    String _replace_3 = _substring_1.replace(".", "/");
                    String _plus_20 = (_plus_18 + _replace_3);
                    String _plus_21 = (_plus_20 + ".java");
                    _overlappingAspect.mergedFile = _plus_21;
                  }
                }
              }
              for (final OverridingAspectsVO _overridingAspect : overridingAspects) {
                {
                  JvmTypeReference _aspectTypeRef_8 = _aspect_3.getAspectTypeRef();
                  String _identifier_1 = _aspectTypeRef_8.getIdentifier();
                  JvmTypeReference _aspectTypeRef_9 = _overridingAspect.leftAspect.getAspectTypeRef();
                  String _identifier_2 = _aspectTypeRef_9.getIdentifier();
                  boolean _equals = _identifier_1.equals(_identifier_2);
                  if (_equals) {
                    JvmTypeReference _aspectTypeRef_10 = _aspect_3.getAspectTypeRef();
                    String _identifier_3 = _aspectTypeRef_10.getIdentifier();
                    String _replace = _identifier_3.replace(".", "/");
                    String _plus_8 = (sourceAspectFolder + _replace);
                    String _plus_9 = (_plus_8 + ".java");
                    _overridingAspect.leftFile = _plus_9;
                  }
                  JvmTypeReference _aspectTypeRef_11 = _aspect_3.getAspectTypeRef();
                  String _identifier_4 = _aspectTypeRef_11.getIdentifier();
                  JvmTypeReference _aspectTypeRef_12 = _overridingAspect.baseAspect.getAspectTypeRef();
                  String _identifier_5 = _aspectTypeRef_12.getIdentifier();
                  boolean _equals_1 = _identifier_4.equals(_identifier_5);
                  if (_equals_1) {
                    JvmTypeReference _aspectTypeRef_13 = _aspect_3.getAspectTypeRef();
                    String _identifier_6 = _aspectTypeRef_13.getIdentifier();
                    String _replace_1 = _identifier_6.replace(".", "/");
                    String _plus_10 = (sourceAspectFolder + _replace_1);
                    String _plus_11 = (_plus_10 + ".java");
                    _overridingAspect.baseFile = _plus_11;
                    String _string_6 = targetAspectNamespace.toString();
                    String _plus_12 = (targetAspectFolder + _string_6);
                    String _plus_13 = (_plus_12 + "/");
                    JvmTypeReference _aspectTypeRef_14 = _aspect_3.getAspectTypeRef();
                    String _identifier_7 = _aspectTypeRef_14.getIdentifier();
                    JvmTypeReference _aspectTypeRef_15 = _aspect_3.getAspectTypeRef();
                    String _identifier_8 = _aspectTypeRef_15.getIdentifier();
                    int _lastIndexOf = _identifier_8.lastIndexOf(".");
                    int _plus_14 = (_lastIndexOf + 1);
                    String _substring = _identifier_7.substring(_plus_14);
                    String _replace_2 = _substring.replace(".", "/");
                    String _plus_15 = (_plus_13 + _replace_2);
                    String _plus_16 = (_plus_15 + ".java");
                    _overridingAspect.mergedFile = _plus_16;
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
  
  public void executeRefactorings(final ArrayList<OverlappingAspectsVO> overlappingAspects, final ArrayList<OverridingAspectsVO> overridingAspects, final ArrayList<RefactoringPatternVO> refactoringPatterns) {
    try {
      IProject _project = this.targetProject.getProject();
      IWorkspace _workspace = _project.getWorkspace();
      final IWorkspaceRoot ws = _workspace.getRoot();
      ArrayList<OverlappingAspectsVO> cleanListOverlappingAspects = this.removeRepeatedElements(overlappingAspects);
      Hashtable<String, PropertiesSetVO> propertiesFiles = new Hashtable<String, PropertiesSetVO>();
      Hashtable<String, String> mergedFiles = new Hashtable<String, String>();
      for (final OverlappingAspectsVO _overlappingAspect : overlappingAspects) {
        {
          boolean _and = false;
          boolean _notEquals = (!Objects.equal(_overlappingAspect.mergedFile, null));
          if (!_notEquals) {
            _and = false;
          } else {
            String _get = mergedFiles.get(_overlappingAspect.mergedFile);
            boolean _equals = Objects.equal(_get, null);
            _and = _equals;
          }
          if (_and) {
            this.overrideMethod(_overlappingAspect.rightFile, _overlappingAspect.mergedFile);
            mergedFiles.put(_overlappingAspect.mergedFile, _overlappingAspect.mergedFile);
          }
          JvmTypeReference _aspectTypeRef = _overlappingAspect.leftAspect.getAspectTypeRef();
          String _identifier = _aspectTypeRef.getIdentifier();
          JvmTypeReference _aspectTypeRef_1 = _overlappingAspect.leftAspect.getAspectTypeRef();
          String _identifier_1 = _aspectTypeRef_1.getIdentifier();
          int _lastIndexOf = _identifier_1.lastIndexOf(".");
          int _plus = (_lastIndexOf + 1);
          String aspectName = _identifier.substring(_plus);
          String mergedPropertiesFile = _overlappingAspect.mergedFile.replace(aspectName, ((aspectName + aspectName) + "Properties"));
          String leftPropertiesFile = _overlappingAspect.rightFile.replace(aspectName, ((aspectName + aspectName) + "Properties"));
          String rightPropertiesFile = _overlappingAspect.rightFile.replace(aspectName, ((aspectName + aspectName) + "Properties"));
          PropertiesSetVO propertiesSet = propertiesFiles.get(mergedPropertiesFile);
          boolean _equals_1 = Objects.equal(propertiesSet, null);
          if (_equals_1) {
            PropertiesSetVO _propertiesSetVO = new PropertiesSetVO();
            propertiesSet = _propertiesSetVO;
            propertiesSet.setMergedPropertiesFile(mergedPropertiesFile);
            ArrayList<String> _allPropertiesFiles = propertiesSet.getAllPropertiesFiles();
            _allPropertiesFiles.add(mergedPropertiesFile);
          }
          ArrayList<String> _allPropertiesFiles_1 = propertiesSet.getAllPropertiesFiles();
          boolean _contains = _allPropertiesFiles_1.contains(leftPropertiesFile);
          boolean _not = (!_contains);
          if (_not) {
            ArrayList<String> _allPropertiesFiles_2 = propertiesSet.getAllPropertiesFiles();
            _allPropertiesFiles_2.add(leftPropertiesFile);
          }
          ArrayList<String> _allPropertiesFiles_3 = propertiesSet.getAllPropertiesFiles();
          boolean _contains_1 = _allPropertiesFiles_3.contains(rightPropertiesFile);
          boolean _not_1 = (!_contains_1);
          if (_not_1) {
            ArrayList<String> _allPropertiesFiles_4 = propertiesSet.getAllPropertiesFiles();
            _allPropertiesFiles_4.add(rightPropertiesFile);
          }
          propertiesFiles.put(mergedPropertiesFile, propertiesSet);
          this.targetProject.refreshLocal(IResource.DEPTH_INFINITE, null);
          JavaCore.initializeAfterLoad(null);
          IPath _location = ws.getLocation();
          String _string = _location.toString();
          final String mergedPathString = _overlappingAspect.mergedFile.replace(_string, "");
          IJavaElement mergedElement = this.cacheJavaElements.get(mergedPathString);
          boolean _equals_2 = Objects.equal(mergedElement, null);
          if (_equals_2) {
            final IPath mergedPath = new Path(mergedPathString);
            IFile _file = ws.getFile(mergedPath);
            IJavaElement _create = JavaCore.create(_file);
            mergedElement = _create;
            this.cacheJavaElements.put(mergedPathString, mergedElement);
          }
          IPath _location_1 = ws.getLocation();
          String _string_1 = _location_1.toString();
          final String leftPathString = _overlappingAspect.leftFile.replace(_string_1, "");
          IJavaElement extensionElement = this.cacheJavaElements.get(leftPathString);
          boolean _equals_3 = Objects.equal(extensionElement, null);
          if (_equals_3) {
            final IPath leftPath = new Path(leftPathString);
            final IFile leftFile = ws.getFile(leftPath);
            IJavaElement _create_1 = JavaCore.create(leftFile);
            extensionElement = _create_1;
            this.cacheJavaElements.put(leftPathString, extensionElement);
          }
          IPath _location_2 = ws.getLocation();
          String _string_2 = _location_2.toString();
          final String righPathString = _overlappingAspect.rightFile.replace(_string_2, "");
          IJavaElement baseElement = this.cacheJavaElements.get(righPathString);
          boolean _equals_4 = Objects.equal(baseElement, null);
          if (_equals_4) {
            final IPath rightPath = new Path(righPathString);
            final IFile rightFile = ws.getFile(rightPath);
            IJavaElement _create_2 = JavaCore.create(rightFile);
            baseElement = _create_2;
            this.cacheJavaElements.put(righPathString, baseElement);
          }
          _overlappingAspect.extensionElement = extensionElement;
          _overlappingAspect.mergedElement = mergedElement;
          _overlappingAspect.baseElement = baseElement;
        }
      }
      for (final OverridingAspectsVO _overridingAspect : overridingAspects) {
        boolean _notEquals = (!Objects.equal(_overridingAspect.mergedFile, null));
        if (_notEquals) {
          IPath _location = ws.getLocation();
          String _string = _location.toString();
          final String mergedPathString = _overridingAspect.mergedFile.replace(_string, "");
          IJavaElement mergedElement = this.cacheJavaElements.get(mergedPathString);
          boolean _equals = Objects.equal(mergedElement, null);
          if (_equals) {
            final IPath mergedPath = new Path(mergedPathString);
            IFile _file = ws.getFile(mergedPath);
            IJavaElement _create = JavaCore.create(_file);
            mergedElement = _create;
            this.cacheJavaElements.put(mergedPathString, mergedElement);
          }
          IPath _location_1 = ws.getLocation();
          String _string_1 = _location_1.toString();
          final String rightPathString = _overridingAspect.baseFile.replace(_string_1, "");
          IJavaElement rightElement = this.cacheJavaElements.get(rightPathString);
          boolean _equals_1 = Objects.equal(rightElement, null);
          if (_equals_1) {
            final IPath rightPath = new Path(rightPathString);
            IFile _file_1 = ws.getFile(rightPath);
            IJavaElement _create_1 = JavaCore.create(_file_1);
            rightElement = _create_1;
            this.cacheJavaElements.put(rightPathString, rightElement);
          }
          IPath _location_2 = ws.getLocation();
          String _string_2 = _location_2.toString();
          final String leftPathString = _overridingAspect.leftFile.replace(_string_2, "");
          IJavaElement extensionElement = this.cacheJavaElements.get(leftPathString);
          boolean _equals_2 = Objects.equal(extensionElement, null);
          if (_equals_2) {
            final IPath leftPath = new Path(leftPathString);
            final IFile leftFile = ws.getFile(leftPath);
            IJavaElement _create_2 = JavaCore.create(leftFile);
            extensionElement = _create_2;
            this.cacheJavaElements.put(leftPathString, extensionElement);
          }
          _overridingAspect.mergedElement = mergedElement;
          _overridingAspect.extensionElement = extensionElement;
          _overridingAspect.baseElement = rightElement;
        }
      }
      for (final RefactoringPatternVO pattern : refactoringPatterns) {
        InputOutput.<String>println(("RefactoringPatternVO pattern: " + pattern));
      }
      URI _locationURI = this.targetProject.getLocationURI();
      String _path = _locationURI.getPath();
      String _plus = (_path + "/xtend-gen/");
      final File targetFolderFile = new File(_plus);
      PrepareApplyRefactoringsJob refactoringJob = new PrepareApplyRefactoringsJob(cleanListOverlappingAspects, overridingAspects, refactoringPatterns, propertiesFiles, targetFolderFile, this.targetProject);
      refactoringJob.schedule();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public ArrayList<OverlappingAspectsVO> removeRepeatedElements(final ArrayList<OverlappingAspectsVO> vos) {
    ArrayList<OverlappingAspectsVO> answer = CollectionLiterals.<OverlappingAspectsVO>newArrayList();
    for (final OverlappingAspectsVO _overlappingAspect : vos) {
      boolean _contains = answer.contains(_overlappingAspect);
      boolean _not = (!_contains);
      if (_not) {
        answer.add(_overlappingAspect);
      }
    }
    return answer;
  }
  
  private void overrideMethod(final String sourceFilePath, final String targetFilePath) {
    try {
      String baseContent = "";
      FileReader _fileReader = new FileReader(sourceFilePath);
      final BufferedReader br = new BufferedReader(_fileReader);
      String line = br.readLine();
      while ((!Objects.equal(line, null))) {
        {
          baseContent = ((baseContent + line) + "\n");
          String _readLine = br.readLine();
          line = _readLine;
        }
      }
      br.close();
      File _file = new File(targetFilePath);
      PrintWriter writer = new PrintWriter(_file);
      writer.print(baseContent);
      writer.close();
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
          final Consumer<RefactoringPatternVO> _function = new Consumer<RefactoringPatternVO>() {
            @Override
            public void accept(final RefactoringPatternVO pattern) {
              boolean _contains = refactoringPattern.contains(pattern);
              boolean _not = (!_contains);
              if (_not) {
                refactoringPattern.add(pattern);
              }
            }
          };
          variablePatterns.forEach(_function);
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
}
