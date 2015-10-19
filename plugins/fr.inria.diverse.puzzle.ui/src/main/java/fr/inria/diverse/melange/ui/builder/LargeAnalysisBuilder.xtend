package fr.inria.diverse.melange.ui.builder

import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.ecore.resource.Resource
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.k3.sle.common.vos.SynthesisProperties
import fr.inria.diverse.puzzle.metrics.actions.ComputeLargeMetricsActionImpl

/**
 * Builder for the action: Analyze Family.
 * Loads the input and performs the delegation to the corresponding plug-in.
 * 
 * @author David Mendez-Acuna
 */
class LargeAnalysisBuilder extends AbstractBuilder {
	
	def void computeMetrics(Resource res, IProject project, IProgressMonitor monitor) {
		val root = res.contents.head as ModelTypingSpace
		var SynthesisProperties properties = this.synthesisProperties
		ComputeLargeMetricsActionImpl.instance.computeMetrics(properties, root, project);
	}
}