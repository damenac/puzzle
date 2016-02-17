package flowchartpck;

import flowchartpck.Flowchart;
import flowchartpck.FlowchartAspectFlowchartAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class FlowchartAspectFlowchartAspectContext {
  public final static FlowchartAspectFlowchartAspectContext INSTANCE = new FlowchartAspectFlowchartAspectContext();
  
  public static FlowchartAspectFlowchartAspectProperties getSelf(final Flowchart _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new flowchartpck.FlowchartAspectFlowchartAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Flowchart, FlowchartAspectFlowchartAspectProperties> map = new java.util.WeakHashMap<flowchartpck.Flowchart, flowchartpck.FlowchartAspectFlowchartAspectProperties>();
  
  public Map<Flowchart, FlowchartAspectFlowchartAspectProperties> getMap() {
    return map;
  }
}
