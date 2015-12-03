package fsmrhapsodyaspects;

import fsm.Program;
import fsmrhapsodyaspects.ProgramAspectProgramAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ProgramAspectProgramAspectContext {
  public final static ProgramAspectProgramAspectContext INSTANCE = new ProgramAspectProgramAspectContext();
  
  public static ProgramAspectProgramAspectProperties getSelf(final Program _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fsmrhapsodyaspects.ProgramAspectProgramAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Program, ProgramAspectProgramAspectProperties> map = new java.util.WeakHashMap<fsm.Program, fsmrhapsodyaspects.ProgramAspectProgramAspectProperties>();
  
  public Map<Program, ProgramAspectProgramAspectProperties> getMap() {
    return map;
  }
}
