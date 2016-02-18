package fr.inria.diverse.melange.ui.vos

import fr.inria.diverse.melange.metamodel.melange.Language

class AbstractCompositionTreeNode {

	public CompositionGraph graph
	
	new(CompositionGraph graph){
		this.graph = graph
	}
	
	/** 
	 * Adds a node to the current tree
	 */
	def void addNode(Language language){
		
	}
}