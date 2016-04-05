package flowchartaspects;

import flowchartaspects.LoopAspectLoopAspectProperties;
import flowchartpck.Loop;
import java.util.Map;

@SuppressWarnings("all")
public class LoopAspectLoopAspectContext {
  public final static LoopAspectLoopAspectContext INSTANCE = new LoopAspectLoopAspectContext();
  
  public static LoopAspectLoopAspectProperties getSelf(final Loop _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new flowchartaspects.LoopAspectLoopAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Loop, LoopAspectLoopAspectProperties> map = new java.util.WeakHashMap<flowchartpck.Loop, flowchartaspects.LoopAspectLoopAspectProperties>();
  
  public Map<Loop, LoopAspectLoopAspectProperties> getMap() {
    return map;
  }
}
