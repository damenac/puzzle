package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import kmLogo.Clear;
import logo.ClearAspectClearAspectProperties;
import logo.Context;
import logo.PrimitiveAspect;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Clear.class)
@SuppressWarnings("all")
public class ClearAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static int eval(final Clear _self, final Context context) {
    logo.ClearAspectClearAspectProperties _self_ = logo.ClearAspectClearAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int super_eval(final Clear _self, final Context context) {
    logo.PrimitiveAspectPrimitiveAspectProperties _self_ = logo.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
    return  logo.PrimitiveAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final ClearAspectClearAspectProperties _self_, final Clear _self, final Context context) {
    InputOutput.<String>println("CLEAR");
    context.turtle.reset();
    return 0;
  }
}
