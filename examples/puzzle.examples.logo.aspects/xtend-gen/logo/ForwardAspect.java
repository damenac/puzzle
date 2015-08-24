package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import kmLogo.Expression;
import kmLogo.Forward;
import logo.Context;
import logo.ExpressionAspect;
import logo.ForwardAspectForwardAspectProperties;
import logo.PrimitiveAspect;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Forward.class)
@SuppressWarnings("all")
public class ForwardAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static int eval(final Forward _self, final Context context) {
    logo.ForwardAspectForwardAspectProperties _self_ = logo.ForwardAspectForwardAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof kmLogo.Forward){
    result = logo.ForwardAspect._privk3_eval(_self_, (kmLogo.Forward)_self,context);
    } else  if (_self instanceof kmLogo.Primitive){
    result = logo.PrimitiveAspect.eval((kmLogo.Primitive)_self,context);
    } else  if (_self instanceof kmLogo.Instruction){
    result = logo.InstructionAspect.eval((kmLogo.Instruction)_self,context);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  private static int super_eval(final Forward _self, final Context context) {
    logo.PrimitiveAspectPrimitiveAspectProperties _self_ = logo.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
    return  logo.PrimitiveAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final ForwardAspectForwardAspectProperties _self_, final Forward _self, final Context context) {
    Expression _steps = _self.getSteps();
    Object _eval = ExpressionAspect.eval(_steps, context);
    int param = (((Integer) _eval)).intValue();
    InputOutput.<String>println(("FORWARD " + Integer.valueOf(param)));
    context.turtle.forward(param);
    return 0;
  }
}
