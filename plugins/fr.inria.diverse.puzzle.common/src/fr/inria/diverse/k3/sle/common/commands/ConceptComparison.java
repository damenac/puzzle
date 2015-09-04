package fr.inria.diverse.k3.sle.common.commands;

import org.eclipse.emf.ecore.EClassifier;

/**
 * Contract for the concepts comparison service
 * @author David Mendez-Acuna
 */
public interface ConceptComparison {

	public boolean equals(EClassifier left, EClassifier right);
}
