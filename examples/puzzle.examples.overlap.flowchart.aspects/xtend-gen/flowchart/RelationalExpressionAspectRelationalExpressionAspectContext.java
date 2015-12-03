package flowchart;

import flowchart.RelationalExpressionAspectRelationalExpressionAspectProperties;
import flowchartpck.RelationalExpression;
import java.util.Map;

@SuppressWarnings("all")
public class RelationalExpressionAspectRelationalExpressionAspectContext {
  public final static RelationalExpressionAspectRelationalExpressionAspectContext INSTANCE = new RelationalExpressionAspectRelationalExpressionAspectContext();
  
  public static RelationalExpressionAspectRelationalExpressionAspectProperties getSelf(final RelationalExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new flowchart.RelationalExpressionAspectRelationalExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<RelationalExpression, RelationalExpressionAspectRelationalExpressionAspectProperties> map = new java.util.WeakHashMap<flowchartpck.RelationalExpression, flowchart.RelationalExpressionAspectRelationalExpressionAspectProperties>();
  
  public Map<RelationalExpression, RelationalExpressionAspectRelationalExpressionAspectProperties> getMap() {
    return map;
  }
}
