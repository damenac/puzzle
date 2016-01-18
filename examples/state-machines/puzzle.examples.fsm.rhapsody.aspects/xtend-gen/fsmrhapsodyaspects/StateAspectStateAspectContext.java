package fsmrhapsodyaspects;

import fsm.State;
import fsmrhapsodyaspects.StateAspectStateAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class StateAspectStateAspectContext {
  public final static StateAspectStateAspectContext INSTANCE = new StateAspectStateAspectContext();
  
  public static StateAspectStateAspectProperties getSelf(final State _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fsmrhapsodyaspects.StateAspectStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<State, StateAspectStateAspectProperties> map = new java.util.WeakHashMap<fsm.State, fsmrhapsodyaspects.StateAspectStateAspectProperties>();
  
  public Map<State, StateAspectStateAspectProperties> getMap() {
    return map;
  }
}
