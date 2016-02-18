package fr.inria.diverse.melange.ui.vos

class CompositionTreeNode extends AbstractCompositionTreeNode {
	
	// -------------------------------------------------
	// Attributes
	// -------------------------------------------------
	
	public AbstractCompositionTreeNode _requiring
	public AbstractCompositionTreeNode _providing
	
	// -------------------------------------------------
	// Constructor
	// -------------------------------------------------
	
	new(CompositionGraph graph) {
		super(graph)
	}
}