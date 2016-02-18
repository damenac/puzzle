package fr.inria.diverse.melange.ui.vos;

import fr.inria.diverse.melange.metamodel.melange.Language;

@SuppressWarnings("all")
public class CompositionNode {
  public Language language;
  
  @Override
  public boolean equals(final Object o) {
    CompositionNode target = ((CompositionNode) o);
    return target.language.equals(this.language);
  }
}
