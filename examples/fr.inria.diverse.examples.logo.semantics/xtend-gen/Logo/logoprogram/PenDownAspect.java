package Logo.logoprogram;

import Logo.PenDown;
import Logo.logoprogram.Context;
import Logo.logoprogram.PenDownAspectPenDownAspectProperties;
import Logo.logoprogram.PrimitiveAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = PenDown.class)
@SuppressWarnings("all")
public class PenDownAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static int eval(final PenDown _self, final Context context) {
    Logo.logoprogram.PenDownAspectPenDownAspectProperties _self_ = Logo.logoprogram.PenDownAspectPenDownAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int super_eval(final PenDown _self, final Context context) {
    Logo.logoprogram.PrimitiveAspectPrimitiveAspectProperties _self_ = Logo.logoprogram.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
    return  Logo.logoprogram.PrimitiveAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final PenDownAspectPenDownAspectProperties _self_, final PenDown _self, final Context context) {
    InputOutput.<String>println("PENDOWN");
    context.turtle.setPenUp(false);
    return 0;
  }
}
