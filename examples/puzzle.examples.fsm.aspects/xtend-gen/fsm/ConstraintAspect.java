package fsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fsm.Constraint;
import fsm.ConstraintAspectConstraintAspectProperties;
import java.util.Hashtable;

@Aspect(className = Constraint.class)
@SuppressWarnings("all")
public class ConstraintAspect {
  public static boolean evalConstraint(final Constraint _self, final Hashtable<String, Object> context) {
    fsm.ConstraintAspectConstraintAspectProperties _self_ = fsm.ConstraintAspectConstraintAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof fsm.RelationalConstraint){
    result = fsm.RelationalConstraintAspect.evalConstraint((fsm.RelationalConstraint)_self,context);
    } else  if (_self instanceof fsm.Constraint){
    result = fsm.ConstraintAspect._privk3_evalConstraint(_self_, (fsm.Constraint)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean _privk3_evalConstraint(final ConstraintAspectConstraintAspectProperties _self_, final Constraint _self, final Hashtable<String, Object> context) {
    return false;
  }
}
