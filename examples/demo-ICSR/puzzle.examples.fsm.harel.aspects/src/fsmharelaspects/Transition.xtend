package fsmharelaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.util.Hashtable

import static extension fsmharelaspects.ConstraintAspect.*
import static extension fsmharelaspects.StateAspect.*
import static extension fsmharelaspects.StatementAspect.*

import fsm.Transition
import fsm.State
import java.util.ArrayList
import fsm.Statement

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
		
		val ArrayList<Hashtable<String,Object>> parallelContexts = new ArrayList<Hashtable<String,Object>>();
		for(Statement _statement : _self.effect){
			var Hashtable<String,Object> _newContext = new Hashtable<String,Object>(context)
			_statement.eval(_newContext)
			parallelContexts.add(_newContext)
		}
		
		// Merging the contexts
		for(Hashtable<String,Object> _context : parallelContexts){
			var _it = _context.keySet.iterator
			while(_it.hasNext){
				var String _key = _it.next
				var Object _value = _context.get(_key)
				if(!_key.startsWith("currentState"))
					context.put(_key, _value)
			}
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