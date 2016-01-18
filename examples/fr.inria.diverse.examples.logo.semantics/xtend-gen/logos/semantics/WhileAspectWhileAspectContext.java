package logos.semantics;

import Logo.While;
import java.util.Map;
import logos.semantics.WhileAspectWhileAspectProperties;

@SuppressWarnings("all")
public class WhileAspectWhileAspectContext {
  public final static WhileAspectWhileAspectContext INSTANCE = new WhileAspectWhileAspectContext();
  
  public static WhileAspectWhileAspectProperties getSelf(final While _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logos.semantics.WhileAspectWhileAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<While, WhileAspectWhileAspectProperties> map = new java.util.WeakHashMap<Logo.While, logos.semantics.WhileAspectWhileAspectProperties>();
  
  public Map<While, WhileAspectWhileAspectProperties> getMap() {
    return map;
  }
}
