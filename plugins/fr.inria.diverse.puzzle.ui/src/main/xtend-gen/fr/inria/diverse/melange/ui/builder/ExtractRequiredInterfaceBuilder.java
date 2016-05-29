package fr.inria.diverse.melange.ui.builder;

import fr.inria.diverse.k3.sle.common.utils.ModelUtils;
import fr.inria.diverse.melange.ui.builder.AbstractBuilder;
import fr.inria.diverse.puzzle.utilities.impl.RequiredInterfaceExtractor;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * Builder for the action: Analyze Family.
 * Loads the input and performs the delegation to the corresponding plug-in.
 * 
 * @author David Mendez-Acuna
 */
@SuppressWarnings("all")
public class ExtractRequiredInterfaceBuilder extends AbstractBuilder {
  private IProject targetProject;
  
  /**
   * Compose the language modules referenced in the melange and puzzle scripts given in the parameters
   */
  public String extractRequiredInterface(final IResource ecoreResource, final IProject project, final IProgressMonitor monitor) {
    try {
      this.targetProject = project;
      IPath _location = ecoreResource.getLocation();
      String _string = _location.toString();
      EPackage metamodel = ModelUtils.loadEcoreFile(_string);
      RequiredInterfaceExtractor _instance = RequiredInterfaceExtractor.getInstance();
      EPackage requiredInterface = _instance.extractRequiredInterface(metamodel);
      IPath _location_1 = ecoreResource.getLocation();
      String _string_1 = _location_1.toString();
      String _replace = _string_1.replace(".ecore", "");
      String _plus = (_replace + "-required.ecore");
      ModelUtils.saveEcoreFile(_plus, requiredInterface);
      this.targetProject.refreshLocal(IResource.DEPTH_INFINITE, monitor);
      return "Interface successfully extracted";
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
