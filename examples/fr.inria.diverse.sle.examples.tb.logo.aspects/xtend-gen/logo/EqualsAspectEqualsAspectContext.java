package logo;

import java.util.Map;
import kmLogo.Equals;
import logo.EqualsAspectEqualsAspectProperties;

@SuppressWarnings("all")
public class EqualsAspectEqualsAspectContext {
  public final static EqualsAspectEqualsAspectContext INSTANCE = new EqualsAspectEqualsAspectContext();
  
  public static EqualsAspectEqualsAspectProperties getSelf(final Equals _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logo.EqualsAspectEqualsAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Equals, EqualsAspectEqualsAspectProperties> map = new java.util.WeakHashMap<kmLogo.Equals, logo.EqualsAspectEqualsAspectProperties>();
  
  public Map<Equals, EqualsAspectEqualsAspectProperties> getMap() {
    return map;
  }
}
