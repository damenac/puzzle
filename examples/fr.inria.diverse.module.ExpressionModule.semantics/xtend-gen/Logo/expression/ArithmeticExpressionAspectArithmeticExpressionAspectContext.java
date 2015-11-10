package Logo.expression;

import ExpressionModule.ArithmeticExpression;
import Logo.expression.ArithmeticExpressionAspectArithmeticExpressionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ArithmeticExpressionAspectArithmeticExpressionAspectContext {
  public final static ArithmeticExpressionAspectArithmeticExpressionAspectContext INSTANCE = new ArithmeticExpressionAspectArithmeticExpressionAspectContext();
  
  public static ArithmeticExpressionAspectArithmeticExpressionAspectProperties getSelf(final ArithmeticExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Logo.expression.ArithmeticExpressionAspectArithmeticExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ArithmeticExpression, ArithmeticExpressionAspectArithmeticExpressionAspectProperties> map = new java.util.WeakHashMap<ExpressionModule.ArithmeticExpression, Logo.expression.ArithmeticExpressionAspectArithmeticExpressionAspectProperties>();
  
  public Map<ArithmeticExpression, ArithmeticExpressionAspectArithmeticExpressionAspectProperties> getMap() {
    return map;
  }
}
