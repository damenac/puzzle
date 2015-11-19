package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import kmLogo.PenUp;
import logo.Context;
import logo.PenUpAspectPenUpAspectProperties;
import logo.PrimitiveAspect;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = PenUp.class)
@SuppressWarnings("all")
public class PenUpAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static int eval(final PenUp _self, final Context context) {
    logo.PenUpAspectPenUpAspectProperties _self_ = logo.PenUpAspectPenUpAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int super_eval(final PenUp _self, final Context context) {
    logo.PrimitiveAspectPrimitiveAspectProperties _self_ = logo.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
    return  logo.PrimitiveAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final PenUpAspectPenUpAspectProperties _self_, final PenUp _self, final Context context) {
    InputOutput.<String>println("PENUP");
    context.turtle.setPenUp(true);
    return 0;
  }
}
