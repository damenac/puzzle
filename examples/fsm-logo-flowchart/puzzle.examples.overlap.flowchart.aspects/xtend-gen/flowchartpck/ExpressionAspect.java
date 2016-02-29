package flowchartpck;

import flowchartpck.ArithmeticExpression;
import flowchartpck.ArithmeticExpressionAspect;
import flowchartpck.Expression;
import flowchartpck.ExpressionAspectExpressionAspectProperties;
import flowchartpck.Literal;
import flowchartpck.LiteralAspect;
import flowchartpck.RelationalExpression;
import flowchartpck.RelationalExpressionAspect;
import flowchartpck.VarReference;
import flowchartpck.VarReferenceAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public class ExpressionAspect {
  public static Object eval(final Expression _self, final Hashtable<String, Object> context) {
    flowchartpck.ExpressionAspectExpressionAspectProperties _self_ = flowchartpck.ExpressionAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  protected static Object _privk3_eval(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self, final Hashtable<String, Object> context) {
    if ((_self instanceof Literal)) {
      return LiteralAspect.eval(((Literal) _self), context);
    } else {
      if ((_self instanceof ArithmeticExpression)) {
        return ArithmeticExpressionAspect.eval(((ArithmeticExpression) _self), context);
      } else {
        if ((_self instanceof RelationalExpression)) {
          return RelationalExpressionAspect.eval(((RelationalExpression) _self), context);
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
}
