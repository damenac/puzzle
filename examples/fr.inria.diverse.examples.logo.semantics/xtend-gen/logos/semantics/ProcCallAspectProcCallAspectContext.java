package logos.semantics;

import Logo.ProcCall;
import java.util.Map;
import logos.semantics.ProcCallAspectProcCallAspectProperties;

@SuppressWarnings("all")
public class ProcCallAspectProcCallAspectContext {
  public final static ProcCallAspectProcCallAspectContext INSTANCE = new ProcCallAspectProcCallAspectContext();
  
  public static ProcCallAspectProcCallAspectProperties getSelf(final ProcCall _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new logos.semantics.ProcCallAspectProcCallAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ProcCall, ProcCallAspectProcCallAspectProperties> map = new java.util.WeakHashMap<Logo.ProcCall, logos.semantics.ProcCallAspectProcCallAspectProperties>();
  
  public Map<ProcCall, ProcCallAspectProcCallAspectProperties> getMap() {
    return map;
  }
}
