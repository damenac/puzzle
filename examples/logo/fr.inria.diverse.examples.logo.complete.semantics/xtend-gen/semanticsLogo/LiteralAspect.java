package semanticsLogo;

import Logo.Literal;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import semanticsLogo.ExpressionAspect;
import semanticsLogo.LiteralAspectLiteralAspectProperties;

@Aspect(className = Literal.class)
@SuppressWarnings("all")
public class LiteralAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final Literal _self, final Hashtable<String, Object> context) {
    semanticsLogo.LiteralAspectLiteralAspectProperties _self_ = semanticsLogo.LiteralAspectLiteralAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final Literal _self, final Hashtable<String, Object> context) {
    semanticsLogo.ExpressionAspectExpressionAspectProperties _self_ = semanticsLogo.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  semanticsLogo.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final LiteralAspectLiteralAspectProperties _self_, final Literal _self, final Hashtable<String, Object> context) {
    if ((_self instanceof Logo.Integer)) {
      return Integer.valueOf(((Logo.Integer) _self).getValue());
    } else {
      if ((_self instanceof Logo.String)) {
        return ((Logo.String) _self).getValue();
      } else {
        if ((_self instanceof Logo.Boolean)) {
          return Boolean.valueOf(((Logo.Boolean) _self).isValue());
        } else {
          return Integer.valueOf(0);
        }
      }
    }
  }
}
