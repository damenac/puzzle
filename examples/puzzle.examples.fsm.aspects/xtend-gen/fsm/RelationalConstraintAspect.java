package fsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fsm.ConstraintAspect;
import fsm.Expression;
import fsm.ExpressionAspect;
import fsm.RelationalConstraint;
import fsm.RelationalConstraintAspectRelationalConstraintAspectProperties;
import java.util.Hashtable;

@Aspect(className = RelationalConstraint.class)
@SuppressWarnings("all")
public class RelationalConstraintAspect extends ConstraintAspect {
  @OverrideAspectMethod
  public static boolean evalConstraint(final RelationalConstraint _self, final Hashtable<String, Object> context) {
    fsm.RelationalConstraintAspectRelationalConstraintAspectProperties _self_ = fsm.RelationalConstraintAspectRelationalConstraintAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof fsm.RelationalConstraint){
    result = fsm.RelationalConstraintAspect._privk3_evalConstraint(_self_, (fsm.RelationalConstraint)_self,context);
    } else  if (_self instanceof fsm.Constraint){
    result = fsm.ConstraintAspect.evalConstraint((fsm.Constraint)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  private static boolean super_evalConstraint(final RelationalConstraint _self, final Hashtable<String, Object> context) {
    fsm.ConstraintAspectConstraintAspectProperties _self_ = fsm.ConstraintAspectConstraintAspectContext.getSelf(_self);
    return  fsm.ConstraintAspect._privk3_evalConstraint(_self_, _self,context);
  }
  
  protected static boolean _privk3_evalConstraint(final RelationalConstraintAspectRelationalConstraintAspectProperties _self_, final RelationalConstraint _self, final Hashtable<String, Object> context) {
    Expression _expression = _self.getExpression();
    Object _eval = ExpressionAspect.eval(_expression, context);
    return (((Boolean) _eval)).booleanValue();
  }
}
