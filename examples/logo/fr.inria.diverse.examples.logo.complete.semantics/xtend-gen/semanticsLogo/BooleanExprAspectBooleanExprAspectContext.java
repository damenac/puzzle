package semanticsLogo;

import Logo.BooleanExpr;
import java.util.Map;
import semanticsLogo.BooleanExprAspectBooleanExprAspectProperties;

@SuppressWarnings("all")
public class BooleanExprAspectBooleanExprAspectContext {
  public final static BooleanExprAspectBooleanExprAspectContext INSTANCE = new BooleanExprAspectBooleanExprAspectContext();
  
  public static BooleanExprAspectBooleanExprAspectProperties getSelf(final BooleanExpr _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new semanticsLogo.BooleanExprAspectBooleanExprAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanExpr, BooleanExprAspectBooleanExprAspectProperties> map = new java.util.WeakHashMap<Logo.BooleanExpr, semanticsLogo.BooleanExprAspectBooleanExprAspectProperties>();
  
  public Map<BooleanExpr, BooleanExprAspectBooleanExprAspectProperties> getMap() {
    return map;
  }
}
