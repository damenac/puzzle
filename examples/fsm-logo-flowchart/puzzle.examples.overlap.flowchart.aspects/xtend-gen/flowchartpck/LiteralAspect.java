package flowchartpck;

import flowchartpck.BoolLit;
import flowchartpck.ExpressionAspect;
import flowchartpck.IntegerLit;
import flowchartpck.Literal;
import flowchartpck.LiteralAspectLiteralAspectProperties;
import flowchartpck.StringLit;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;

@Aspect(className = Literal.class)
@SuppressWarnings("all")
public class LiteralAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final Literal _self, final Hashtable<String, Object> context) {
    flowchartpck.LiteralAspectLiteralAspectProperties _self_ = flowchartpck.LiteralAspectLiteralAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final Literal _self, final Hashtable<String, Object> context) {
    flowchartpck.ExpressionAspectExpressionAspectProperties _self_ = flowchartpck.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  flowchartpck.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final LiteralAspectLiteralAspectProperties _self_, final Literal _self, final Hashtable<String, Object> context) {
    if ((_self instanceof IntegerLit)) {
      return Integer.valueOf(((IntegerLit) _self).getValue());
    } else {
      if ((_self instanceof StringLit)) {
        return ((StringLit) _self).getValue();
      } else {
        if ((_self instanceof BoolLit)) {
          return Boolean.valueOf(((BoolLit) _self).isValue());
        } else {
          return Integer.valueOf(0);
        }
      }
    }
  }
}
