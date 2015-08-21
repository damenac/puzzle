package rhapsody;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import rhapsody.Constraint;
import rhapsody.ConstraintAspectConstraintAspectProperties;

@Aspect(className = Constraint.class)
@SuppressWarnings("all")
public class ConstraintAspect {
  public static boolean evalConstraint(final Constraint _self, final Hashtable<String, Object> context) {
    rhapsody.ConstraintAspectConstraintAspectProperties _self_ = rhapsody.ConstraintAspectConstraintAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rhapsody.RelationalConstraint){
    result = rhapsody.RelationalConstraintAspect.evalConstraint((rhapsody.RelationalConstraint)_self,context);
    } else  if (_self instanceof rhapsody.Constraint){
    result = rhapsody.ConstraintAspect._privk3_evalConstraint(_self_, (rhapsody.Constraint)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean _privk3_evalConstraint(final ConstraintAspectConstraintAspectProperties _self_, final Constraint _self, final Hashtable<String, Object> context) {
    return false;
  }
}
