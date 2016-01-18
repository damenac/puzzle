package Logo.logoprogram;

import Logo.Clear;
import Logo.logoprogram.ClearAspectClearAspectProperties;
import Logo.logoprogram.Context;
import Logo.logoprogram.PrimitiveAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Clear.class)
@SuppressWarnings("all")
public class ClearAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static int eval(final Clear _self, final Context context) {
    Logo.logoprogram.ClearAspectClearAspectProperties _self_ = Logo.logoprogram.ClearAspectClearAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int super_eval(final Clear _self, final Context context) {
    Logo.logoprogram.PrimitiveAspectPrimitiveAspectProperties _self_ = Logo.logoprogram.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
    return  Logo.logoprogram.PrimitiveAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final ClearAspectClearAspectProperties _self_, final Clear _self, final Context context) {
    InputOutput.<String>println("CLEAR");
    context.turtle.reset();
    return 0;
  }
}
