package fr.inria.diverse.k3.sle.common.graphs;

import java.util.ArrayList;
import java.util.List;

import fr.inria.diverse.k3.sle.common.utils.MelangeServices;

/**
 * Dependency graph.
 * @author David Mendez-Acuna
 *
 */
public class DependencyGraph {

	// -----------------------------------------------
	// Attributes
	// -----------------------------------------------
	
	private List<DependencyVertex> vertex;
	private List<DependencyArc> arcs;

	// -----------------------------------------------
	// Constructors
	// -----------------------------------------------
	
	/**
	 * Constructor by default.
	 */
	public DependencyGraph(){
		vertex = new ArrayList<DependencyVertex>();
		arcs = new ArrayList<DependencyArc>();
	}
	
	/**
	 * Builds a dependency graph from a modularization graph.
	 * @param modularizationGraph. Modularization graph that will be used to create the dependencies graph.
	 */
	public DependencyGraph(EcoreGraph modularizationGraph){
		vertex = new ArrayList<DependencyVertex>();
		arcs = new ArrayList<DependencyArc>();
		
		// Create one vertex for each modularization group. 
		for (ArrayList<EcoreVertex> group : modularizationGraph.getGroups()) {
			String moduleName = MelangeServices.getLanguageModuleName(group);
			DependencyVertex dependencyVertex = new DependencyVertex(moduleName);
			this.vertex.add(dependencyVertex);
		}
	}
	
	// -----------------------------------------------
	// Getters
	// -----------------------------------------------
	
	public List<DependencyVertex> getVertex() {
		return vertex;
	}

	public List<DependencyArc> getArcs() {
		return arcs;
	}
}