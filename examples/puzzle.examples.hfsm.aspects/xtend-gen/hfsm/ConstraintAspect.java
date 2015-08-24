package hfsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import hfsm.Constraint;
import hfsm.ConstraintAspectConstraintAspectProperties;
import java.util.Hashtable;

@Aspect(className = Constraint.class)
@SuppressWarnings("all")
public class ConstraintAspect {
  public static boolean evalConstraint(final Constraint _self, final Hashtable<String, Object> context) {
    hfsm.ConstraintAspectConstraintAspectProperties _self_ = hfsm.ConstraintAspectConstraintAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof hfsm.RelationalConstraint){
    result = hfsm.RelationalConstraintAspect.evalConstraint((hfsm.RelationalConstraint)_self,context);
    } else  if (_self instanceof hfsm.Constraint){
    result = hfsm.ConstraintAspect._privk3_evalConstraint(_self_, (hfsm.Constraint)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean _privk3_evalConstraint(final ConstraintAspectConstraintAspectProperties _self_, final Constraint _self, final Hashtable<String, Object> context) {
    return false;
  }
}
