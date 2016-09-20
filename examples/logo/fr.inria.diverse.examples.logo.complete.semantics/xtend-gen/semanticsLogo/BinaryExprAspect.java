package semanticsLogo;

import Logo.BinaryExpr;
import Logo.BinaryOperator;
import Logo.Expression;
import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import semanticsLogo.BinaryExprAspectBinaryExprAspectProperties;
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
    BinaryOperator _operator = _self.getOperator();
    boolean _equals = Objects.equal(_operator, BinaryOperator.PLUS);
    if (_equals) {
      Expression _leftExpr = _self.getLeftExpr();
      Object _eval = ExpressionAspect.eval(_leftExpr, context);
      int _intValue = ((Integer) _eval).intValue();
      Expression _rightExpr = _self.getRightExpr();
      Object _eval_1 = ExpressionAspect.eval(_rightExpr, context);
      int _intValue_1 = ((Integer) _eval_1).intValue();
      return Integer.valueOf((_intValue + _intValue_1));
    } else {
      BinaryOperator _operator_1 = _self.getOperator();
      boolean _equals_1 = Objects.equal(_operator_1, BinaryOperator.MINUS);
      if (_equals_1) {
        Expression _leftExpr_1 = _self.getLeftExpr();
        Object _eval_2 = ExpressionAspect.eval(_leftExpr_1, context);
        int _intValue_2 = ((Integer) _eval_2).intValue();
        Expression _rightExpr_1 = _self.getRightExpr();
        Object _eval_3 = ExpressionAspect.eval(_rightExpr_1, context);
        int _intValue_3 = ((Integer) _eval_3).intValue();
        return Integer.valueOf((_intValue_2 - _intValue_3));
      } else {
        BinaryOperator _operator_2 = _self.getOperator();
        boolean _equals_2 = Objects.equal(_operator_2, BinaryOperator.MULT);
        if (_equals_2) {
          Expression _leftExpr_2 = _self.getLeftExpr();
          Object _eval_4 = ExpressionAspect.eval(_leftExpr_2, context);
          int _intValue_4 = ((Integer) _eval_4).intValue();
          Expression _rightExpr_2 = _self.getRightExpr();
          Object _eval_5 = ExpressionAspect.eval(_rightExpr_2, context);
          int _intValue_5 = ((Integer) _eval_5).intValue();
          return Integer.valueOf((_intValue_4 * _intValue_5));
        } else {
          BinaryOperator _operator_3 = _self.getOperator();
          boolean _equals_3 = Objects.equal(_operator_3, BinaryOperator.DIV);
          if (_equals_3) {
            Expression _leftExpr_3 = _self.getLeftExpr();
            Object _eval_6 = ExpressionAspect.eval(_leftExpr_3, context);
            int _intValue_6 = ((Integer) _eval_6).intValue();
            Expression _rightExpr_3 = _self.getRightExpr();
            Object _eval_7 = ExpressionAspect.eval(_rightExpr_3, context);
            int _intValue_7 = ((Integer) _eval_7).intValue();
            return Integer.valueOf((_intValue_6 / _intValue_7));
          } else {
            BinaryOperator _operator_4 = _self.getOperator();
            boolean _equals_4 = Objects.equal(_operator_4, BinaryOperator.EQUAL);
            if (_equals_4) {
              Expression _leftExpr_4 = _self.getLeftExpr();
              Object _eval_8 = ExpressionAspect.eval(_leftExpr_4, context);
              Expression _rightExpr_4 = _self.getRightExpr();
              Object _eval_9 = ExpressionAspect.eval(_rightExpr_4, context);
              return Boolean.valueOf(_eval_8.equals(_eval_9));
            } else {
              BinaryOperator _operator_5 = _self.getOperator();
              boolean _equals_5 = Objects.equal(_operator_5, BinaryOperator.DIFF);
              if (_equals_5) {
                Expression _leftExpr_5 = _self.getLeftExpr();
                Object _eval_10 = ExpressionAspect.eval(_leftExpr_5, context);
                Expression _rightExpr_5 = _self.getRightExpr();
                Object _eval_11 = ExpressionAspect.eval(_rightExpr_5, context);
                boolean _equals_6 = _eval_10.equals(_eval_11);
                return Boolean.valueOf((!_equals_6));
              } else {
                return null;
              }
            }
          }
        }
      }
    }
  }
}
