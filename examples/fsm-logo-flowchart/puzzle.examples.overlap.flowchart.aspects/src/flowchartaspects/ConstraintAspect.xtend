package flowchartaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.util.Hashtable
import flowchartpck.Constraint
import flowchartpck.RelationalConstraint

import static extension flowchartaspects.RelationalConstraintAspect.*

@Aspect(className=Constraint)
public class ConstraintAspect {
	
	def boolean evalConstraint(Hashtable<String, Object> context){
		if(_self instanceof RelationalConstraint){
			return (_self as RelationalConstraint).evalConstraint(context)
		}
		return false
	}
}
