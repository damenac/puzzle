package fr.inria.diverse.melange.ui.builder

import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.ecore.EPackage
import fr.inria.diverse.k3.sle.common.utils.ModelUtils
import org.eclipse.core.resources.IResource
import fr.inria.diverse.puzzle.utilities.impl.ProvidedInterfaceExtractor

/**
 * Builder for the action: ExtractProvidedInterfaceBuilder.
 * Loads the input and performs the delegation to the corresponding plug-in.
 * 
 * @author David Mendez-Acuna
 */
class ExtractProvidedInterfaceBuilder extends AbstractBuilder {
	
	// -------------------------------------------------
	// Attributes
	// -------------------------------------------------
	
	private IProject targetProject
	
	// -------------------------------------------------
	// Methods
	// -------------------------------------------------
	
	/**
	 * Compose the language modules referenced in the melange and puzzle scripts given in the parameters
	 */
	def String extractProvidedInterface(IResource ecoreResource, IProject project, IProgressMonitor monitor) {
		this.targetProject = project;
		var EPackage metamodel = ModelUtils.loadEcoreFile(ecoreResource.location.toString)
		var EPackage providedInterface = ProvidedInterfaceExtractor.instance.extractProvidedInterface(metamodel)
		ModelUtils.saveEcoreFile(ecoreResource.location.toString.replace(".ecore","") + "-provided.ecore", providedInterface)
		this.targetProject.refreshLocal(IResource.DEPTH_INFINITE, monitor)
		return "Interface successfully extracted"
	}
	
	
}