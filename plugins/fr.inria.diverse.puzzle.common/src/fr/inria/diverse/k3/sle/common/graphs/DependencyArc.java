package fr.inria.diverse.k3.sle.common.graphs;

import fr.inria.diverse.graph.Arc;

/**
 * Value object representing an arc within a dependency graph.
 * @author David Mendez-Acuna
 *
 */
public class DependencyArc extends Arc {

	
	// -----------------------------------------------
	// Constructor
	// -----------------------------------------------
	
	public DependencyArc(DependencyVertex from, DependencyVertex to) {
		super(from, to);
	}
}