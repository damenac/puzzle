package tfsm;

import java.util.Map;
import tfsm.Loop;
import tfsm.LoopAspectLoopAspectProperties;

@SuppressWarnings("all")
public class LoopAspectLoopAspectContext {
  public final static LoopAspectLoopAspectContext INSTANCE = new LoopAspectLoopAspectContext();
  
  public static LoopAspectLoopAspectProperties getSelf(final Loop _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new tfsm.LoopAspectLoopAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Loop, LoopAspectLoopAspectProperties> map = new java.util.WeakHashMap<tfsm.Loop, tfsm.LoopAspectLoopAspectProperties>();
  
  public Map<Loop, LoopAspectLoopAspectProperties> getMap() {
    return map;
  }
}
