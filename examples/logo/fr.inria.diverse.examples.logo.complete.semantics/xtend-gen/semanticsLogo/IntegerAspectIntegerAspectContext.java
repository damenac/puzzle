package semanticsLogo;

import java.util.Map;
import semanticsLogo.IntegerAspectIntegerAspectProperties;

@SuppressWarnings("all")
public class IntegerAspectIntegerAspectContext {
  public final static IntegerAspectIntegerAspectContext INSTANCE = new IntegerAspectIntegerAspectContext();
  
  public static IntegerAspectIntegerAspectProperties getSelf(final Logo.Integer _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new semanticsLogo.IntegerAspectIntegerAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Logo.Integer, IntegerAspectIntegerAspectProperties> map = new java.util.WeakHashMap<Logo.Integer, semanticsLogo.IntegerAspectIntegerAspectProperties>();
  
  public Map<Logo.Integer, IntegerAspectIntegerAspectProperties> getMap() {
    return map;
  }
}
