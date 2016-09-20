package semanticsLogo;

import Logo.LogoProgram;
import java.util.Map;
import semanticsLogo.LogoProgramAspectLogoProgramAspectProperties;

@SuppressWarnings("all")
public class LogoProgramAspectLogoProgramAspectContext {
  public final static LogoProgramAspectLogoProgramAspectContext INSTANCE = new LogoProgramAspectLogoProgramAspectContext();
  
  public static LogoProgramAspectLogoProgramAspectProperties getSelf(final LogoProgram _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new semanticsLogo.LogoProgramAspectLogoProgramAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LogoProgram, LogoProgramAspectLogoProgramAspectProperties> map = new java.util.WeakHashMap<Logo.LogoProgram, semanticsLogo.LogoProgramAspectLogoProgramAspectProperties>();
  
  public Map<LogoProgram, LogoProgramAspectLogoProgramAspectProperties> getMap() {
    return map;
  }
}
