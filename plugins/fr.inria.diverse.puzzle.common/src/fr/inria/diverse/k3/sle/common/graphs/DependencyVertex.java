package fr.inria.diverse.k3.sle.common.graphs;

import java.util.ArrayList;
import java.util.List;

import fr.inria.diverse.graph.Vertex;

/**
 * Value object representing a vertex within a dependency graph.
 * @author David Mendez-Acuna
 *
 */
public class DependencyVertex extends Vertex {

	// -----------------------------------------------
	// Attributes
	// -----------------------------------------------
	
	private List<EcoreVertex> internalVertex;

	// -----------------------------------------------
	// Constructor
	// -----------------------------------------------
	
	public DependencyVertex(String identifier){
		super(identifier);
		this.internalVertex = new ArrayList<EcoreVertex>();
	}
	
	// -----------------------------------------------
	// Getters and setters
	// -----------------------------------------------

	public List<EcoreVertex> getInternalVertex() {
		return this.internalVertex;
	}
}