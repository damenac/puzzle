package fr.inria.diverse.melange.ui.builder

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison
import fr.inria.diverse.k3.sle.common.commands.MethodComparison
import fr.inria.diverse.k3.sle.common.commands.FeaturesModelInference
import fr.inria.diverse.k3.sle.common.commands.GraphPartition
import fr.inria.diverse.k3.sle.common.comparisonOperators.DeepConceptComparison
import fr.inria.diverse.k3.sle.common.comparisonOperators.SignatureAndSourceMethodComparison
import fr.inria.diverse.puzzle.variabilityinferer.inferers.PuzzleInferrer
import fr.inria.diverse.k3.sle.common.vos.SynthesisProperties
import fr.inria.diverse.k3.sle.common.comparisonOperators.NamingConceptComparison
import fr.inria.diverse.k3.sle.common.comparisonOperators.NamingMethodComparison
import fr.inria.diverse.k3.sle.common.comparisonOperators.SignatureMethodComparison
import fr.inria.diverse.puzzle.breaker.popup.actions.MinimumAcyclicPartition

/**
 * Abstract builder. Responsible for managing the parameters of the reverse-engineering process. 
 * @author David Mendez-Acuna
 */
class AbstractBuilder {
	
	/**
	 * Defines the reverse-engineering process and returns an object with the corresponding values.
	 * 
	 * TODO: Read the properties from an external file. 
	 */
	def protected SynthesisProperties getSynthesisProperties(){
		var ConceptComparison conceptComparisonOperator = new NamingConceptComparison();
		var MethodComparison methodComparisonOperator = SignatureAndSourceMethodComparison.getInstance();
		var FeaturesModelInference variabilityInferer = new PuzzleInferrer();
		var GraphPartition graphPartition = new MinimumAcyclicPartition();
		var SynthesisProperties properties = new SynthesisProperties(conceptComparisonOperator, methodComparisonOperator, variabilityInferer, graphPartition);
		return properties;
	}
}