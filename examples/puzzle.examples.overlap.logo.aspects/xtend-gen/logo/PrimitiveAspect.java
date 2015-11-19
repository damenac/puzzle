package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import kmLogo.Primitive;
import logo.Context;
import logo.InstructionAspect;
import logo.PrimitiveAspectPrimitiveAspectProperties;

@Aspect(className = Primitive.class)
@SuppressWarnings("all")
public class PrimitiveAspect extends InstructionAspect {
  @OverrideAspectMethod
  public static int eval(final Primitive _self, final Context context) {
    logo.PrimitiveAspectPrimitiveAspectProperties _self_ = logo.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int super_eval(final Primitive _self, final Context context) {
    logo.InstructionAspectInstructionAspectProperties _self_ = logo.InstructionAspectInstructionAspectContext.getSelf(_self);
    return  logo.InstructionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final PrimitiveAspectPrimitiveAspectProperties _self_, final Primitive _self, final Context context) {
    return 0;
  }
}
