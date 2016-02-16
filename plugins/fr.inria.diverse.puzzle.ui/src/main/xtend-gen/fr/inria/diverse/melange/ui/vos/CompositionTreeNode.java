package fr.inria.diverse.melange.ui.vos;

import fr.inria.diverse.melange.ui.vos.AbstractCompositionTreeNode;
import fr.inria.diverse.puzzle.adl.language.puzzle.Binding;

@SuppressWarnings("all")
public class CompositionTreeNode extends AbstractCompositionTreeNode {
  public AbstractCompositionTreeNode _requiring;
  
  public AbstractCompositionTreeNode _providing;
  
  public Binding _binding;
}
