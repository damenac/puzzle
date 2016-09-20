package CompleteDSL;

import CompleteDSLPckg.Instruction;
import CompleteDSLPckg.Primitive;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import CompleteDSL.InstructionAspectInstructionAspectProperties;
import CompleteDSL.PrimitiveAspect;

@Aspect(className = Instruction.class)
@SuppressWarnings("all")
public class InstructionAspect {
  public static void eval(final Instruction _self, final Hashtable<String, Object> context) {
    CompleteDSL.InstructionAspectInstructionAspectProperties _self_ = CompleteDSL.InstructionAspectInstructionAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final InstructionAspectInstructionAspectProperties _self_, final Instruction _self, final Hashtable<String, Object> context) {
    if ((_self instanceof Primitive)) {
      PrimitiveAspect.eval(((Primitive) _self), context);
    }
  }
}
