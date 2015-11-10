package FlowchartLike.flowchart;

import FlowchartLike.flowchart.SubflowAspectSubflowAspectProperties;
import FlowchartModule.Subflow;
import java.util.Map;

@SuppressWarnings("all")
public class SubflowAspectSubflowAspectContext {
  public final static SubflowAspectSubflowAspectContext INSTANCE = new SubflowAspectSubflowAspectContext();
  
  public static SubflowAspectSubflowAspectProperties getSelf(final Subflow _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new FlowchartLike.flowchart.SubflowAspectSubflowAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Subflow, SubflowAspectSubflowAspectProperties> map = new java.util.WeakHashMap<FlowchartModule.Subflow, FlowchartLike.flowchart.SubflowAspectSubflowAspectProperties>();
  
  public Map<Subflow, SubflowAspectSubflowAspectProperties> getMap() {
    return map;
  }
}
