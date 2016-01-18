package expressions.semantics;

import ExpressionPck.Literal;
import expressions.semantics.Context;
import expressions.semantics.ExpressionAspect;
import expressions.semantics.LiteralAspectLiteralAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = Literal.class)
@SuppressWarnings("all")
public class LiteralAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final Literal _self, final Context context) {
    expressions.semantics.LiteralAspectLiteralAspectProperties _self_ = expressions.semantics.LiteralAspectLiteralAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final Literal _self, final Context context) {
    expressions.semantics.ExpressionAspectExpressionAspectProperties _self_ = expressions.semantics.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  expressions.semantics.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final LiteralAspectLiteralAspectProperties _self_, final Literal _self, final Context context) {
    return Integer.valueOf(0);
  }
}
