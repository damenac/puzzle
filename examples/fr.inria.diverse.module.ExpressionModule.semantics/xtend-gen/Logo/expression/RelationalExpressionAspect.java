package Logo.expression;

import ExpressionModule.RelationalExpression;
import Logo.expression.ExpressionAspect;
import Logo.expression.RelationalExpressionAspectRelationalExpressionAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = RelationalExpression.class)
@SuppressWarnings("all")
public class RelationalExpressionAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Object eval(final RelationalExpression _self, final Context context) {
    Logo.expression.RelationalExpressionAspectRelationalExpressionAspectProperties _self_ = Logo.expression.RelationalExpressionAspectRelationalExpressionAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof ExpressionModule.RelationalExpression){
    result = Logo.expression.RelationalExpressionAspect._privk3_eval(_self_, (ExpressionModule.RelationalExpression)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final RelationalExpression _self, final Context context) {
    Logo.expression.ExpressionAspectExpressionAspectProperties _self_ = Logo.expression.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  Logo.expression.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final RelationalExpressionAspectRelationalExpressionAspectProperties _self_, final RelationalExpression _self, final Context context) {
    throw new Error("Unresolved compilation problems:"
      + "\nCannot make a static reference to the non-static method eval from the type RelationalExpressionAspect"
      + "\nInvalid number of arguments. The method eval(Context) is not applicable for the arguments (Expression,Context)"
      + "\nCannot make a static reference to the non-static method eval from the type RelationalExpressionAspect"
      + "\nInvalid number of arguments. The method eval(Context) is not applicable for the arguments (Expression,Context)"
      + "\nCannot make a static reference to the non-static method eval from the type RelationalExpressionAspect"
      + "\nInvalid number of arguments. The method eval(Context) is not applicable for the arguments (Expression,Context)"
      + "\nCannot make a static reference to the non-static method eval from the type RelationalExpressionAspect"
      + "\nInvalid number of arguments. The method eval(Context) is not applicable for the arguments (Expression,Context)"
      + "\nCannot make a static reference to the non-static method eval from the type RelationalExpressionAspect"
      + "\nInvalid number of arguments. The method eval(Context) is not applicable for the arguments (Expression,Context)"
      + "\nCannot make a static reference to the non-static method eval from the type RelationalExpressionAspect"
      + "\nInvalid number of arguments. The method eval(Context) is not applicable for the arguments (Expression,Context)"
      + "\nCannot make a static reference to the non-static method eval from the type RelationalExpressionAspect"
      + "\nInvalid number of arguments. The method eval(Context) is not applicable for the arguments (Expression,Context)"
      + "\nCannot make a static reference to the non-static method eval from the type RelationalExpressionAspect"
      + "\nInvalid number of arguments. The method eval(Context) is not applicable for the arguments (Expression,Context)"
      + "\nCannot make a static reference to the non-static method eval from the type RelationalExpressionAspect"
      + "\nInvalid number of arguments. The method eval(Context) is not applicable for the arguments (Expression,Context)"
      + "\nCannot make a static reference to the non-static method eval from the type RelationalExpressionAspect"
      + "\nInvalid number of arguments. The method eval(Context) is not applicable for the arguments (Expression,Context)"
      + "\nCannot make a static reference to the non-static method eval from the type RelationalExpressionAspect"
      + "\nInvalid number of arguments. The method eval(Context) is not applicable for the arguments (Expression,Context)"
      + "\nCannot make a static reference to the non-static method eval from the type RelationalExpressionAspect"
      + "\nInvalid number of arguments. The method eval(Context) is not applicable for the arguments (Expression,Context)");
  }
}
