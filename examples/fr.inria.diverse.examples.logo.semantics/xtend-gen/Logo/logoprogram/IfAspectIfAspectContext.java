package Logo.logoprogram;

import Logo.If;
import Logo.logoprogram.IfAspectIfAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class IfAspectIfAspectContext {
  public final static IfAspectIfAspectContext INSTANCE = new IfAspectIfAspectContext();
  
  public static IfAspectIfAspectProperties getSelf(final If _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Logo.logoprogram.IfAspectIfAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<If, IfAspectIfAspectProperties> map = new java.util.WeakHashMap<Logo.If, Logo.logoprogram.IfAspectIfAspectProperties>();
  
  public Map<If, IfAspectIfAspectProperties> getMap() {
    return map;
  }
}
