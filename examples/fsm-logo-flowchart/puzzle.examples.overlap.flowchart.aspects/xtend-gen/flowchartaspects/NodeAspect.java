package flowchartaspects;

import flowchartaspects.ActionAspect;
import flowchartaspects.DecisionAspect;
import flowchartaspects.EndAspect;
import flowchartaspects.NodeAspectNodeAspectProperties;
import flowchartpck.Action;
import flowchartpck.Decision;
import flowchartpck.End;
import flowchartpck.Node;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;

@Aspect(className = Node.class)
@SuppressWarnings("all")
public class NodeAspect {
  public static void eval(final Node _self, final Hashtable<String, Object> context) {
    flowchartaspects.NodeAspectNodeAspectProperties _self_ = flowchartaspects.NodeAspectNodeAspectContext.getSelf(_self);
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
