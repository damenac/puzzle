package Logo.logoprogram;

import Logo.Right;
import Logo.logoprogram.RightAspectRightAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class RightAspectRightAspectContext {
  public final static RightAspectRightAspectContext INSTANCE = new RightAspectRightAspectContext();
  
  public static RightAspectRightAspectProperties getSelf(final Right _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Logo.logoprogram.RightAspectRightAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Right, RightAspectRightAspectProperties> map = new java.util.WeakHashMap<Logo.Right, Logo.logoprogram.RightAspectRightAspectProperties>();
  
  public Map<Right, RightAspectRightAspectProperties> getMap() {
    return map;
  }
}
