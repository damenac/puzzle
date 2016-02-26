package flowchartpck;

import flowchartpck.Arc;
import flowchartpck.Node;
import flowchartpck.NodeAspect;
import flowchartpck.Start;
import flowchartpck.StartAspectStartAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Start.class)
@SuppressWarnings("all")
public class StartAspect extends NodeAspect {
  @OverrideAspectMethod
  public static void eval(final Start _self, final Hashtable<String, Object> context) {
    flowchartpck.StartAspectStartAspectProperties _self_ = flowchartpck.StartAspectStartAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  private static void super_eval(final Start _self, final Hashtable<String, Object> context) {
    flowchartpck.NodeAspectNodeAspectProperties _self_ = flowchartpck.NodeAspectNodeAspectContext.getSelf(_self);
     flowchartpck.NodeAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final StartAspectStartAspectProperties _self_, final Start _self, final Hashtable<String, Object> context) {
    InputOutput.<String>println("Initiating execution of the flowchart");
    EList<Arc> _outgoing = _self.getOutgoing();
    for (final Arc arc : _outgoing) {
      Node _target = arc.getTarget();
      NodeAspect.eval(_target, context);
    }
  }
}
