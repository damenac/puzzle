package semanticsLogoBinaryExpressions;

import BinaryExpressions.BooleanExpr;
import BinaryExpressions.BooleanOperator;
import BinaryExpressions.Expression;
import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Hashtable;
import semanticsLogoBinaryExpressions.BinaryExprAspect;
import semanticsLogoBinaryExpressions.BooleanExprAspectBooleanExprAspectProperties;

@Aspect(className = BooleanExpr.class)
@SuppressWarnings("all")
public class BooleanExprAspect extends BinaryExprAspect {
  @OverrideAspectMethod
  public static Object eval(final BooleanExpr _self, final Hashtable<String, Object> context) {
    semanticsLogoBinaryExpressions.BooleanExprAspectBooleanExprAspectProperties _self_ = semanticsLogoBinaryExpressions.BooleanExprAspectBooleanExprAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof BinaryExpressions.BooleanExpr){
    result = semanticsLogoBinaryExpressions.BooleanExprAspect._privk3_eval(_self_, (BinaryExpressions.BooleanExpr)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final BooleanExpr _self, final Hashtable<String, Object> context) {
    semanticsLogoBinaryExpressions.BinaryExprAspectBinaryExprAspectProperties _self_ = semanticsLogoBinaryExpressions.BinaryExprAspectBinaryExprAspectContext.getSelf(_self);
    return  semanticsLogoBinaryExpressions.BinaryExprAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final BooleanExprAspectBooleanExprAspectProperties _self_, final BooleanExpr _self, final Hashtable<String, Object> context) {
    BooleanOperator _operator = _self.getOperator();
    boolean _equals = Objects.equal(_operator, BooleanOperator.EQUAL);
    if (_equals) {
      Expression _leftExpr = _self.getLeftExpr();
      Object _eval = _leftExpr.eval(context);
      int _intValue = ((Integer) _eval).intValue();
      Expression _rightExpr = _self.getRightExpr();
      Object _eval_1 = _rightExpr.eval(context);
      int _intValue_1 = ((Integer) _eval_1).intValue();
      return Boolean.valueOf((_intValue == _intValue_1));
    } else {
      BooleanOperator _operator_1 = _self.getOperator();
      boolean _equals_1 = Objects.equal(_operator_1, BooleanOperator.DIFF);
      if (_equals_1) {
        Expression _leftExpr_1 = _self.getLeftExpr();
        Object _eval_2 = _leftExpr_1.eval(context);
        int _intValue_2 = ((Integer) _eval_2).intValue();
        Expression _rightExpr_1 = _self.getRightExpr();
        Object _eval_3 = _rightExpr_1.eval(context);
        int _intValue_3 = ((Integer) _eval_3).intValue();
        return Boolean.valueOf((_intValue_2 != _intValue_3));
      } else {
        return null;
      }
    }
  }
}
