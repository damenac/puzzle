package fsmaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.util.Hashtable
import fsm.AbstractState
import fsm.State
import fsm.FinalState

import static extension fsmaspects.StateAspect.*
import static extension fsmaspects.FinalStateAspect.*


// *.*
// ASPECT
@Aspect(className=AbstractState)
class AbstractStateAspect {
	
	def public void exitState(Hashtable<String, Object> context) {
		if(_self instanceof State && !(_self instanceof FinalState))
			(_self as State).exitState(context)
		else if(_self instanceof FinalState)
			(_self as FinalState).exitState(context)
	}
}