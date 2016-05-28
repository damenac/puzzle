package fr.inria.diverse.puzzle.examples.expr.semantics;

import ExpressionPck.ArithmeticExpression;
import ExpressionPck.ArithmeticOperator;
import ExpressionPck.Expression;
import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.puzzle.examples.expr.semantics.ArithmeticExpressionAspectArithmeticExpressionAspectProperties;
import fr.inria.diverse.puzzle.examples.expr.semantics.ExpressionAspect;
import java.util.Hashtable;

@Aspect(className = ArithmeticExpression.class)
@SuppressWarnings("all")
public class ArithmeticExpressionAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final ArithmeticExpression _self, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.expr.semantics.ArithmeticExpressionAspectArithmeticExpressionAspectProperties _self_ = fr.inria.diverse.puzzle.examples.expr.semantics.ArithmeticExpressionAspectArithmeticExpressionAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof ExpressionPck.ArithmeticExpression){
    result = fr.inria.diverse.puzzle.examples.expr.semantics.ArithmeticExpressionAspect._privk3_eval(_self_, (ExpressionPck.ArithmeticExpression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final ArithmeticExpression _self, final Hashtable<String, Object> context) {
    fr.inria.diverse.puzzle.examples.expr.semantics.ExpressionAspectExpressionAspectProperties _self_ = fr.inria.diverse.puzzle.examples.expr.semantics.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  fr.inria.diverse.puzzle.examples.expr.semantics.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final ArithmeticExpressionAspectArithmeticExpressionAspectProperties _self_, final ArithmeticExpression _self, final Hashtable<String, Object> context) {
    int result = 0;
    ArithmeticOperator _operator = _self.getOperator();
    boolean _equals = Objects.equal(_operator, ArithmeticOperator.PLUS);
    if (_equals) {
      Expression _left = _self.getLeft();
      Object _eval = ExpressionAspect.eval(_left, context);
      Expression _right = _self.getRight();
      Object _eval_1 = ExpressionAspect.eval(_right, context);
      int _plus = ((((Integer) _eval)).intValue() + (((Integer) _eval_1)).intValue());
      result = _plus;
    } else {
      ArithmeticOperator _operator_1 = _self.getOperator();
      boolean _equals_1 = Objects.equal(_operator_1, ArithmeticOperator.MINUS);
      if (_equals_1) {
        Expression _left_1 = _self.getLeft();
        Object _eval_2 = ExpressionAspect.eval(_left_1, context);
        Expression _right_1 = _self.getRight();
        Object _eval_3 = ExpressionAspect.eval(_right_1, context);
        int _minus = ((((Integer) _eval_2)).intValue() - (((Integer) _eval_3)).intValue());
        result = _minus;
      } else {
        ArithmeticOperator _operator_2 = _self.getOperator();
        boolean _equals_2 = Objects.equal(_operator_2, ArithmeticOperator.MULT);
        if (_equals_2) {
          Expression _left_2 = _self.getLeft();
          Object _eval_4 = ExpressionAspect.eval(_left_2, context);
          Expression _right_2 = _self.getRight();
          Object _eval_5 = ExpressionAspect.eval(_right_2, context);
          int _multiply = ((((Integer) _eval_4)).intValue() * (((Integer) _eval_5)).intValue());
          result = _multiply;
        } else {
          ArithmeticOperator _operator_3 = _self.getOperator();
          boolean _equals_3 = Objects.equal(_operator_3, ArithmeticOperator.DIV);
          if (_equals_3) {
            Expression _left_3 = _self.getLeft();
            Object _eval_6 = ExpressionAspect.eval(_left_3, context);
            Expression _right_3 = _self.getRight();
            Object _eval_7 = ExpressionAspect.eval(_right_3, context);
            int _divide = ((((Integer) _eval_6)).intValue() / (((Integer) _eval_7)).intValue());
            result = _divide;
          }
        }
      }
    }
    return Integer.valueOf(result);
  }
}
