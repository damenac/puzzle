package fr.inria.diverse.melange.ui.vos;

import com.google.common.base.Objects;
import fr.inria.diverse.melange.metamodel.melange.Element;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.ModelType;
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace;
import fr.inria.diverse.melange.ui.vos.CompositionArc;
import fr.inria.diverse.melange.ui.vos.CompositionNode;
import fr.inria.diverse.puzzle.language.binding.Binding;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class CompositionGraph {
  private List<CompositionNode> nodes;
  
  private List<CompositionArc> arcs;
  
  public CompositionGraph(final ArrayList<Language> bindedLanguages, final List<Binding> statements, final ModelTypingSpace modelTypingSpace) {
    ArrayList<CompositionNode> _arrayList = new ArrayList<CompositionNode>();
    this.nodes = _arrayList;
    ArrayList<CompositionArc> _arrayList_1 = new ArrayList<CompositionArc>();
    this.arcs = _arrayList_1;
    for (final Language language : bindedLanguages) {
      {
        CompositionNode newNode = new CompositionNode();
        newNode.language = language;
        boolean _contains = this.nodes.contains(newNode);
        boolean _not = (!_contains);
        if (_not) {
          this.nodes.add(newNode);
        }
      }
    }
    for (final Binding binding : statements) {
      {
        CompositionArc newArc = new CompositionArc();
        EList<Element> _elements = modelTypingSpace.getElements();
        final Function1<Element, Boolean> _function = new Function1<Element, Boolean>() {
          @Override
          public Boolean apply(final Element element) {
            boolean _and = false;
            if (!(element instanceof Language)) {
              _and = false;
            } else {
              EList<ModelType> _requires = ((Language) element).getRequires();
              final Function1<ModelType, Boolean> _function = new Function1<ModelType, Boolean>() {
                @Override
                public Boolean apply(final ModelType req) {
                  boolean _and = false;
                  String _name = req.getName();
                  String _left = binding.getLeft();
                  boolean _equals = _name.equals(_left);
                  if (!_equals) {
                    _and = false;
                  } else {
                    String _name_1 = req.getName();
                    String _name_2 = ((Language) element).getName();
                    boolean _contains = _name_1.contains(_name_2);
                    _and = _contains;
                  }
                  return Boolean.valueOf(_and);
                }
              };
              boolean _exists = IterableExtensions.<ModelType>exists(_requires, _function);
              _and = _exists;
            }
            return Boolean.valueOf(_and);
          }
        };
        Element _findFirst = IterableExtensions.<Element>findFirst(_elements, _function);
        final Language leftLanguage = ((Language) _findFirst);
        EList<Element> _elements_1 = modelTypingSpace.getElements();
        final Function1<Element, Boolean> _function_1 = new Function1<Element, Boolean>() {
          @Override
          public Boolean apply(final Element element) {
            boolean _and = false;
            boolean _and_1 = false;
            if (!(element instanceof Language)) {
              _and_1 = false;
            } else {
              boolean _notEquals = (!Objects.equal(leftLanguage, element));
              _and_1 = _notEquals;
            }
            if (!_and_1) {
              _and = false;
            } else {
              EList<ModelType> _implements = ((Language) element).getImplements();
              final Function1<ModelType, Boolean> _function = new Function1<ModelType, Boolean>() {
                @Override
                public Boolean apply(final ModelType impl) {
                  boolean _and = false;
                  String _name = impl.getName();
                  String _right = binding.getRight();
                  boolean _equals = _name.equals(_right);
                  if (!_equals) {
                    _and = false;
                  } else {
                    String _name_1 = impl.getName();
                    String _name_2 = ((Language) element).getName();
                    boolean _contains = _name_1.contains(_name_2);
                    _and = _contains;
                  }
                  return Boolean.valueOf(_and);
                }
              };
              boolean _exists = IterableExtensions.<ModelType>exists(_implements, _function);
              _and = _exists;
            }
            return Boolean.valueOf(_and);
          }
        };
        Element _findFirst_1 = IterableExtensions.<Element>findFirst(_elements_1, _function_1);
        final Language rightLanguage = ((Language) _findFirst_1);
        CompositionNode _findNode = this.findNode(leftLanguage);
        newArc.setFrom(_findNode);
        CompositionNode _findNode_1 = this.findNode(rightLanguage);
        newArc.setTo(_findNode_1);
        this.arcs.add(newArc);
        CompositionNode _from = newArc.getFrom();
        _from.outgoing.add(newArc);
        CompositionNode _to = newArc.getTo();
        _to.incoming.add(newArc);
      }
    }
  }
  
  public boolean depends(final Language from, final Language to) {
    CompositionNode fromNode = this.findNode(from);
    CompositionNode toNode = this.findNode(to);
    return fromNode.thereIsPath(toNode);
  }
  
  public CompositionNode findNode(final Language language) {
    final Function1<CompositionNode, Boolean> _function = new Function1<CompositionNode, Boolean>() {
      @Override
      public Boolean apply(final CompositionNode node) {
        return Boolean.valueOf(Objects.equal(node.language, language));
      }
    };
    return IterableExtensions.<CompositionNode>findFirst(this.nodes, _function);
  }
  
  public List<CompositionNode> getNodes() {
    return this.nodes;
  }
  
  public List<CompositionArc> getArcs() {
    return this.arcs;
  }
}
