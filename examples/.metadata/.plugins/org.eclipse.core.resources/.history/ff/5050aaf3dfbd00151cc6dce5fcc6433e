package Logo.logoprogram;

import Logo.PenUp;
import Logo.logoprogram.PenUpAspectPenUpAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class PenUpAspectPenUpAspectContext {
  public final static PenUpAspectPenUpAspectContext INSTANCE = new PenUpAspectPenUpAspectContext();
  
  public static PenUpAspectPenUpAspectProperties getSelf(final PenUp _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Logo.logoprogram.PenUpAspectPenUpAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<PenUp, PenUpAspectPenUpAspectProperties> map = new java.util.WeakHashMap<Logo.PenUp, Logo.logoprogram.PenUpAspectPenUpAspectProperties>();
  
  public Map<PenUp, PenUpAspectPenUpAspectProperties> getMap() {
    return map;
  }
}
