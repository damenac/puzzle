package flowchartaspects;

import flowchartaspects.StartAspectStartAspectProperties;
import flowchartpck.Start;
import java.util.Map;

@SuppressWarnings("all")
public class StartAspectStartAspectContext {
  public final static StartAspectStartAspectContext INSTANCE = new StartAspectStartAspectContext();
  
  public static StartAspectStartAspectProperties getSelf(final Start _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new flowchartaspects.StartAspectStartAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Start, StartAspectStartAspectProperties> map = new java.util.WeakHashMap<flowchartpck.Start, flowchartaspects.StartAspectStartAspectProperties>();
  
  public Map<Start, StartAspectStartAspectProperties> getMap() {
    return map;
  }
}
