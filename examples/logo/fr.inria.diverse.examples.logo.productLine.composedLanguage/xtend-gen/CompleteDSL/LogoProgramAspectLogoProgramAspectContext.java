package CompleteDSL;

import CompleteDSLPckg.LogoProgram;
import java.util.Map;
import CompleteDSL.LogoProgramAspectLogoProgramAspectProperties;

@SuppressWarnings("all")
public class LogoProgramAspectLogoProgramAspectContext {
  public final static LogoProgramAspectLogoProgramAspectContext INSTANCE = new LogoProgramAspectLogoProgramAspectContext();
  
  public static LogoProgramAspectLogoProgramAspectProperties getSelf(final LogoProgram _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new CompleteDSL.LogoProgramAspectLogoProgramAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LogoProgram, LogoProgramAspectLogoProgramAspectProperties> map = new java.util.WeakHashMap<CompleteDSLPckg.LogoProgram, CompleteDSL.LogoProgramAspectLogoProgramAspectProperties>();
  
  public Map<LogoProgram, LogoProgramAspectLogoProgramAspectProperties> getMap() {
    return map;
  }
}
