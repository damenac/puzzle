package FSMFlowchart.expression;

import ExpressionModule.StringLit;
import FSMFlowchart.expression.LiteralAspect;
import FSMFlowchart.expression.StringLitAspectStringLitAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;

@Aspect(className = StringLit.class)
@SuppressWarnings("all")
public class StringLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final StringLit _self, final Hashtable<String, Object> context) {
    FSMFlowchart.expression.StringLitAspectStringLitAspectProperties _self_ = FSMFlowchart.expression.StringLitAspectStringLitAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final StringLit _self, final Hashtable<String, Object> context) {
    FSMFlowchart.expression.LiteralAspectLiteralAspectProperties _self_ = FSMFlowchart.expression.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  FSMFlowchart.expression.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final StringLitAspectStringLitAspectProperties _self_, final StringLit _self, final Hashtable<String, Object> context) {
    return _self.getValue();
  }
}
