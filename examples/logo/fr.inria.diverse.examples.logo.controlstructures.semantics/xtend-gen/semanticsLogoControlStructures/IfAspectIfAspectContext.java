package semanticsLogoControlStructures;

import ControlStructures.If;
import java.util.Map;
import semanticsLogoControlStructures.IfAspectIfAspectProperties;

@SuppressWarnings("all")
public class IfAspectIfAspectContext {
  public final static IfAspectIfAspectContext INSTANCE = new IfAspectIfAspectContext();
  
  public static IfAspectIfAspectProperties getSelf(final If _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new semanticsLogoControlStructures.IfAspectIfAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<If, IfAspectIfAspectProperties> map = new java.util.WeakHashMap<ControlStructures.If, semanticsLogoControlStructures.IfAspectIfAspectProperties>();
  
  public Map<If, IfAspectIfAspectProperties> getMap() {
    return map;
  }
}
