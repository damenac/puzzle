package flowchart;

import flowchart.ExpressionAspect;
import flowchart.Literal;
import flowchart.LiteralAspectLiteralAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = Literal.class)
@SuppressWarnings("all")
public class LiteralAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final Literal _self) {
    flowchart.LiteralAspectLiteralAspectProperties _self_ = flowchart.LiteralAspectLiteralAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof flowchart.IntegerLit){
    result = flowchart.IntegerLitAspect.eval((flowchart.IntegerLit)_self);
    } else  if (_self instanceof flowchart.BoolLit){
    result = flowchart.BoolLitAspect.eval((flowchart.BoolLit)_self);
    } else  if (_self instanceof flowchart.StringLit){
    result = flowchart.StringLitAspect.eval((flowchart.StringLit)_self);
    } else  if (_self instanceof flowchart.Literal){
    result = flowchart.LiteralAspect._privk3_eval(_self_, (flowchart.Literal)_self);
    } else  if (_self instanceof flowchart.Expression){
    result = flowchart.ExpressionAspect.eval((flowchart.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final Literal _self) {
    flowchart.ExpressionAspectExpressionAspectProperties _self_ = flowchart.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  flowchart.ExpressionAspect._privk3_eval(_self_, _self);
  }
  
  protected static Object _privk3_eval(final LiteralAspectLiteralAspectProperties _self_, final Literal _self) {
    return Integer.valueOf(0);
  }
}
