package logos.semantics;

import Logo.Clear;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import logos.semantics.ClearAspectClearAspectProperties;
import logos.semantics.Context;
import logos.semantics.PrimitiveAspect;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Clear.class)
@SuppressWarnings("all")
public class ClearAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static int eval(final Clear _self, final Context context) {
    logos.semantics.ClearAspectClearAspectProperties _self_ = logos.semantics.ClearAspectClearAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int super_eval(final Clear _self, final Context context) {
    logos.semantics.PrimitiveAspectPrimitiveAspectProperties _self_ = logos.semantics.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
    return  logos.semantics.PrimitiveAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final ClearAspectClearAspectProperties _self_, final Clear _self, final Context context) {
    InputOutput.<String>println("CLEAR");
    context.turtle.reset();
    return 0;
  }
}
