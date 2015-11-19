package fsmaspects;

import fsm.Wait;
import fsmaspects.WaitAspectWaitAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class WaitAspectWaitAspectContext {
  public final static WaitAspectWaitAspectContext INSTANCE = new WaitAspectWaitAspectContext();
  
  public static WaitAspectWaitAspectProperties getSelf(final Wait _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fsmaspects.WaitAspectWaitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Wait, WaitAspectWaitAspectProperties> map = new java.util.WeakHashMap<fsm.Wait, fsmaspects.WaitAspectWaitAspectProperties>();
  
  public Map<Wait, WaitAspectWaitAspectProperties> getMap() {
    return map;
  }
}
