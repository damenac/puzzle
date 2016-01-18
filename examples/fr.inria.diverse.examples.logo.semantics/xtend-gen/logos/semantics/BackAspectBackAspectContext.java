package logos.semantics;

import Logo.Back;
import java.util.Map;
import logos.semantics.BackAspectBackAspectProperties;

@SuppressWarnings("all")
public class BackAspectBackAspectContext {
  public final static BackAspectBackAspectContext INSTANCE = new BackAspectBackAspectContext();
  
  public static BackAspectBackAspectProperties getSelf(final Back _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logos.semantics.BackAspectBackAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Back, BackAspectBackAspectProperties> map = new java.util.WeakHashMap<Logo.Back, logos.semantics.BackAspectBackAspectProperties>();
  
  public Map<Back, BackAspectBackAspectProperties> getMap() {
    return map;
  }
}
