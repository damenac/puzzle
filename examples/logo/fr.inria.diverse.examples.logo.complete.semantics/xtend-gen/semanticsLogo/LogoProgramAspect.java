package semanticsLogo;

import Logo.Instruction;
import Logo.LogoProgram;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import java.util.Hashtable;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import semanticsLogo.InstructionAspect;
import semanticsLogo.LogoProgramAspectLogoProgramAspectProperties;

@Aspect(className = LogoProgram.class)
@SuppressWarnings("all")
public class LogoProgramAspect {
  @Main
  public static void eval(final LogoProgram _self, final Hashtable<String, Object> context) {
    semanticsLogo.LogoProgramAspectLogoProgramAspectProperties _self_ = semanticsLogo.LogoProgramAspectLogoProgramAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self,context);
  }
  
  protected static void _privk3_eval(final LogoProgramAspectLogoProgramAspectProperties _self_, final LogoProgram _self, final Hashtable<String, Object> context) {
    InputOutput.<String>println("LogoProgram eval !");
    EList<Instruction> _instructions = _self.getInstructions();
    final Consumer<Instruction> _function = (Instruction instr) -> {
      InstructionAspect.eval(instr, context);
    };
    _instructions.forEach(_function);
  }
}
