package flowchartaspects;

import flowchartaspects.ActionAspectActionAspectProperties;
import flowchartaspects.NodeAspect;
import flowchartaspects.ProgramAspect;
import flowchartpck.Action;
import flowchartpck.Arc;
import flowchartpck.Node;
import flowchartpck.Program;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Action.class)
@SuppressWarnings("all")
public class ActionAspect extends NodeAspect {
  @OverrideAspectMethod
  public static void eval(final Action _self, final Hashtable<String, Object> context) {
    flowchartaspects.ActionAspectActionAspectProperties _self_ = flowchartaspects.ActionAspectActionAspectContext.getSelf(_self);
     if (_self instanceof flowchartpck.Action){
     flowchartaspects.ActionAspect._privk3_eval(_self_, (flowchartpck.Action)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_eval(final Action _self, final Hashtable<String, Object> context) {
    flowchartaspects.NodeAspectNodeAspectProperties _self_ = flowchartaspects.NodeAspectNodeAspectContext.getSelf(_self);
     flowchartaspects.NodeAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final ActionAspectActionAspectProperties _self_, final Action _self, final Hashtable<String, Object> context) {
    Program _doProgram = _self.getDoProgram();
    ProgramAspect.eval(_doProgram, context);
    String _string = context.toString();
    String _plus = ("   ... context = " + _string);
    InputOutput.<String>println(_plus);
    EList<Arc> _outgoing = _self.getOutgoing();
    final Consumer<Arc> _function = (Arc arc) -> {
      Node _target = arc.getTarget();
      NodeAspect.eval(_target, context);
    };
    _outgoing.forEach(_function);
  }
}
