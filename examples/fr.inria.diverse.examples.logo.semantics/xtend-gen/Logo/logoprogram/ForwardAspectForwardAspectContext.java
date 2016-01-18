package Logo.logoprogram;

import Logo.Forward;
import Logo.logoprogram.ForwardAspectForwardAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ForwardAspectForwardAspectContext {
  public final static ForwardAspectForwardAspectContext INSTANCE = new ForwardAspectForwardAspectContext();
  
  public static ForwardAspectForwardAspectProperties getSelf(final Forward _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Logo.logoprogram.ForwardAspectForwardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Forward, ForwardAspectForwardAspectProperties> map = new java.util.WeakHashMap<Logo.Forward, Logo.logoprogram.ForwardAspectForwardAspectProperties>();
  
  public Map<Forward, ForwardAspectForwardAspectProperties> getMap() {
    return map;
  }
}
