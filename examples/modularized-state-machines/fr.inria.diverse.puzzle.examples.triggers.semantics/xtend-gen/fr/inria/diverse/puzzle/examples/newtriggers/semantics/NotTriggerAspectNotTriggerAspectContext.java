package fr.inria.diverse.puzzle.examples.newtriggers.semantics;

import complextriggers.NotTrigger;
import fr.inria.diverse.puzzle.examples.newtriggers.semantics.NotTriggerAspectNotTriggerAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class NotTriggerAspectNotTriggerAspectContext {
  public final static NotTriggerAspectNotTriggerAspectContext INSTANCE = new NotTriggerAspectNotTriggerAspectContext();
  
  public static NotTriggerAspectNotTriggerAspectProperties getSelf(final NotTrigger _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.puzzle.examples.newtriggers.semantics.NotTriggerAspectNotTriggerAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NotTrigger, NotTriggerAspectNotTriggerAspectProperties> map = new java.util.WeakHashMap<complextriggers.NotTrigger, fr.inria.diverse.puzzle.examples.newtriggers.semantics.NotTriggerAspectNotTriggerAspectProperties>();
  
  public Map<NotTrigger, NotTriggerAspectNotTriggerAspectProperties> getMap() {
    return map;
  }
}
