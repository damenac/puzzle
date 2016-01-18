package Logo.logoprogram;

import Logo.ParameterCall;
import Logo.logoprogram.ParameterCallAspectParameterCallAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ParameterCallAspectParameterCallAspectContext {
  public final static ParameterCallAspectParameterCallAspectContext INSTANCE = new ParameterCallAspectParameterCallAspectContext();
  
  public static ParameterCallAspectParameterCallAspectProperties getSelf(final ParameterCall _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Logo.logoprogram.ParameterCallAspectParameterCallAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ParameterCall, ParameterCallAspectParameterCallAspectProperties> map = new java.util.WeakHashMap<Logo.ParameterCall, Logo.logoprogram.ParameterCallAspectParameterCallAspectProperties>();
  
  public Map<ParameterCall, ParameterCallAspectParameterCallAspectProperties> getMap() {
    return map;
  }
}
