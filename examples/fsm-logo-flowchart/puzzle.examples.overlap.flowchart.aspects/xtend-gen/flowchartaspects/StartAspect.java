package flowchartaspects;

import flowchartaspects.NodeAspect;
import flowchartaspects.StartAspectStartAspectProperties;
import flowchartpck.Arc;
import flowchartpck.Node;
import flowchartpck.Start;
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
    flowchartaspects.StartAspectStartAspectProperties _self_ = flowchartaspects.StartAspectStartAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  private static void super_eval(final Start _self, final Hashtable<String, Object> context) {
    flowchartaspects.NodeAspectNodeAspectProperties _self_ = flowchartaspects.NodeAspectNodeAspectContext.getSelf(_self);
     flowchartaspects.NodeAspect._privk3_eval(_self_, _self,context);
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
