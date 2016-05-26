package CompleteDSL;

import CompleteDSLPckg.ArithmeticExpression;
import CompleteDSLPckg.BoolLit;
import CompleteDSLPckg.Expression;
import CompleteDSLPckg.IntegerLit;
import CompleteDSLPckg.RelationalExpression;
import CompleteDSLPckg.StringLit;
import CompleteDSLPckg.VarRef;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import CompleteDSL.ArithmeticExpressionAspect;
import CompleteDSL.BoolLitAspect;
import CompleteDSL.ExpressionAspectExpressionAspectProperties;
import CompleteDSL.IntegerLitAspect;
import CompleteDSL.RelationalExpressionAspect;
import CompleteDSL.StringLitAspect;
import CompleteDSL.VarRefAspect;
import java.util.Hashtable;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public class ExpressionAspect {
  @Main
  public static Object eval(final Expression _self, final Hashtable<String, Object> context) {
    CompleteDSL.ExpressionAspectExpressionAspectProperties _self_ = CompleteDSL.ExpressionAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (java.lang.Object)result;
  }
  
  protected static Object _privk3_eval(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self, final Hashtable<String, Object> context) {
    if ((_self instanceof IntegerLit)) {
      return IntegerLitAspect.eval(((IntegerLit) _self), context);
    } else {
      if ((_self instanceof StringLit)) {
        return StringLitAspect.eval(((StringLit) _self), context);
      } else {
        if ((_self instanceof BoolLit)) {
          return BoolLitAspect.eval(((BoolLit) _self), context);
        } else {
          if ((_self instanceof ArithmeticExpression)) {
            return ArithmeticExpressionAspect.eval(((ArithmeticExpression) _self), context);
          } else {
            if ((_self instanceof RelationalExpression)) {
              return RelationalExpressionAspect.eval(((RelationalExpression) _self), context);
            } else {
              if ((_self instanceof VarRef)) {
                return VarRefAspect.eval(((VarRef) _self), context);
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
