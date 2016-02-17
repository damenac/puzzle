package flowchartpck;

import flowchartpck.Action;
import flowchartpck.ActionAspectActionAspectProperties;
import flowchartpck.Arc;
import flowchartpck.Node;
import flowchartpck.NodeAspect;
import flowchartpck.Program;
import flowchartpck.ProgramAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;

@Aspect(className = Action.class)
@SuppressWarnings("all")
public class ActionAspect extends NodeAspect {
  @OverrideAspectMethod
  public static void eval(final Action _self, final Hashtable<String, Object> context) {
    flowchartpck.ActionAspectActionAspectProperties _self_ = flowchartpck.ActionAspectActionAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final ActionAspectActionAspectProperties _self_, final Action _self, final Hashtable<String, Object> context) {
    Program _doProgram = _self.getDoProgram();
    ProgramAspect.eval(_doProgram, context);
    EList<Arc> _outgoing = _self.getOutgoing();
    final Consumer<Arc> _function = (Arc arc) -> {
      Node _target = arc.getTarget();
      NodeAspect.eval(_target, context);
    };
    _outgoing.forEach(_function);
  }
}
