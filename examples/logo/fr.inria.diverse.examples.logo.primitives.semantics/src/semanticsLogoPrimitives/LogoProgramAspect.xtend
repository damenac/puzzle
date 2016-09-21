package semanticsLogoPrimitives

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main

import java.util.Hashtable
import Primitives.Instruction
import Primitives.LogoProgram

import static extension semanticsLogoPrimitives.InstructionAspect.*

@Aspect(className=LogoProgram)
public class LogoProgramAspect {

	@Main
	def void eval (Hashtable<String, Object> context) {
		println("LogoProgram eval !")
		for(Instruction instruction : _self.instructions){
			println(instruction)
			instruction.evalInstruction(context)
		}
	}
}
