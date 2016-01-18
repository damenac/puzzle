package Logo.logoprogram;

import Logo.PenUp;
import Logo.logoprogram.Context;
import Logo.logoprogram.PenUpAspectPenUpAspectProperties;
import Logo.logoprogram.PrimitiveAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = PenUp.class)
@SuppressWarnings("all")
public class PenUpAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static int eval(final PenUp _self, final Context context) {
    Logo.logoprogram.PenUpAspectPenUpAspectProperties _self_ = Logo.logoprogram.PenUpAspectPenUpAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int super_eval(final PenUp _self, final Context context) {
    Logo.logoprogram.PrimitiveAspectPrimitiveAspectProperties _self_ = Logo.logoprogram.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
    return  Logo.logoprogram.PrimitiveAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final PenUpAspectPenUpAspectProperties _self_, final PenUp _self, final Context context) {
    InputOutput.<String>println("PENUP");
    context.turtle.setPenUp(true);
    return 0;
  }
}
