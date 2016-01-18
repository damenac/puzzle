package logos.semantics;

import Logo.Back;
import Logo.Expression;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import logos.semantics.BackAspectBackAspectProperties;
import logos.semantics.Context;
import logos.semantics.PrimitiveAspect;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Back.class)
@SuppressWarnings("all")
public class BackAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static int eval(final Back _self, final Context context) {
    logos.semantics.BackAspectBackAspectProperties _self_ = logos.semantics.BackAspectBackAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int super_eval(final Back _self, final Context context) {
    logos.semantics.PrimitiveAspectPrimitiveAspectProperties _self_ = logos.semantics.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
    return  logos.semantics.PrimitiveAspect._privk3_eval(_self_, _self,context);
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
