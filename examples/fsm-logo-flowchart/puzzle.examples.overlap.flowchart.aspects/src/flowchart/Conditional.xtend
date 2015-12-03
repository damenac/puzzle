package flowchart

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable

import static extension flowchart.ExpressionAspect.*
import static extension flowchart.ProgramAspect.*
import flowchartpck.Conditional

@Aspect(className=Conditional)
class ConditionalAspect extends StatementAspect {
	
	@OverrideAspectMethod
	def void eval(Hashtable<String, Object> context){
		if(_self.condition.eval(context) as Boolean){
			_self.body.eval(context)
		}
	}
}