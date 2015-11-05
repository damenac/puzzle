package fsm;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fsm.Expression;
import fsm.ExpressionAspect;
import fsm.RelationalExpression;
import fsm.RelationalExpressionAspectRelationalExpressionAspectProperties;
import fsm.RelationalOperator;
import java.util.Hashtable;

@Aspect(className = RelationalExpression.class)
@SuppressWarnings("all")
public class RelationalExpressionAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final RelationalExpression _self, final Hashtable<String, Object> context) {
    fsm.RelationalExpressionAspectRelationalExpressionAspectProperties _self_ = fsm.RelationalExpressionAspectRelationalExpressionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final RelationalExpression _self, final Hashtable<String, Object> context) {
    fsm.ExpressionAspectExpressionAspectProperties _self_ = fsm.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  fsm.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final RelationalExpressionAspectRelationalExpressionAspectProperties _self_, final RelationalExpression _self, final Hashtable<String, Object> context) {
    boolean result = false;
    RelationalOperator _operator = _self.getOperator();
    boolean _equals = Objects.equal(_operator, RelationalOperator.EQUALS);
    if (_equals) {
      Expression _left = _self.getLeft();
      Object _eval = ExpressionAspect.eval(_left, context);
      Expression _right = _self.getRight();
      Object _eval_1 = ExpressionAspect.eval(_right, context);
      boolean _equals_1 = Objects.equal(((Integer) _eval), ((Integer) _eval_1));
      result = _equals_1;
    } else {
      RelationalOperator _operator_1 = _self.getOperator();
      boolean _equals_2 = Objects.equal(_operator_1, RelationalOperator.NOT_EQUAL);
      if (_equals_2) {
        Expression _left_1 = _self.getLeft();
        Object _eval_2 = ExpressionAspect.eval(_left_1, context);
        Expression _right_1 = _self.getRight();
        Object _eval_3 = ExpressionAspect.eval(_right_1, context);
        boolean _notEquals = (!Objects.equal(((Integer) _eval_2), ((Integer) _eval_3)));
        result = _notEquals;
      } else {
        RelationalOperator _operator_2 = _self.getOperator();
        boolean _equals_3 = Objects.equal(_operator_2, RelationalOperator.LESS_THAN);
        if (_equals_3) {
          Expression _left_2 = _self.getLeft();
          Object _eval_4 = ExpressionAspect.eval(_left_2, context);
          Expression _right_2 = _self.getRight();
          Object _eval_5 = ExpressionAspect.eval(_right_2, context);
          boolean _lessThan = (((Integer) _eval_4).compareTo(((Integer) _eval_5)) < 0);
          result = _lessThan;
        } else {
          RelationalOperator _operator_3 = _self.getOperator();
          boolean _equals_4 = Objects.equal(_operator_3, RelationalOperator.GREATER_THAN);
          if (_equals_4) {
            Expression _left_3 = _self.getLeft();
            Object _eval_6 = ExpressionAspect.eval(_left_3, context);
            Expression _right_3 = _self.getRight();
            Object _eval_7 = ExpressionAspect.eval(_right_3, context);
            boolean _greaterThan = (((Integer) _eval_6).compareTo(((Integer) _eval_7)) > 0);
            result = _greaterThan;
          } else {
            RelationalOperator _operator_4 = _self.getOperator();
            boolean _equals_5 = Objects.equal(_operator_4, RelationalOperator.LESS_THAN_OR_EQUAL_TO);
            if (_equals_5) {
              Expression _left_4 = _self.getLeft();
              Object _eval_8 = ExpressionAspect.eval(_left_4, context);
              Expression _right_4 = _self.getRight();
              Object _eval_9 = ExpressionAspect.eval(_right_4, context);
              boolean _lessEqualsThan = (((Integer) _eval_8).compareTo(((Integer) _eval_9)) <= 0);
              result = _lessEqualsThan;
            } else {
              RelationalOperator _operator_5 = _self.getOperator();
              boolean _equals_6 = Objects.equal(_operator_5, RelationalOperator.GREATER_THAN_OR_EQUAL_TO);
              if (_equals_6) {
                Expression _left_5 = _self.getLeft();
                Object _eval_10 = ExpressionAspect.eval(_left_5, context);
                Expression _right_5 = _self.getRight();
                Object _eval_11 = ExpressionAspect.eval(_right_5, context);
                boolean _greaterEqualsThan = (((Integer) _eval_10).compareTo(((Integer) _eval_11)) >= 0);
                result = _greaterEqualsThan;
              }
            }
          }
        }
      }
    }
    return Boolean.valueOf(result);
  }
}
