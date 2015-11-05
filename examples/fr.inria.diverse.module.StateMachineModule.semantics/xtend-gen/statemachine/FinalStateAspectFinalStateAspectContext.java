package statemachine;

import StateMachineModule.FinalState;
import java.util.Map;
import statemachine.FinalStateAspectFinalStateAspectProperties;

@SuppressWarnings("all")
public class FinalStateAspectFinalStateAspectContext {
  public final static FinalStateAspectFinalStateAspectContext INSTANCE = new FinalStateAspectFinalStateAspectContext();
  
  public static FinalStateAspectFinalStateAspectProperties getSelf(final FinalState _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new statemachine.FinalStateAspectFinalStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<FinalState, FinalStateAspectFinalStateAspectProperties> map = new java.util.WeakHashMap<StateMachineModule.FinalState, statemachine.FinalStateAspectFinalStateAspectProperties>();
  
  public Map<FinalState, FinalStateAspectFinalStateAspectProperties> getMap() {
    return map;
  }
}
