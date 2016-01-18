package Logo.logoprogram;

import Logo.Left;
import Logo.logoprogram.LeftAspectLeftAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class LeftAspectLeftAspectContext {
  public final static LeftAspectLeftAspectContext INSTANCE = new LeftAspectLeftAspectContext();
  
  public static LeftAspectLeftAspectProperties getSelf(final Left _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Logo.logoprogram.LeftAspectLeftAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Left, LeftAspectLeftAspectProperties> map = new java.util.WeakHashMap<Logo.Left, Logo.logoprogram.LeftAspectLeftAspectProperties>();
  
  public Map<Left, LeftAspectLeftAspectProperties> getMap() {
    return map;
  }
}
