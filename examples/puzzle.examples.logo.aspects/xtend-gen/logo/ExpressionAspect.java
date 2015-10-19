package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import kmLogo.Expression;
import logo.Context;
import logo.ExpressionAspectExpressionAspectProperties;
import logo.InstructionAspect;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public class ExpressionAspect extends InstructionAspect {
  @OverrideAspectMethod
  public static Object eval(final Expression _self, final Context context) {
    logo.ExpressionAspectExpressionAspectProperties _self_ = logo.ExpressionAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof kmLogo.ParameterCall){
    result = logo.ParameterCallAspect.eval((kmLogo.ParameterCall)_self,context);
    } else  if (_self instanceof kmLogo.StringLit){
    result = logo.StringLitAspect.eval((kmLogo.StringLit)_self,context);
    } else  if (_self instanceof kmLogo.IntegerLit){
    result = logo.IntegerLitAspect.eval((kmLogo.IntegerLit)_self,context);
    } else  if (_self instanceof kmLogo.RelationalExpression){
    result = logo.RelationalExpressionAspect.eval((kmLogo.RelationalExpression)_self,context);
    } else  if (_self instanceof kmLogo.ArithmeticExpression){
    result = logo.ArithmeticExpressionAspect.eval((kmLogo.ArithmeticExpression)_self,context);
    } else  if (_self instanceof kmLogo.ProcCall){
    result = logo.ProcCallAspect.eval((kmLogo.ProcCall)_self,context);
    } else  if (_self instanceof kmLogo.BoolLit){
    result = logo.BoolLitAspect.eval((kmLogo.BoolLit)_self,context);
    } else  if (_self instanceof kmLogo.Literal){
    result = logo.LiteralAspect.eval((kmLogo.Literal)_self,context);
    } else  if (_self instanceof kmLogo.Expression){
    result = logo.ExpressionAspect._privk3_eval(_self_, (kmLogo.Expression)_self,context);
    } else  if (_self instanceof kmLogo.Instruction){
    result = logo.InstructionAspect.eval((kmLogo.Instruction)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_eval(final Expression _self, final Context context) {
    logo.InstructionAspectInstructionAspectProperties _self_ = logo.InstructionAspectInstructionAspectContext.getSelf(_self);
    return  logo.InstructionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static Object _privk3_eval(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self, final Context context) {
    return Integer.valueOf(0);
  }
}
