package logo;

import java.util.Map;
import kmLogo.ParameterCall;
import logo.ParameterCallAspectParameterCallAspectProperties;

@SuppressWarnings("all")
public class ParameterCallAspectParameterCallAspectContext {
  public final static ParameterCallAspectParameterCallAspectContext INSTANCE = new ParameterCallAspectParameterCallAspectContext();
  
  public static ParameterCallAspectParameterCallAspectProperties getSelf(final ParameterCall _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logo.ParameterCallAspectParameterCallAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ParameterCall, ParameterCallAspectParameterCallAspectProperties> map = new java.util.WeakHashMap<kmLogo.ParameterCall, logo.ParameterCallAspectParameterCallAspectProperties>();
  
  public Map<ParameterCall, ParameterCallAspectParameterCallAspectProperties> getMap() {
    return map;
  }
}
