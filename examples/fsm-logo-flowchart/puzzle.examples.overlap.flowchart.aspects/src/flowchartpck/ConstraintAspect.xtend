package flowchartpck

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.util.Hashtable
import flowchartpck.Constraint

import static extension flowchartpck.RelationalConstraintAspect.*

@Aspect(className=Constraint)
public class ConstraintAspect {
	
	def boolean evalConstraint(Hashtable<String, Object> context){
		if(_self instanceof RelationalConstraint){
			return (_self as RelationalConstraint).evalConstraint(context)
		}
		return false
	}
}
