package fr.inria.diverse.k3.sle.common.comparisonOperators;

import org.eclipse.emf.ecore.EClassifier;

import fr.inria.diverse.k3.sle.common.commands.ConceptComparison;

/**
 * Service for concepts comparison by simple naming match
 * @author David Mendez-Acuna
 */
public class NamingConceptComparison implements ConceptComparison {

	@Override
	public boolean equals(EClassifier left, EClassifier right) {
		if(left != null && left.getName() != null && right != null && right.getName() != null)
			return left.getName().equals(right.getName());
		else return false;
	}
}