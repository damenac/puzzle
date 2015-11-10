package LogoLike.expression;

import ExpressionModule.IntegerLit;
import LogoLike.expression.IntegerLitAspectIntegerLitAspectProperties;
import LogoLike.expression.LiteralAspect;
import commons.Context;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = IntegerLit.class)
@SuppressWarnings("all")
public class IntegerLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final IntegerLit _self, final Context context) {
    LogoLike.expression.IntegerLitAspectIntegerLitAspectProperties _self_ = LogoLike.expression.IntegerLitAspectIntegerLitAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final IntegerLit _self, final Context context) {
    LogoLike.expression.LiteralAspectLiteralAspectProperties _self_ = LogoLike.expression.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  LogoLike.expression.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final IntegerLitAspectIntegerLitAspectProperties _self_, final IntegerLit _self, final Context context) {
    return Integer.valueOf(_self.getValue());
  }
}
