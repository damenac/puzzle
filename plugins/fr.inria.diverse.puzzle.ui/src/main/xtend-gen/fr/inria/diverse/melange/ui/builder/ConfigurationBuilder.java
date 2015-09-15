package fr.inria.diverse.melange.ui.builder;

import fr.inria.diverse.k3.sle.common.utils.ModelUtils;
import fr.inria.diverse.melange.ui.builder.AbstractBuilder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.InputOutput;
import vm.PFeatureModel;

/**
 * Builder for the action: Configure.
 * Loads the input and performs the delegation to the corresponding plug-in.
 * 
 * @author David Mendez-Acuna
 */
@SuppressWarnings("all")
public class ConfigurationBuilder extends AbstractBuilder {
  public void configureDSL(final IResource res, final IProject project, final IProgressMonitor monitor) {
    IPath _location = res.getLocation();
    String _string = _location.toString();
    EObject _loadXMIFile = ModelUtils.loadXMIFile(_string);
    PFeatureModel fm = ((PFeatureModel) _loadXMIFile);
    InputOutput.<String>println(("PFeatureModel: " + fm));
  }
}
