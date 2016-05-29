package CompleteDSL;

import CompleteDSLPckg.NotTrigger;
import CompleteDSL.NotTriggerAspectNotTriggerAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class NotTriggerAspectNotTriggerAspectContext {
  public final static NotTriggerAspectNotTriggerAspectContext INSTANCE = new NotTriggerAspectNotTriggerAspectContext();
  
  public static NotTriggerAspectNotTriggerAspectProperties getSelf(final NotTrigger _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new CompleteDSL.NotTriggerAspectNotTriggerAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NotTrigger, NotTriggerAspectNotTriggerAspectProperties> map = new java.util.WeakHashMap<CompleteDSLPckg.NotTrigger, CompleteDSL.NotTriggerAspectNotTriggerAspectProperties>();
  
  public Map<NotTrigger, NotTriggerAspectNotTriggerAspectProperties> getMap() {
    return map;
  }
}
