package CompleteDSL;

import CompleteDSLPckg.ArithmeticExpr;
import java.util.Map;
import CompleteDSL.ArithmeticExprAspectArithmeticExprAspectProperties;

@SuppressWarnings("all")
public class ArithmeticExprAspectArithmeticExprAspectContext {
  public final static ArithmeticExprAspectArithmeticExprAspectContext INSTANCE = new ArithmeticExprAspectArithmeticExprAspectContext();
  
  public static ArithmeticExprAspectArithmeticExprAspectProperties getSelf(final ArithmeticExpr _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new CompleteDSL.ArithmeticExprAspectArithmeticExprAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ArithmeticExpr, ArithmeticExprAspectArithmeticExprAspectProperties> map = new java.util.WeakHashMap<CompleteDSLPckg.ArithmeticExpr, CompleteDSL.ArithmeticExprAspectArithmeticExprAspectProperties>();
  
  public Map<ArithmeticExpr, ArithmeticExprAspectArithmeticExprAspectProperties> getMap() {
    return map;
  }
}
