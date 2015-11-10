package Logo.logoprogram

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import LogoProgramModule.LogoProgram

import static extension logoprogram.InstructionAspect.*
@Aspect(className=LogoProgram)
public class LogoProgramAspect {
	def int eval (Context context) {
		println("LogoProgram eval !")
		_self.instructions.forEach[instr  | instr.eval(context)]
		return 0
	}
}
