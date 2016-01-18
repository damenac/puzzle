package Logo.logoprogram;

import Logo.Expression;
import Logo.Forward;
import Logo.logoprogram.Context;
import Logo.logoprogram.ForwardAspectForwardAspectProperties;
import Logo.logoprogram.PrimitiveAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Forward.class)
@SuppressWarnings("all")
public class ForwardAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static int eval(final Forward _self, final Context context) {
    Logo.logoprogram.ForwardAspectForwardAspectProperties _self_ = Logo.logoprogram.ForwardAspectForwardAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int super_eval(final Forward _self, final Context context) {
    Logo.logoprogram.PrimitiveAspectPrimitiveAspectProperties _self_ = Logo.logoprogram.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
    return  Logo.logoprogram.PrimitiveAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final ForwardAspectForwardAspectProperties _self_, final Forward _self, final Context context) {
    Expression _steps = _self.getSteps();
    Object _eval = _steps.eval(context);
    int param = (((Integer) _eval)).intValue();
    InputOutput.<String>println(("FORWARD " + Integer.valueOf(param)));
    context.turtle.forward(param);
    return 0;
  }
}
