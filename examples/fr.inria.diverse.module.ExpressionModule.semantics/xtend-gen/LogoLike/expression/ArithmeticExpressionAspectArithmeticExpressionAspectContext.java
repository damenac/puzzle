package LogoLike.expression;

import ExpressionModule.ArithmeticExpression;
import LogoLike.expression.ArithmeticExpressionAspectArithmeticExpressionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ArithmeticExpressionAspectArithmeticExpressionAspectContext {
  public final static ArithmeticExpressionAspectArithmeticExpressionAspectContext INSTANCE = new ArithmeticExpressionAspectArithmeticExpressionAspectContext();
  
  public static ArithmeticExpressionAspectArithmeticExpressionAspectProperties getSelf(final ArithmeticExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new LogoLike.expression.ArithmeticExpressionAspectArithmeticExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ArithmeticExpression, ArithmeticExpressionAspectArithmeticExpressionAspectProperties> map = new java.util.WeakHashMap<ExpressionModule.ArithmeticExpression, LogoLike.expression.ArithmeticExpressionAspectArithmeticExpressionAspectProperties>();
  
  public Map<ArithmeticExpression, ArithmeticExpressionAspectArithmeticExpressionAspectProperties> getMap() {
    return map;
  }
}
