package fr.inria.diverse.k3.sle.common.graphs;

import java.util.ArrayList;

/**
 * Class representing a set of vertex in an ecore graph. 
 * 
 * @author David Mendez-Acuna
 *
 */
public class EcoreGroup {
	
	// -----------------------------------------------
	// Attributes
	// -----------------------------------------------
	
	private String name;
	private ArrayList<EcoreVertex> vertex;

	// -----------------------------------------------
	// Constructor
	// -----------------------------------------------
	
	public EcoreGroup(String name){
		this.name = name;
		this.vertex = new ArrayList<EcoreVertex>();
	}

	// -----------------------------------------------
	// Getters and setters
	// -----------------------------------------------
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<EcoreVertex> getVertex() {
		return vertex;
	}
	
}
