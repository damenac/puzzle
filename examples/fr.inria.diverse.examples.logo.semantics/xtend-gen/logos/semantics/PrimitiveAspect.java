package logos.semantics;

import Logo.Primitive;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import logos.semantics.Context;
import logos.semantics.InstructionAspect;
import logos.semantics.PrimitiveAspectPrimitiveAspectProperties;

@Aspect(className = Primitive.class)
@SuppressWarnings("all")
public class PrimitiveAspect extends InstructionAspect {
  @OverrideAspectMethod
  public static int eval(final Primitive _self, final Context context) {
    logos.semantics.PrimitiveAspectPrimitiveAspectProperties _self_ = logos.semantics.PrimitiveAspectPrimitiveAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int super_eval(final Primitive _self, final Context context) {
    logos.semantics.InstructionAspectInstructionAspectProperties _self_ = logos.semantics.InstructionAspectInstructionAspectContext.getSelf(_self);
    return  logos.semantics.InstructionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final PrimitiveAspectPrimitiveAspectProperties _self_, final Primitive _self, final Context context) {
    return 0;
  }
}
