package semanticsLogo;

import Logo.Instruction;
import Logo.Primitive;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import semanticsLogo.InstructionAspectInstructionAspectProperties;
import semanticsLogo.PrimitiveAspect;

@Aspect(className = Instruction.class)
@SuppressWarnings("all")
public class InstructionAspect {
  public static void eval(final Instruction _self, final Hashtable<String, Object> context) {
    semanticsLogo.InstructionAspectInstructionAspectProperties _self_ = semanticsLogo.InstructionAspectInstructionAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final InstructionAspectInstructionAspectProperties _self_, final Instruction _self, final Hashtable<String, Object> context) {
    if ((_self instanceof Primitive)) {
      PrimitiveAspect.eval(((Primitive) _self), context);
    }
  }
}
