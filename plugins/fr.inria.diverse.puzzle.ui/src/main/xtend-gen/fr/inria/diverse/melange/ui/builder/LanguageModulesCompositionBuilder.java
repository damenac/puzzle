package fr.inria.diverse.melange.ui.builder;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.sle.common.utils.ModelUtils;
import fr.inria.diverse.melange.metamodel.melange.Element;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.Metamodel;
import fr.inria.diverse.melange.metamodel.melange.ModelType;
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace;
import fr.inria.diverse.melange.ui.builder.AbstractBuilder;
import fr.inria.diverse.puzzle.adl.language.puzzle.Binding;
import fr.inria.diverse.puzzle.adl.language.puzzle.LanguageBinding;
import fr.inria.diverse.sle.puzzle.merge.impl.PuzzleMerge;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
  public String composeLanguageModules(final Resource puzzleResource, final Resource melangeResource, final IProject project, final IProgressMonitor monitor) {
    EList<EObject> _contents = puzzleResource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    final LanguageBinding bindingSpace = ((LanguageBinding) _head);
    EList<EObject> _contents_1 = melangeResource.getContents();
    EObject _head_1 = IterableExtensions.<EObject>head(_contents_1);
    final ModelTypingSpace modelTypingSpace = ((ModelTypingSpace) _head_1);
    EcoreUtil.resolveAll(modelTypingSpace);
    String answer = "Puzzle diagnostic: \n\n";
    for (int i = 0; (i < bindingSpace.getBinding().size()); i++) {
      {
        EList<Binding> _binding = bindingSpace.getBinding();
        Binding binding = _binding.get(i);
        final String requiredModelTypeName = binding.getLeft();
        final String providedModelTypeName = binding.getRight();
        EList<Element> _elements = modelTypingSpace.getElements();
        final Function1<Element, Boolean> _function = new Function1<Element, Boolean>() {
          @Override
          public Boolean apply(final Element element) {
            boolean _and = false;
            if (!(element instanceof ModelType)) {
              _and = false;
            } else {
              String _name = ((ModelType) element).getName();
              boolean _equals = _name.equals(requiredModelTypeName);
              _and = _equals;
            }
            return Boolean.valueOf(_and);
          }
        };
        Element _findFirst = IterableExtensions.<Element>findFirst(_elements, _function);
        final ModelType requiredModelType = ((ModelType) _findFirst);
        EList<Element> _elements_1 = modelTypingSpace.getElements();
        final Function1<Element, Boolean> _function_1 = new Function1<Element, Boolean>() {
          @Override
          public Boolean apply(final Element element) {
            boolean _and = false;
            if (!(element instanceof ModelType)) {
              _and = false;
            } else {
              String _name = ((ModelType) element).getName();
              boolean _equals = _name.equals(providedModelTypeName);
              _and = _equals;
            }
            return Boolean.valueOf(_and);
          }
        };
        Element _findFirst_1 = IterableExtensions.<Element>findFirst(_elements_1, _function_1);
        final ModelType providedModelType = ((ModelType) _findFirst_1);
        String _ecoreUri = requiredModelType.getEcoreUri();
        final EPackage requiredModelTypeEPackage = ModelUtils.loadEcoreResource(_ecoreUri);
        String _ecoreUri_1 = providedModelType.getEcoreUri();
        final EPackage providedModelTypeEPackage = ModelUtils.loadEcoreResource(_ecoreUri_1);
        EList<Element> _elements_2 = modelTypingSpace.getElements();
        final Function1<Element, Boolean> _function_2 = new Function1<Element, Boolean>() {
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
                  return Boolean.valueOf(_name.equals(requiredModelTypeName));
                }
              };
              boolean _exists = IterableExtensions.<ModelType>exists(_requires, _function);
              _and = _exists;
            }
            return Boolean.valueOf(_and);
          }
        };
        Element _findFirst_2 = IterableExtensions.<Element>findFirst(_elements_2, _function_2);
        final Language requiringLanguage = ((Language) _findFirst_2);
        EList<Element> _elements_3 = modelTypingSpace.getElements();
        final Function1<Element, Boolean> _function_3 = new Function1<Element, Boolean>() {
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
                  return Boolean.valueOf(_name.equals(providedModelTypeName));
                }
              };
              boolean _exists = IterableExtensions.<ModelType>exists(_implements, _function);
              _and = _exists;
            }
            return Boolean.valueOf(_and);
          }
        };
        Element _findFirst_3 = IterableExtensions.<Element>findFirst(_elements_3, _function_3);
        final Language providingLanguage = ((Language) _findFirst_3);
        Metamodel _syntax = requiringLanguage.getSyntax();
        String _ecoreUri_2 = _syntax.getEcoreUri();
        final EPackage requiredLanguageEPackage = ModelUtils.loadEcoreResource(_ecoreUri_2);
        Metamodel _syntax_1 = providingLanguage.getSyntax();
        String _ecoreUri_3 = _syntax_1.getEcoreUri();
        final EPackage providedLanguageEPackage = ModelUtils.loadEcoreResource(_ecoreUri_3);
        String _name = requiredModelTypeEPackage.getName();
        String _plus = ("Data ... requiredModelTypeEPackage: " + _name);
        String _plus_1 = (_plus + " - ");
        String _plus_2 = (_plus_1 + "providedModelTypeEPackage: ");
        String _name_1 = providedModelTypeEPackage.getName();
        String _plus_3 = (_plus_2 + _name_1);
        String _plus_4 = (_plus_3 + " - ");
        String _plus_5 = (_plus_4 + "requiringLanguage: ");
        String _name_2 = requiringLanguage.getName();
        String _plus_6 = (_plus_5 + _name_2);
        String _plus_7 = (_plus_6 + " - ");
        String _plus_8 = (_plus_7 + "providingLanguage: ");
        String _name_3 = providingLanguage.getName();
        String _plus_9 = (_plus_8 + _name_3);
        String _plus_10 = (_plus_9 + " - ");
        InputOutput.<String>println(_plus_10);
        final ResourceSet resourceSet1 = new ResourceSetImpl();
        final ResourceSet resourceSet2 = new ResourceSetImpl();
        String _ecoreUri_4 = requiredModelType.getEcoreUri();
        URI _createURI = URI.createURI(_ecoreUri_4);
        resourceSet1.getResource(_createURI, true);
        String _ecoreUri_5 = providedModelType.getEcoreUri();
        URI _createURI_1 = URI.createURI(_ecoreUri_5);
        resourceSet2.getResource(_createURI_1, true);
        final IComparisonScope scope = new DefaultComparisonScope(resourceSet1, resourceSet2, null);
        EMFCompare.Builder _builder = EMFCompare.builder();
        EMFCompare _build = _builder.build();
        final Comparison comparison = _build.compare(scope);
        PuzzleMerge _instance = PuzzleMerge.getInstance();
        EPackage recalculatedRequiredInterface = _instance.recalculateRequiredInterface(providedLanguageEPackage, comparison, "merged", requiredLanguageEPackage);
        PuzzleMerge _instance_1 = PuzzleMerge.getInstance();
        _instance_1.mergeAbstractSyntax(providedLanguageEPackage, providedModelTypeEPackage, requiredLanguageEPackage, requiredModelTypeEPackage, comparison, recalculatedRequiredInterface, "");
      }
    }
    return answer;
  }
}
