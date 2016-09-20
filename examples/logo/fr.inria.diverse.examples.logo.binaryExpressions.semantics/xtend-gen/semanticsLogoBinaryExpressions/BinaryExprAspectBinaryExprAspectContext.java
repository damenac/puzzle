package semanticsLogoBinaryExpressions;

import BinaryExpressions.BinaryExpr;
import java.util.Map;
import semanticsLogoBinaryExpressions.BinaryExprAspectBinaryExprAspectProperties;

@SuppressWarnings("all")
public class BinaryExprAspectBinaryExprAspectContext {
  public final static BinaryExprAspectBinaryExprAspectContext INSTANCE = new BinaryExprAspectBinaryExprAspectContext();
  
  public static BinaryExprAspectBinaryExprAspectProperties getSelf(final BinaryExpr _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new semanticsLogoBinaryExpressions.BinaryExprAspectBinaryExprAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BinaryExpr, BinaryExprAspectBinaryExprAspectProperties> map = new java.util.WeakHashMap<BinaryExpressions.BinaryExpr, semanticsLogoBinaryExpressions.BinaryExprAspectBinaryExprAspectProperties>();
  
  public Map<BinaryExpr, BinaryExprAspectBinaryExprAspectProperties> getMap() {
    return map;
  }
}
