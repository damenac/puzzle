package logo;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.function.Consumer;
import kmLogo.Instruction;
import kmLogo.LogoProgram;
import logo.Context;
import logo.InstructionAspect;
import logo.LogoProgramAspectLogoProgramAspectProperties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = LogoProgram.class)
@SuppressWarnings("all")
public class LogoProgramAspect {
  public static int eval(final LogoProgram _self, final Context context) {
    logo.LogoProgramAspectLogoProgramAspectProperties _self_ = logo.LogoProgramAspectLogoProgramAspectContext.getSelf(_self);
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
