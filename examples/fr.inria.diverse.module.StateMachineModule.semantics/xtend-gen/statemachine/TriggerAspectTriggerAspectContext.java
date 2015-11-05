package statemachine;

import StateMachineModule.Trigger;
import java.util.Map;
import statemachine.TriggerAspectTriggerAspectProperties;

@SuppressWarnings("all")
public class TriggerAspectTriggerAspectContext {
  public final static TriggerAspectTriggerAspectContext INSTANCE = new TriggerAspectTriggerAspectContext();
  
  public static TriggerAspectTriggerAspectProperties getSelf(final Trigger _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new statemachine.TriggerAspectTriggerAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Trigger, TriggerAspectTriggerAspectProperties> map = new java.util.WeakHashMap<StateMachineModule.Trigger, statemachine.TriggerAspectTriggerAspectProperties>();
  
  public Map<Trigger, TriggerAspectTriggerAspectProperties> getMap() {
    return map;
  }
}
