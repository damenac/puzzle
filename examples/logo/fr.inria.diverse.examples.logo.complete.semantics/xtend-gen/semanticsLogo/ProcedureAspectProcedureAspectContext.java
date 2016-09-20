package semanticsLogo;

import Logo.Procedure;
import java.util.Map;
import semanticsLogo.ProcedureAspectProcedureAspectProperties;

@SuppressWarnings("all")
public class ProcedureAspectProcedureAspectContext {
  public final static ProcedureAspectProcedureAspectContext INSTANCE = new ProcedureAspectProcedureAspectContext();
  
  public static ProcedureAspectProcedureAspectProperties getSelf(final Procedure _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new semanticsLogo.ProcedureAspectProcedureAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Procedure, ProcedureAspectProcedureAspectProperties> map = new java.util.WeakHashMap<Logo.Procedure, semanticsLogo.ProcedureAspectProcedureAspectProperties>();
  
  public Map<Procedure, ProcedureAspectProcedureAspectProperties> getMap() {
    return map;
  }
}
