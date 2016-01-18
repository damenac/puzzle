package logos.semantics;

import Logo.Instruction;
import Logo.LogoProgram;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.function.Consumer;
import logos.semantics.Context;
import logos.semantics.InstructionAspect;
import logos.semantics.LogoProgramAspectLogoProgramAspectProperties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = LogoProgram.class)
@SuppressWarnings("all")
public class LogoProgramAspect {
  public static int eval(final LogoProgram _self, final Context context) {
    logos.semantics.LogoProgramAspectLogoProgramAspectProperties _self_ = logos.semantics.LogoProgramAspectLogoProgramAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_eval(_self_, _self,context);
    return (int)result;
  }
  
  protected static int _privk3_eval(final LogoProgramAspectLogoProgramAspectProperties _self_, final LogoProgram _self, final Context context) {
    InputOutput.<String>println("LogoProgram eval !");
    EList<Instruction> _instructions = _self.getInstructions();
    final Consumer<Instruction> _function = (Instruction instr) -> {
      InstructionAspect.eval(instr, context);
    };
    _instructions.forEach(_function);
    return 0;
  }
}
