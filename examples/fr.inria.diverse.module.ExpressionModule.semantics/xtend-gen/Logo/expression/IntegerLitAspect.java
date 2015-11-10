package Logo.expression;

import ExpressionModule.IntegerLit;
import Logo.expression.IntegerLitAspectIntegerLitAspectProperties;
import Logo.expression.LiteralAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = IntegerLit.class)
@SuppressWarnings("all")
public class IntegerLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final IntegerLit _self, final Context context) {
    Logo.expression.IntegerLitAspectIntegerLitAspectProperties _self_ = Logo.expression.IntegerLitAspectIntegerLitAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof ExpressionModule.IntegerLit){
    result = Logo.expression.IntegerLitAspect._privk3_eval(_self_, (ExpressionModule.IntegerLit)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final IntegerLit _self, final Context context) {
    Logo.expression.LiteralAspectLiteralAspectProperties _self_ = Logo.expression.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  Logo.expression.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final IntegerLitAspectIntegerLitAspectProperties _self_, final IntegerLit _self, final Context context) {
    return Integer.valueOf(_self.getValue());
  }
}
