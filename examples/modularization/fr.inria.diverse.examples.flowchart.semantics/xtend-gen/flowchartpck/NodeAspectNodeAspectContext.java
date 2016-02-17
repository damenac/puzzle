package flowchartpck;

import flowchartpck.Node;
import flowchartpck.NodeAspectNodeAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class NodeAspectNodeAspectContext {
  public final static NodeAspectNodeAspectContext INSTANCE = new NodeAspectNodeAspectContext();
  
  public static NodeAspectNodeAspectProperties getSelf(final Node _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new flowchartpck.NodeAspectNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Node, NodeAspectNodeAspectProperties> map = new java.util.WeakHashMap<flowchartpck.Node, flowchartpck.NodeAspectNodeAspectProperties>();
  
  public Map<Node, NodeAspectNodeAspectProperties> getMap() {
    return map;
  }
}
