package statemachine


import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable
import StateMachineModule.FinalState


// *.*
// ASPECT
@Aspect(className=FinalState)
class FinalStateAspect extends StateAspect {
	
	@OverrideAspectMethod 
	def public void exitState(Hashtable<String, Object> context){
		System.exit(0)
	}
}
