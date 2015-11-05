package statemachine;

import StateMachineModule.Assignation;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import statemachine.AssignationAspectAssignationAspectProperties;
import statemachine.StatementAspect;

@Aspect(className = Assignation.class)
@SuppressWarnings("all")
public class AssignationAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Assignation _self, final Hashtable<String, Object> context) {
    statemachine.AssignationAspectAssignationAspectProperties _self_ = statemachine.AssignationAspectAssignationAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final AssignationAspectAssignationAspectProperties _self_, final Assignation _self, final Hashtable<String, Object> context) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method eval is undefined for the type AssignationAspect");
  }
}
