package logo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import kmLogo.LogoProgram

import static extension logo.InstructionAspect.*
import java.util.Hashtable

@Aspect(className=LogoProgram)
public class LogoProgramAspect {

	def void eval (Hashtable<String, Object> context) {
		println("LogoProgram eval !")
		_self.instructions.forEach[instr  | instr.eval(context)]
	}
}
