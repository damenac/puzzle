package semanticsLogo;

import Logo.Assignation;
import Logo.ControlStructure;
import Logo.Instruction;
import Logo.Primitive;
import Logo.VarDecl;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Hashtable;
import semanticsLogo.AssignationAspect;
import semanticsLogo.ControlStructureAspect;
import semanticsLogo.InstructionAspectInstructionAspectProperties;
import semanticsLogo.PrimitiveAspect;
import semanticsLogo.VarDeclAspect;

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
    } else {
      if ((_self instanceof VarDecl)) {
        VarDeclAspect.eval(((VarDecl) _self), context);
      } else {
        if ((_self instanceof Assignation)) {
          AssignationAspect.eval(((Assignation) _self), context);
        } else {
          if ((_self instanceof ControlStructure)) {
            ControlStructureAspect.eval(((ControlStructure) _self), context);
          }
        }
      }
    }
  }
}
