package flowchartpck;

import flowchartpck.Node;
import flowchartpck.NodeAspectNodeAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;

@Aspect(className = Node.class)
@SuppressWarnings("all")
public abstract class NodeAspect {
  @Abstract
  public static void eval(final Node _self, final Hashtable<String, Object> context) {
    flowchartpck.NodeAspectNodeAspectProperties _self_ = flowchartpck.NodeAspectNodeAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final NodeAspectNodeAspectProperties _self_, final Node _self, final Hashtable<String, Object> context) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
