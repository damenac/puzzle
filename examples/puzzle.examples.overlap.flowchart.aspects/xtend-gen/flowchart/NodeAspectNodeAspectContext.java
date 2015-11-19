package flowchart;

import flowchart.NodeAspectNodeAspectProperties;
import flowchartpck.Node;
import java.util.Map;

@SuppressWarnings("all")
public class NodeAspectNodeAspectContext {
  public final static NodeAspectNodeAspectContext INSTANCE = new NodeAspectNodeAspectContext();
  
  public static NodeAspectNodeAspectProperties getSelf(final Node _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new flowchart.NodeAspectNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Node, NodeAspectNodeAspectProperties> map = new java.util.WeakHashMap<flowchartpck.Node, flowchart.NodeAspectNodeAspectProperties>();
  
  public Map<Node, NodeAspectNodeAspectProperties> getMap() {
    return map;
  }
}
