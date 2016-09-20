package CompleteDSL;

import CompleteDSLPckg.ArithmeticExpr;
import CompleteDSLPckg.ArithmeticOperator;
import CompleteDSLPckg.Expression;
import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import CompleteDSL.ArithmeticExprAspectArithmeticExprAspectProperties;
import CompleteDSL.BinaryExprAspect;

@Aspect(className = ArithmeticExpr.class)
@SuppressWarnings("all")
public class ArithmeticExprAspect extends BinaryExprAspect {
  @OverrideAspectMethod
  public static Object eval(final ArithmeticExpr _self, final Hashtable<String, Object> context) {
    CompleteDSL.ArithmeticExprAspectArithmeticExprAspectProperties _self_ = CompleteDSL.ArithmeticExprAspectArithmeticExprAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof CompleteDSLPckg.ArithmeticExpr){
    result = CompleteDSL.ArithmeticExprAspect._privk3_eval(_self_, (CompleteDSLPckg.ArithmeticExpr)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final ArithmeticExpr _self, final Hashtable<String, Object> context) {
    CompleteDSL.BinaryExprAspectBinaryExprAspectProperties _self_ = CompleteDSL.BinaryExprAspectBinaryExprAspectContext.getSelf(_self);
    return  CompleteDSL.BinaryExprAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final ArithmeticExprAspectArithmeticExprAspectProperties _self_, final ArithmeticExpr _self, final Hashtable<String, Object> context) {
    ArithmeticOperator _operator = _self.getOperator();
    boolean _equals = Objects.equal(_operator, ArithmeticOperator.PLUS);
    if (_equals) {
      Expression _leftExpr = _self.getLeftExpr();
      Object _eval = ExpressionAspect.eval( _leftExpr,context);
      int _intValue = ((Integer) _eval).intValue();
      Expression _rightExpr = _self.getRightExpr();
      Object _eval_1 = ExpressionAspect.eval( _rightExpr,context);
      int _intValue_1 = ((Integer) _eval_1).intValue();
      return Integer.valueOf((_intValue + _intValue_1));
    } else {
      ArithmeticOperator _operator_1 = _self.getOperator();
      boolean _equals_1 = Objects.equal(_operator_1, ArithmeticOperator.MINUS);
      if (_equals_1) {
        Expression _leftExpr_1 = _self.getLeftExpr();
        Object _eval_2 = ExpressionAspect.eval( _leftExpr_1,context);
        int _intValue_2 = ((Integer) _eval_2).intValue();
        Expression _rightExpr_1 = _self.getRightExpr();
        Object _eval_3 = ExpressionAspect.eval( _rightExpr_1,context);
        int _intValue_3 = ((Integer) _eval_3).intValue();
        return Integer.valueOf((_intValue_2 - _intValue_3));
      } else {
        ArithmeticOperator _operator_2 = _self.getOperator();
        boolean _equals_2 = Objects.equal(_operator_2, ArithmeticOperator.MULT);
        if (_equals_2) {
          Expression _leftExpr_2 = _self.getLeftExpr();
          Object _eval_4 = ExpressionAspect.eval( _leftExpr_2,context);
          int _intValue_4 = ((Integer) _eval_4).intValue();
          Expression _rightExpr_2 = _self.getRightExpr();
          Object _eval_5 = ExpressionAspect.eval( _rightExpr_2,context);
          int _intValue_5 = ((Integer) _eval_5).intValue();
          return Integer.valueOf((_intValue_4 * _intValue_5));
        } else {
          ArithmeticOperator _operator_3 = _self.getOperator();
          boolean _equals_3 = Objects.equal(_operator_3, ArithmeticOperator.DIV);
          if (_equals_3) {
            Expression _leftExpr_3 = _self.getLeftExpr();
            Object _eval_6 = ExpressionAspect.eval( _leftExpr_3,context);
            int _intValue_6 = ((Integer) _eval_6).intValue();
            Expression _rightExpr_3 = _self.getRightExpr();
            Object _eval_7 = ExpressionAspect.eval( _rightExpr_3,context);
            int _intValue_7 = ((Integer) _eval_7).intValue();
            return Integer.valueOf((_intValue_6 / _intValue_7));
          } else {
            return null;
          }
        }
      }
    }
  }
}
