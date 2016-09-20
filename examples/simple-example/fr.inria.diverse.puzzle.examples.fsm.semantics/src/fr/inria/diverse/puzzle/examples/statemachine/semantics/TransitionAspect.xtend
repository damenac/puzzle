package fr.inria.diverse.puzzle.examples.statemachine.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
	
import fsm.Transition
import java.util.Hashtable
import fsm.State

import static extension fr.inria.diverse.puzzle.examples.statemachine.semantics.StateAspect.*

@Aspect(className=Transition)
class TransitionAspect {
	
	private boolean fired = false
	
	def public void evalTransition(Hashtable<String, Object> context){
		if(_self.guard.eval(context)){
			_self.fired = true
			if(_self.target instanceof State){
				(_self.target as State).entryState(context)
				(_self.target as State).evalState(context)				
			}
		} 
	}
	
	def public boolean alreadyFired(Hashtable<String, Object> context){
		return _self.fired
		
	}
	
	def public void resetFired(){
		_self.fired = false
	}
}