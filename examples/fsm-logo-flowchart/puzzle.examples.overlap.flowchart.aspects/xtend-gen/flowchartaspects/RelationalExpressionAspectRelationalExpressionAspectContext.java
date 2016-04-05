package flowchartaspects;

import flowchartaspects.RelationalExpressionAspectRelationalExpressionAspectProperties;
import flowchartpck.RelationalExpression;
import java.util.Map;

@SuppressWarnings("all")
public class RelationalExpressionAspectRelationalExpressionAspectContext {
  public final static RelationalExpressionAspectRelationalExpressionAspectContext INSTANCE = new RelationalExpressionAspectRelationalExpressionAspectContext();
  
  public static RelationalExpressionAspectRelationalExpressionAspectProperties getSelf(final RelationalExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new flowchartaspects.RelationalExpressionAspectRelationalExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<RelationalExpression, RelationalExpressionAspectRelationalExpressionAspectProperties> map = new java.util.WeakHashMap<flowchartpck.RelationalExpression, flowchartaspects.RelationalExpressionAspectRelationalExpressionAspectProperties>();
  
  public Map<RelationalExpression, RelationalExpressionAspectRelationalExpressionAspectProperties> getMap() {
    return map;
  }
}
