package CompleteDSL;

import java.util.Map;
import CompleteDSL.BooleanAspectBooleanAspectProperties;

@SuppressWarnings("all")
public class BooleanAspectBooleanAspectContext {
  public final static BooleanAspectBooleanAspectContext INSTANCE = new BooleanAspectBooleanAspectContext();
  
  public static BooleanAspectBooleanAspectProperties getSelf(final CompleteDSLPckg.Boolean _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new CompleteDSL.BooleanAspectBooleanAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<CompleteDSLPckg.Boolean, BooleanAspectBooleanAspectProperties> map = new java.util.WeakHashMap<CompleteDSLPckg.Boolean, CompleteDSL.BooleanAspectBooleanAspectProperties>();
  
  public Map<CompleteDSLPckg.Boolean, BooleanAspectBooleanAspectProperties> getMap() {
    return map;
  }
}
