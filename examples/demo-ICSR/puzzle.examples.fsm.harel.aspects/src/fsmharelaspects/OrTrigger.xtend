package fsmharelaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import static extension fsmharelaspects.TriggerAspect.*

import org.eclipse.emf.common.util.EList
import fsm.OrTrigger

// *.*
// ASPECT
@Aspect(className=OrTrigger)
class OrTriggerAspect {
	
	def public boolean evalTrigger(EList<String> events){
		return _self.right.evalTrigger(events) && _self.left.evalTrigger(events);
	}
}