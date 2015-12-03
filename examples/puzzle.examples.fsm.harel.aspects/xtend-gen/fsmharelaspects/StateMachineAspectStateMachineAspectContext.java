package fsmharelaspects;

import fsm.StateMachine;
import fsmharelaspects.StateMachineAspectStateMachineAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class StateMachineAspectStateMachineAspectContext {
  public final static StateMachineAspectStateMachineAspectContext INSTANCE = new StateMachineAspectStateMachineAspectContext();
  
  public static StateMachineAspectStateMachineAspectProperties getSelf(final StateMachine _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fsmharelaspects.StateMachineAspectStateMachineAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StateMachine, StateMachineAspectStateMachineAspectProperties> map = new java.util.WeakHashMap<fsm.StateMachine, fsmharelaspects.StateMachineAspectStateMachineAspectProperties>();
  
  public Map<StateMachine, StateMachineAspectStateMachineAspectProperties> getMap() {
    return map;
  }
}
