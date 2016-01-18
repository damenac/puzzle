package Logo.logoprogram;

import Logo.Clear;
import Logo.logoprogram.ClearAspectClearAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ClearAspectClearAspectContext {
  public final static ClearAspectClearAspectContext INSTANCE = new ClearAspectClearAspectContext();
  
  public static ClearAspectClearAspectProperties getSelf(final Clear _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Logo.logoprogram.ClearAspectClearAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Clear, ClearAspectClearAspectProperties> map = new java.util.WeakHashMap<Logo.Clear, Logo.logoprogram.ClearAspectClearAspectProperties>();
  
  public Map<Clear, ClearAspectClearAspectProperties> getMap() {
    return map;
  }
}
