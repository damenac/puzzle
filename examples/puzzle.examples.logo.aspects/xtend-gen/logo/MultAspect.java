package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import kmLogo.Expression;
import kmLogo.Mult;
import logo.BinaryExpAspect;
import logo.Context;
import logo.ExpressionAspect;
import logo.MultAspectMultAspectProperties;

@Aspect(className = Mult.class)
@SuppressWarnings("all")
public class MultAspect extends BinaryExpAspect {
  @OverrideAspectMethod
  public static int eval(final Mult _self, final Context context) {
    logo.MultAspectMultAspectProperties _self_ = logo.MultAspectMultAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof kmLogo.Mult){
    result = logo.MultAspect._privk3_eval(_self_, (kmLogo.Mult)_self,context);
    } else  if (_self instanceof kmLogo.BinaryExp){
    result = logo.BinaryExpAspect.eval((kmLogo.BinaryExp)_self,context);
    } else  if (_self instanceof kmLogo.Expression){
    result = logo.ExpressionAspect.eval((kmLogo.Expression)_self,context);
    } else  if (_self instanceof kmLogo.Instruction){
    result = logo.InstructionAspect.eval((kmLogo.Instruction)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  private static int super_eval(final Mult _self, final Context context) {
    logo.BinaryExpAspectBinaryExpAspectProperties _self_ = logo.BinaryExpAspectBinaryExpAspectContext.getSelf(_self);
    return  logo.BinaryExpAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final MultAspectMultAspectProperties _self_, final Mult _self, final Context context) {
    Expression _lhs = _self.getLhs();
    int _eval = ExpressionAspect.eval(_lhs, context);
    Expression _rhs = _self.getRhs();
    int _eval_1 = ExpressionAspect.eval(_rhs, context);
    return (_eval * _eval_1);
  }
}
