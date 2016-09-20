package semanticsLogo;

import Logo.BinaryExpr;
import Logo.Expression;
import Logo.Literal;
import Logo.VarReference;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import semanticsLogo.BinaryExprAspect;
import semanticsLogo.ExpressionAspectExpressionAspectProperties;
import semanticsLogo.LiteralAspect;
import semanticsLogo.VarReferenceAspect;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public class ExpressionAspect {
  public static Object eval(final Expression _self, final Hashtable<String, Object> context) {
    semanticsLogo.ExpressionAspectExpressionAspectProperties _self_ = semanticsLogo.ExpressionAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  protected static Object _privk3_eval(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self, final Hashtable<String, Object> context) {
    if ((_self instanceof Literal)) {
      return LiteralAspect.eval(((Literal) _self), context);
    } else {
      if ((_self instanceof BinaryExpr)) {
        return BinaryExprAspect.eval(((BinaryExpr) _self), context);
      } else {
        if ((_self instanceof VarReference)) {
          return VarReferenceAspect.eval(((VarReference) _self), context);
        } else {
          return Integer.valueOf(0);
        }
      }
    }
  }
}
