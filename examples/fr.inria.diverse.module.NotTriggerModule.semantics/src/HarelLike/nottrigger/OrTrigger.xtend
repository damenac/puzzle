package HarelLike.nottrigger

import commons.*

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.eclipse.emf.common.util.EList
import NotTriggerModule.OrTrigger

// *.*
// ASPECT
@Aspect(className=OrTrigger)
class OrTriggerAspect {
	
	def public boolean evalTrigger(EList<String> events){
		return _self.right.evalTrigger(events) && _self.left.evalTrigger(events);
	}
}
