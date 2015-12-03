package fsmharelaspects;

import fsm.NotTrigger;
import fsmharelaspects.NotTriggerAspectNotTriggerAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class NotTriggerAspectNotTriggerAspectContext {
  public final static NotTriggerAspectNotTriggerAspectContext INSTANCE = new NotTriggerAspectNotTriggerAspectContext();
  
  public static NotTriggerAspectNotTriggerAspectProperties getSelf(final NotTrigger _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fsmharelaspects.NotTriggerAspectNotTriggerAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NotTrigger, NotTriggerAspectNotTriggerAspectProperties> map = new java.util.WeakHashMap<fsm.NotTrigger, fsmharelaspects.NotTriggerAspectNotTriggerAspectProperties>();
  
  public Map<NotTrigger, NotTriggerAspectNotTriggerAspectProperties> getMap() {
    return map;
  }
}
