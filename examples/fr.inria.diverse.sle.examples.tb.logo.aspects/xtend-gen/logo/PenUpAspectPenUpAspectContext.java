package logo;

import java.util.Map;
import kmLogo.PenUp;
import logo.PenUpAspectPenUpAspectProperties;

@SuppressWarnings("all")
public class PenUpAspectPenUpAspectContext {
  public final static PenUpAspectPenUpAspectContext INSTANCE = new PenUpAspectPenUpAspectContext();
  
  public static PenUpAspectPenUpAspectProperties getSelf(final PenUp _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logo.PenUpAspectPenUpAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<PenUp, PenUpAspectPenUpAspectProperties> map = new java.util.WeakHashMap<kmLogo.PenUp, logo.PenUpAspectPenUpAspectProperties>();
  
  public Map<PenUp, PenUpAspectPenUpAspectProperties> getMap() {
    return map;
  }
}
