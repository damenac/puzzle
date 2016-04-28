package fr.inria.diverse.puzzle.metrics.vos;

public class HCMatrix {

	// ----------------------------------------------
	// Attributes
	// ----------------------------------------------
	
	private HCMatrixEntry[][] entries;

	// ----------------------------------------------
	// Constructor
	// ----------------------------------------------
	
	public HCMatrix(){}
	
	// ----------------------------------------------
	// Methods
	// ----------------------------------------------
	
	public HCMatrixEntry[][] getEntries() {
		return entries;
	}

	public void setEntries(HCMatrixEntry[][] entries) {
		this.entries = entries;
	}
}