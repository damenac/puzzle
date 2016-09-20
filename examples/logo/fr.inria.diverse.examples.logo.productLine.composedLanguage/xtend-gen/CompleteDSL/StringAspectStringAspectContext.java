package CompleteDSL;

import java.util.Map;
import CompleteDSL.StringAspectStringAspectProperties;

@SuppressWarnings("all")
public class StringAspectStringAspectContext {
  public final static StringAspectStringAspectContext INSTANCE = new StringAspectStringAspectContext();
  
  public static StringAspectStringAspectProperties getSelf(final CompleteDSLPckg.String _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new CompleteDSL.StringAspectStringAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<CompleteDSLPckg.String, StringAspectStringAspectProperties> map = new java.util.WeakHashMap<CompleteDSLPckg.String, CompleteDSL.StringAspectStringAspectProperties>();
  
  public Map<CompleteDSLPckg.String, StringAspectStringAspectProperties> getMap() {
    return map;
  }
}
