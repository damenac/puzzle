package fr.inria.diverse.melange.ui.vos;

import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.ui.vos.CompositionArc;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

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
    final ArrayList<CompositionNode> outgoingNodes = new ArrayList<CompositionNode>();
    final Function1<CompositionArc, Boolean> _function = new Function1<CompositionArc, Boolean>() {
      @Override
      public Boolean apply(final CompositionArc element) {
        return Boolean.valueOf(outgoingNodes.add(element.to));
      }
    };
    IterableExtensions.<CompositionArc>forall(this.outgoing, _function);
    boolean _contains = outgoingNodes.contains(node);
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
