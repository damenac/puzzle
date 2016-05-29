package fr.inria.diverse.puzzle.examples.statemachine.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
	
import fsm.Region
import java.util.Hashtable
import org.eclipse.emf.common.util.EList
import java.util.ArrayList
import fsm.AbstractState
import fsm.Pseudostate
import fsm.Transition
import org.eclipse.emf.common.util.BasicEList
import fsm.State
import fsm.InitialState

import static extension fr.inria.diverse.puzzle.examples.statemachine.semantics.StateAspect.*
import static extension fr.inria.diverse.puzzle.examples.statemachine.semantics.TransitionAspect.*
import static extension fr.inria.diverse.puzzle.examples.statemachine.semantics.TriggerAspect.*

@Aspect(className=Region)
class RegionAspect {
	
	def public void initRegion(Hashtable<String, Object> context){
		var ArrayList<AbstractState> regionCurrentState = new ArrayList<AbstractState>();
		context.put(_self.getContextPathByRegion, regionCurrentState)
		
		// Looking for the initial pseudo-state
		var Pseudostate initialPseudostate = _self.subvertex.
						findFirst[ _vertex | (_vertex instanceof Pseudostate) && 
							(_vertex instanceof InitialState)] as Pseudostate
		
		// Dispatching the transitions of the initial pseudo-state
		var ArrayList<AbstractState> initialCurrentState = new ArrayList<AbstractState>()
		var ArrayList<Transition> initialCurrentTransitions = new ArrayList<Transition>()
		for(Transition _transition : initialPseudostate.outgoing){
			initialCurrentTransitions.add(_transition)
			initialCurrentState.add(_transition.target)
		}
		(regionCurrentState as ArrayList<AbstractState>).addAll(initialCurrentState)
		
		initialCurrentTransitions.forEach[ transition |
			transition.evalTransition(context)
		]
	}
	
	def public String getContextPathByRegion(){
		return "currentState-" + _self.name
	}
	
	/**
	 * Performs a step in the state machine i.e., reads an entry of the input stack and executes it.
	 * If there are several events in the same step they are executed sequentially.  
	 */
	def public void step(Hashtable<String, Object> context, EList<String> events){
		var ArrayList<AbstractState> currentState = _self.getCurrentState(context, events)
		var ArrayList<Transition> currentTransitions = new ArrayList<Transition>()
		
		var ArrayList<AbstractState> attendedStates = new ArrayList<AbstractState>()
		var ArrayList<AbstractState> newStates = new ArrayList<AbstractState>()
		var EList<Transition> activeTransitions = new BasicEList<Transition>()
		
		for(AbstractState _state : currentState){
			activeTransitions.addAll(_self.getActiveTransitions(_state, events))
		}
		
		for(Transition transition : activeTransitions){
			_self.findOldActiveStates(attendedStates, transition, context)
			_self.findNewActiveTransitions(currentTransitions, transition, context)
			_self.findNewActiveStates(newStates, transition, currentTransitions, context)
		}
		
		for(AbstractState _attendedState : attendedStates){
			if(_attendedState instanceof State)
				(_attendedState as State).exitState(context)
		}
		
		_self.removeStatesFromContext(context, attendedStates)
		_self.addStatesToContext(context, newStates)
		
		activeTransitions.forEach[ transition |
			transition.evalTransition(context)
		]
		
		currentTransitions.forEach[ transition |
			if(!transition.alreadyFired(context))
				transition.evalTransition(context)
		]
		
		newStates.forEach[ state |
				state.outgoing.forEach[ transition | transition.resetFired() ]
		]
	}
	
	def public void removeStatesFromContext(Hashtable<String, Object> context, ArrayList<AbstractState> toRemove){
		(context.get(_self.contextPathByRegion) as ArrayList<AbstractState>).removeAll(toRemove)
	}
	
	def public void addStatesToContext(Hashtable<String, Object> context, ArrayList<AbstractState> newStates){
		for(AbstractState _newState : newStates){
			if(!(context.get(_self.contextPathByRegion) as ArrayList<AbstractState>).contains(_newState))
				(context.get(_self.contextPathByRegion) as ArrayList<AbstractState>).add(_newState)
		}
	}
	
	/**
	 * Returns the current state of the machine. It corresponds to the current set of active states.
	 */
	def public ArrayList<AbstractState> getCurrentState(Hashtable<String, Object> context, EList<String> events){
		val ArrayList<AbstractState> currentState = new ArrayList<AbstractState>
			
			var _it = context.keySet.iterator
			while(_it.hasNext){
				var String _key = _it.next
				var Object _value = context.get(_key)
				if(_key.startsWith("currentState-" + _self.name))
					(_value as ArrayList<AbstractState>).forEach[ _vertex |
						currentState.add(_vertex)]
			}
		return currentState
	}
	
	/**
	 * Returns the active transitions of a vertex
	 */
	def public EList<Transition> getActiveTransitions(AbstractState vertex, EList<String> events){
		val res = new BasicEList<Transition>();
		for(Transition transition : vertex.outgoing){
			if( (transition.trigger == null) || (transition.trigger != null && transition.trigger.evalTrigger(events))){
				res.add(transition)
			}
		}
		return res;
	}
	
	/**
	 * Finds the set of states that are active before the step and that will be left after the step. 
	 */
	def public void findOldActiveStates(ArrayList<AbstractState> oldActiveStates, 
		Transition selectedTransition, Hashtable<String, Object> context){
		if(!oldActiveStates.contains(selectedTransition.source))
			oldActiveStates.add(selectedTransition.source)
	}
	
	/**
	 * Finds the set of states that will be active after the step.
	 */
	def public void findNewActiveStates(ArrayList<AbstractState> newActiveStates,
		Transition selectedTransition, ArrayList<Transition> currentActiveTransitions,
		Hashtable<String, Object> context){
			if(!newActiveStates.contains(selectedTransition.target) && 
				!selectedTransition.alreadyFired(context))
					newActiveStates.add(selectedTransition.target)
	}
	
	/**
	 * Finds the transitions that will be fired during the step. 
	 */
	def public void findNewActiveTransitions(ArrayList<Transition> newActiveTransitions, 
		Transition selectedTransition, Hashtable<String, Object> context){
		newActiveTransitions.add(selectedTransition)
	}
}