package rhapsody;

import java.util.Map;
import rhapsody.Trigger;
import rhapsody.TriggerAspectTriggerAspectProperties;

@SuppressWarnings("all")
public class TriggerAspectTriggerAspectContext {
  public final static TriggerAspectTriggerAspectContext INSTANCE = new TriggerAspectTriggerAspectContext();
  
  public static TriggerAspectTriggerAspectProperties getSelf(final Trigger _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rhapsody.TriggerAspectTriggerAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Trigger, TriggerAspectTriggerAspectProperties> map = new java.util.WeakHashMap<rhapsody.Trigger, rhapsody.TriggerAspectTriggerAspectProperties>();
  
  public Map<Trigger, TriggerAspectTriggerAspectProperties> getMap() {
    return map;
  }
}
