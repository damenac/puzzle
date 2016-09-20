package semanticsLogoProcedures;

import Procedures.Procedure;
import java.util.Map;
import semanticsLogoProcedures.ProcedureAspectProcedureAspectProperties;

@SuppressWarnings("all")
public class ProcedureAspectProcedureAspectContext {
  public final static ProcedureAspectProcedureAspectContext INSTANCE = new ProcedureAspectProcedureAspectContext();
  
  public static ProcedureAspectProcedureAspectProperties getSelf(final Procedure _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new semanticsLogoProcedures.ProcedureAspectProcedureAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Procedure, ProcedureAspectProcedureAspectProperties> map = new java.util.WeakHashMap<Procedures.Procedure, semanticsLogoProcedures.ProcedureAspectProcedureAspectProperties>();
  
  public Map<Procedure, ProcedureAspectProcedureAspectProperties> getMap() {
    return map;
  }
}
