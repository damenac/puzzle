package flowchartaspects;

import flowchartaspects.ConstraintAspectConstraintAspectProperties;
import flowchartaspects.RelationalConstraintAspect;
import flowchartpck.Constraint;
import flowchartpck.RelationalConstraint;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;

@Aspect(className = Constraint.class)
@SuppressWarnings("all")
public class ConstraintAspect {
  public static boolean evalConstraint(final Constraint _self, final Hashtable<String, Object> context) {
    flowchartaspects.ConstraintAspectConstraintAspectProperties _self_ = flowchartaspects.ConstraintAspectConstraintAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_evalConstraint(_self_, _self,context);
    return (boolean)result;
  }
  
  protected static boolean _privk3_evalConstraint(final ConstraintAspectConstraintAspectProperties _self_, final Constraint _self, final Hashtable<String, Object> context) {
    if ((_self instanceof RelationalConstraint)) {
      return RelationalConstraintAspect.evalConstraint(((RelationalConstraint) _self), context);
    }
    return false;
  }
}
