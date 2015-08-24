package hfsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import hfsm.Expression;
import hfsm.ExpressionAspectExpressionAspectProperties;
import java.util.Hashtable;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public class ExpressionAspect {
  public static Object eval(final Expression _self, final Hashtable<String, Object> context) {
    hfsm.ExpressionAspectExpressionAspectProperties _self_ = hfsm.ExpressionAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof hfsm.StringLit){
    result = hfsm.StringLitAspect.eval((hfsm.StringLit)_self,context);
    } else  if (_self instanceof hfsm.RelationalExpression){
    result = hfsm.RelationalExpressionAspect.eval((hfsm.RelationalExpression)_self,context);
    } else  if (_self instanceof hfsm.ArithmeticExpression){
    result = hfsm.ArithmeticExpressionAspect.eval((hfsm.ArithmeticExpression)_self,context);
    } else  if (_self instanceof hfsm.IntegerLit){
    result = hfsm.IntegerLitAspect.eval((hfsm.IntegerLit)_self,context);
    } else  if (_self instanceof hfsm.BoolLit){
    result = hfsm.BoolLitAspect.eval((hfsm.BoolLit)_self,context);
    } else  if (_self instanceof hfsm.Literal){
    result = hfsm.LiteralAspect.eval((hfsm.Literal)_self,context);
    } else  if (_self instanceof hfsm.Expression){
    result = hfsm.ExpressionAspect._privk3_eval(_self_, (hfsm.Expression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  protected static Object _privk3_eval(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self, final Hashtable<String, Object> context) {
    return Integer.valueOf(0);
  }
}
