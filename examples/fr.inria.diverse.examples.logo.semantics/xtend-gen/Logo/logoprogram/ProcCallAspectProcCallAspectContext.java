package Logo.logoprogram;

import Logo.ProcCall;
import Logo.logoprogram.ProcCallAspectProcCallAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ProcCallAspectProcCallAspectContext {
  public final static ProcCallAspectProcCallAspectContext INSTANCE = new ProcCallAspectProcCallAspectContext();
  
  public static ProcCallAspectProcCallAspectProperties getSelf(final ProcCall _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Logo.logoprogram.ProcCallAspectProcCallAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ProcCall, ProcCallAspectProcCallAspectProperties> map = new java.util.WeakHashMap<Logo.ProcCall, Logo.logoprogram.ProcCallAspectProcCallAspectProperties>();
  
  public Map<ProcCall, ProcCallAspectProcCallAspectProperties> getMap() {
    return map;
  }
}
