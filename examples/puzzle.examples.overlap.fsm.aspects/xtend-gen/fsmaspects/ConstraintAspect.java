package fsmaspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fsm.Constraint;
import fsmaspects.ConstraintAspectConstraintAspectProperties;
import java.util.Hashtable;

@Aspect(className = Constraint.class)
@SuppressWarnings("all")
public class ConstraintAspect {
  public static boolean evalConstraint(final Constraint _self, final Hashtable<String, Object> context) {
    fsmaspects.ConstraintAspectConstraintAspectProperties _self_ = fsmaspects.ConstraintAspectConstraintAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_evalConstraint(_self_, _self,context);
    return (boolean)result;
  }
  
  protected static boolean _privk3_evalConstraint(final ConstraintAspectConstraintAspectProperties _self_, final Constraint _self, final Hashtable<String, Object> context) {
    return false;
  }
}
