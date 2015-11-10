package Logo.expression;

import ExpressionModule.IntegerLit;
import Logo.expression.IntegerLitAspectIntegerLitAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class IntegerLitAspectIntegerLitAspectContext {
  public final static IntegerLitAspectIntegerLitAspectContext INSTANCE = new IntegerLitAspectIntegerLitAspectContext();
  
  public static IntegerLitAspectIntegerLitAspectProperties getSelf(final IntegerLit _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Logo.expression.IntegerLitAspectIntegerLitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerLit, IntegerLitAspectIntegerLitAspectProperties> map = new java.util.WeakHashMap<ExpressionModule.IntegerLit, Logo.expression.IntegerLitAspectIntegerLitAspectProperties>();
  
  public Map<IntegerLit, IntegerLitAspectIntegerLitAspectProperties> getMap() {
    return map;
  }
}
