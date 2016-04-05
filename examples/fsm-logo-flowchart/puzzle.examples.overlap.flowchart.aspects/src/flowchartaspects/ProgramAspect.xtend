package flowchartaspects

import java.util.Hashtable
import flowchartpck.Program
import flowchartpck.Statement

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

@Aspect(className=Program)
class ProgramAspect extends StatementAspect {
	
	@OverrideAspectMethod
	def void eval(Hashtable<String, Object> context){
		for(Statement _statement : _self.statements){
			_statement.eval(context)
		}
	}
}