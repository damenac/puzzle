package CompleteDSL;

import CompleteDSLPckg.ProcedureCall;
import java.util.Map;
import CompleteDSL.ProcedureCallAspectProcedureCallAspectProperties;

@SuppressWarnings("all")
public class ProcedureCallAspectProcedureCallAspectContext {
  public final static ProcedureCallAspectProcedureCallAspectContext INSTANCE = new ProcedureCallAspectProcedureCallAspectContext();
  
  public static ProcedureCallAspectProcedureCallAspectProperties getSelf(final ProcedureCall _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new CompleteDSL.ProcedureCallAspectProcedureCallAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ProcedureCall, ProcedureCallAspectProcedureCallAspectProperties> map = new java.util.WeakHashMap<CompleteDSLPckg.ProcedureCall, CompleteDSL.ProcedureCallAspectProcedureCallAspectProperties>();
  
  public Map<ProcedureCall, ProcedureCallAspectProcedureCallAspectProperties> getMap() {
    return map;
  }
}
