package flowchart.semantics;

import flowchart.semantics.DecisionAspectDecisionAspectProperties;
import flowchart.semantics.NodeAspect;
import flowchartpck.Arc;
import flowchartpck.Constraint;
import flowchartpck.Decision;
import flowchartpck.Node;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import org.eclipse.emf.common.util.EList;

@Aspect(className = Decision.class)
@SuppressWarnings("all")
public class DecisionAspect extends NodeAspect {
  public static void eval(final Decision _self, final Hashtable<String, Object> context) {
    flowchart.semantics.DecisionAspectDecisionAspectProperties _self_ = flowchart.semantics.DecisionAspectDecisionAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final DecisionAspectDecisionAspectProperties _self_, final Decision _self, final Hashtable<String, Object> context) {
    Constraint _guard = _self.getGuard();
    boolean guard = _guard.evalConstraint(context);
    if (guard) {
      EList<Arc> _outgoing = _self.getOutgoing();
      Arc _get = _outgoing.get(0);
      Node _target = _get.getTarget();
      NodeAspect.eval(_target, context);
    } else {
      EList<Arc> _outgoing_1 = _self.getOutgoing();
      Arc _get_1 = _outgoing_1.get(1);
      Node _target_1 = _get_1.getTarget();
      NodeAspect.eval(_target_1, context);
    }
  }
}
