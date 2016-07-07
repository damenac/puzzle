package CompleteDSL;

import CompleteDSLPckg.ArithmeticExpression;
import CompleteDSL.ArithmeticExpressionAspectArithmeticExpressionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ArithmeticExpressionAspectArithmeticExpressionAspectContext {
  public final static ArithmeticExpressionAspectArithmeticExpressionAspectContext INSTANCE = new ArithmeticExpressionAspectArithmeticExpressionAspectContext();
  
  public static ArithmeticExpressionAspectArithmeticExpressionAspectProperties getSelf(final ArithmeticExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new CompleteDSL.ArithmeticExpressionAspectArithmeticExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ArithmeticExpression, ArithmeticExpressionAspectArithmeticExpressionAspectProperties> map = new java.util.WeakHashMap<CompleteDSLPckg.ArithmeticExpression, CompleteDSL.ArithmeticExpressionAspectArithmeticExpressionAspectProperties>();
  
  public Map<ArithmeticExpression, ArithmeticExpressionAspectArithmeticExpressionAspectProperties> getMap() {
    return map;
  }
}
