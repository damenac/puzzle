package fsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fsm.Expression;
import fsm.ExpressionAspectExpressionAspectProperties;
import java.util.Hashtable;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public class ExpressionAspect {
  public static Object eval(final Expression _self, final Hashtable<String, Object> context) {
    fsm.ExpressionAspectExpressionAspectProperties _self_ = fsm.ExpressionAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof fsm.IntegerLit){
    result = fsm.IntegerLitAspect.eval((fsm.IntegerLit)_self,context);
    } else  if (_self instanceof fsm.StringLit){
    result = fsm.StringLitAspect.eval((fsm.StringLit)_self,context);
    } else  if (_self instanceof fsm.RelationalExpression){
    result = fsm.RelationalExpressionAspect.eval((fsm.RelationalExpression)_self,context);
    } else  if (_self instanceof fsm.BoolLit){
    result = fsm.BoolLitAspect.eval((fsm.BoolLit)_self,context);
    } else  if (_self instanceof fsm.ArithmeticExpression){
    result = fsm.ArithmeticExpressionAspect.eval((fsm.ArithmeticExpression)_self,context);
    } else  if (_self instanceof fsm.Literal){
    result = fsm.LiteralAspect.eval((fsm.Literal)_self,context);
    } else  if (_self instanceof fsm.Expression){
    result = fsm.ExpressionAspect._privk3_eval(_self_, (fsm.Expression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  protected static Object _privk3_eval(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self, final Hashtable<String, Object> context) {
    return Integer.valueOf(0);
  }
}
