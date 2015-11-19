package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import kmLogo.ControlStructure;
import logo.Context;
import logo.ControlStructureAspectControlStructureAspectProperties;
import logo.InstructionAspect;

@Aspect(className = ControlStructure.class)
@SuppressWarnings("all")
public class ControlStructureAspect extends InstructionAspect {
  @OverrideAspectMethod
  public static int eval(final ControlStructure _self, final Context context) {
    logo.ControlStructureAspectControlStructureAspectProperties _self_ = logo.ControlStructureAspectControlStructureAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  private static int super_eval(final ControlStructure _self, final Context context) {
    logo.InstructionAspectInstructionAspectProperties _self_ = logo.InstructionAspectInstructionAspectContext.getSelf(_self);
    return  logo.InstructionAspect._privk3_eval(_self_, _self,context);
  }
  
  protected static int _privk3_eval(final ControlStructureAspectControlStructureAspectProperties _self_, final ControlStructure _self, final Context context) {
    return 0;
  }
}
