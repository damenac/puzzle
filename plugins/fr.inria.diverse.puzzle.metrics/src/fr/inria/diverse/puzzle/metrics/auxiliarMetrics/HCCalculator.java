package fr.inria.diverse.puzzle.metrics.auxiliarMetrics;

import java.util.List;

import org.eclipse.emf.ecore.EClass;

import fr.inria.diverse.puzzle.metrics.vos.HCMatrix;
import fr.inria.diverse.puzzle.metrics.vos.HCMatrixEntry;
import fr.inria.diverse.puzzle.metrics.vos.HCTree;
import fr.inria.diverse.puzzle.metrics.vos.HCTreeNode;

public class HCCalculator {

	// ----------------------------------------------
	// Attributes
	// ----------------------------------------------
	
	private HCTree tree;
	private HCMatrix hcMatrix;
	
	// ----------------------------------------------
	// Constructor
	// ----------------------------------------------
	
	public HCCalculator(){
		tree = new HCTree();
	}
	
	// ----------------------------------------------
	// Methods
	// ----------------------------------------------
	
	/**
	 * Computes the tree with the hierarchical analysis of the domains for the meta-classes in the parameter
	 * by using the matrix metrics also given in the parameter. 
	 * @param inputMatrix
	 * @param metaclasses
	 */
	public void computeHCTree(double[][] inputMatrix, List<EClass> metaclasses, int iterations){
		hcMatrix = this.buildInitialHCMatrixFromMetrixMatrix(inputMatrix, metaclasses);
		
		int count = iterations;
		while(count > 0){
			HCMatrixEntry biggerEntry = this.findBiggerEntry(hcMatrix.getEntries());
			HCTreeNode newNode = updateHCTreeWithEntry(biggerEntry);
			updateHCMatrix(biggerEntry, newNode);
			count --;
		}
	}
	
	/**
	 * Builds the initial HCMatrix from the metrics matrix on the parameter. 
	 * @param inputMatrix
	 * @return
	 */
	public HCMatrix buildInitialHCMatrixFromMetrixMatrix(double[][] inputMatrix, List<EClass> metaclasses){
		HCMatrix matrix = new HCMatrix();
		HCMatrixEntry[][] entryMatrix = new HCMatrixEntry[metaclasses.size()][metaclasses.size()];
		for (int x = 0; x < inputMatrix.length; x++) {
			for (int y = 0; y < inputMatrix.length; y++) {
				double value = inputMatrix[x][y];
				
				if(y<=x)
					value = -1;
				
				HCTreeNode xTreeNode = new HCTreeNode();
				xTreeNode.seteClass(metaclasses.get(x));
				xTreeNode.setIdentifier(metaclasses.get(x).getName());
				
				HCTreeNode yTreeNode = new HCTreeNode();
				yTreeNode.seteClass(metaclasses.get(y));
				yTreeNode.setIdentifier(metaclasses.get(y).getName());
				
				HCMatrixEntry entry = new HCMatrixEntry(xTreeNode, yTreeNode, value);
				entryMatrix[x][y] = entry;
			}
		}
		matrix.setEntries(entryMatrix);
		return matrix;
	}
	
	/**
	 * Returns the entry with the bigger value in the entries list given in the parameter. 
	 * @param entries
	 * @return
	 */
	public HCMatrixEntry findBiggerEntry(HCMatrixEntry[][] entries){
		HCMatrixEntry biggerEntry = null;
		double biggerValue = -1;
		
		for (int x = 0; x < entries.length; x++) {
			for (int y = x + 1; y < entries.length; y++) {
				if(entries[x][y].getValue() > biggerValue){
					biggerEntry = entries[x][y];
					biggerValue = entries[x][y].getValue();
				}
			}
		}
		return biggerEntry;
	}

	/**
	 * Updates the current hierarchical clustering tree with the new entry given in the parameter. 
	 * @param biggerEntry
	 */
	public HCTreeNode updateHCTreeWithEntry(HCMatrixEntry biggerEntry) {
		HCTreeNode xMatrixNode = biggerEntry.getX();
		HCTreeNode yMatrixNode = biggerEntry.getY();
		
		HCTreeNode  xTreeNode = this.tree.findNodeByIdentifier(xMatrixNode.getIdentifier());
		HCTreeNode  yTreeNode = this.tree.findNodeByIdentifier(yMatrixNode.getIdentifier());
		
		if(xTreeNode == null){
			xTreeNode = xMatrixNode;
			this.tree.getNodes().add(xTreeNode);
		}
		
		if(yTreeNode == null){
			yTreeNode = yMatrixNode;
			this.tree.getNodes().add(yMatrixNode);
		}
		
		HCTreeNode joinNode = new HCTreeNode();
		joinNode.setLeftChild(xTreeNode);
		joinNode.setRightChild(yTreeNode);
		joinNode.setIdentifier("(" + xTreeNode.getIdentifier() + "," + yTreeNode.getIdentifier() + ")");
		this.tree.getNodes().add(joinNode);
		
		return joinNode;
	}
	
