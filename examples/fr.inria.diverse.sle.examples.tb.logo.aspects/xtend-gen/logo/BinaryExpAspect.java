package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import kmLogo.BinaryExp;
import logo.BinaryExpAspectBinaryExpAspectProperties;
import logo.Context;
import logo.ExpressionAspect;

@Aspect(className = BinaryExp.class)
@SuppressWarnings("all")
public class BinaryExpAspect extends ExpressionAspect {
  public static int eval(final BinaryExp _self, final Context context) {
    logo.BinaryExpAspectBinaryExpAspectProperties _self_ = logo.BinaryExpAspectBinaryExpAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof kmLogo.Plus){
    result = logo.PlusAspect.eval((kmLogo.Plus)_self,context);
    } else  if (_self instanceof kmLogo.Equals){
    result = logo.EqualsAspect.eval((kmLogo.Equals)_self,context);
    } else  if (_self instanceof kmLogo.Div){
    result = logo.DivAspect.eval((kmLogo.Div)_self,context);
    } else  if (_self instanceof kmLogo.Greater){
    result = logo.GreaterAspect.eval((kmLogo.Greater)_self,context);
    } else  if (_self instanceof kmLogo.Mult){
    result = logo.MultAspect.eval((kmLogo.Mult)_self,context);
    } else  if (_self instanceof kmLogo.Lower){
    result = logo.LowerAspect.eval((kmLogo.Lower)_self,context);
    } else  if (_self instanceof kmLogo.Minus){
    result = logo.MinusAspect.eval((kmLogo.Minus)_self,context);
    } else  if (_self instanceof kmLogo.BinaryExp){
    result = logo.BinaryExpAspect._privk3_eval(_self_, (kmLogo.BinaryExp)_self,context);
    } else  if (_self instanceof kmLogo.Expression){
    result = logo.ExpressionAspect.eval((kmLogo.Expression)_self,context);
    } else  if (_self instanceof kmLogo.Instruction){
    result = logo.InstructionAspect.eval((kmLogo.Instruction)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  protected static int _privk3_eval(final BinaryExpAspectBinaryExpAspectProperties _self_, final BinaryExp _self, final Context context) {
    return 0;
  }
}
