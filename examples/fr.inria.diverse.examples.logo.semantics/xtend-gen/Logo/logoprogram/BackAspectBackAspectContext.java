package Logo.logoprogram;

import Logo.Back;
import Logo.logoprogram.BackAspectBackAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class BackAspectBackAspectContext {
  public final static BackAspectBackAspectContext INSTANCE = new BackAspectBackAspectContext();
  
  public static BackAspectBackAspectProperties getSelf(final Back _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Logo.logoprogram.BackAspectBackAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Back, BackAspectBackAspectProperties> map = new java.util.WeakHashMap<Logo.Back, Logo.logoprogram.BackAspectBackAspectProperties>();
  
  public Map<Back, BackAspectBackAspectProperties> getMap() {
    return map;
  }
}
