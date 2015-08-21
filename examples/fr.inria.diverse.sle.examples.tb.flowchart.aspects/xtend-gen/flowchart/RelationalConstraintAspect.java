package flowchart;

import flowchart.ConstraintAspect;
import flowchart.Expression;
import flowchart.ExpressionAspect;
import flowchart.RelationalConstraint;
import flowchart.RelationalConstraintAspectRelationalConstraintAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;

@Aspect(className = RelationalConstraint.class)
@SuppressWarnings("all")
public class RelationalConstraintAspect extends ConstraintAspect {
  @OverrideAspectMethod
  public static boolean evalConstraint(final RelationalConstraint _self, final Hashtable<String, Object> context) {
    flowchart.RelationalConstraintAspectRelationalConstraintAspectProperties _self_ = flowchart.RelationalConstraintAspectRelationalConstraintAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof flowchart.RelationalConstraint){
    result = flowchart.RelationalConstraintAspect._privk3_evalConstraint(_self_, (flowchart.RelationalConstraint)_self,context);
    } else  if (_self instanceof flowchart.Constraint){
    result = flowchart.ConstraintAspect.evalConstraint((flowchart.Constraint)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  private static boolean super_evalConstraint(final RelationalConstraint _self, final Hashtable<String, Object> context) {
    flowchart.ConstraintAspectConstraintAspectProperties _self_ = flowchart.ConstraintAspectConstraintAspectContext.getSelf(_self);
    return  flowchart.ConstraintAspect._privk3_evalConstraint(_self_, _self,context);
  }
  
  protected static boolean _privk3_evalConstraint(final RelationalConstraintAspectRelationalConstraintAspectProperties _self_, final RelationalConstraint _self, final Hashtable<String, Object> context) {
    Expression _expression = _self.getExpression();
    Object _eval = ExpressionAspect.eval(_expression);
    return (((Boolean) _eval)).booleanValue();
  }
}
