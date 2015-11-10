package Logo.expression;

import ExpressionModule.ArithmeticExpression;
import Logo.expression.ArithmeticExpressionAspectArithmeticExpressionAspectProperties;
import Logo.expression.ExpressionAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = ArithmeticExpression.class)
@SuppressWarnings("all")
public class ArithmeticExpressionAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final ArithmeticExpression _self, final Context context) {
    Logo.expression.ArithmeticExpressionAspectArithmeticExpressionAspectProperties _self_ = Logo.expression.ArithmeticExpressionAspectArithmeticExpressionAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof ExpressionModule.ArithmeticExpression){
    result = Logo.expression.ArithmeticExpressionAspect._privk3_eval(_self_, (ExpressionModule.ArithmeticExpression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final ArithmeticExpression _self, final Context context) {
    Logo.expression.ExpressionAspectExpressionAspectProperties _self_ = Logo.expression.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  Logo.expression.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final ArithmeticExpressionAspectArithmeticExpressionAspectProperties _self_, final ArithmeticExpression _self, final Context context) {
    throw new Error("Unresolved compilation problems:"
      + "\nCannot make a static reference to the non-static method eval from the type ArithmeticExpressionAspect"
      + "\nInvalid number of arguments. The method eval(Context) is not applicable for the arguments (Expression,Context)"
      + "\nCannot make a static reference to the non-static method eval from the type ArithmeticExpressionAspect"
      + "\nInvalid number of arguments. The method eval(Context) is not applicable for the arguments (Expression,Context)"
      + "\nCannot make a static reference to the non-static method eval from the type ArithmeticExpressionAspect"
      + "\nInvalid number of arguments. The method eval(Context) is not applicable for the arguments (Expression,Context)"
      + "\nCannot make a static reference to the non-static method eval from the type ArithmeticExpressionAspect"
      + "\nInvalid number of arguments. The method eval(Context) is not applicable for the arguments (Expression,Context)"
      + "\nCannot make a static reference to the non-static method eval from the type ArithmeticExpressionAspect"
      + "\nInvalid number of arguments. The method eval(Context) is not applicable for the arguments (Expression,Context)"
      + "\nCannot make a static reference to the non-static method eval from the type ArithmeticExpressionAspect"
      + "\nInvalid number of arguments. The method eval(Context) is not applicable for the arguments (Expression,Context)"
      + "\nCannot make a static reference to the non-static method eval from the type ArithmeticExpressionAspect"
      + "\nInvalid number of arguments. The method eval(Context) is not applicable for the arguments (Expression,Context)"
      + "\nCannot make a static reference to the non-static method eval from the type ArithmeticExpressionAspect"
      + "\nInvalid number of arguments. The method eval(Context) is not applicable for the arguments (Expression,Context)");
  }
}
