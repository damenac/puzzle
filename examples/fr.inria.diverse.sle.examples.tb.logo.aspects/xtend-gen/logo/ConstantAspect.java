package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import kmLogo.Constant;
import logo.ConstantAspectConstantAspectProperties;
import logo.Context;
import logo.ExpressionAspect;

@Aspect(className = Constant.class)
@SuppressWarnings("all")
public class ConstantAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static int eval(final Constant _self, final Context context) {
    logo.ConstantAspectConstantAspectProperties _self_ = logo.ConstantAspectConstantAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof kmLogo.Constant){
    result = logo.ConstantAspect._privk3_eval(_self_, (kmLogo.Constant)_self,context);
    } else  if (_self instanceof kmLogo.Expression){
    result = logo.ExpressionAspect.eval((kmLogo.Expression)_self,context);
    } else  if (_self instanceof kmLogo.Instruction){
    result = logo.InstructionAspect.eval((kmLogo.Instruction)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  private static int super_eval(final Constant _self, final Context context) {
    logo.ExpressionAspectExpressionAspectProperties _self_ = logo.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  logo.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final ConstantAspectConstantAspectProperties _self_, final Constant _self, final Context context) {
    return _self.getIntegerValue();
  }
}
