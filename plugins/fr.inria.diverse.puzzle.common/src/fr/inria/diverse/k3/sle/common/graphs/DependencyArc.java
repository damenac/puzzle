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
		this.from.getOutgoingArcs().add(this);
		
		this.to = to;
		this.to.getIncomingArcs().add(this);
	}
	
	// -----------------------------------------------
	// Methods
	// -----------------------------------------------
	
	public String toString(){
		return this.from.getIdentifier() + " -> " + this.to.getIdentifier();
	}
	
	public boolean equals(Object o){
		DependencyArc arc = (DependencyArc) o;
		return this.getFrom().getIdentifier().equals(arc.getFrom().getIdentifier()) &&
				this.getTo().getIdentifier().equals(arc.getTo().getIdentifier());
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