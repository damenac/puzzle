package fsmaspects;

import fsm.AndTrigger;
import fsmaspects.AndTriggerAspectAndTriggerAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class AndTriggerAspectAndTriggerAspectContext {
  public final static AndTriggerAspectAndTriggerAspectContext INSTANCE = new AndTriggerAspectAndTriggerAspectContext();
  
  public static AndTriggerAspectAndTriggerAspectProperties getSelf(final AndTrigger _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fsmaspects.AndTriggerAspectAndTriggerAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<AndTrigger, AndTriggerAspectAndTriggerAspectProperties> map = new java.util.WeakHashMap<fsm.AndTrigger, fsmaspects.AndTriggerAspectAndTriggerAspectProperties>();
  
  public Map<AndTrigger, AndTriggerAspectAndTriggerAspectProperties> getMap() {
    return map;
  }
}
