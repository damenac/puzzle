package statemachine;

import StateMachineModule.Wait;
import java.util.Map;
import statemachine.WaitAspectWaitAspectProperties;

@SuppressWarnings("all")
public class WaitAspectWaitAspectContext {
  public final static WaitAspectWaitAspectContext INSTANCE = new WaitAspectWaitAspectContext();
  
  public static WaitAspectWaitAspectProperties getSelf(final Wait _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new statemachine.WaitAspectWaitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Wait, WaitAspectWaitAspectProperties> map = new java.util.WeakHashMap<StateMachineModule.Wait, statemachine.WaitAspectWaitAspectProperties>();
  
  public Map<Wait, WaitAspectWaitAspectProperties> getMap() {
    return map;
  }
}
