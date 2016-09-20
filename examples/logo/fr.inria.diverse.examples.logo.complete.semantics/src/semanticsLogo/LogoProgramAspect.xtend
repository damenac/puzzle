package semanticsLogo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main

import java.util.Hashtable

import static extension semanticsLogo.InstructionAspect.*
//import static extension logo.VarDeclAspect.*
import Logo.LogoProgram

@Aspect(className=LogoProgram)
public class LogoProgramAspect {

	@Main
	def void eval (Hashtable<String, Object> context) {
		println("LogoProgram eval !")
//		_self.variables.forEach[ variable | variable.eval(context) ]
		_self.instructions.forEach[ instr  | instr.eval(context)]
	}
}
