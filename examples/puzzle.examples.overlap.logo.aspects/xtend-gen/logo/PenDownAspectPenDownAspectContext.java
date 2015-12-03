package logo;

import java.util.Map;
import kmLogo.PenDown;
import logo.PenDownAspectPenDownAspectProperties;

@SuppressWarnings("all")
public class PenDownAspectPenDownAspectContext {
  public final static PenDownAspectPenDownAspectContext INSTANCE = new PenDownAspectPenDownAspectContext();
  
  public static PenDownAspectPenDownAspectProperties getSelf(final PenDown _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logo.PenDownAspectPenDownAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<PenDown, PenDownAspectPenDownAspectProperties> map = new java.util.WeakHashMap<kmLogo.PenDown, logo.PenDownAspectPenDownAspectProperties>();
  
  public Map<PenDown, PenDownAspectPenDownAspectProperties> getMap() {
    return map;
  }
}
