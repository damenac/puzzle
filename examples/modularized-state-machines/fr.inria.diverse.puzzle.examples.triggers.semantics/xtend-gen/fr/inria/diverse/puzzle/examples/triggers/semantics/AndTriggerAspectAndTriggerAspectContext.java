package fr.inria.diverse.puzzle.examples.triggers.semantics;

import complextriggers.AndTrigger;
import fr.inria.diverse.puzzle.examples.triggers.semantics.AndTriggerAspectAndTriggerAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class AndTriggerAspectAndTriggerAspectContext {
  public final static AndTriggerAspectAndTriggerAspectContext INSTANCE = new AndTriggerAspectAndTriggerAspectContext();
  
  public static AndTriggerAspectAndTriggerAspectProperties getSelf(final AndTrigger _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.puzzle.examples.triggers.semantics.AndTriggerAspectAndTriggerAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<AndTrigger, AndTriggerAspectAndTriggerAspectProperties> map = new java.util.WeakHashMap<complextriggers.AndTrigger, fr.inria.diverse.puzzle.examples.triggers.semantics.AndTriggerAspectAndTriggerAspectProperties>();
  
  public Map<AndTrigger, AndTriggerAspectAndTriggerAspectProperties> getMap() {
    return map;
  }
}
