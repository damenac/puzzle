package fr.inria.diverse.puzzle.examples.statemachine.semantics;

import fr.inria.diverse.puzzle.examples.statemachine.semantics.StateAspectStateAspectProperties;
import fsm.State;
import java.util.Map;

@SuppressWarnings("all")
public class StateAspectStateAspectContext {
  public final static StateAspectStateAspectContext INSTANCE = new StateAspectStateAspectContext();
  
  public static StateAspectStateAspectProperties getSelf(final State _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.puzzle.examples.statemachine.semantics.StateAspectStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<State, StateAspectStateAspectProperties> map = new java.util.WeakHashMap<fsm.State, fr.inria.diverse.puzzle.examples.statemachine.semantics.StateAspectStateAspectProperties>();
  
  public Map<State, StateAspectStateAspectProperties> getMap() {
    return map;
  }
}
