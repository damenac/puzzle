package CompleteDSL;

import CompleteDSLPckg.ArithmeticExpr;
import CompleteDSLPckg.BinaryExpr;
import CompleteDSLPckg.BooleanExpr;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import CompleteDSL.BinaryExprAspectBinaryExprAspectProperties;

@Aspect(className = BinaryExpr.class)
@SuppressWarnings("all")
public class BinaryExprAspect {
  public static Object eval(final BinaryExpr _self, final Hashtable<String, Object> context) {
    CompleteDSL.BinaryExprAspectBinaryExprAspectProperties _self_ = CompleteDSL.BinaryExprAspectBinaryExprAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  protected static Object _privk3_eval(final BinaryExprAspectBinaryExprAspectProperties _self_, final BinaryExpr _self, final Hashtable<String, Object> context) {
    if ((_self instanceof ArithmeticExpr)) {
      ArithmeticExpr _expr = ((ArithmeticExpr) _self);
      return BlockAspect.eval( _expr,context);
    } else {
      if ((_self instanceof BooleanExpr)) {
        BooleanExpr _expr_1 = ((BooleanExpr) _self);
        return BlockAspect.eval( _expr_1,context);
      } else {
        return null;
      }
    }
  }
}
