package CompleteDSL;

import CompleteDSLPckg.AndTrigger;
import CompleteDSL.AndTriggerAspectAndTriggerAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class AndTriggerAspectAndTriggerAspectContext {
  public final static AndTriggerAspectAndTriggerAspectContext INSTANCE = new AndTriggerAspectAndTriggerAspectContext();
  
  public static AndTriggerAspectAndTriggerAspectProperties getSelf(final AndTrigger _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new CompleteDSL.AndTriggerAspectAndTriggerAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<AndTrigger, AndTriggerAspectAndTriggerAspectProperties> map = new java.util.WeakHashMap<CompleteDSLPckg.AndTrigger, CompleteDSL.AndTriggerAspectAndTriggerAspectProperties>();
  
  public Map<AndTrigger, AndTriggerAspectAndTriggerAspectProperties> getMap() {
    return map;
  }
}
