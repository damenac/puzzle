package semanticsLogoPrimitives;

import Primitives.Instruction;
import Primitives.Primitive;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import semanticsLogoPrimitives.InstructionAspectInstructionAspectProperties;
import semanticsLogoPrimitives.PrimitiveAspect;

@Aspect(className = Instruction.class)
@SuppressWarnings("all")
public class InstructionAspect {
  public static void evalInstruction(final Instruction _self, final Hashtable<String, Object> context) {
    semanticsLogoPrimitives.InstructionAspectInstructionAspectProperties _self_ = semanticsLogoPrimitives.InstructionAspectInstructionAspectContext.getSelf(_self);
    _privk3_evalInstruction(_self_, _self,context);
  }
  
  protected static void _privk3_evalInstruction(final InstructionAspectInstructionAspectProperties _self_, final Instruction _self, final Hashtable<String, Object> context) {
    if ((_self instanceof Primitive)) {
      PrimitiveAspect.evalInstruction(((Primitive) _self), context);
    }
  }
}
