package statemachine;

import StateMachineModule.Program;
import java.util.Map;
import statemachine.ProgramAspectProgramAspectProperties;

@SuppressWarnings("all")
public class ProgramAspectProgramAspectContext {
  public final static ProgramAspectProgramAspectContext INSTANCE = new ProgramAspectProgramAspectContext();
  
  public static ProgramAspectProgramAspectProperties getSelf(final Program _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new statemachine.ProgramAspectProgramAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Program, ProgramAspectProgramAspectProperties> map = new java.util.WeakHashMap<StateMachineModule.Program, statemachine.ProgramAspectProgramAspectProperties>();
  
  public Map<Program, ProgramAspectProgramAspectProperties> getMap() {
    return map;
  }
}
