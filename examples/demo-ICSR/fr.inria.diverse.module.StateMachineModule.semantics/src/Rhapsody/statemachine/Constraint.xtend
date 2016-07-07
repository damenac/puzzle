package Rhapsody.statemachine
import commons.*

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import java.util.Hashtable
import StateMachineModule.Constraint
@Aspect(className=Constraint)
public class ConstraintAspect {
	
	def boolean evalConstraint(Hashtable<String, Object> context){
		return false
	}
}
