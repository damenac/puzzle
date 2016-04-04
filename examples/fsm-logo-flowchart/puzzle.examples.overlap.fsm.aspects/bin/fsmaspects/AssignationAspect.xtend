package fsmaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable
import fsm.Assignation

import static extension fsmaspects.ExpressionAspect.*

@Aspect(className=Assignation)
class AssignationAspect extends StatementAspect {
	
	@OverrideAspectMethod
	def public void eval(Hashtable<String, Object> context){
		context.put(_self.varRef.key, _self.expression.eval(context))
	}
}
