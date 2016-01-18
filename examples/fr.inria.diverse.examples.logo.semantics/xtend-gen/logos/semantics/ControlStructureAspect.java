package logos.semantics;

import Logo.ControlStructure;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import logos.semantics.Context;
import logos.semantics.ControlStructureAspectControlStructureAspectProperties;
import logos.semantics.InstructionAspect;

@Aspect(className = ControlStructure.class)
@SuppressWarnings("all")
public class ControlStructureAspect extends InstructionAspect {
  @OverrideAspectMethod
  public static int eval(final ControlStructure _self, final Context context) {
    logos.semantics.ControlStructureAspectControlStructureAspectProperties _self_ = logos.semantics.ControlStructureAspectControlStructureAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int super_eval(final ControlStructure _self, final Context context) {
    logos.semantics.InstructionAspectInstructionAspectProperties _self_ = logos.semantics.InstructionAspectInstructionAspectContext.getSelf(_self);
    return  logos.semantics.InstructionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final ControlStructureAspectControlStructureAspectProperties _self_, final ControlStructure _self, final Context context) {
    return 0;
  }
}
