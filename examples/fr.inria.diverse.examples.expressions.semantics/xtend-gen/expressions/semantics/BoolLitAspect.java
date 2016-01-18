package expressions.semantics;

import ExpressionPck.BoolLit;
import expressions.semantics.BoolLitAspectBoolLitAspectProperties;
import expressions.semantics.Context;
import expressions.semantics.LiteralAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = BoolLit.class)
@SuppressWarnings("all")
public class BoolLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final BoolLit _self, final Context context) {
    expressions.semantics.BoolLitAspectBoolLitAspectProperties _self_ = expressions.semantics.BoolLitAspectBoolLitAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final BoolLit _self, final Context context) {
    expressions.semantics.LiteralAspectLiteralAspectProperties _self_ = expressions.semantics.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  expressions.semantics.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final BoolLitAspectBoolLitAspectProperties _self_, final BoolLit _self, final Context context) {
    return Boolean.valueOf(_self.isValue());
  }
}
