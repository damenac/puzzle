package logos.semantics;

import Logo.PenDown;
import java.util.Map;
import logos.semantics.PenDownAspectPenDownAspectProperties;

@SuppressWarnings("all")
public class PenDownAspectPenDownAspectContext {
  public final static PenDownAspectPenDownAspectContext INSTANCE = new PenDownAspectPenDownAspectContext();
  
  public static PenDownAspectPenDownAspectProperties getSelf(final PenDown _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logos.semantics.PenDownAspectPenDownAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<PenDown, PenDownAspectPenDownAspectProperties> map = new java.util.WeakHashMap<Logo.PenDown, logos.semantics.PenDownAspectPenDownAspectProperties>();
  
  public Map<PenDown, PenDownAspectPenDownAspectProperties> getMap() {
    return map;
  }
}
