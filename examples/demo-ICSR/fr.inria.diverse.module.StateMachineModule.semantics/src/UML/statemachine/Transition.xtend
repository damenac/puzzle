package UML.statemachine
import commons.*

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import java.util.Hashtable
import static extension UML.statemachine.ConstraintAspect.*
import static extension UML.statemachine.StateAspect.*
import static extension UML.statemachine.StatementAspect.*
import StateMachineModule.Transition
import StateMachineModule.State
import StateMachineModule.Statement
// *.*
// ASPECT
@Aspect(className=Transition)
class TransitionAspect {
	
	private boolean fired = false
	
	def public void evalTransition(Hashtable<String, Object> context){
		if(_self.validGuard(context)){
			_self.fired = true
			if(_self.target instanceof State){
				(_self.target as State).entryState(context)
				(_self.target as State).evalState(context)				
			}
		}
		
		for(Statement _statement : _self.effect){
			_statement.eval(context)
		}
	}
	
	def public boolean validGuard(Hashtable<String, Object> context){
		return (_self.guard == null) || (_self.guard != null && _self.guard.evalConstraint(context) == true)
	}
	
	def public boolean alreadyFired(Hashtable<String, Object> context){
		return _self.fired
		
	}
	
	def public void resetFired(){
		_self.fired = false
	}
}
