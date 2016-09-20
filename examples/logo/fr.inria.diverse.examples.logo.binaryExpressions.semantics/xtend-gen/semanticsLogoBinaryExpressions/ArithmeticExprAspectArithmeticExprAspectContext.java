package semanticsLogoBinaryExpressions;

import BinaryExpressions.ArithmeticExpr;
import java.util.Map;
import semanticsLogoBinaryExpressions.ArithmeticExprAspectArithmeticExprAspectProperties;

@SuppressWarnings("all")
public class ArithmeticExprAspectArithmeticExprAspectContext {
  public final static ArithmeticExprAspectArithmeticExprAspectContext INSTANCE = new ArithmeticExprAspectArithmeticExprAspectContext();
  
  public static ArithmeticExprAspectArithmeticExprAspectProperties getSelf(final ArithmeticExpr _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new semanticsLogoBinaryExpressions.ArithmeticExprAspectArithmeticExprAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ArithmeticExpr, ArithmeticExprAspectArithmeticExprAspectProperties> map = new java.util.WeakHashMap<BinaryExpressions.ArithmeticExpr, semanticsLogoBinaryExpressions.ArithmeticExprAspectArithmeticExprAspectProperties>();
  
  public Map<ArithmeticExpr, ArithmeticExprAspectArithmeticExprAspectProperties> getMap() {
    return map;
  }
}
