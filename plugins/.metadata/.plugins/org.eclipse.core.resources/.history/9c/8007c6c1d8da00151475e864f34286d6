package fr.inria.diverse.melange.ui.builder

import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.resources.IResource
import fr.inria.diverse.k3.sle.common.utils.ModelUtils
import vm.PFeatureModel
import fr.inria.diverse.puzzle.configurator.ConfigurationFacade

/**
 * Builder for the action: Configure.
 * Loads the input and performs the delegation to the corresponding plug-in.
 * 
 * @author David Mendez-Acuna
 */
class ConfigurationBuilder extends AbstractBuilder {
	
	def void configureDSL(IResource res, IProject project, IProgressMonitor monitor) {
		var PFeatureModel fm = ModelUtils.loadXMIFile(res.location.toString) as PFeatureModel
		ConfigurationFacade.instance.configure(fm)
	}
}