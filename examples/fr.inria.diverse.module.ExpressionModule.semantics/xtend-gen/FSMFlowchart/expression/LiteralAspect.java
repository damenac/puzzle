package FSMFlowchart.expression;

import ExpressionModule.Literal;
import FSMFlowchart.expression.ExpressionAspect;
import FSMFlowchart.expression.LiteralAspectLiteralAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;

@Aspect(className = Literal.class)
@SuppressWarnings("all")
public class LiteralAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final Literal _self, final Hashtable<String, Object> context) {
    FSMFlowchart.expression.LiteralAspectLiteralAspectProperties _self_ = FSMFlowchart.expression.LiteralAspectLiteralAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final Literal _self, final Hashtable<String, Object> context) {
    FSMFlowchart.expression.ExpressionAspectExpressionAspectProperties _self_ = FSMFlowchart.expression.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  FSMFlowchart.expression.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final LiteralAspectLiteralAspectProperties _self_, final Literal _self, final Hashtable<String, Object> context) {
    return Integer.valueOf(0);
  }
}
