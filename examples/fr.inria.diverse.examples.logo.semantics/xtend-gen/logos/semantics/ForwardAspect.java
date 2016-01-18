package logos.semantics;

import Logo.Expression;
import Logo.Forward;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import logos.semantics.Context;
import logos.semantics.ForwardAspectForwardAspectProperties;
import logos.semantics.PrimitiveAspect;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Forward.class)
@SuppressWarnings("all")
public class ForwardAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static int eval(final Forward _self, final Context context) {
    logos.semantics.ForwardAspectForwardAspectProperties _self_ = logos.semantics.ForwardAspectForwardAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int super_eval(final Forward _self, final Context context) {
    logos.semantics.PrimitiveAspectPrimitiveAspectProperties _self_ = logos.semantics.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
    return  logos.semantics.PrimitiveAspect._privk3_eval(_self_, _self,context);
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
