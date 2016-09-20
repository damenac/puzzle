package semanticsLogoProcedures;

import Procedures.ProcedureCall;
import java.util.Map;
import semanticsLogoProcedures.ProcedureCallAspectProcedureCallAspectProperties;

@SuppressWarnings("all")
public class ProcedureCallAspectProcedureCallAspectContext {
  public final static ProcedureCallAspectProcedureCallAspectContext INSTANCE = new ProcedureCallAspectProcedureCallAspectContext();
  
  public static ProcedureCallAspectProcedureCallAspectProperties getSelf(final ProcedureCall _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new semanticsLogoProcedures.ProcedureCallAspectProcedureCallAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ProcedureCall, ProcedureCallAspectProcedureCallAspectProperties> map = new java.util.WeakHashMap<Procedures.ProcedureCall, semanticsLogoProcedures.ProcedureCallAspectProcedureCallAspectProperties>();
  
  public Map<ProcedureCall, ProcedureCallAspectProcedureCallAspectProperties> getMap() {
    return map;
  }
}
