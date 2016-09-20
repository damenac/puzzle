package semanticsLogo;

import Logo.Right;
import java.util.Map;
import semanticsLogo.RightAspectRightAspectProperties;

@SuppressWarnings("all")
public class RightAspectRightAspectContext {
  public final static RightAspectRightAspectContext INSTANCE = new RightAspectRightAspectContext();
  
  public static RightAspectRightAspectProperties getSelf(final Right _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new semanticsLogo.RightAspectRightAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Right, RightAspectRightAspectProperties> map = new java.util.WeakHashMap<Logo.Right, semanticsLogo.RightAspectRightAspectProperties>();
  
  public Map<Right, RightAspectRightAspectProperties> getMap() {
    return map;
  }
}
