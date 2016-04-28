package fr.inria.diverse.puzzle.metrics.vos;

public class HCTree {

	// ----------------------------------------------
	// Attributes
	// ----------------------------------------------
	
	private HCTreeNode root;

	// ----------------------------------------------
	// Constructor
	// ----------------------------------------------
	
	public HCTree(){}
	
	// ----------------------------------------------
	// Methods
	// ----------------------------------------------
	
	public HCTreeNode getRoot() {
		return root;
	}

	public void setRoot(HCTreeNode root) {
		this.root = root;
	}
}
