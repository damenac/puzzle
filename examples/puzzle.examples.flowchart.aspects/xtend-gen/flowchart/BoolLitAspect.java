package flowchart;

import flowchart.BoolLit;
import flowchart.BoolLitAspectBoolLitAspectProperties;
import flowchart.LiteralAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = BoolLit.class)
@SuppressWarnings("all")
public class BoolLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final BoolLit _self) {
    flowchart.BoolLitAspectBoolLitAspectProperties _self_ = flowchart.BoolLitAspectBoolLitAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof flowchart.BoolLit){
    result = flowchart.BoolLitAspect._privk3_eval(_self_, (flowchart.BoolLit)_self);
    } else  if (_self instanceof flowchart.Literal){
    result = flowchart.LiteralAspect.eval((flowchart.Literal)_self);
    } else  if (_self instanceof flowchart.Expression){
    result = flowchart.ExpressionAspect.eval((flowchart.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final BoolLit _self) {
    flowchart.LiteralAspectLiteralAspectProperties _self_ = flowchart.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  flowchart.LiteralAspect._privk3_eval(_self_, _self);
  }
  
  protected static Object _privk3_eval(final BoolLitAspectBoolLitAspectProperties _self_, final BoolLit _self) {
    return Boolean.valueOf(_self.isValue());
  }
}
