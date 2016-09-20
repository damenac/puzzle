package simple.constraints;

import java.util.Map;
import simple.constraints.ProgramAspectProgramAspectProperties;
import simpleconstraints.Program;

@SuppressWarnings("all")
public class ProgramAspectProgramAspectContext {
  public final static ProgramAspectProgramAspectContext INSTANCE = new ProgramAspectProgramAspectContext();
  
  public static ProgramAspectProgramAspectProperties getSelf(final Program _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new simple.constraints.ProgramAspectProgramAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Program, ProgramAspectProgramAspectProperties> map = new java.util.WeakHashMap<simpleconstraints.Program, simple.constraints.ProgramAspectProgramAspectProperties>();
  
  public Map<Program, ProgramAspectProgramAspectProperties> getMap() {
    return map;
  }
}
