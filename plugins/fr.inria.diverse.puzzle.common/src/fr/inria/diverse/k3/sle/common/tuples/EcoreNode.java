package fr.inria.diverse.k3.sle.common.tuples;

import org.eclipse.emf.ecore.EClassifier;

public class EcoreNode {

	// -----------------------------------------------
	// Attributes
	// -----------------------------------------------
	
	private EClassifier classifier;
	
	// -----------------------------------------------
	// Constructor
	// -----------------------------------------------
	
	public EcoreNode(EClassifier classifier) {
		this.classifier = classifier;
	}

	// -----------------------------------------------
	// Getters and setters
	// -----------------------------------------------
	
	public EClassifier getClassifier() {
		return classifier;
	}

	public void setClassifier(EClassifier classifier) {
		this.classifier = classifier;
	}
}