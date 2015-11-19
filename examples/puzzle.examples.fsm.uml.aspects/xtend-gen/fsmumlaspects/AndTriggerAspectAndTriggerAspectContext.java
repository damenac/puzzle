package fsmumlaspects;

import fsm.AndTrigger;
import fsmumlaspects.AndTriggerAspectAndTriggerAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class AndTriggerAspectAndTriggerAspectContext {
  public final static AndTriggerAspectAndTriggerAspectContext INSTANCE = new AndTriggerAspectAndTriggerAspectContext();
  
  public static AndTriggerAspectAndTriggerAspectProperties getSelf(final AndTrigger _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fsmumlaspects.AndTriggerAspectAndTriggerAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<AndTrigger, AndTriggerAspectAndTriggerAspectProperties> map = new java.util.WeakHashMap<fsm.AndTrigger, fsmumlaspects.AndTriggerAspectAndTriggerAspectProperties>();
  
  public Map<AndTrigger, AndTriggerAspectAndTriggerAspectProperties> getMap() {
    return map;
  }
}
