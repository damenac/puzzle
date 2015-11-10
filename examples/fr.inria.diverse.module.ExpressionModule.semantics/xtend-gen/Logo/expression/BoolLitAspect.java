package Logo.expression;

import ExpressionModule.BoolLit;
import Logo.expression.BoolLitAspectBoolLitAspectProperties;
import Logo.expression.LiteralAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = BoolLit.class)
@SuppressWarnings("all")
public class BoolLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final BoolLit _self, final Context context) {
    Logo.expression.BoolLitAspectBoolLitAspectProperties _self_ = Logo.expression.BoolLitAspectBoolLitAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof ExpressionModule.BoolLit){
    result = Logo.expression.BoolLitAspect._privk3_eval(_self_, (ExpressionModule.BoolLit)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final BoolLit _self, final Context context) {
    Logo.expression.LiteralAspectLiteralAspectProperties _self_ = Logo.expression.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  Logo.expression.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final BoolLitAspectBoolLitAspectProperties _self_, final BoolLit _self, final Context context) {
    return Boolean.valueOf(_self.isValue());
  }
}
