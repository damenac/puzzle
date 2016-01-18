package Logo.logoprogram;

import Logo.PenDown;
import Logo.logoprogram.PenDownAspectPenDownAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class PenDownAspectPenDownAspectContext {
  public final static PenDownAspectPenDownAspectContext INSTANCE = new PenDownAspectPenDownAspectContext();
  
  public static PenDownAspectPenDownAspectProperties getSelf(final PenDown _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Logo.logoprogram.PenDownAspectPenDownAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<PenDown, PenDownAspectPenDownAspectProperties> map = new java.util.WeakHashMap<Logo.PenDown, Logo.logoprogram.PenDownAspectPenDownAspectProperties>();
  
  public Map<PenDown, PenDownAspectPenDownAspectProperties> getMap() {
    return map;
  }
}
