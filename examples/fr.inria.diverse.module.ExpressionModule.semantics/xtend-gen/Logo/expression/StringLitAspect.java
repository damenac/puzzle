package Logo.expression;

import ExpressionModule.StringLit;
import Logo.expression.LiteralAspect;
import Logo.expression.StringLitAspectStringLitAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = StringLit.class)
@SuppressWarnings("all")
public class StringLitAspect extends LiteralAspect {
  @OverrideAspectMethod
  public static Object eval(final StringLit _self, final Context context) {
    Logo.expression.StringLitAspectStringLitAspectProperties _self_ = Logo.expression.StringLitAspectStringLitAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof ExpressionModule.StringLit){
    result = Logo.expression.StringLitAspect._privk3_eval(_self_, (ExpressionModule.StringLit)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final StringLit _self, final Context context) {
    Logo.expression.LiteralAspectLiteralAspectProperties _self_ = Logo.expression.LiteralAspectLiteralAspectContext.getSelf(_self);
    return  Logo.expression.LiteralAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final StringLitAspectStringLitAspectProperties _self_, final StringLit _self, final Context context) {
    return _self.getValue();
  }
}
