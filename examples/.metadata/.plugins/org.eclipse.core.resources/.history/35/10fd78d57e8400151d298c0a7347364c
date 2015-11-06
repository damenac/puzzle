package fsmaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import java.util.Hashtable

import static extension fsmaspects.ExpressionAspect.*
import static extension fsmaspects.ProgramAspect.*

import fsm.Conditional
import fsm.RelationalExpression

@Aspect(className=Conditional)
class ConditionalAspect extends StatementAspect {
	
	@OverrideAspectMethod
	def void eval(Hashtable<String, Object> context){
		if((_self.condition as RelationalExpression).eval(context) as Boolean){
			_self.body.eval(context)
		}
	}
}