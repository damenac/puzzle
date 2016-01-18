package logos.semantics;

import Logo.If;
import java.util.Map;
import logos.semantics.IfAspectIfAspectProperties;

@SuppressWarnings("all")
public class IfAspectIfAspectContext {
  public final static IfAspectIfAspectContext INSTANCE = new IfAspectIfAspectContext();
  
  public static IfAspectIfAspectProperties getSelf(final If _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logos.semantics.IfAspectIfAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<If, IfAspectIfAspectProperties> map = new java.util.WeakHashMap<Logo.If, logos.semantics.IfAspectIfAspectProperties>();
  
  public Map<If, IfAspectIfAspectProperties> getMap() {
    return map;
  }
}
