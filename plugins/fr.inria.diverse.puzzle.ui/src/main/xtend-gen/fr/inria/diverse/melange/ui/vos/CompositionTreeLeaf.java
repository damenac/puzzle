package fr.inria.diverse.melange.ui.vos;

import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.ui.vos.AbstractCompositionTreeNode;

@SuppressWarnings("all")
public class CompositionTreeLeaf extends AbstractCompositionTreeNode {
  public Language language;
  
  public CompositionTreeLeaf(final Language language) {
    this.language = language;
  }
}
