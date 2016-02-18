package fr.inria.diverse.melange.ui.vos;

import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.ui.vos.CompositionGraph;
import fr.inria.diverse.melange.ui.vos.CompositionTreeLeaf;
import fr.inria.diverse.melange.ui.vos.CompositionTreeNode;

@SuppressWarnings("all")
public class AbstractCompositionTreeNode {
  public CompositionGraph graph;
  
  public AbstractCompositionTreeNode(final CompositionGraph graph) {
    this.graph = graph;
  }
  
  public boolean existsDependency(final CompositionTreeLeaf node) {
    if ((this instanceof CompositionTreeLeaf)) {
      CompositionTreeLeaf thisLeaf = ((CompositionTreeLeaf) this);
      boolean _depends = this.graph.depends(thisLeaf.language, node.language);
      if (_depends) {
        return true;
      } else {
        return false;
      }
    } else {
      if ((this instanceof CompositionTreeNode)) {
        CompositionTreeNode thisNode = ((CompositionTreeNode) this);
        boolean _or = false;
        boolean _existsDependency = thisNode._requiring.existsDependency(node);
        if (_existsDependency) {
          _or = true;
        } else {
          boolean _existsDependency_1 = thisNode._providing.existsDependency(node);
          _or = _existsDependency_1;
        }
        return _or;
      }
    }
    return false;
  }
  
  /**
   * Adds a node to the current tree
   */
  public AbstractCompositionTreeNode addNode(final Language language) {
    if ((this instanceof CompositionTreeLeaf)) {
      CompositionTreeLeaf currentLeaf = ((CompositionTreeLeaf) this);
      CompositionTreeLeaf newLeaf = new CompositionTreeLeaf(this.graph, language);
      CompositionTreeNode node = new CompositionTreeNode(this.graph);
      boolean _depends = this.graph.depends(currentLeaf.language, language);
      if (_depends) {
        node._requiring = currentLeaf;
        node._providing = newLeaf;
      } else {
        node._requiring = newLeaf;
        node._providing = currentLeaf;
      }
      return node;
    } else {
      CompositionTreeNode currentNode = ((CompositionTreeNode) this);
      CompositionTreeLeaf leaf = new CompositionTreeLeaf(this.graph, language);
      boolean _existsDependency = currentNode._providing.existsDependency(leaf);
      if (_existsDependency) {
        CompositionTreeNode newNode = new CompositionTreeNode(this.graph);
        AbstractCompositionTreeNode _addNode = currentNode._providing.addNode(language);
        newNode._providing = _addNode;
        newNode._requiring = currentNode._requiring;
        return newNode;
      } else {
        CompositionTreeNode newNode_1 = new CompositionTreeNode(this.graph);
        newNode_1._providing = currentNode._providing;
        AbstractCompositionTreeNode _addNode_1 = currentNode._requiring.addNode(language);
        newNode_1._requiring = _addNode_1;
        return newNode_1;
      }
    }
  }
}
