package Logo.logoprogram;

import Logo.While;
import Logo.logoprogram.WhileAspectWhileAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class WhileAspectWhileAspectContext {
  public final static WhileAspectWhileAspectContext INSTANCE = new WhileAspectWhileAspectContext();
  
  public static WhileAspectWhileAspectProperties getSelf(final While _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Logo.logoprogram.WhileAspectWhileAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<While, WhileAspectWhileAspectProperties> map = new java.util.WeakHashMap<Logo.While, Logo.logoprogram.WhileAspectWhileAspectProperties>();
  
  public Map<While, WhileAspectWhileAspectProperties> getMap() {
    return map;
  }
}
