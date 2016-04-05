package flowchartaspects;

import flowchartaspects.ArcAspectArcAspectProperties;
import flowchartpck.Arc;
import java.util.Map;

@SuppressWarnings("all")
public class ArcAspectArcAspectContext {
  public final static ArcAspectArcAspectContext INSTANCE = new ArcAspectArcAspectContext();
  
  public static ArcAspectArcAspectProperties getSelf(final Arc _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new flowchartaspects.ArcAspectArcAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Arc, ArcAspectArcAspectProperties> map = new java.util.WeakHashMap<flowchartpck.Arc, flowchartaspects.ArcAspectArcAspectProperties>();
  
  public Map<Arc, ArcAspectArcAspectProperties> getMap() {
    return map;
  }
}
