package expressions.semantics;

import ExpressionPck.Expression;
import expressions.semantics.Context;
import expressions.semantics.ExpressionAspectExpressionAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public class ExpressionAspect {
  public static Object eval(final Expression _self, final Context context) {
    expressions.semantics.ExpressionAspectExpressionAspectProperties _self_ = expressions.semantics.ExpressionAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  protected static Object _privk3_eval(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self, final Context context) {
    return Integer.valueOf(0);
  }
}
