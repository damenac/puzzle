package Logo.logoprogram;

import Logo.Primitive;
import Logo.logoprogram.Context;
import Logo.logoprogram.InstructionAspect;
import Logo.logoprogram.PrimitiveAspectPrimitiveAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = Primitive.class)
@SuppressWarnings("all")
public class PrimitiveAspect extends InstructionAspect {
  @OverrideAspectMethod
  public static int eval(final Primitive _self, final Context context) {
    Logo.logoprogram.PrimitiveAspectPrimitiveAspectProperties _self_ = Logo.logoprogram.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int super_eval(final Primitive _self, final Context context) {
    Logo.logoprogram.InstructionAspectInstructionAspectProperties _self_ = Logo.logoprogram.InstructionAspectInstructionAspectContext.getSelf(_self);
    return  Logo.logoprogram.InstructionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final PrimitiveAspectPrimitiveAspectProperties _self_, final Primitive _self, final Context context) {
    return 0;
  }
}
