package flowchartaspects;

import flowchartaspects.ConstraintAspect;
import flowchartaspects.DecisionAspectDecisionAspectProperties;
import flowchartaspects.NodeAspect;
import flowchartpck.Arc;
import flowchartpck.Constraint;
import flowchartpck.Decision;
import flowchartpck.Node;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Decision.class)
@SuppressWarnings("all")
public class DecisionAspect extends NodeAspect {
  public static void eval(final Decision _self, final Hashtable<String, Object> context) {
    flowchartaspects.DecisionAspectDecisionAspectProperties _self_ = flowchartaspects.DecisionAspectDecisionAspectContext.getSelf(_self);
     if (_self instanceof flowchartpck.Decision){
     flowchartaspects.DecisionAspect._privk3_eval(_self_, (flowchartpck.Decision)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final DecisionAspectDecisionAspectProperties _self_, final Decision _self, final Hashtable<String, Object> context) {
    Constraint _guard = _self.getGuard();
    boolean guard = ConstraintAspect.evalConstraint(_guard, context);
    InputOutput.<String>println(("Evaluating constraint " + Boolean.valueOf(guard)));
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
