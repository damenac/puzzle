package logo;

import java.util.Map;
import kmLogo.Plus;
import logo.PlusAspectPlusAspectProperties;

@SuppressWarnings("all")
public class PlusAspectPlusAspectContext {
  public final static PlusAspectPlusAspectContext INSTANCE = new PlusAspectPlusAspectContext();
  
  public static PlusAspectPlusAspectProperties getSelf(final Plus _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logo.PlusAspectPlusAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Plus, PlusAspectPlusAspectProperties> map = new java.util.WeakHashMap<kmLogo.Plus, logo.PlusAspectPlusAspectProperties>();
  
  public Map<Plus, PlusAspectPlusAspectProperties> getMap() {
    return map;
  }
}
