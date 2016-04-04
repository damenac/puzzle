package fsmharelaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import static extension fsmharelaspects.TriggerAspect.*

import org.eclipse.emf.common.util.EList
import fsm.NotTrigger

// *.*
// ASPECT
@Aspect(className=NotTrigger)
class NotTriggerAspect {
	
	def public boolean evalTrigger(EList<String> events){
		return !_self.trigger.evalTrigger(events);
	}
}