package logo;

import java.util.Map;
import kmLogo.Greater;
import logo.GreaterAspectGreaterAspectProperties;

@SuppressWarnings("all")
public class GreaterAspectGreaterAspectContext {
  public final static GreaterAspectGreaterAspectContext INSTANCE = new GreaterAspectGreaterAspectContext();
  
  public static GreaterAspectGreaterAspectProperties getSelf(final Greater _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logo.GreaterAspectGreaterAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Greater, GreaterAspectGreaterAspectProperties> map = new java.util.WeakHashMap<kmLogo.Greater, logo.GreaterAspectGreaterAspectProperties>();
  
  public Map<Greater, GreaterAspectGreaterAspectProperties> getMap() {
    return map;
  }
}
