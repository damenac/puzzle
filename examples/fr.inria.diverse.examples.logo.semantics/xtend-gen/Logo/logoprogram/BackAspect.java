package Logo.logoprogram;

import Logo.Back;
import Logo.Expression;
import Logo.logoprogram.BackAspectBackAspectProperties;
import Logo.logoprogram.Context;
import Logo.logoprogram.PrimitiveAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Back.class)
@SuppressWarnings("all")
public class BackAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static int eval(final Back _self, final Context context) {
    Logo.logoprogram.BackAspectBackAspectProperties _self_ = Logo.logoprogram.BackAspectBackAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int super_eval(final Back _self, final Context context) {
    Logo.logoprogram.PrimitiveAspectPrimitiveAspectProperties _self_ = Logo.logoprogram.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
    return  Logo.logoprogram.PrimitiveAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final BackAspectBackAspectProperties _self_, final Back _self, final Context context) {
    Expression _steps = _self.getSteps();
    Object _eval = _steps.eval(context);
    int param = ((-1) * (((Integer) _eval)).intValue());
    InputOutput.<String>println(("BACK " + Integer.valueOf(param)));
    context.turtle.forward(param);
    return 0;
  }
}
