package Logo.expression;

import ExpressionModule.Literal;
import Logo.expression.ExpressionAspect;
import Logo.expression.LiteralAspectLiteralAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = Literal.class)
@SuppressWarnings("all")
public class LiteralAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final Literal _self, final Context context) {
    Logo.expression.LiteralAspectLiteralAspectProperties _self_ = Logo.expression.LiteralAspectLiteralAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof ExpressionModule.Literal){
    result = Logo.expression.LiteralAspect._privk3_eval(_self_, (ExpressionModule.Literal)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final Literal _self, final Context context) {
    Logo.expression.ExpressionAspectExpressionAspectProperties _self_ = Logo.expression.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  Logo.expression.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final LiteralAspectLiteralAspectProperties _self_, final Literal _self, final Context context) {
    return Integer.valueOf(0);
  }
}
