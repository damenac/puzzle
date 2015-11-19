package logo;

import java.util.Map;
import kmLogo.LogoProgram;
import logo.LogoProgramAspectLogoProgramAspectProperties;

@SuppressWarnings("all")
public class LogoProgramAspectLogoProgramAspectContext {
  public final static LogoProgramAspectLogoProgramAspectContext INSTANCE = new LogoProgramAspectLogoProgramAspectContext();
  
  public static LogoProgramAspectLogoProgramAspectProperties getSelf(final LogoProgram _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logo.LogoProgramAspectLogoProgramAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LogoProgram, LogoProgramAspectLogoProgramAspectProperties> map = new java.util.WeakHashMap<kmLogo.LogoProgram, logo.LogoProgramAspectLogoProgramAspectProperties>();
  
  public Map<LogoProgram, LogoProgramAspectLogoProgramAspectProperties> getMap() {
    return map;
  }
}
