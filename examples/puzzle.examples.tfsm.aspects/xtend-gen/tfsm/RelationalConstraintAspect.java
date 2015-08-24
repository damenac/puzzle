package tfsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import tfsm.ConstraintAspect;
import tfsm.Expression;
import tfsm.ExpressionAspect;
import tfsm.RelationalConstraint;
import tfsm.RelationalConstraintAspectRelationalConstraintAspectProperties;

@Aspect(className = RelationalConstraint.class)
@SuppressWarnings("all")
public class RelationalConstraintAspect extends ConstraintAspect {
  @OverrideAspectMethod
  public static boolean evalConstraint(final RelationalConstraint _self, final Hashtable<String, Object> context) {
    tfsm.RelationalConstraintAspectRelationalConstraintAspectProperties _self_ = tfsm.RelationalConstraintAspectRelationalConstraintAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof tfsm.RelationalConstraint){
    result = tfsm.RelationalConstraintAspect._privk3_evalConstraint(_self_, (tfsm.RelationalConstraint)_self,context);
    } else  if (_self instanceof tfsm.Constraint){
    result = tfsm.ConstraintAspect.evalConstraint((tfsm.Constraint)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  private static boolean super_evalConstraint(final RelationalConstraint _self, final Hashtable<String, Object> context) {
    tfsm.ConstraintAspectConstraintAspectProperties _self_ = tfsm.ConstraintAspectConstraintAspectContext.getSelf(_self);
    return  tfsm.ConstraintAspect._privk3_evalConstraint(_self_, _self,context);
  }
  
  protected static boolean _privk3_evalConstraint(final RelationalConstraintAspectRelationalConstraintAspectProperties _self_, final RelationalConstraint _self, final Hashtable<String, Object> context) {
    Expression _expression = _self.getExpression();
    Object _eval = ExpressionAspect.eval(_expression, context);
    return (((Boolean) _eval)).booleanValue();
  }
}
