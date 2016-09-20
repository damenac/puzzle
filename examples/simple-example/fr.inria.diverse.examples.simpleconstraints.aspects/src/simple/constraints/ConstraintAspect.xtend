package simple.constraints

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.util.Hashtable	

import simpleconstraints.Constraint

@Aspect(className=Constraint)
class ConstraintAspect{
	def public boolean eval(Hashtable<String,Object> context){
		return true
	}
}