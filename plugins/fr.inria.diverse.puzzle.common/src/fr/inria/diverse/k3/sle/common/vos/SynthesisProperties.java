package fr.inria.diverse.k3.sle.common.vos;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;
import fr.inria.diverse.k3.sle.common.commands.MethodComparison;
import fr.inria.diverse.k3.sle.common.commands.VariabilityInferer;

/**
 * VO with the synthesis properties
 * @author David Mendez-Acuna
 */
public class SynthesisProperties {
	
	// -----------------------------------------------------------
	// Attributes
	// -----------------------------------------------------------
	
	private ConceptComparison conceptComparisonOperator;
	private MethodComparison methodComparisonOperator;
	private VariabilityInferer variabilityInferer;

	// -----------------------------------------------------------
	// Constructor
	// -----------------------------------------------------------
	
	public SynthesisProperties(ConceptComparison conceptComparisonOperator,
			MethodComparison methodComparisonOperator,
			VariabilityInferer variabilityInferer) {
		this.conceptComparisonOperator = conceptComparisonOperator;
		this.methodComparisonOperator = methodComparisonOperator;
		this.variabilityInferer = variabilityInferer;
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

	public VariabilityInferer getVariabilityInferer() {
		return variabilityInferer;
	}

	public void setVariabilityInferer(VariabilityInferer variabilityInferer) {
		this.variabilityInferer = variabilityInferer;
	}
}