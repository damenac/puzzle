package fr.inria.diverse.melange.ui.builder

import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.ecore.resource.Resource
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.puzzle.metrics.actions.ComputeMetricsActionImpl
import fr.inria.diverse.k3.sle.common.vos.SynthesisProperties
import fr.inria.diverse.k3.sle.common.commands.ConceptComparison
import fr.inria.diverse.k3.sle.common.commands.MethodComparison
import fr.inria.diverse.k3.sle.common.commands.FeaturesModelInference
import fr.inria.diverse.k3.sle.common.commands.GraphPartition
import fr.inria.diverse.k3.sle.common.comparisonOperators.DeepConceptComparison
import fr.inria.diverse.k3.sle.common.comparisonOperators.SignatureAndSourceMethodComparison
import fr.inria.diverse.puzzle.variabilityinferer.inferers.KSynthesisInferrer
import fr.inria.diverse.k3.sle.common.graphsOperators.MembershipGraphPartition
import fr.inria.diverse.puzzle.variabilityinferer.inferers.FamaInferrer

class MetricsBuilder
{
	def void computeMetrics(Resource res, IProject project, IProgressMonitor monitor) {
		val root = res.contents.head as ModelTypingSpace
		var SynthesisProperties properties = this.synthesisProperties
		ComputeMetricsActionImpl.instance.computeMetrics(properties, root, project);
	}
	
	def private SynthesisProperties getSynthesisProperties(){
		var ConceptComparison conceptComparisonOperator = new DeepConceptComparison();
		var MethodComparison methodComparisonOperator = SignatureAndSourceMethodComparison.getInstance();
		var FeaturesModelInference variabilityInferer = new FamaInferrer();
		var GraphPartition graphPartition = new MembershipGraphPartition();
		var SynthesisProperties properties = new SynthesisProperties(conceptComparisonOperator, methodComparisonOperator, variabilityInferer, graphPartition);
		return properties;
	}
}