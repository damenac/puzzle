package tfsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import tfsm.Constraint;
import tfsm.ConstraintAspectConstraintAspectProperties;

@Aspect(className = Constraint.class)
@SuppressWarnings("all")
public class ConstraintAspect {
  public static boolean evalConstraint(final Constraint _self, final Hashtable<String, Object> context) {
    tfsm.ConstraintAspectConstraintAspectProperties _self_ = tfsm.ConstraintAspectConstraintAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof tfsm.RelationalConstraint){
    result = tfsm.RelationalConstraintAspect.evalConstraint((tfsm.RelationalConstraint)_self,context);
    } else  if (_self instanceof tfsm.Constraint){
    result = tfsm.ConstraintAspect._privk3_evalConstraint(_self_, (tfsm.Constraint)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean _privk3_evalConstraint(final ConstraintAspectConstraintAspectProperties _self_, final Constraint _self, final Hashtable<String, Object> context) {
    return false;
  }
}
