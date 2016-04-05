package flowchartaspects;

import flowchartaspects.ConstraintAspect;
import flowchartaspects.ExpressionAspect;
import flowchartaspects.RelationalConstraintAspectRelationalConstraintAspectProperties;
import flowchartpck.Expression;
import flowchartpck.RelationalConstraint;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;

@Aspect(className = RelationalConstraint.class)
@SuppressWarnings("all")
public class RelationalConstraintAspect extends ConstraintAspect {
  @OverrideAspectMethod
  public static boolean evalConstraint(final RelationalConstraint _self, final Hashtable<String, Object> context) {
    flowchartaspects.RelationalConstraintAspectRelationalConstraintAspectProperties _self_ = flowchartaspects.RelationalConstraintAspectRelationalConstraintAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_evalConstraint(_self_, _self,context);
    return (boolean)result;
  }
  
  private static boolean super_evalConstraint(final RelationalConstraint _self, final Hashtable<String, Object> context) {
    flowchartaspects.ConstraintAspectConstraintAspectProperties _self_ = flowchartaspects.ConstraintAspectConstraintAspectContext.getSelf(_self);
    return  flowchartaspects.ConstraintAspect._privk3_evalConstraint(_self_, _self,context);
  }
  
  protected static boolean _privk3_evalConstraint(final RelationalConstraintAspectRelationalConstraintAspectProperties _self_, final RelationalConstraint _self, final Hashtable<String, Object> context) {
    Expression _expression = _self.getExpression();
    Object _eval = ExpressionAspect.eval(_expression, context);
    return (((Boolean) _eval)).booleanValue();
  }
}
