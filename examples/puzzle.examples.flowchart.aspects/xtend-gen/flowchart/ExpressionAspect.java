package flowchart;

import flowchart.Expression;
import flowchart.ExpressionAspectExpressionAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public class ExpressionAspect {
  public static Object eval(final Expression _self, final Hashtable<String, Object> context) {
    flowchart.ExpressionAspectExpressionAspectProperties _self_ = flowchart.ExpressionAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof flowchart.ArithmeticExpression){
    result = flowchart.ArithmeticExpressionAspect.eval((flowchart.ArithmeticExpression)_self,context);
    } else  if (_self instanceof flowchart.BoolLit){
    result = flowchart.BoolLitAspect.eval((flowchart.BoolLit)_self,context);
    } else  if (_self instanceof flowchart.RelationalExpression){
    result = flowchart.RelationalExpressionAspect.eval((flowchart.RelationalExpression)_self,context);
    } else  if (_self instanceof flowchart.IntegerLit){
    result = flowchart.IntegerLitAspect.eval((flowchart.IntegerLit)_self,context);
    } else  if (_self instanceof flowchart.StringLit){
    result = flowchart.StringLitAspect.eval((flowchart.StringLit)_self,context);
    } else  if (_self instanceof flowchart.Literal){
    result = flowchart.LiteralAspect.eval((flowchart.Literal)_self,context);
    } else  if (_self instanceof flowchart.Expression){
    result = flowchart.ExpressionAspect._privk3_eval(_self_, (flowchart.Expression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  protected static Object _privk3_eval(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self, final Hashtable<String, Object> context) {
    return Integer.valueOf(0);
  }
}
