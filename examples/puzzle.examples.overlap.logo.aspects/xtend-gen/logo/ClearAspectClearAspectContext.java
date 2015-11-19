package logo;

import java.util.Map;
import kmLogo.Clear;
import logo.ClearAspectClearAspectProperties;

@SuppressWarnings("all")
public class ClearAspectClearAspectContext {
  public final static ClearAspectClearAspectContext INSTANCE = new ClearAspectClearAspectContext();
  
  public static ClearAspectClearAspectProperties getSelf(final Clear _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logo.ClearAspectClearAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Clear, ClearAspectClearAspectProperties> map = new java.util.WeakHashMap<kmLogo.Clear, logo.ClearAspectClearAspectProperties>();
  
  public Map<Clear, ClearAspectClearAspectProperties> getMap() {
    return map;
  }
}
