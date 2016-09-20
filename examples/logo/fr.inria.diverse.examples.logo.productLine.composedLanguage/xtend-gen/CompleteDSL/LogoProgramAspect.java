package CompleteDSL;

import CompleteDSLPckg.Instruction;
import CompleteDSLPckg.LogoProgram;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import java.util.Hashtable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import CompleteDSL.InstructionAspect;
import CompleteDSL.LogoProgramAspectLogoProgramAspectProperties;

@Aspect(className = LogoProgram.class)
@SuppressWarnings("all")
public class LogoProgramAspect {
  @Main
  public static void eval(final LogoProgram _self, final Hashtable<String, Object> context) {
    CompleteDSL.LogoProgramAspectLogoProgramAspectProperties _self_ = CompleteDSL.LogoProgramAspectLogoProgramAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final LogoProgramAspectLogoProgramAspectProperties _self_, final LogoProgram _self, final Hashtable<String, Object> context) {
    InputOutput.<String>println("LogoProgram eval !");
    EList<Instruction> _instructions = _self.getInstructions();
    for (final Instruction instruction : _instructions) {
      {
        InputOutput.<Instruction>println(instruction);
        InstructionAspect.eval(instruction, context);
      }
    }
  }
}
