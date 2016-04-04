package simple.constraints

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable	

import simpleconstraints.RelationalConstraint
import simpleconstraints.Constraint

@Aspect(className=Constraint)
abstract class ConstraintAspect{
	def public boolean evalConstraint(Hashtable<String,Object> context)
}

@Aspect(className=RelationalConstraint)
class RelationalConstraintAspect extends ConstraintAspect{
	
	@OverrideAspectMethod
	def public boolean evalConstraint(Hashtable<String,Object> context){
		return _self.expression.eval(context) as Boolean
	}
}