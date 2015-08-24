package flowchart;

import flowchart.Node;
import flowchart.NodeAspectNodeAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;

@Aspect(className = Node.class)
@SuppressWarnings("all")
public class NodeAspect {
  public static void eval(final Node _self, final Hashtable<String, Object> context) {
    flowchart.NodeAspectNodeAspectProperties _self_ = flowchart.NodeAspectNodeAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final NodeAspectNodeAspectProperties _self_, final Node _self, final Hashtable<String, Object> context) {
  }
}
