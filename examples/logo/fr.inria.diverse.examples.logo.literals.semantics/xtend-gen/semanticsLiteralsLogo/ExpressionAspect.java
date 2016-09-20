package semanticsLiteralsLogo;

import LogoLiterals.Expression;
import LogoLiterals.Literal;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import semanticsLiteralsLogo.ExpressionAspectExpressionAspectProperties;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public class ExpressionAspect {
  public static Object eval(final Expression _self, final Hashtable<String, Object> context) {
    semanticsLiteralsLogo.ExpressionAspectExpressionAspectProperties _self_ = semanticsLiteralsLogo.ExpressionAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  protected static Object _privk3_eval(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self, final Hashtable<String, Object> context) {
    if ((_self instanceof Literal)) {
      return ExpressionAspect.eval(((Literal) _self), context);
    } else {
      return Integer.valueOf(0);
    }
  }
}
