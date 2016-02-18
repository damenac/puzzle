package fr.inria.diverse.melange.ui.vos

import fr.inria.diverse.melange.metamodel.melange.Language
import java.util.List
import java.util.ArrayList

class CompositionNode {
	
	public Language language
	public List<CompositionArc> incoming
	public List<CompositionArc> outgoing 
	
	new(){
		this.incoming = new ArrayList<CompositionArc>()
		this.outgoing = new ArrayList<CompositionArc>()
	}
	
	
	/**
	 * Indicates if there is a path between the current node and the one given in the parameter
	 */
	def boolean thereIsPath(CompositionNode node) {
		val ArrayList<CompositionNode> outgoingNodes = new ArrayList<CompositionNode>()
		this.outgoing.forall[ element | outgoingNodes.add(element.to) ]
		
		if(outgoingNodes.contains(node)){
			return true
		}
		
		for(CompositionArc arc : outgoing){
			var boolean exists = arc.to.thereIsPath(node)
			if(exists){
				return true
			}
		}
		return false
	}
	
	override public boolean equals(Object o){
		var CompositionNode target = o as CompositionNode
		return target.language.equals(this.language)
	}
}