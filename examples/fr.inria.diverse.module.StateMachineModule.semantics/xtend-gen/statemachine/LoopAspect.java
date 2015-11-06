package statemachine;

import StateMachineModule.Loop;
import StateMachineModule.Program;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import statemachine.LoopAspectLoopAspectProperties;
import statemachine.ProgramAspect;
import statemachine.StatementAspect;

@Aspect(className = Loop.class)
@SuppressWarnings("all")
public class LoopAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Loop _self, final Hashtable<String, Object> context) {
    statemachine.LoopAspectLoopAspectProperties _self_ = statemachine.LoopAspectLoopAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final LoopAspectLoopAspectProperties _self_, final Loop _self, final Hashtable<String, Object> context) {
    while ((((Boolean) _self.getGuard().eval(context))).booleanValue()) {
      Program _body = _self.getBody();
      ProgramAspect.eval(_body, context);
    }
  }
}
