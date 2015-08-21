package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import kmLogo.Parameter;
import kmLogo.ParameterCall;
import logo.Context;
import logo.ExpressionAspect;
import logo.ParameterAspect;
import logo.ParameterCallAspectParameterCallAspectProperties;

@Aspect(className = ParameterCall.class)
@SuppressWarnings("all")
public class ParameterCallAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static int eval(final ParameterCall _self, final Context context) {
    logo.ParameterCallAspectParameterCallAspectProperties _self_ = logo.ParameterCallAspectParameterCallAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof kmLogo.ParameterCall){
    result = logo.ParameterCallAspect._privk3_eval(_self_, (kmLogo.ParameterCall)_self,context);
    } else  if (_self instanceof kmLogo.Expression){
    result = logo.ExpressionAspect.eval((kmLogo.Expression)_self,context);
    } else  if (_self instanceof kmLogo.Instruction){
    result = logo.InstructionAspect.eval((kmLogo.Instruction)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  private static int super_eval(final ParameterCall _self, final Context context) {
    logo.ExpressionAspectExpressionAspectProperties _self_ = logo.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  logo.ExpressionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final ParameterCallAspectParameterCallAspectProperties _self_, final ParameterCall _self, final Context context) {
    Parameter _parameter = _self.getParameter();
    return ParameterAspect.eval(_parameter, context);
  }
}
