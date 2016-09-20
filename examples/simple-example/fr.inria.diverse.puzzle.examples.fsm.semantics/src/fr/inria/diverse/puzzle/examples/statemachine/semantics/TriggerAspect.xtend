package fr.inria.diverse.puzzle.examples.statemachine.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
	
import fsm.Trigger
import org.eclipse.emf.common.util.EList

@Aspect(className=Trigger)
class TriggerAspect {
	
	def public boolean evalTrigger(EList<String> events){
		return events.contains(_self.expression)
	}
}