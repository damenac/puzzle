package flowchart;

import flowchart.SubflowAspectSubflowAspectProperties;
import flowchartpck.Subflow;
import java.util.Map;

@SuppressWarnings("all")
public class SubflowAspectSubflowAspectContext {
  public final static SubflowAspectSubflowAspectContext INSTANCE = new SubflowAspectSubflowAspectContext();
  
  public static SubflowAspectSubflowAspectProperties getSelf(final Subflow _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new flowchart.SubflowAspectSubflowAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Subflow, SubflowAspectSubflowAspectProperties> map = new java.util.WeakHashMap<flowchartpck.Subflow, flowchart.SubflowAspectSubflowAspectProperties>();
  
  public Map<Subflow, SubflowAspectSubflowAspectProperties> getMap() {
    return map;
  }
}
