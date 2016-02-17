package flowchartpck;

import flowchartpck.Arc;
import flowchartpck.Node;
import flowchartpck.NodeAspect;
import flowchartpck.Start;
import flowchartpck.StartAspectStartAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;

@Aspect(className = Start.class)
@SuppressWarnings("all")
public class StartAspect extends NodeAspect {
  @OverrideAspectMethod
  public static void eval(final Start _self, final Hashtable<String, Object> context) {
    flowchartpck.StartAspectStartAspectProperties _self_ = flowchartpck.StartAspectStartAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final StartAspectStartAspectProperties _self_, final Start _self, final Hashtable<String, Object> context) {
    EList<Arc> _outgoing = _self.getOutgoing();
    final Consumer<Arc> _function = (Arc arc) -> {
      Node _target = arc.getTarget();
      NodeAspect.eval(_target, context);
    };
    _outgoing.forEach(_function);
  }
}
