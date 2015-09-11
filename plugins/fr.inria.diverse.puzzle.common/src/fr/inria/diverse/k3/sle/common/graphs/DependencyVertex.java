package fr.inria.diverse.k3.sle.common.graphs;

import java.util.ArrayList;
import java.util.List;

/**
 * Value object representing a vertex within a dependency graph.
 * @author David Mendez-Acuna
 *
 */
public class DependencyVertex {

	// -----------------------------------------------
	// Attributes
	// -----------------------------------------------
	
	private String identifier;
	private List<EcoreVertex> internalVertex;
	private List<DependencyArc> incomingArcs;
	private List<DependencyArc> outgoingArcs;
	private boolean visited;
	private boolean included;

	// -----------------------------------------------
	// Constructor
	// -----------------------------------------------
	
	public DependencyVertex(String identifier){
		this.identifier = identifier;
		this.internalVertex = new ArrayList<EcoreVertex>();
		this.incomingArcs = new ArrayList<DependencyArc>();
		this.outgoingArcs = new ArrayList<DependencyArc>();
	}
	
	// -----------------------------------------------
	// Getters and setters
	// -----------------------------------------------
	
	/**
	 * Indicates if there is a path from the origin to the destination.
	 * @param origin
	 * @param destination
	 * @return
	 */
	public boolean thereIsPath(DependencyVertex destination){
		this.visited = true;
		
		// Base case: there is a direct arc from the origin to the destination. 
		for (DependencyArc ecoreArc : this.getOutgoingArcs()) {
			if(ecoreArc.getTo().getIdentifier().equals(destination.getIdentifier()))
				return true;
		}
		// Recursive case: visiting recursively the outgoing vertex.
		for (DependencyArc ecoreArc : this.getOutgoingArcs()) {
			if(!ecoreArc.getTo().isVisited()){
				boolean thereIsPath = ecoreArc.getTo().thereIsPath(destination);
				if(thereIsPath)
					return true;
			}
		}
		return false;
	}
	
	public String toString(){
		return this.identifier;
	}
	
	// -----------------------------------------------
	// Getters and setters
	// -----------------------------------------------

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public List<EcoreVertex> getInternalVertex() {
		return this.internalVertex;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<DependencyArc> getIncomingArcs() {
		return incomingArcs;
	}

	public List<DependencyArc> getOutgoingArcs() {
		return outgoingArcs;
	}

	public boolean isIncluded() {
		return included;
	}

	public void setIncluded(boolean included) {
		this.included = included;
	}
}