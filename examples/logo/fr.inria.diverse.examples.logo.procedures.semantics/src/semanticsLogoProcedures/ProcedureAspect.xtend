package semanticsLogoProcedures

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.util.Hashtable
import Procedures.Procedure

@Aspect(className=Procedure)
class ProcedureAspect {
	
	def void eval(Hashtable<String, Object> context){
		_self.body.eval(context)
	}
}