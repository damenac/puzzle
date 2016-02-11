package fr.inria.diverse.puzzle.match.vo;

import org.eclipse.emf.ecore.EObject;

/**
 * Value object for item metamodels matching
 * 
 * @author David Mendez-Acuna
 */
public class MatchingDiagnosticItem {

	// -----------------------------------------------------
	// Attributes
	// -----------------------------------------------------

	private EObject left;
	
	private EObject right;
	
	// -----------------------------------------------------
	// Constructor
	// -----------------------------------------------------
	
	public MatchingDiagnosticItem(EObject left, EObject right){
		this.left = left;
		this.right = right;
	}

	// -----------------------------------------------------
	// Getters and setters
	// -----------------------------------------------------

	public EObject getLeft() {
		return left;
	}

	public void setLeft(EObject left) {
		this.left = left;
	}

	public EObject getRight() {
		return right;
	}

	public void setRight(EObject right) {
		this.right = right;
	}
}