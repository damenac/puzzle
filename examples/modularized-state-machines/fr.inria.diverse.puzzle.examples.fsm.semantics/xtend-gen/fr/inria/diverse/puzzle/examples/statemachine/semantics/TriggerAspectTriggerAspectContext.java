package fr.inria.diverse.puzzle.examples.statemachine.semantics;

import fr.inria.diverse.puzzle.examples.statemachine.semantics.TriggerAspectTriggerAspectProperties;
import fsm.Trigger;
import java.util.Map;

@SuppressWarnings("all")
public class TriggerAspectTriggerAspectContext {
  public final static TriggerAspectTriggerAspectContext INSTANCE = new TriggerAspectTriggerAspectContext();
  
  public static TriggerAspectTriggerAspectProperties getSelf(final Trigger _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.puzzle.examples.statemachine.semantics.TriggerAspectTriggerAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Trigger, TriggerAspectTriggerAspectProperties> map = new java.util.WeakHashMap<fsm.Trigger, fr.inria.diverse.puzzle.examples.statemachine.semantics.TriggerAspectTriggerAspectProperties>();
  
  public Map<Trigger, TriggerAspectTriggerAspectProperties> getMap() {
    return map;
  }
}
