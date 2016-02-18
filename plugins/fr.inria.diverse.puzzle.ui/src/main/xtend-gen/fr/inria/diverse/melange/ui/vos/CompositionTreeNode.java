package fr.inria.diverse.melange.ui.vos;

import fr.inria.diverse.melange.ui.vos.AbstractCompositionTreeNode;
import fr.inria.diverse.melange.ui.vos.CompositionGraph;

@SuppressWarnings("all")
public class CompositionTreeNode extends AbstractCompositionTreeNode {
  public AbstractCompositionTreeNode _requiring;
  
  public AbstractCompositionTreeNode _providing;
  
  public CompositionTreeNode(final CompositionGraph graph) {
    super(graph);
  }
}
