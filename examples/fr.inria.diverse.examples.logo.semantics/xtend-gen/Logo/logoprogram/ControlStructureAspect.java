package Logo.logoprogram;

import Logo.ControlStructure;
import Logo.logoprogram.Context;
import Logo.logoprogram.ControlStructureAspectControlStructureAspectProperties;
import Logo.logoprogram.InstructionAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = ControlStructure.class)
@SuppressWarnings("all")
public class ControlStructureAspect extends InstructionAspect {
  @OverrideAspectMethod
  public static int eval(final ControlStructure _self, final Context context) {
    Logo.logoprogram.ControlStructureAspectControlStructureAspectProperties _self_ = Logo.logoprogram.ControlStructureAspectControlStructureAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int super_eval(final ControlStructure _self, final Context context) {
    Logo.logoprogram.InstructionAspectInstructionAspectProperties _self_ = Logo.logoprogram.InstructionAspectInstructionAspectContext.getSelf(_self);
    return  Logo.logoprogram.InstructionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final ControlStructureAspectControlStructureAspectProperties _self_, final ControlStructure _self, final Context context) {
    return 0;
  }
}
