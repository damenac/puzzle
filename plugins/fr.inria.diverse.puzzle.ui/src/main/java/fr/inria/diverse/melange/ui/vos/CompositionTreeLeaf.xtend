package fr.inria.diverse.melange.ui.vos

import fr.inria.diverse.melange.metamodel.melange.Language

class CompositionTreeLeaf extends AbstractCompositionTreeNode {
	
	// -------------------------------------------------
	// Attributes
	// -------------------------------------------------
	
	public Language language
	
	// -------------------------------------------------
	// Constructor
	// -------------------------------------------------
	
	new(CompositionGraph graph, Language language){
		super(graph)
		this.language = language
	}
}