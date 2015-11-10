package Logo.expression;

import ExpressionModule.BoolLit;
import Logo.expression.BoolLitAspectBoolLitAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class BoolLitAspectBoolLitAspectContext {
  public final static BoolLitAspectBoolLitAspectContext INSTANCE = new BoolLitAspectBoolLitAspectContext();
  
  public static BoolLitAspectBoolLitAspectProperties getSelf(final BoolLit _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Logo.expression.BoolLitAspectBoolLitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BoolLit, BoolLitAspectBoolLitAspectProperties> map = new java.util.WeakHashMap<ExpressionModule.BoolLit, Logo.expression.BoolLitAspectBoolLitAspectProperties>();
  
  public Map<BoolLit, BoolLitAspectBoolLitAspectProperties> getMap() {
    return map;
  }
}
