package semanticsLogoProcedures

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.util.Hashtable
import Procedures.Procedure
import Procedures.Instruction

@Aspect(className=Procedure)
class ProcedureAspect {
	
	def void evalInstruction(Hashtable<String, Object> context){
		for(Instruction _instruction : _self.body){
			_instruction.evalInstruction(context)
		}
	}
}