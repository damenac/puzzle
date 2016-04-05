package simple.imperative.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import java.util.Hashtable
import simpleimperative.Assignation

@Aspect(className=Assignation)
class AssignationAspect extends StatementAspect {
	
	@OverrideAspectMethod
	def public void eval(Hashtable<String, Object> context){
		context.put(_self.varRef.name, _self.expression.eval(context))
	}
}
