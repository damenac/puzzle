package fr.inria.diverse.puzzle.examples.expr.semantics;

import ExpressionPck.ArithmeticExpression;
import fr.inria.diverse.puzzle.examples.expr.semantics.ArithmeticExpressionAspectArithmeticExpressionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ArithmeticExpressionAspectArithmeticExpressionAspectContext {
  public final static ArithmeticExpressionAspectArithmeticExpressionAspectContext INSTANCE = new ArithmeticExpressionAspectArithmeticExpressionAspectContext();
  
  public static ArithmeticExpressionAspectArithmeticExpressionAspectProperties getSelf(final ArithmeticExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.puzzle.examples.expr.semantics.ArithmeticExpressionAspectArithmeticExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ArithmeticExpression, ArithmeticExpressionAspectArithmeticExpressionAspectProperties> map = new java.util.WeakHashMap<ExpressionPck.ArithmeticExpression, fr.inria.diverse.puzzle.examples.expr.semantics.ArithmeticExpressionAspectArithmeticExpressionAspectProperties>();
  
  public Map<ArithmeticExpression, ArithmeticExpressionAspectArithmeticExpressionAspectProperties> getMap() {
    return map;
  }
}
