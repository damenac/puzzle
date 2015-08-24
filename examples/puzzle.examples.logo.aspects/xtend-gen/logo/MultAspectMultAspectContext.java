package logo;

import java.util.Map;
import kmLogo.Mult;
import logo.MultAspectMultAspectProperties;

@SuppressWarnings("all")
public class MultAspectMultAspectContext {
  public final static MultAspectMultAspectContext INSTANCE = new MultAspectMultAspectContext();
  
  public static MultAspectMultAspectProperties getSelf(final Mult _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logo.MultAspectMultAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Mult, MultAspectMultAspectProperties> map = new java.util.WeakHashMap<kmLogo.Mult, logo.MultAspectMultAspectProperties>();
  
  public Map<Mult, MultAspectMultAspectProperties> getMap() {
    return map;
  }
}
