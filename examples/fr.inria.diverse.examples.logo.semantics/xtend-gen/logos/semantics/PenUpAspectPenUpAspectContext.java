package logos.semantics;

import Logo.PenUp;
import java.util.Map;
import logos.semantics.PenUpAspectPenUpAspectProperties;

@SuppressWarnings("all")
public class PenUpAspectPenUpAspectContext {
  public final static PenUpAspectPenUpAspectContext INSTANCE = new PenUpAspectPenUpAspectContext();
  
  public static PenUpAspectPenUpAspectProperties getSelf(final PenUp _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logos.semantics.PenUpAspectPenUpAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<PenUp, PenUpAspectPenUpAspectProperties> map = new java.util.WeakHashMap<Logo.PenUp, logos.semantics.PenUpAspectPenUpAspectProperties>();
  
  public Map<PenUp, PenUpAspectPenUpAspectProperties> getMap() {
    return map;
  }
}
