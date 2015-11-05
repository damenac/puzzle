package fsm

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import org.eclipse.emf.common.util.EList


// *.*
// ASPECT
@Aspect(className=Trigger)
class TriggerAspect {
	
	def public boolean evalTrigger(EList<String> events){
		return events.contains(_self.expression)
	}
}