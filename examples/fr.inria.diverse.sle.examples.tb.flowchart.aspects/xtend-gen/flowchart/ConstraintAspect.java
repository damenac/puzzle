package flowchart;

import flowchart.Constraint;
import flowchart.ConstraintAspectConstraintAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;

@Aspect(className = Constraint.class)
@SuppressWarnings("all")
public class ConstraintAspect {
  public static boolean evalConstraint(final Constraint _self, final Hashtable<String, Object> context) {
    flowchart.ConstraintAspectConstraintAspectProperties _self_ = flowchart.ConstraintAspectConstraintAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof flowchart.RelationalConstraint){
    result = flowchart.RelationalConstraintAspect.evalConstraint((flowchart.RelationalConstraint)_self,context);
    } else  if (_self instanceof flowchart.Constraint){
    result = flowchart.ConstraintAspect._privk3_evalConstraint(_self_, (flowchart.Constraint)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean _privk3_evalConstraint(final ConstraintAspectConstraintAspectProperties _self_, final Constraint _self, final Hashtable<String, Object> context) {
    return false;
  }
}
