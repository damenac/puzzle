package FlowchartLike.flowchart;

import FlowchartLike.flowchart.NodeAspectNodeAspectProperties;
import FlowchartModule.Node;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;

@Aspect(className = Node.class)
@SuppressWarnings("all")
public class NodeAspect {
  public static void eval(final Node _self, final Hashtable<String, Object> context) {
    FlowchartLike.flowchart.NodeAspectNodeAspectProperties _self_ = FlowchartLike.flowchart.NodeAspectNodeAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final NodeAspectNodeAspectProperties _self_, final Node _self, final Hashtable<String, Object> context) {
  }
}
