package semanticsLogoControlStructures;

import ControlStructures.While;
import java.util.Map;
import semanticsLogoControlStructures.WhileAspectWhileAspectProperties;

@SuppressWarnings("all")
public class WhileAspectWhileAspectContext {
  public final static WhileAspectWhileAspectContext INSTANCE = new WhileAspectWhileAspectContext();
  
  public static WhileAspectWhileAspectProperties getSelf(final While _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new semanticsLogoControlStructures.WhileAspectWhileAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<While, WhileAspectWhileAspectProperties> map = new java.util.WeakHashMap<ControlStructures.While, semanticsLogoControlStructures.WhileAspectWhileAspectProperties>();
  
  public Map<While, WhileAspectWhileAspectProperties> getMap() {
    return map;
  }
}
