package Logo.logoprogram;

import Logo.LogoProgram;
import Logo.logoprogram.LogoProgramAspectLogoProgramAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class LogoProgramAspectLogoProgramAspectContext {
  public final static LogoProgramAspectLogoProgramAspectContext INSTANCE = new LogoProgramAspectLogoProgramAspectContext();
  
  public static LogoProgramAspectLogoProgramAspectProperties getSelf(final LogoProgram _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Logo.logoprogram.LogoProgramAspectLogoProgramAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LogoProgram, LogoProgramAspectLogoProgramAspectProperties> map = new java.util.WeakHashMap<Logo.LogoProgram, Logo.logoprogram.LogoProgramAspectLogoProgramAspectProperties>();
  
  public Map<LogoProgram, LogoProgramAspectLogoProgramAspectProperties> getMap() {
    return map;
  }
}
