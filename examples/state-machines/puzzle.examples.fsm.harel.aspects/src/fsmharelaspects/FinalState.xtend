package fsmharelaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable
import fsm.FinalState

// *.*
// ASPECT
@Aspect(className=FinalState)
class FinalStateAspect extends StateAspect {
	
	@OverrideAspectMethod
	def public void exitState(Hashtable<String, Object> context){
		_self.super_exitState(context)
		System.exit(0)
	}
}