package fr.inria.diverse.k3.sle.common.graphs;

/**
 * Value object representing an arc within a dependency graph.
 * @author David Mendez-Acuna
 *
 */
public class DependencyArc {

	// -----------------------------------------------
	// Attributes
	// -----------------------------------------------
	
	private DependencyVertex from;
	private DependencyVertex to;
	
	// -----------------------------------------------
	// Constructor
	// -----------------------------------------------
	
	public DependencyArc(DependencyVertex from, DependencyVertex to) {
		super();
		this.from = from;
		this.to = to;
	}
	
	// -----------------------------------------------
	// Getters and setters
	// -----------------------------------------------

	public DependencyVertex getFrom() {
		return from;
	}

	public void setFrom(DependencyVertex from) {
		this.from = from;
	}

	public DependencyVertex getTo() {
		return to;
	}

	public void setTo(DependencyVertex to) {
		this.to = to;
	}
}