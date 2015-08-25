package fr.inria.diverse.k3.sle.common.tuples;

import org.eclipse.emf.ecore.EClassifier;

public class EcoreNode {

	// -----------------------------------------------
	// Attributes
	// -----------------------------------------------
	
	private String nodeId;
	private EClassifier classifier;
	
	// -----------------------------------------------
	// Constructor
	// -----------------------------------------------
	
	public EcoreNode(String nodeId, EClassifier classifier) {
		this.nodeId = nodeId;
		this.classifier = classifier;
	}

	// -----------------------------------------------
	// Getters and setters
	// -----------------------------------------------
	
	public EClassifier getClassifier() {
		return classifier;
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public void setClassifier(EClassifier classifier) {
		this.classifier = classifier;
	}
}