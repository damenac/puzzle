package semanticsLogo;

import java.util.Map;
import semanticsLogo.StringAspectStringAspectProperties;

@SuppressWarnings("all")
public class StringAspectStringAspectContext {
  public final static StringAspectStringAspectContext INSTANCE = new StringAspectStringAspectContext();
  
  public static StringAspectStringAspectProperties getSelf(final Logo.String _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new semanticsLogo.StringAspectStringAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Logo.String, StringAspectStringAspectProperties> map = new java.util.WeakHashMap<Logo.String, semanticsLogo.StringAspectStringAspectProperties>();
  
  public Map<Logo.String, StringAspectStringAspectProperties> getMap() {
    return map;
  }
}
