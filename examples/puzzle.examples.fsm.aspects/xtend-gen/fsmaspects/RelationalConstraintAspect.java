package fsmaspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fsm.Expression;
import fsm.RelationalConstraint;
import fsmaspects.ConstraintAspect;
import fsmaspects.ExpressionAspect;
import fsmaspects.RelationalConstraintAspectRelationalConstraintAspectProperties;
import java.util.Hashtable;

@Aspect(className = RelationalConstraint.class)
@SuppressWarnings("all")
public class RelationalConstraintAspect extends ConstraintAspect {
  @OverrideAspectMethod
  public static boolean evalConstraint(final RelationalConstraint _self, final Hashtable<String, Object> context) {
    fsmaspects.RelationalConstraintAspectRelationalConstraintAspectProperties _self_ = fsmaspects.RelationalConstraintAspectRelationalConstraintAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_evalConstraint(_self_, _self,context);
    return (boolean)result;
  }
  
  private static boolean super_evalConstraint(final RelationalConstraint _self, final Hashtable<String, Object> context) {
    fsmaspects.ConstraintAspectConstraintAspectProperties _self_ = fsmaspects.ConstraintAspectConstraintAspectContext.getSelf(_self);
    return  fsmaspects.ConstraintAspect._privk3_evalConstraint(_self_, _self,context);
  }
  
  protected static boolean _privk3_evalConstraint(final RelationalConstraintAspectRelationalConstraintAspectProperties _self_, final RelationalConstraint _self, final Hashtable<String, Object> context) {
    Expression _expression = _self.getExpression();
    Object _eval = ExpressionAspect.eval(_expression, context);
    return (((Boolean) _eval)).booleanValue();
  }
}
