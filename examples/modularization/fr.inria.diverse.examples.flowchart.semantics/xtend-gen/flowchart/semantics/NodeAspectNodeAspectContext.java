package flowchart.semantics;

import flowchart.semantics.NodeAspectNodeAspectProperties;
import flowchartpck.Node;
import java.util.Map;

@SuppressWarnings("all")
public class NodeAspectNodeAspectContext {
  public final static NodeAspectNodeAspectContext INSTANCE = new NodeAspectNodeAspectContext();
  
  public static NodeAspectNodeAspectProperties getSelf(final Node _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new flowchart.semantics.NodeAspectNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Node, NodeAspectNodeAspectProperties> map = new java.util.WeakHashMap<flowchartpck.Node, flowchart.semantics.NodeAspectNodeAspectProperties>();
  
  public Map<Node, NodeAspectNodeAspectProperties> getMap() {
    return map;
  }
}
