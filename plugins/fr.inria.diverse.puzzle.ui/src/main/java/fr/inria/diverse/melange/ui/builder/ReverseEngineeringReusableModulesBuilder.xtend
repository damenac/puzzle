package fr.inria.diverse.melange.ui.builder

import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.ecore.resource.Resource
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.k3.sle.common.vos.SynthesisProperties
import fr.inria.diverse.puzzle.extractor.impl.ExtractorImpl
import java.util.ArrayList
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.Element
import fr.inria.diverse.k3.sle.common.utils.ProjectManagementServices

/**
 * Builder for the action: Analyze Family.
 * Loads the input and performs the delegation to the corresponding plug-in.
 * 
 * @author David Mendez-Acuna
 */
class ReverseEngineeringReusableModulesBuilder extends AbstractBuilder {
	
	def void extractReusableModules(Resource res, IProject project, IProgressMonitor monitor) {
		val root = res.contents.head as ModelTypingSpace
		var ArrayList<Language> languages = new ArrayList<Language>()
		
		for(Element element : root.elements){
			if(element instanceof Language)
				languages.add(element as Language);
		}
		
		// Create a module that contains the modeling-in-the large artifacts as well as the metrics. 
		var IProject lplProject = ProjectManagementServices.createEclipseEmptyProject("fr.inria.diverse.puzzle.reverseEngineering");
		this.decorateProjectWithFolderStructure(lplProject)
		var SynthesisProperties properties = this.synthesisProperties
		
		ExtractorImpl.instance.extractReusableModules(properties, languages, lplProject)
		ProjectManagementServices.refreshProject(lplProject)
	}
	
	/**
	 * Decorates the project in the parameter with the structure to contain a language product line
	 * @param project. Project to decorate.
	 */
	def decorateProjectWithFolderStructure(IProject project) {
		ProjectManagementServices.createFolderByName(project, "reports")
		ProjectManagementServices.createFolderByName(project, "models")
	}
}