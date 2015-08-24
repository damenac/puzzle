package logo;

import java.util.Map;
import kmLogo.Lower;
import logo.LowerAspectLowerAspectProperties;

@SuppressWarnings("all")
public class LowerAspectLowerAspectContext {
  public final static LowerAspectLowerAspectContext INSTANCE = new LowerAspectLowerAspectContext();
  
  public static LowerAspectLowerAspectProperties getSelf(final Lower _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logo.LowerAspectLowerAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Lower, LowerAspectLowerAspectProperties> map = new java.util.WeakHashMap<kmLogo.Lower, logo.LowerAspectLowerAspectProperties>();
  
  public Map<Lower, LowerAspectLowerAspectProperties> getMap() {
    return map;
  }
}
