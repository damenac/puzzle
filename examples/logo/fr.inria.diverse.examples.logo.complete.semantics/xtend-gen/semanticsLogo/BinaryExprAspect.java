package semanticsLogo;

import Logo.ArithmeticExpr;
import Logo.BinaryExpr;
import Logo.BooleanExpr;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import semanticsLogo.ArithmeticExprAspect;
import semanticsLogo.BinaryExprAspectBinaryExprAspectProperties;
import semanticsLogo.BooleanExprAspect;
import semanticsLogo.ExpressionAspect;

@Aspect(className = BinaryExpr.class)
@SuppressWarnings("all")
public class BinaryExprAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final BinaryExpr _self, final Hashtable<String, Object> context) {
    semanticsLogo.BinaryExprAspectBinaryExprAspectProperties _self_ = semanticsLogo.BinaryExprAspectBinaryExprAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof Logo.BinaryExpr){
    result = semanticsLogo.BinaryExprAspect._privk3_eval(_self_, (Logo.BinaryExpr)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final BinaryExpr _self, final Hashtable<String, Object> context) {
    semanticsLogo.ExpressionAspectExpressionAspectProperties _self_ = semanticsLogo.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  semanticsLogo.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final BinaryExprAspectBinaryExprAspectProperties _self_, final BinaryExpr _self, final Hashtable<String, Object> context) {
    if ((_self instanceof ArithmeticExpr)) {
      return ArithmeticExprAspect.eval(((ArithmeticExpr) _self), context);
    } else {
      if ((_self instanceof BooleanExpr)) {
        return BooleanExprAspect.eval(((BooleanExpr) _self), context);
      } else {
        return null;
      }
    }
  }
}
