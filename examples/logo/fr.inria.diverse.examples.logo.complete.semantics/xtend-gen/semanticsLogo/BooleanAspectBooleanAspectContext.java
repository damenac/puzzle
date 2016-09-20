package semanticsLogo;

import java.util.Map;
import semanticsLogo.BooleanAspectBooleanAspectProperties;

@SuppressWarnings("all")
public class BooleanAspectBooleanAspectContext {
  public final static BooleanAspectBooleanAspectContext INSTANCE = new BooleanAspectBooleanAspectContext();
  
  public static BooleanAspectBooleanAspectProperties getSelf(final Logo.Boolean _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new semanticsLogo.BooleanAspectBooleanAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Logo.Boolean, BooleanAspectBooleanAspectProperties> map = new java.util.WeakHashMap<Logo.Boolean, semanticsLogo.BooleanAspectBooleanAspectProperties>();
  
  public Map<Logo.Boolean, BooleanAspectBooleanAspectProperties> getMap() {
    return map;
  }
}
