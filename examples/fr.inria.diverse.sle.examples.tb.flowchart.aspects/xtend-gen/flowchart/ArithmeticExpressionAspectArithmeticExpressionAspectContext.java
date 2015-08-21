package flowchart;

import flowchart.ArithmeticExpression;
import flowchart.ArithmeticExpressionAspectArithmeticExpressionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ArithmeticExpressionAspectArithmeticExpressionAspectContext {
  public final static ArithmeticExpressionAspectArithmeticExpressionAspectContext INSTANCE = new ArithmeticExpressionAspectArithmeticExpressionAspectContext();
  
  public static ArithmeticExpressionAspectArithmeticExpressionAspectProperties getSelf(final ArithmeticExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new flowchart.ArithmeticExpressionAspectArithmeticExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ArithmeticExpression, ArithmeticExpressionAspectArithmeticExpressionAspectProperties> map = new java.util.WeakHashMap<flowchart.ArithmeticExpression, flowchart.ArithmeticExpressionAspectArithmeticExpressionAspectProperties>();
  
  public Map<ArithmeticExpression, ArithmeticExpressionAspectArithmeticExpressionAspectProperties> getMap() {
    return map;
  }
}
