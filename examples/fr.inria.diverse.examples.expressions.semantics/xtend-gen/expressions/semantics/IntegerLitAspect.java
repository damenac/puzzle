package expressions.semantics;

import ExpressionPck.IntegerLit;
import expressions.semantics.Context;
import expressions.semantics.IntegerLitAspectIntegerLitAspectProperties;
import expressions.semantics.LiteralAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = IntegerLit.class)
@SuppressWarnings("all")
public class IntegerLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final IntegerLit _self, final Context context) {
    expressions.semantics.IntegerLitAspectIntegerLitAspectProperties _self_ = expressions.semantics.IntegerLitAspectIntegerLitAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final IntegerLit _self, final Context context) {
    expressions.semantics.LiteralAspectLiteralAspectProperties _self_ = expressions.semantics.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  expressions.semantics.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final IntegerLitAspectIntegerLitAspectProperties _self_, final IntegerLit _self, final Context context) {
    return Integer.valueOf(_self.getValue());
  }
}
