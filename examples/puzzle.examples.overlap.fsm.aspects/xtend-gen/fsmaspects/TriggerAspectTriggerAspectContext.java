package fsmaspects;

import fsm.Trigger;
import fsmaspects.TriggerAspectTriggerAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class TriggerAspectTriggerAspectContext {
  public final static TriggerAspectTriggerAspectContext INSTANCE = new TriggerAspectTriggerAspectContext();
  
  public static TriggerAspectTriggerAspectProperties getSelf(final Trigger _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fsmaspects.TriggerAspectTriggerAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Trigger, TriggerAspectTriggerAspectProperties> map = new java.util.WeakHashMap<fsm.Trigger, fsmaspects.TriggerAspectTriggerAspectProperties>();
  
  public Map<Trigger, TriggerAspectTriggerAspectProperties> getMap() {
    return map;
  }
}
