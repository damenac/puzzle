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
  public static void eval(final Instruction _self, final Hashtable<String, Object> context) {
    semanticsLogoPrimitives.InstructionAspectInstructionAspectProperties _self_ = semanticsLogoPrimitives.InstructionAspectInstructionAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final InstructionAspectInstructionAspectProperties _self_, final Instruction _self, final Hashtable<String, Object> context) {
    if ((_self instanceof Primitive)) {
      PrimitiveAspect.eval(((Primitive) _self), context);
    }
  }
}
