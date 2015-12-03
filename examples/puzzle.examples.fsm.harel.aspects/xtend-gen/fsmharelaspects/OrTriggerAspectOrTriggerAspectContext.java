package fsmharelaspects;

import fsm.OrTrigger;
import fsmharelaspects.OrTriggerAspectOrTriggerAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class OrTriggerAspectOrTriggerAspectContext {
  public final static OrTriggerAspectOrTriggerAspectContext INSTANCE = new OrTriggerAspectOrTriggerAspectContext();
  
  public static OrTriggerAspectOrTriggerAspectProperties getSelf(final OrTrigger _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fsmharelaspects.OrTriggerAspectOrTriggerAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<OrTrigger, OrTriggerAspectOrTriggerAspectProperties> map = new java.util.WeakHashMap<fsm.OrTrigger, fsmharelaspects.OrTriggerAspectOrTriggerAspectProperties>();
  
  public Map<OrTrigger, OrTriggerAspectOrTriggerAspectProperties> getMap() {
    return map;
  }
}
