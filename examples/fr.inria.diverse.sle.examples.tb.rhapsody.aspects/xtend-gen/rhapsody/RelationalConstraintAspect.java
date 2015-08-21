package rhapsody;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import rhapsody.ConstraintAspect;
import rhapsody.Expression;
import rhapsody.ExpressionAspect;
import rhapsody.RelationalConstraint;
import rhapsody.RelationalConstraintAspectRelationalConstraintAspectProperties;

@Aspect(className = RelationalConstraint.class)
@SuppressWarnings("all")
public class RelationalConstraintAspect extends ConstraintAspect {
  @OverrideAspectMethod
  public static boolean evalConstraint(final RelationalConstraint _self, final Hashtable<String, Object> context) {
    rhapsody.RelationalConstraintAspectRelationalConstraintAspectProperties _self_ = rhapsody.RelationalConstraintAspectRelationalConstraintAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rhapsody.RelationalConstraint){
    result = rhapsody.RelationalConstraintAspect._privk3_evalConstraint(_self_, (rhapsody.RelationalConstraint)_self,context);
    } else  if (_self instanceof rhapsody.Constraint){
    result = rhapsody.ConstraintAspect.evalConstraint((rhapsody.Constraint)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  private static boolean super_evalConstraint(final RelationalConstraint _self, final Hashtable<String, Object> context) {
    rhapsody.ConstraintAspectConstraintAspectProperties _self_ = rhapsody.ConstraintAspectConstraintAspectContext.getSelf(_self);
    return  rhapsody.ConstraintAspect._privk3_evalConstraint(_self_, _self,context);
  }
  
  protected static boolean _privk3_evalConstraint(final RelationalConstraintAspectRelationalConstraintAspectProperties _self_, final RelationalConstraint _self, final Hashtable<String, Object> context) {
    Expression _expression = _self.getExpression();
    Object _eval = ExpressionAspect.eval(_expression, context);
    return (((Boolean) _eval)).booleanValue();
  }
}
