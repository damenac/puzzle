package fr.inria.diverse.puzzle.metrics.vos;

import org.eclipse.emf.ecore.EClass;

public class HCTreeNode {

	// ----------------------------------------------
	// Attributes
	// ----------------------------------------------
	
	private EClass eClass;
	private String identifier;
	private HCTreeNode leftChild;
	private HCTreeNode rightChild;
	private double similarityValue;

	// ----------------------------------------------
	// Constructor
	// ----------------------------------------------
	
	public HCTreeNode(){}

	// ----------------------------------------------
	// Getters and setters
	// ----------------------------------------------

	public String toString(){
		return this.identifier;
	}
	
	public EClass geteClass() {
		return eClass;
	}

	public void seteClass(EClass eClass) {
		this.eClass = eClass;
	}

	public HCTreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(HCTreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public HCTreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(HCTreeNode rightChild) {
		this.rightChild = rightChild;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public double getSimilarityValue() {
		return similarityValue;
	}

	public void setSimilarityValue(double similarityValue) {
		this.similarityValue = similarityValue;
	}
}