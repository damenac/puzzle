package statemachine;

import StateMachineModule.Conditional;
import StateMachineModule.Expression;
import StateMachineModule.Program;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import statemachine.ConditionalAspectConditionalAspectProperties;
import statemachine.ProgramAspect;
import statemachine.StatementAspect;

@Aspect(className = Conditional.class)
@SuppressWarnings("all")
public class ConditionalAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Conditional _self, final Hashtable<String, Object> context) {
    statemachine.ConditionalAspectConditionalAspectProperties _self_ = statemachine.ConditionalAspectConditionalAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final ConditionalAspectConditionalAspectProperties _self_, final Conditional _self, final Hashtable<String, Object> context) {
    Expression _condition = _self.getCondition();
    Object _eval = _condition.eval(context);
    if ((((Boolean) _eval)).booleanValue()) {
      Program _body = _self.getBody();
      ProgramAspect.eval(_body, context);
    }
  }
}
