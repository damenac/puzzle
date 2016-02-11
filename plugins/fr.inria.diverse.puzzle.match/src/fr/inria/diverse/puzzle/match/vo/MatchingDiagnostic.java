package fr.inria.diverse.puzzle.match.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * Value object for metamodels matching
 * 
 * @author David Mendez-Acuna
 */
public class MatchingDiagnostic {

	// -----------------------------------------------------
	// Attributes
	// -----------------------------------------------------

	private List<MatchingDiagnosticItem> items;
	
	// -----------------------------------------------------
	// Construct
	// -----------------------------------------------------
	
	public MatchingDiagnostic(){
		this.items = new ArrayList<MatchingDiagnosticItem>();
	}
	
	// -----------------------------------------------------
	// Getters and setters
	// -----------------------------------------------------
	
	public List<MatchingDiagnosticItem> getItems() {
		return items;
	}
}
