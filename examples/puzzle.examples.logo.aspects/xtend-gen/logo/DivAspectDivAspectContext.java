package logo;

import java.util.Map;
import kmLogo.Div;
import logo.DivAspectDivAspectProperties;

@SuppressWarnings("all")
public class DivAspectDivAspectContext {
  public final static DivAspectDivAspectContext INSTANCE = new DivAspectDivAspectContext();
  
  public static DivAspectDivAspectProperties getSelf(final Div _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logo.DivAspectDivAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Div, DivAspectDivAspectProperties> map = new java.util.WeakHashMap<kmLogo.Div, logo.DivAspectDivAspectProperties>();
  
  public Map<Div, DivAspectDivAspectProperties> getMap() {
    return map;
  }
}
