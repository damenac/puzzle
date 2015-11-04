package fr.inria.diverse.melange.ui.builder;

import fr.inria.diverse.melange.ui.builder.AbstractBuilder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.InputOutput;

/**
 * Builder for the action: Analyze Family.
 * Loads the input and performs the delegation to the corresponding plug-in.
 * 
 * @author David Mendez-Acuna
 */
@SuppressWarnings("all")
public class ExtractionBuilder extends AbstractBuilder {
  public void extractReusableModules(final Resource res, final IProject project, final IProgressMonitor monitor) {
    InputOutput.<String>println("ExtractionBuilder.extractReusableModules");
  }
}
