package semanticsLogo;

import Logo.Left;
import java.util.Map;
import semanticsLogo.LeftAspectLeftAspectProperties;

@SuppressWarnings("all")
public class LeftAspectLeftAspectContext {
  public final static LeftAspectLeftAspectContext INSTANCE = new LeftAspectLeftAspectContext();
  
  public static LeftAspectLeftAspectProperties getSelf(final Left _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new semanticsLogo.LeftAspectLeftAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Left, LeftAspectLeftAspectProperties> map = new java.util.WeakHashMap<Logo.Left, semanticsLogo.LeftAspectLeftAspectProperties>();
  
  public Map<Left, LeftAspectLeftAspectProperties> getMap() {
    return map;
  }
}
