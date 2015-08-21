package logo;

import java.util.Map;
import kmLogo.Minus;
import logo.MinusAspectMinusAspectProperties;

@SuppressWarnings("all")
public class MinusAspectMinusAspectContext {
  public final static MinusAspectMinusAspectContext INSTANCE = new MinusAspectMinusAspectContext();
  
  public static MinusAspectMinusAspectProperties getSelf(final Minus _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logo.MinusAspectMinusAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Minus, MinusAspectMinusAspectProperties> map = new java.util.WeakHashMap<kmLogo.Minus, logo.MinusAspectMinusAspectProperties>();
  
  public Map<Minus, MinusAspectMinusAspectProperties> getMap() {
    return map;
  }
}
