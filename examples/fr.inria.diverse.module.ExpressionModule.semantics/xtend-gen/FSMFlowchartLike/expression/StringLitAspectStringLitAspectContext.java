package FSMFlowchartLike.expression;

import ExpressionModule.StringLit;
import FSMFlowchartLike.expression.StringLitAspectStringLitAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class StringLitAspectStringLitAspectContext {
  public final static StringLitAspectStringLitAspectContext INSTANCE = new StringLitAspectStringLitAspectContext();
  
  public static StringLitAspectStringLitAspectProperties getSelf(final StringLit _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new FSMFlowchartLike.expression.StringLitAspectStringLitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringLit, StringLitAspectStringLitAspectProperties> map = new java.util.WeakHashMap<ExpressionModule.StringLit, FSMFlowchartLike.expression.StringLitAspectStringLitAspectProperties>();
  
  public Map<StringLit, StringLitAspectStringLitAspectProperties> getMap() {
    return map;
  }
}
