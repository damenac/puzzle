package fr.inria.diverse.melange.ui.builder

import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.ecore.resource.Resource
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.puzzle.metrics.actions.ComputeMetricsActionImpl
import fr.inria.diverse.melange.metamodel.melange.Language
import java.util.ArrayList
import fr.inria.diverse.melange.metamodel.melange.Element
import fr.inria.diverse.puzzle.synthesizer.impl.SynthesizerManager
import fr.inria.diverse.k3.sle.common.utils.ProjectManagementServices

class SynthesisBuilder
{
	def void synthesizeLanguageProductLine(Resource res, IProject project, IProgressMonitor monitor) {
		val root = res.contents.head as ModelTypingSpace
		var ArrayList<Language> languages = new ArrayList<Language>()
		
		for(Element element : root.elements){
			if(element instanceof Language)
				languages.add(element as Language);
		}
		
		// Create a module that contains the modeling-in-the large artifacts as well as the metrics. 
		var IProject lplProject = ProjectManagementServices.createEclipseProject("fr.inria.diverse.examples.breaking.lpl");
		SynthesizerManager.instance.synthesizeLanguageProductLine(languages, lplProject)
		ComputeMetricsActionImpl.instance.computeMetrics(root, project);
		ProjectManagementServices.refreshProject(lplProject)
	}	
}