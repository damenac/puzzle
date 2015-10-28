package flowchart;

import flowchart.ExpressionAspect;
import flowchart.Literal;
import flowchart.LiteralAspectLiteralAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;

@Aspect(className = Literal.class)
@SuppressWarnings("all")
public class LiteralAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final Literal _self, final Hashtable<String, Object> context) {
    flowchart.LiteralAspectLiteralAspectProperties _self_ = flowchart.LiteralAspectLiteralAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof flowchart.BoolLit){
    result = flowchart.BoolLitAspect.eval((flowchart.BoolLit)_self,context);
    } else  if (_self instanceof flowchart.IntegerLit){
    result = flowchart.IntegerLitAspect.eval((flowchart.IntegerLit)_self,context);
    } else  if (_self instanceof flowchart.StringLit){
    result = flowchart.StringLitAspect.eval((flowchart.StringLit)_self,context);
    } else  if (_self instanceof flowchart.Literal){
    result = flowchart.LiteralAspect._privk3_eval(_self_, (flowchart.Literal)_self,context);
    } else  if (_self instanceof flowchart.Expression){
    result = flowchart.ExpressionAspect.eval((flowchart.Expression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final Literal _self, final Hashtable<String, Object> context) {
    flowchart.ExpressionAspectExpressionAspectProperties _self_ = flowchart.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  flowchart.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final LiteralAspectLiteralAspectProperties _self_, final Literal _self, final Hashtable<String, Object> context) {
    return Integer.valueOf(0);
  }
}
