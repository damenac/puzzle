package logos.semantics;

import Logo.Forward;
import java.util.Map;
import logos.semantics.ForwardAspectForwardAspectProperties;

@SuppressWarnings("all")
public class ForwardAspectForwardAspectContext {
  public final static ForwardAspectForwardAspectContext INSTANCE = new ForwardAspectForwardAspectContext();
  
  public static ForwardAspectForwardAspectProperties getSelf(final Forward _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logos.semantics.ForwardAspectForwardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Forward, ForwardAspectForwardAspectProperties> map = new java.util.WeakHashMap<Logo.Forward, logos.semantics.ForwardAspectForwardAspectProperties>();
  
  public Map<Forward, ForwardAspectForwardAspectProperties> getMap() {
    return map;
  }
}
