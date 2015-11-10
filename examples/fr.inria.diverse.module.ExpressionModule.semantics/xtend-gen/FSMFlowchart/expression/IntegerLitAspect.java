package FSMFlowchart.expression;

import ExpressionModule.IntegerLit;
import FSMFlowchart.expression.IntegerLitAspectIntegerLitAspectProperties;
import FSMFlowchart.expression.LiteralAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;

@Aspect(className = IntegerLit.class)
@SuppressWarnings("all")
public class IntegerLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final IntegerLit _self, final Hashtable<String, Object> context) {
    FSMFlowchart.expression.IntegerLitAspectIntegerLitAspectProperties _self_ = FSMFlowchart.expression.IntegerLitAspectIntegerLitAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final IntegerLit _self, final Hashtable<String, Object> context) {
    FSMFlowchart.expression.LiteralAspectLiteralAspectProperties _self_ = FSMFlowchart.expression.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  FSMFlowchart.expression.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final IntegerLitAspectIntegerLitAspectProperties _self_, final IntegerLit _self, final Hashtable<String, Object> context) {
    return Integer.valueOf(_self.getValue());
  }
}
