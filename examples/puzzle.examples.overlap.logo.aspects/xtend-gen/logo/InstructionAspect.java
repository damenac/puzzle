package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import kmLogo.Instruction;
import logo.Context;
import logo.InstructionAspectInstructionAspectProperties;

@Aspect(className = Instruction.class)
@SuppressWarnings("all")
public class InstructionAspect {
  public static int eval(final Instruction _self, final Context context) {
    logo.InstructionAspectInstructionAspectProperties _self_ = logo.InstructionAspectInstructionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  protected static int _privk3_eval(final InstructionAspectInstructionAspectProperties _self_, final Instruction _self, final Context context) {
    return 0;
  }
}
