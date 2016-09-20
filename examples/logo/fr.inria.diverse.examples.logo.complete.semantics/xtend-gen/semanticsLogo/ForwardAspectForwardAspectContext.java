package semanticsLogo;

import Logo.Forward;
import java.util.Map;
import semanticsLogo.ForwardAspectForwardAspectProperties;

@SuppressWarnings("all")
public class ForwardAspectForwardAspectContext {
  public final static ForwardAspectForwardAspectContext INSTANCE = new ForwardAspectForwardAspectContext();
  
  public static ForwardAspectForwardAspectProperties getSelf(final Forward _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new semanticsLogo.ForwardAspectForwardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Forward, ForwardAspectForwardAspectProperties> map = new java.util.WeakHashMap<Logo.Forward, semanticsLogo.ForwardAspectForwardAspectProperties>();
  
  public Map<Forward, ForwardAspectForwardAspectProperties> getMap() {
    return map;
  }
}
