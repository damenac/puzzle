package fr.inria.diverse.melange.ui.builder;

import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace;
import fr.inria.diverse.melange.ui.builder.AbstractBuilder;
import fr.inria.diverse.puzzle.adl.language.puzzle.LanguageBinding;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Builder for the action: Analyze Family.
 * Loads the input and performs the delegation to the corresponding plug-in.
 * 
 * @author David Mendez-Acuna
 */
@SuppressWarnings("all")
public class LanguageModulesValidationBuilder extends AbstractBuilder {
  public void validateLanguageModulesComposability(final Resource puzzleResource, final Resource melangeResource, final IProject project, final IProgressMonitor monitor) {
    InputOutput.<String>println("coucou!! validateLanguageModulesComposability");
    InputOutput.<String>println(("puzzleResource: " + puzzleResource));
    InputOutput.<String>println(("melangeResource: " + melangeResource));
    EList<EObject> _contents = puzzleResource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    final LanguageBinding bindingSpace = ((LanguageBinding) _head);
    EList<EObject> _contents_1 = melangeResource.getContents();
    EObject _head_1 = IterableExtensions.<EObject>head(_contents_1);
    final ModelTypingSpace modelTypingSpace = ((ModelTypingSpace) _head_1);
    InputOutput.<String>println(("bindingSpace: " + bindingSpace));
    InputOutput.<String>println(("modelTypingSpace: " + modelTypingSpace));
  }
}
