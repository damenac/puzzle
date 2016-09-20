package CompleteDSL;

import CompleteDSLPckg.BinaryExpr;
import java.util.Map;
import CompleteDSL.BinaryExprAspectBinaryExprAspectProperties;

@SuppressWarnings("all")
public class BinaryExprAspectBinaryExprAspectContext {
  public final static BinaryExprAspectBinaryExprAspectContext INSTANCE = new BinaryExprAspectBinaryExprAspectContext();
  
  public static BinaryExprAspectBinaryExprAspectProperties getSelf(final BinaryExpr _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new CompleteDSL.BinaryExprAspectBinaryExprAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BinaryExpr, BinaryExprAspectBinaryExprAspectProperties> map = new java.util.WeakHashMap<CompleteDSLPckg.BinaryExpr, CompleteDSL.BinaryExprAspectBinaryExprAspectProperties>();
  
  public Map<BinaryExpr, BinaryExprAspectBinaryExprAspectProperties> getMap() {
    return map;
  }
}
