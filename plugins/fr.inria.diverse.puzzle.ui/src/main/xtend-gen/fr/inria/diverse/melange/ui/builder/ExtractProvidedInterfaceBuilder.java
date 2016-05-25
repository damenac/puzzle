package fr.inria.diverse.melange.ui.builder;

import fr.inria.diverse.k3.sle.common.utils.ModelUtils;
import fr.inria.diverse.melange.ui.builder.AbstractBuilder;
import fr.inria.diverse.puzzle.utilities.impl.ProvidedInterfaceExtractor;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EPackage;

/**
 * Builder for the action: ExtractProvidedInterfaceBuilder.
 * Loads the input and performs the delegation to the corresponding plug-in.
 * 
 * @author David Mendez-Acuna
 */
@SuppressWarnings("all")
public class ExtractProvidedInterfaceBuilder extends AbstractBuilder {
  private IProject targetProject;
  
  /**
   * Compose the language modules referenced in the melange and puzzle scripts given in the parameters
   */
  public String extractProvidedInterface(final IResource ecoreResource, final IProject project, final IProgressMonitor monitor) {
    this.targetProject = project;
    IPath _location = ecoreResource.getLocation();
    String _string = _location.toString();
    EPackage metamodel = ModelUtils.loadEcoreFile(_string);
    ProvidedInterfaceExtractor _instance = ProvidedInterfaceExtractor.getInstance();
    EPackage providedInterface = _instance.extractProvidedInterface(metamodel);
    IPath _location_1 = ecoreResource.getLocation();
    String _string_1 = _location_1.toString();
    String _replace = _string_1.replace(".ecore", "");
    String _plus = (_replace + "-provided.ecore");
    ModelUtils.saveEcoreFile(_plus, providedInterface);
    return "Interface successfully extracted";
  }
}
