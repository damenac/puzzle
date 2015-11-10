package LogoLike.expression;

import ExpressionModule.Expression;
import LogoLike.expression.ExpressionAspectExpressionAspectProperties;
import commons.Context;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public class ExpressionAspect {
  public static Object eval(final Expression _self, final Context context) {
    LogoLike.expression.ExpressionAspectExpressionAspectProperties _self_ = LogoLike.expression.ExpressionAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  protected static Object _privk3_eval(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self, final Context context) {
    return Integer.valueOf(0);
  }
}
