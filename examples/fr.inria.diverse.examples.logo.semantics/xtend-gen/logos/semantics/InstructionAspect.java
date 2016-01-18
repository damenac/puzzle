package logos.semantics;

import Logo.Instruction;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import logos.semantics.Context;
import logos.semantics.InstructionAspectInstructionAspectProperties;

@Aspect(className = Instruction.class)
@SuppressWarnings("all")
public class InstructionAspect {
  public static int eval(final Instruction _self, final Context context) {
    logos.semantics.InstructionAspectInstructionAspectProperties _self_ = logos.semantics.InstructionAspectInstructionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  protected static int _privk3_eval(final InstructionAspectInstructionAspectProperties _self_, final Instruction _self, final Context context) {
    return 0;
  }
}
