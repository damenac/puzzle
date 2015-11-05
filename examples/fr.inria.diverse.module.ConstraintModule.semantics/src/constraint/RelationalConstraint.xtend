package constraint


import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import java.util.Hashtable

import static extension fsmaspects.ExpressionAspect.*
import ConstraintModule.RelationalConstraint


@Aspect(className=RelationalConstraint)
public class RelationalConstraintAspect extends ConstraintAspect {

	@OverrideAspectMethod	
	def boolean evalConstraint(Hashtable<String, Object> context){
		return _self.expression.eval(context) as Boolean
	}
}
