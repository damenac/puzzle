package FSM.expression;

import ExpressionModule.BoolLit;
import FSM.expression.BoolLitAspectBoolLitAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class BoolLitAspectBoolLitAspectContext {
  public final static BoolLitAspectBoolLitAspectContext INSTANCE = new BoolLitAspectBoolLitAspectContext();
  
  public static BoolLitAspectBoolLitAspectProperties getSelf(final BoolLit _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new FSM.expression.BoolLitAspectBoolLitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BoolLit, BoolLitAspectBoolLitAspectProperties> map = new java.util.WeakHashMap<ExpressionModule.BoolLit, FSM.expression.BoolLitAspectBoolLitAspectProperties>();
  
  public Map<BoolLit, BoolLitAspectBoolLitAspectProperties> getMap() {
    return map;
  }
}
