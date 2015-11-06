package statemachine;

import StateMachineModule.Conditional;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import statemachine.ConditionalAspectConditionalAspectProperties;
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
    throw new Error("Unresolved compilation problems:"
      + "\nRelationalExpression cannot be resolved to a type."
      + "\neval cannot be resolved");
  }
}
