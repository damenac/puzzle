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

class SynthesisBuilder
{
	def void synthesizeLanguageProductLine(Resource res, IProject project, IProgressMonitor monitor) {
		val root = res.contents.head as ModelTypingSpace
		var ArrayList<Language> languages = new ArrayList<Language>()
		
		for(Element element : root.elements){
			if(element instanceof Language)
				languages.add(element as Language);
		}
		SynthesizerManager.instance.synthesizeLanguageProductLine(languages)
		ComputeMetricsActionImpl.instance.computeMetrics(root, project);
	}	
}