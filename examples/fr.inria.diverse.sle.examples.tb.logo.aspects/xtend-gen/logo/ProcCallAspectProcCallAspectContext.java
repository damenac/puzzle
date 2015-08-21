package logo;

import java.util.Map;
import kmLogo.ProcCall;
import logo.ProcCallAspectProcCallAspectProperties;

@SuppressWarnings("all")
public class ProcCallAspectProcCallAspectContext {
  public final static ProcCallAspectProcCallAspectContext INSTANCE = new ProcCallAspectProcCallAspectContext();
  
  public static ProcCallAspectProcCallAspectProperties getSelf(final ProcCall _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logo.ProcCallAspectProcCallAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ProcCall, ProcCallAspectProcCallAspectProperties> map = new java.util.WeakHashMap<kmLogo.ProcCall, logo.ProcCallAspectProcCallAspectProperties>();
  
  public Map<ProcCall, ProcCallAspectProcCallAspectProperties> getMap() {
    return map;
  }
}
