package Harel.nottrigger
import commons.*

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.eclipse.emf.common.util.EList
import NotTriggerModule.NotTrigger
// *.*
// ASPECT
@Aspect(className=NotTrigger)
class NotTriggerAspect {
	
	def public boolean evalTrigger(EList<String> events){
		return !_self.trigger.evalTrigger(events);
	}
}
