package tfsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import tfsm.Expression;
import tfsm.ExpressionAspectExpressionAspectProperties;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public class ExpressionAspect {
  public static Object eval(final Expression _self, final Hashtable<String, Object> context) {
    tfsm.ExpressionAspectExpressionAspectProperties _self_ = tfsm.ExpressionAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof tfsm.ArithmeticExpression){
    result = tfsm.ArithmeticExpressionAspect.eval((tfsm.ArithmeticExpression)_self,context);
    } else  if (_self instanceof tfsm.RelationalExpression){
    result = tfsm.RelationalExpressionAspect.eval((tfsm.RelationalExpression)_self,context);
    } else  if (_self instanceof tfsm.BoolLit){
    result = tfsm.BoolLitAspect.eval((tfsm.BoolLit)_self,context);
    } else  if (_self instanceof tfsm.StringLit){
    result = tfsm.StringLitAspect.eval((tfsm.StringLit)_self,context);
    } else  if (_self instanceof tfsm.IntegerLit){
    result = tfsm.IntegerLitAspect.eval((tfsm.IntegerLit)_self,context);
    } else  if (_self instanceof tfsm.Literal){
    result = tfsm.LiteralAspect.eval((tfsm.Literal)_self,context);
    } else  if (_self instanceof tfsm.Expression){
    result = tfsm.ExpressionAspect._privk3_eval(_self_, (tfsm.Expression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  protected static Object _privk3_eval(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self, final Hashtable<String, Object> context) {
    return Integer.valueOf(0);
  }
}
