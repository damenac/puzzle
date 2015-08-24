package hfsm;

import hfsm.Loop;
import hfsm.LoopAspectLoopAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class LoopAspectLoopAspectContext {
  public final static LoopAspectLoopAspectContext INSTANCE = new LoopAspectLoopAspectContext();
  
  public static LoopAspectLoopAspectProperties getSelf(final Loop _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new hfsm.LoopAspectLoopAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Loop, LoopAspectLoopAspectProperties> map = new java.util.WeakHashMap<hfsm.Loop, hfsm.LoopAspectLoopAspectProperties>();
  
  public Map<Loop, LoopAspectLoopAspectProperties> getMap() {
    return map;
  }
}