	/**
	 * Updates the HCMatrix with the entry given in the parameter. 
	 * @param biggerEntry
	 */
	public void updateHCMatrix(HCMatrixEntry biggerEntry, HCTreeNode newNode) {
		HCMatrixEntry[][] oldMatrix = this.hcMatrix.getEntries();
		HCMatrixEntry[][] newMatrix = new HCMatrixEntry[this.hcMatrix.getEntries().length-1][this.hcMatrix.getEntries().length-1];
		
		// Calculating the reduced matrix.
		int deltaX = 0;
		for (int x = 0; x < oldMatrix.length; x++) {
			int deltaY = 0;
			
			for (int y = 0; y < oldMatrix.length; y++) {
				
				if(oldMatrix[x][y] != null){
					boolean delta = false;
					
					if(oldMatrix[x][y].getX().getIdentifier().equals(biggerEntry.getX().getIdentifier()) || 
							oldMatrix[x][y].getX().getIdentifier().equals(biggerEntry.getY().getIdentifier())){
						deltaX ++;
						break;
					}
					
					if(oldMatrix[x][y].getY().getIdentifier().equals(biggerEntry.getX().getIdentifier()) || 
							oldMatrix[x][y].getY().getIdentifier().equals(biggerEntry.getY().getIdentifier())){
						deltaY ++;
						delta = true;
					}
					
					if(!delta){
						newMatrix[x - deltaX][y - deltaY] = oldMatrix[x][y];
					}
				}
			}
		}
		
		// Computing the values for the unification
		for (int x = 0; x < newMatrix.length - 1; x++) {
			HCMatrixEntry newEntry = this.computeJointEntry(biggerEntry.getX(), biggerEntry.getY(), newMatrix[x][0].getX(), newNode);
			newMatrix[x][newMatrix.length - 1] = newEntry;
		}
		
		for (int y = 0; y < newMatrix.length; y++) {
			newMatrix[newMatrix.length - 1][y] = new HCMatrixEntry(newNode, newMatrix[0][y].getY(), -1);
		}
		
		// Update the objects
		this.hcMatrix.setEntries(newMatrix);
	}
	
	
	public HCMatrixEntry computeJointEntry(HCTreeNode x, HCTreeNode y, HCTreeNode entryNode, HCTreeNode newNode){
		HCMatrixEntry[][] oldMatrix = this.hcMatrix.getEntries();
		
		double rXEntry = -1;
	
		for (int i = 0; i < oldMatrix.length; i++) {
			for (int j = 0; j < oldMatrix.length; j++) {
				if(oldMatrix[i][j].getX().getIdentifier().equals(x.getIdentifier()) &&
						oldMatrix[i][j].getY().getIdentifier().equals(entryNode.getIdentifier())){
					rXEntry = oldMatrix[i][j].getValue();
				}
			}
		}
		
		if(rXEntry == -1){
			for (int i = 0; i < oldMatrix.length; i++) {
				for (int j = 0; j < oldMatrix.length; j++) {
					if(oldMatrix[i][j].getX().getIdentifier().equals(entryNode.getIdentifier()) &&
							oldMatrix[i][j].getY().getIdentifier().equals(x.getIdentifier())){
						rXEntry = oldMatrix[i][j].getValue();
					}
				}
			}
		}
		
		double rYEntry = -1;
		
		for (int i = 0; i < oldMatrix.length; i++) {
			for (int j = 0; j < oldMatrix.length; j++) {
				if(oldMatrix[i][j].getX().getIdentifier().equals(y.getIdentifier()) &&
						oldMatrix[i][j].getY().getIdentifier().equals(entryNode.getIdentifier())){
					rYEntry = oldMatrix[i][j].getValue();
				}
			}
		}
		
		if(rYEntry == -1){
			for (int i = 0; i < oldMatrix.length; i++) {
				for (int j = 0; j < oldMatrix.length; j++) {
					if(oldMatrix[i][j].getX().getIdentifier().equals(entryNode.getIdentifier()) &&
							oldMatrix[i][j].getY().getIdentifier().equals(y.getIdentifier())){
						rYEntry = oldMatrix[i][j].getValue();
					}
				}
			}
		}
		
		double answer = ( rXEntry + rYEntry ) / (double) 2;
		return new HCMatrixEntry(entryNode, newNode , answer);
	}
	
	// ----------------------------------------------
	// Getters and setters
	// ----------------------------------------------
	
	public HCTree getTree() {
		return tree;
	}

	public void setTree(HCTree tree) {
		this.tree = tree;
	}

	public HCMatrix getHcMatrix() {
		return hcMatrix;
	}

	public void setHcMatrix(HCMatrix hcMatrix) {
		this.hcMatrix = hcMatrix;
	}
}