package flowchartaspects;

import flowchartaspects.ArithmeticExpressionAspect;
import flowchartaspects.ExpressionAspectExpressionAspectProperties;
import flowchartaspects.LiteralAspect;
import flowchartaspects.RelationalExpressionAspect;
import flowchartaspects.VarReferenceAspect;
import flowchartpck.ArithmeticExpression;
import flowchartpck.Expression;
import flowchartpck.Literal;
import flowchartpck.RelationalExpression;
import flowchartpck.VarReference;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public class ExpressionAspect {
  public static Object eval(final Expression _self, final Hashtable<String, Object> context) {
    flowchartaspects.ExpressionAspectExpressionAspectProperties _self_ = flowchartaspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
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
