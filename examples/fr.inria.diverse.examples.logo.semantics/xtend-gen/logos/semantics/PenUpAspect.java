package logos.semantics;

import Logo.PenUp;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import logos.semantics.Context;
import logos.semantics.PenUpAspectPenUpAspectProperties;
import logos.semantics.PrimitiveAspect;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = PenUp.class)
@SuppressWarnings("all")
public class PenUpAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static int eval(final PenUp _self, final Context context) {
    logos.semantics.PenUpAspectPenUpAspectProperties _self_ = logos.semantics.PenUpAspectPenUpAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int super_eval(final PenUp _self, final Context context) {
    logos.semantics.PrimitiveAspectPrimitiveAspectProperties _self_ = logos.semantics.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
    return  logos.semantics.PrimitiveAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final PenUpAspectPenUpAspectProperties _self_, final PenUp _self, final Context context) {
    InputOutput.<String>println("PENUP");
    context.turtle.setPenUp(true);
    return 0;
  }
}
