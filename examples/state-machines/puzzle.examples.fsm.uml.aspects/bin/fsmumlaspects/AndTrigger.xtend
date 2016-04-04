package fsmumlaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import static extension fsmumlaspects.TriggerAspect.*

import fsm.AndTrigger
import org.eclipse.emf.common.util.EList

// *.*
// ASPECT
@Aspect(className=AndTrigger)
class AndTriggerAspect {
	
	def public boolean evalTrigger(EList<String> events){
		return _self.right.evalTrigger(events) && _self.left.evalTrigger(events);
	}
}