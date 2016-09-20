package semanticsLogoBinaryExpressions;

import BinaryExpressions.ArithmeticExpr;
import BinaryExpressions.BinaryExpr;
import BinaryExpressions.BooleanExpr;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import semanticsLogoBinaryExpressions.BinaryExprAspectBinaryExprAspectProperties;

@Aspect(className = BinaryExpr.class)
@SuppressWarnings("all")
public class BinaryExprAspect {
  public static Object eval(final BinaryExpr _self, final Hashtable<String, Object> context) {
    semanticsLogoBinaryExpressions.BinaryExprAspectBinaryExprAspectProperties _self_ = semanticsLogoBinaryExpressions.BinaryExprAspectBinaryExprAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  protected static Object _privk3_eval(final BinaryExprAspectBinaryExprAspectProperties _self_, final BinaryExpr _self, final Hashtable<String, Object> context) {
    if ((_self instanceof ArithmeticExpr)) {
      ArithmeticExpr _expr = ((ArithmeticExpr) _self);
      return _expr.eval(context);
    } else {
      if ((_self instanceof BooleanExpr)) {
        BooleanExpr _expr_1 = ((BooleanExpr) _self);
        return _expr_1.eval(context);
      } else {
        return null;
      }
    }
  }
}
