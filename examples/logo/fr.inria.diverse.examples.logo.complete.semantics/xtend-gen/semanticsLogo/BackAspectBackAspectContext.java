package semanticsLogo;

import Logo.Back;
import java.util.Map;
import semanticsLogo.BackAspectBackAspectProperties;

@SuppressWarnings("all")
public class BackAspectBackAspectContext {
  public final static BackAspectBackAspectContext INSTANCE = new BackAspectBackAspectContext();
  
  public static BackAspectBackAspectProperties getSelf(final Back _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new semanticsLogo.BackAspectBackAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Back, BackAspectBackAspectProperties> map = new java.util.WeakHashMap<Logo.Back, semanticsLogo.BackAspectBackAspectProperties>();
  
  public Map<Back, BackAspectBackAspectProperties> getMap() {
    return map;
  }
}
