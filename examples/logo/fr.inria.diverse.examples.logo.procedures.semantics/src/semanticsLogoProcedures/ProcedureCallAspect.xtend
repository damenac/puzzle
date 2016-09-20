package semanticsLogoProcedures

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.util.Hashtable
import Procedures.ProcedureCall

import static extension semanticsLogoProcedures.ProcedureAspect.*

@Aspect(className=ProcedureCall)
class ProcedureCallAspect {
	
	def void eval(Hashtable<String, Object> context){
		_self.ref.eval(context)
	}
}