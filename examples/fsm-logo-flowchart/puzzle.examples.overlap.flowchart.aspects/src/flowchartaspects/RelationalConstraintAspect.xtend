package flowchartaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable
import flowchartpck.RelationalConstraint

import static extension flowchartaspects.ExpressionAspect.*

@Aspect(className=RelationalConstraint)
public class RelationalConstraintAspect extends ConstraintAspect {

	@OverrideAspectMethod	
	def boolean evalConstraint(Hashtable<String, Object> context){
		return _self.expression.eval(context) as Boolean
	}
}