package rhapsody;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import rhapsody.Expression;
import rhapsody.ExpressionAspectExpressionAspectProperties;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public class ExpressionAspect {
  public static Object eval(final Expression _self, final Hashtable<String, Object> context) {
    rhapsody.ExpressionAspectExpressionAspectProperties _self_ = rhapsody.ExpressionAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rhapsody.StringLit){
    result = rhapsody.StringLitAspect.eval((rhapsody.StringLit)_self,context);
    } else  if (_self instanceof rhapsody.IntegerLit){
    result = rhapsody.IntegerLitAspect.eval((rhapsody.IntegerLit)_self,context);
    } else  if (_self instanceof rhapsody.RelationalExpression){
    result = rhapsody.RelationalExpressionAspect.eval((rhapsody.RelationalExpression)_self,context);
    } else  if (_self instanceof rhapsody.BoolLit){
    result = rhapsody.BoolLitAspect.eval((rhapsody.BoolLit)_self,context);
    } else  if (_self instanceof rhapsody.Literal){
    result = rhapsody.LiteralAspect.eval((rhapsody.Literal)_self,context);
    } else  if (_self instanceof rhapsody.ArithmeticExpression){
    result = rhapsody.ArithmeticExpressionAspect.eval((rhapsody.ArithmeticExpression)_self,context);
    } else  if (_self instanceof rhapsody.Expression){
    result = rhapsody.ExpressionAspect._privk3_eval(_self_, (rhapsody.Expression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  protected static Object _privk3_eval(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self, final Hashtable<String, Object> context) {
    return Integer.valueOf(0);
  }
}
