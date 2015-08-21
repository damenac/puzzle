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
  public static int eval(final Expression _self, final Context context) {
    logo.ExpressionAspectExpressionAspectProperties _self_ = logo.ExpressionAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof kmLogo.Greater){
    result = logo.GreaterAspect.eval((kmLogo.Greater)_self,context);
    } else  if (_self instanceof kmLogo.Div){
    result = logo.DivAspect.eval((kmLogo.Div)_self,context);
    } else  if (_self instanceof kmLogo.Mult){
    result = logo.MultAspect.eval((kmLogo.Mult)_self,context);
    } else  if (_self instanceof kmLogo.ParameterCall){
    result = logo.ParameterCallAspect.eval((kmLogo.ParameterCall)_self,context);
    } else  if (_self instanceof kmLogo.Lower){
    result = logo.LowerAspect.eval((kmLogo.Lower)_self,context);
    } else  if (_self instanceof kmLogo.Equals){
    result = logo.EqualsAspect.eval((kmLogo.Equals)_self,context);
    } else  if (_self instanceof kmLogo.Constant){
    result = logo.ConstantAspect.eval((kmLogo.Constant)_self,context);
    } else  if (_self instanceof kmLogo.Minus){
    result = logo.MinusAspect.eval((kmLogo.Minus)_self,context);
    } else  if (_self instanceof kmLogo.ProcCall){
    result = logo.ProcCallAspect.eval((kmLogo.ProcCall)_self,context);
    } else  if (_self instanceof kmLogo.Plus){
    result = logo.PlusAspect.eval((kmLogo.Plus)_self,context);
    } else  if (_self instanceof kmLogo.BinaryExp){
    result = logo.BinaryExpAspect.eval((kmLogo.BinaryExp)_self,context);
    } else  if (_self instanceof kmLogo.Expression){
    result = logo.ExpressionAspect._privk3_eval(_self_, (kmLogo.Expression)_self,context);
    } else  if (_self instanceof kmLogo.Instruction){
    result = logo.InstructionAspect.eval((kmLogo.Instruction)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  private static int super_eval(final Expression _self, final Context context) {
    logo.InstructionAspectInstructionAspectProperties _self_ = logo.InstructionAspectInstructionAspectContext.getSelf(_self);
    return  logo.InstructionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self, final Context context) {
    return 0;
  }
}
