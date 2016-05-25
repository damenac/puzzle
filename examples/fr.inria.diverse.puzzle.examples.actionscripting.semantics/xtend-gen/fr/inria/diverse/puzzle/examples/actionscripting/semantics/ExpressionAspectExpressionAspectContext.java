package fr.inria.diverse.puzzle.examples.actionscripting.semantics;

import actionscripting.Expression;
import fr.inria.diverse.puzzle.examples.actionscripting.semantics.ExpressionAspectExpressionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ExpressionAspectExpressionAspectContext {
  public final static ExpressionAspectExpressionAspectContext INSTANCE = new ExpressionAspectExpressionAspectContext();
  
  public static ExpressionAspectExpressionAspectProperties getSelf(final Expression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.puzzle.examples.actionscripting.semantics.ExpressionAspectExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression, ExpressionAspectExpressionAspectProperties> map = new java.util.WeakHashMap<actionscripting.Expression, fr.inria.diverse.puzzle.examples.actionscripting.semantics.ExpressionAspectExpressionAspectProperties>();
  
  public Map<Expression, ExpressionAspectExpressionAspectProperties> getMap() {
    return map;
  }
}
