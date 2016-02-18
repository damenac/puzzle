package fr.inria.diverse.melange.ui.vos;

import fr.inria.diverse.melange.ui.vos.CompositionNode;

@SuppressWarnings("all")
public class CompositionArc {
  private CompositionNode from;
  
  private CompositionNode to;
  
  public CompositionNode getFrom() {
    return this.from;
  }
  
  public void setFrom(final CompositionNode from) {
    this.from = from;
  }
  
  public CompositionNode getTo() {
    return this.to;
  }
  
  public void setTo(final CompositionNode to) {
    this.to = to;
  }
}
