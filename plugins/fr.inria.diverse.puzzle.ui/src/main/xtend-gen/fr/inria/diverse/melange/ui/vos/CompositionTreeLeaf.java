package fr.inria.diverse.melange.ui.vos;

import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.ui.vos.AbstractCompositionTreeNode;
import fr.inria.diverse.melange.ui.vos.CompositionGraph;

@SuppressWarnings("all")
public class CompositionTreeLeaf extends AbstractCompositionTreeNode {
  public Language language;
  
  public CompositionTreeLeaf(final CompositionGraph graph, final Language language) {
    super(graph);
    this.language = language;
  }
}
