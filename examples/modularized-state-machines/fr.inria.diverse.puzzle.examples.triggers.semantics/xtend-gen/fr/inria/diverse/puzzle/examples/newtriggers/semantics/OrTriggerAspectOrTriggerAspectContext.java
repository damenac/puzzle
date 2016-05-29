package fr.inria.diverse.puzzle.examples.newtriggers.semantics;

import complextriggers.OrTrigger;
import fr.inria.diverse.puzzle.examples.newtriggers.semantics.OrTriggerAspectOrTriggerAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class OrTriggerAspectOrTriggerAspectContext {
  public final static OrTriggerAspectOrTriggerAspectContext INSTANCE = new OrTriggerAspectOrTriggerAspectContext();
  
  public static OrTriggerAspectOrTriggerAspectProperties getSelf(final OrTrigger _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.puzzle.examples.newtriggers.semantics.OrTriggerAspectOrTriggerAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<OrTrigger, OrTriggerAspectOrTriggerAspectProperties> map = new java.util.WeakHashMap<complextriggers.OrTrigger, fr.inria.diverse.puzzle.examples.newtriggers.semantics.OrTriggerAspectOrTriggerAspectProperties>();
  
  public Map<OrTrigger, OrTriggerAspectOrTriggerAspectProperties> getMap() {
    return map;
  }
}
