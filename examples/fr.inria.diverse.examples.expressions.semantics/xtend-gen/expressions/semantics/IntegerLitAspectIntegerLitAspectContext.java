package expressions.semantics;

import ExpressionPck.IntegerLit;
import expressions.semantics.IntegerLitAspectIntegerLitAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class IntegerLitAspectIntegerLitAspectContext {
  public final static IntegerLitAspectIntegerLitAspectContext INSTANCE = new IntegerLitAspectIntegerLitAspectContext();
  
  public static IntegerLitAspectIntegerLitAspectProperties getSelf(final IntegerLit _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new expressions.semantics.IntegerLitAspectIntegerLitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerLit, IntegerLitAspectIntegerLitAspectProperties> map = new java.util.WeakHashMap<ExpressionPck.IntegerLit, expressions.semantics.IntegerLitAspectIntegerLitAspectProperties>();
  
  public Map<IntegerLit, IntegerLitAspectIntegerLitAspectProperties> getMap() {
    return map;
  }
}
