package fsmaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import java.util.Hashtable
import fsm.Constraint

@Aspect(className=Constraint)
public class ConstraintAspect {
	
	def boolean evalConstraint(Hashtable<String, Object> context){
		return false
	}
}