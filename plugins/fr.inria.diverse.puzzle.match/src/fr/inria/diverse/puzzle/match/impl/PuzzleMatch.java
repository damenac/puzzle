package fr.inria.diverse.puzzle.match.impl;

import org.eclipse.emf.ecore.EObject;

import fr.inria.diverse.puzzle.match.vo.MatchingDiagnostic;

/**
 * Implementation of matching for metamodels-based DSLs
 * DiverSE Team - INRIA/IRISA Rennes.
 * 
 * @author David Mendez-Acuna
 */
public class PuzzleMatch {

	// -----------------------------------------------------
	// Attributes
	// -----------------------------------------------------
	
	private static PuzzleMatch instance;
	
	// -----------------------------------------------------
	// Constructor and singleton
	// -----------------------------------------------------
	
	private PuzzleMatch(){}
	
	public static PuzzleMatch getInstance(){
		if(instance == null)
			instance = new PuzzleMatch();
		return instance;
	}
	
	// -----------------------------------------------------
	// Methods
	// -----------------------------------------------------
	
	public MatchingDiagnostic match(EObject left, EObject right){
		MatchingDiagnostic diagnostic = new MatchingDiagnostic();
		
		return diagnostic;
	}
}
