package fsmaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.util.Hashtable
import fsm.Constraint
import fsm.RelationalConstraint

import static extension fsmaspects.RelationalConstraintAspect.*

@Aspect(className=Constraint)
public class ConstraintAspect {
	
	def boolean evalConstraint(Hashtable<String, Object> context){
		if(_self instanceof RelationalConstraint){
			return (_self as RelationalConstraint).evalConstraint(context)
		}
		return false
	}
}
