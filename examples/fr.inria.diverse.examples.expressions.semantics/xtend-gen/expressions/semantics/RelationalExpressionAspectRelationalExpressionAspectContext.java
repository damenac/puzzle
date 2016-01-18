package expressions.semantics;

import ExpressionPck.RelationalExpression;
import expressions.semantics.RelationalExpressionAspectRelationalExpressionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class RelationalExpressionAspectRelationalExpressionAspectContext {
  public final static RelationalExpressionAspectRelationalExpressionAspectContext INSTANCE = new RelationalExpressionAspectRelationalExpressionAspectContext();
  
  public static RelationalExpressionAspectRelationalExpressionAspectProperties getSelf(final RelationalExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new expressions.semantics.RelationalExpressionAspectRelationalExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<RelationalExpression, RelationalExpressionAspectRelationalExpressionAspectProperties> map = new java.util.WeakHashMap<ExpressionPck.RelationalExpression, expressions.semantics.RelationalExpressionAspectRelationalExpressionAspectProperties>();
  
  public Map<RelationalExpression, RelationalExpressionAspectRelationalExpressionAspectProperties> getMap() {
    return map;
  }
}
