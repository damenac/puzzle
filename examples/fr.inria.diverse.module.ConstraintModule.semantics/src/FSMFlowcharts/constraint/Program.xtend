package FSMFlowcharts.constraint

import commons.*

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import java.util.Hashtable
import ConstraintModule.Program

import ConstraintModule.Statement

@Aspect(className=Program)
class ProgramAspect extends StatementAspect {
	
	@OverrideAspectMethod
	def void eval(Hashtable<String, Object> context){
		for(Statement _statement : _self.statements){
			_statement.eval(context)
			
		}
	}
}
