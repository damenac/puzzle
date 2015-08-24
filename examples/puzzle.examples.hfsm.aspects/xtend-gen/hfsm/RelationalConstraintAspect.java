package hfsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import hfsm.ConstraintAspect;
import hfsm.Expression;
import hfsm.ExpressionAspect;
import hfsm.RelationalConstraint;
import hfsm.RelationalConstraintAspectRelationalConstraintAspectProperties;
import java.util.Hashtable;

@Aspect(className = RelationalConstraint.class)
@SuppressWarnings("all")
public class RelationalConstraintAspect extends ConstraintAspect {
  @OverrideAspectMethod
  public static boolean evalConstraint(final RelationalConstraint _self, final Hashtable<String, Object> context) {
    hfsm.RelationalConstraintAspectRelationalConstraintAspectProperties _self_ = hfsm.RelationalConstraintAspectRelationalConstraintAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof hfsm.RelationalConstraint){
    result = hfsm.RelationalConstraintAspect._privk3_evalConstraint(_self_, (hfsm.RelationalConstraint)_self,context);
    } else  if (_self instanceof hfsm.Constraint){
    result = hfsm.ConstraintAspect.evalConstraint((hfsm.Constraint)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  private static boolean super_evalConstraint(final RelationalConstraint _self, final Hashtable<String, Object> context) {
    hfsm.ConstraintAspectConstraintAspectProperties _self_ = hfsm.ConstraintAspectConstraintAspectContext.getSelf(_self);
    return  hfsm.ConstraintAspect._privk3_evalConstraint(_self_, _self,context);
  }
  
  protected static boolean _privk3_evalConstraint(final RelationalConstraintAspectRelationalConstraintAspectProperties _self_, final RelationalConstraint _self, final Hashtable<String, Object> context) {
    Expression _expression = _self.getExpression();
    Object _eval = ExpressionAspect.eval(_expression, context);
    return (((Boolean) _eval)).booleanValue();
  }
}
