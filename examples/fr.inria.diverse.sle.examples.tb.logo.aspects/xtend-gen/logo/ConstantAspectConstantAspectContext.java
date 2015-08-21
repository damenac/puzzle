package logo;

import java.util.Map;
import kmLogo.Constant;
import logo.ConstantAspectConstantAspectProperties;

@SuppressWarnings("all")
public class ConstantAspectConstantAspectContext {
  public final static ConstantAspectConstantAspectContext INSTANCE = new ConstantAspectConstantAspectContext();
  
  public static ConstantAspectConstantAspectProperties getSelf(final Constant _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logo.ConstantAspectConstantAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Constant, ConstantAspectConstantAspectProperties> map = new java.util.WeakHashMap<kmLogo.Constant, logo.ConstantAspectConstantAspectProperties>();
  
  public Map<Constant, ConstantAspectConstantAspectProperties> getMap() {
    return map;
  }
}
