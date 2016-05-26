package fr.inria.diverse.puzzle.examples.expr.semantics;

import ExpressionPck.IntegerLit;
import fr.inria.diverse.puzzle.examples.expr.semantics.IntegerLitAspectIntegerLitAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class IntegerLitAspectIntegerLitAspectContext {
  public final static IntegerLitAspectIntegerLitAspectContext INSTANCE = new IntegerLitAspectIntegerLitAspectContext();
  
  public static IntegerLitAspectIntegerLitAspectProperties getSelf(final IntegerLit _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.puzzle.examples.expr.semantics.IntegerLitAspectIntegerLitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerLit, IntegerLitAspectIntegerLitAspectProperties> map = new java.util.WeakHashMap<ExpressionPck.IntegerLit, fr.inria.diverse.puzzle.examples.expr.semantics.IntegerLitAspectIntegerLitAspectProperties>();
  
  public Map<IntegerLit, IntegerLitAspectIntegerLitAspectProperties> getMap() {
    return map;
  }
}
