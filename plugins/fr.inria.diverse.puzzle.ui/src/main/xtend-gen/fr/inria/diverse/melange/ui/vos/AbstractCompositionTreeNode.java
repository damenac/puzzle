package fr.inria.diverse.melange.ui.vos;

import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.ui.vos.CompositionGraph;

@SuppressWarnings("all")
public class AbstractCompositionTreeNode {
  public CompositionGraph graph;
  
  public AbstractCompositionTreeNode(final CompositionGraph graph) {
    this.graph = graph;
  }
  
  /**
   * Adds a node to the current tree
   */
  public void addNode(final Language language) {
  }
}
