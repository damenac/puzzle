package simple.constraints

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.util.Hashtable	
import simpleconstraints.Constraint
import simpleconstraints.Program

import static extension simple.constraints.ConstraintAspect.*

@Aspect(className=Program)
class ProgramAspect{
	def public boolean eval(Hashtable<String,Object> context){
		for(Constraint constraint : _self.constraints){
			if(constraint.eval(context) == false)
				return false
		}
		return true
	}
}