package logo;

import java.util.Map;
import kmLogo.Right;
import logo.RightAspectRightAspectProperties;

@SuppressWarnings("all")
public class RightAspectRightAspectContext {
  public final static RightAspectRightAspectContext INSTANCE = new RightAspectRightAspectContext();
  
  public static RightAspectRightAspectProperties getSelf(final Right _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logo.RightAspectRightAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Right, RightAspectRightAspectProperties> map = new java.util.WeakHashMap<kmLogo.Right, logo.RightAspectRightAspectProperties>();
  
  public Map<Right, RightAspectRightAspectProperties> getMap() {
    return map;
  }
}
