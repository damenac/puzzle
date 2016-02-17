package flowchartpck;

import flowchartpck.ConstraintAspect;
import flowchartpck.Expression;
import flowchartpck.ExpressionAspect;
import flowchartpck.RelationalConstraint;
import flowchartpck.RelationalConstraintAspectRelationalConstraintAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;

@Aspect(className = RelationalConstraint.class)
@SuppressWarnings("all")
public class RelationalConstraintAspect extends ConstraintAspect {
  @OverrideAspectMethod
  public static boolean evalConstraint(final RelationalConstraint _self, final Hashtable<String, Object> context) {
    flowchartpck.RelationalConstraintAspectRelationalConstraintAspectProperties _self_ = flowchartpck.RelationalConstraintAspectRelationalConstraintAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_evalConstraint(_self_, _self,context);
    return (boolean)result;
  }
  
  private static boolean super_evalConstraint(final RelationalConstraint _self, final Hashtable<String, Object> context) {
    flowchartpck.ConstraintAspectConstraintAspectProperties _self_ = flowchartpck.ConstraintAspectConstraintAspectContext.getSelf(_self);
    return  flowchartpck.ConstraintAspect._privk3_evalConstraint(_self_, _self,context);
  }
  
  protected static boolean _privk3_evalConstraint(final RelationalConstraintAspectRelationalConstraintAspectProperties _self_, final RelationalConstraint _self, final Hashtable<String, Object> context) {
    Expression _expression = _self.getExpression();
    Object _eval = ExpressionAspect.eval(_expression, context);
    return (((Boolean) _eval)).booleanValue();
  }
}
