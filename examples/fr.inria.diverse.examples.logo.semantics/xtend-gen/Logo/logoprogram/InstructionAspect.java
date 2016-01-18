package Logo.logoprogram;

import Logo.Instruction;
import Logo.logoprogram.Context;
import Logo.logoprogram.InstructionAspectInstructionAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

@Aspect(className = Instruction.class)
@SuppressWarnings("all")
public class InstructionAspect {
  public static int eval(final Instruction _self, final Context context) {
    Logo.logoprogram.InstructionAspectInstructionAspectProperties _self_ = Logo.logoprogram.InstructionAspectInstructionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  protected static int _privk3_eval(final InstructionAspectInstructionAspectProperties _self_, final Instruction _self, final Context context) {
    return 0;
  }
}
