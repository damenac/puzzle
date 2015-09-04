package fr.inria.diverse.k3.sle.common.comparisonOperators;

import org.eclipse.emf.ecore.EClassifier;

/**
 * Service for concepts comparison by simple naming match
 * @author David Mendez-Acuna
 */
public class NamingConceptComparison implements ConceptComparison {

	@Override
	public boolean equals(EClassifier left, EClassifier right) {
		return left.getName().equals(right.getName());
	}
}