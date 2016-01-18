package Logo.logoprogram;

import Logo.Parameter;
import Logo.logoprogram.ParameterAspectParameterAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ParameterAspectParameterAspectContext {
  public final static ParameterAspectParameterAspectContext INSTANCE = new ParameterAspectParameterAspectContext();
  
  public static ParameterAspectParameterAspectProperties getSelf(final Parameter _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Logo.logoprogram.ParameterAspectParameterAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Parameter, ParameterAspectParameterAspectProperties> map = new java.util.WeakHashMap<Logo.Parameter, Logo.logoprogram.ParameterAspectParameterAspectProperties>();
  
  public Map<Parameter, ParameterAspectParameterAspectProperties> getMap() {
    return map;
  }
}
