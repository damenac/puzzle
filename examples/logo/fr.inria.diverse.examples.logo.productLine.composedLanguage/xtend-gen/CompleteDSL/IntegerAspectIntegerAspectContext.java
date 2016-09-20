package CompleteDSL;

import java.util.Map;
import CompleteDSL.IntegerAspectIntegerAspectProperties;

@SuppressWarnings("all")
public class IntegerAspectIntegerAspectContext {
  public final static IntegerAspectIntegerAspectContext INSTANCE = new IntegerAspectIntegerAspectContext();
  
  public static IntegerAspectIntegerAspectProperties getSelf(final CompleteDSLPckg.Integer _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new CompleteDSL.IntegerAspectIntegerAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<CompleteDSLPckg.Integer, IntegerAspectIntegerAspectProperties> map = new java.util.WeakHashMap<CompleteDSLPckg.Integer, CompleteDSL.IntegerAspectIntegerAspectProperties>();
  
  public Map<CompleteDSLPckg.Integer, IntegerAspectIntegerAspectProperties> getMap() {
    return map;
  }
}
