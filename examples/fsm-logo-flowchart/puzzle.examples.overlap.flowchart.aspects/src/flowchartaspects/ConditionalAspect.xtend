package flowchartaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable
import flowchartpck.Conditional

import static extension flowchartaspects.ExpressionAspect.*
import static extension flowchartaspects.ProgramAspect.*

@Aspect(className=Conditional)
class ConditionalAspect extends StatementAspect {
	
	@OverrideAspectMethod
	def void eval(Hashtable<String, Object> context){
		if(_self.condition.eval(context) as Boolean){
			_self.thenInstructions.eval(context)
		}else{
			_self.elseInstructions.eval(context)
		}
	}
}