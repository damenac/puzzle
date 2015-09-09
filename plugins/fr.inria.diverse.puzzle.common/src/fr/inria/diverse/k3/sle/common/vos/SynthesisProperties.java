package fr.inria.diverse.k3.sle.common.vos;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.k3.sle.common.commands.GraphPartition;
import fr.inria.diverse.k3.sle.common.commands.MethodComparison;
import fr.inria.diverse.k3.sle.common.commands.FeaturesModelInference;

/**
 * VO with the synthesis properties
 * @author David Mendez-Acuna
 * 
 */
public class SynthesisProperties {
	
	// -----------------------------------------------------------
	// Attributes
	// -----------------------------------------------------------
	
	private ConceptComparison conceptComparisonOperator;
	private MethodComparison methodComparisonOperator;
	private FeaturesModelInference variabilityInferer;
	private GraphPartition graphPartition;

	// -----------------------------------------------------------
	// Constructor
	// -----------------------------------------------------------
	
	public SynthesisProperties(ConceptComparison conceptComparisonOperator,
			MethodComparison methodComparisonOperator,
			FeaturesModelInference variabilityInferer,
			GraphPartition graphPartition) {
		this.conceptComparisonOperator = conceptComparisonOperator;
		this.methodComparisonOperator = methodComparisonOperator;
		this.variabilityInferer = variabilityInferer;
		this.graphPartition = graphPartition;
	}

	// -----------------------------------------------------------
	// Getters and setters
	// -----------------------------------------------------------
	
	public ConceptComparison getConceptComparisonOperator() {
		return conceptComparisonOperator;
	}

	public void setConceptComparisonOperator(
			ConceptComparison conceptComparisonOperator) {
		this.conceptComparisonOperator = conceptComparisonOperator;
	}

	public MethodComparison getMethodComparisonOperator() {
		return methodComparisonOperator;
	}

	public void setMethodComparisonOperator(
			MethodComparison methodComparisonOperator) {
		this.methodComparisonOperator = methodComparisonOperator;
	}

	public FeaturesModelInference getVariabilityInferer() {
		return variabilityInferer;
	}

	public void setVariabilityInferer(FeaturesModelInference variabilityInferer) {
		this.variabilityInferer = variabilityInferer;
	}

	public GraphPartition getGraphPartition() {
		return graphPartition;
	}

	public void setGraphPartition(GraphPartition graphPartition) {
		this.graphPartition = graphPartition;
	}
}