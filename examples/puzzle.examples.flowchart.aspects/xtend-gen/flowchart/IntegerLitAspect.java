package flowchart;

import flowchart.IntegerLit;
import flowchart.IntegerLitAspectIntegerLitAspectProperties;
import flowchart.LiteralAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = IntegerLit.class)
@SuppressWarnings("all")
public class IntegerLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final IntegerLit _self) {
    flowchart.IntegerLitAspectIntegerLitAspectProperties _self_ = flowchart.IntegerLitAspectIntegerLitAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof flowchart.IntegerLit){
    result = flowchart.IntegerLitAspect._privk3_eval(_self_, (flowchart.IntegerLit)_self);
    } else  if (_self instanceof flowchart.Literal){
    result = flowchart.LiteralAspect.eval((flowchart.Literal)_self);
    } else  if (_self instanceof flowchart.Expression){
    result = flowchart.ExpressionAspect.eval((flowchart.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final IntegerLit _self) {
    flowchart.LiteralAspectLiteralAspectProperties _self_ = flowchart.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  flowchart.LiteralAspect._privk3_eval(_self_, _self);
  }
  
  protected static Object _privk3_eval(final IntegerLitAspectIntegerLitAspectProperties _self_, final IntegerLit _self) {
    return Integer.valueOf(_self.getValue());
  }
}
