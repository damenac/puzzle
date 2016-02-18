package fr.inria.diverse.melange.ui.vos;

import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.ui.vos.CompositionArc;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class CompositionNode {
  public Language language;
  
  public List<CompositionArc> incoming;
  
  public List<CompositionArc> outgoing;
  
  public CompositionNode() {
    ArrayList<CompositionArc> _arrayList = new ArrayList<CompositionArc>();
    this.incoming = _arrayList;
    ArrayList<CompositionArc> _arrayList_1 = new ArrayList<CompositionArc>();
    this.outgoing = _arrayList_1;
  }
  
  /**
   * Indicates if there is a path between the current node and the one given in the parameter
   */
  public boolean thereIsPath(final CompositionNode node) {
    boolean _contains = this.outgoing.contains(node);
    if (_contains) {
      return true;
    }
    for (final CompositionArc arc : this.outgoing) {
      {
        boolean exists = arc.to.thereIsPath(node);
        if (exists) {
          return true;
        }
      }
    }
    return false;
  }
  
  @Override
  public boolean equals(final Object o) {
    CompositionNode target = ((CompositionNode) o);
    return target.language.equals(this.language);
  }
}
