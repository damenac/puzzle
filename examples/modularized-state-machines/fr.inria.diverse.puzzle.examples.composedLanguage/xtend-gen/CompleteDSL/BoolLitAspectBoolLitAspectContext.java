package CompleteDSL;

import CompleteDSLPckg.BoolLit;
import CompleteDSL.BoolLitAspectBoolLitAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class BoolLitAspectBoolLitAspectContext {
  public final static BoolLitAspectBoolLitAspectContext INSTANCE = new BoolLitAspectBoolLitAspectContext();
  
  public static BoolLitAspectBoolLitAspectProperties getSelf(final BoolLit _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new CompleteDSL.BoolLitAspectBoolLitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BoolLit, BoolLitAspectBoolLitAspectProperties> map = new java.util.WeakHashMap<CompleteDSLPckg.BoolLit, CompleteDSL.BoolLitAspectBoolLitAspectProperties>();
  
  public Map<BoolLit, BoolLitAspectBoolLitAspectProperties> getMap() {
    return map;
  }
}
