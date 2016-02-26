package flowchartpck;

import flowchartpck.Action;
import flowchartpck.ActionAspect;
import flowchartpck.Decision;
import flowchartpck.DecisionAspect;
import flowchartpck.End;
import flowchartpck.EndAspect;
import flowchartpck.Node;
import flowchartpck.NodeAspectNodeAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;

@Aspect(className = Node.class)
@SuppressWarnings("all")
public class NodeAspect {
  public static void eval(final Node _self, final Hashtable<String, Object> context) {
    flowchartpck.NodeAspectNodeAspectProperties _self_ = flowchartpck.NodeAspectNodeAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final NodeAspectNodeAspectProperties _self_, final Node _self, final Hashtable<String, Object> context) {
    if ((_self instanceof Action)) {
      ActionAspect.eval(((Action) _self), context);
    } else {
      if ((_self instanceof Decision)) {
        DecisionAspect.eval(((Decision) _self), context);
      } else {
        if ((_self instanceof End)) {
          EndAspect.eval(((End) _self), context);
        }
      }
    }
  }
}
