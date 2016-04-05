package flowchartaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable
import flowchartpck.Loop

import static extension flowchartaspects.ExpressionAspect.*
import static extension flowchartaspects.ProgramAspect.*

@Aspect(className=Loop)
class LoopAspect extends StatementAspect {
	
	@OverrideAspectMethod
	def void eval(Hashtable<String, Object> context){
		while(_self.guard.eval(context) as Boolean){
			_self.body.eval(context)
		}
	}
}