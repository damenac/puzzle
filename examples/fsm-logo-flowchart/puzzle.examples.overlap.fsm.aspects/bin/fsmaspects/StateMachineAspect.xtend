package fsmaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main

import java.util.ArrayList
import java.util.Hashtable
import java.util.Scanner

import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList

import static extension fsmaspects.TransitionAspect.*
import static extension fsmaspects.StateAspect.*
import static extension fsmaspects.TriggerAspect.*

import fsm.StateMachine
import fsm.AbstractState
import fsm.Pseudostate
import fsm.PseudostateKind
import fsm.Transition
import fsm.State

// *.*
// ASPECT
@Aspect(className=StateMachine)
class StateMachineAspect { 
	
	public ArrayList<ArrayList<String>> events
	 
	/**
	 * Reads the input events from the console and performs the corresponding steps in the state machine. 
	 */
	@Main
	def public void evalStateMachine() {
		val Hashtable<String, Object> context = new Hashtable<String, Object>
		
		// Welcome message and initialization of the state machine. 
		println("Executing the state machine. Please enter the input events:\n")
		_self.initStateMachine(context)
		
		print("    step: ---> current active state (s): ")
		var _it = context.keySet.iterator
		while(_it.hasNext){
			var String _key = _it.next
			var Object _value = context.get(_key)
			if(_key.startsWith("currentState"))
				(_value as ArrayList<AbstractState>).forEach[ _vertex |
					print( _vertex.name + " ")]
		}
		
		_it = context.keySet.iterator
		var String variablesString = ""
		while(_it.hasNext){
			var String _key = _it.next
			var Object _value = context.get(_key)
			if(!_key.startsWith("currentState"))
				variablesString += " - " + _key + ": " + _value + "\n"
		}
		if(!variablesString.equals("")){
			println("\n ---> current variables' values: ")
			println(variablesString)
		}
		
		// Execution of the state machine.		
		while(true){
			var Scanner in = new Scanner(System.in);
			print(" \n\n *INPUT ---> Next event: ")
			var String[] eventsChain = in.nextLine.split(",")
			for(String _event : eventsChain){
				val EList<String> events = new BasicEList<String>()
				events.add(_event)
				_self.step(context, events)
				
				print("    step: ---> current active state (s): ")
				_it = context.keySet.iterator
				while(_it.hasNext){
					var String _key = _it.next
					var Object _value = context.get(_key)
					if(_key.startsWith("currentState"))
						(_value as ArrayList<AbstractState>).forEach[ _vertex |
							print( _vertex.name + " ")]
				}
			}
		}
	}
	
	/**
	 * Finds the initial pseudo-state and starts the execution of the state machine. 
	 */
	def public void initStateMachine(Hashtable<String, Object> context){
		var ArrayList<AbstractState> initialState = new ArrayList<AbstractState>();
		context.put("currentState", initialState)
		
		// Looking for the initial pseudo-state
		var Pseudostate initialPseudostate = _self.subvertex.
						findFirst[ _vertex | (_vertex instanceof Pseudostate) && 
							(_vertex as Pseudostate).kind == PseudostateKind.INITIAL] as Pseudostate
		
		// Dispatching the transitions of the initial pseudo-state
		var ArrayList<AbstractState> initialCurrentState = new ArrayList<AbstractState>()
		var ArrayList<Transition> initialCurrentTransitions = new ArrayList<Transition>()
		for(Transition _transition : initialPseudostate.outgoing){
			initialCurrentTransitions.add(_transition)
			initialCurrentState.add(_transition.target)
		}
		(initialState as ArrayList<AbstractState>).addAll(initialCurrentState)
		
		initialCurrentTransitions.forEach[ transition |
			transition.evalTransition(context)
		]
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
		
		(context.get("currentState") as ArrayList<AbstractState>).removeAll(attendedStates)
		
		for(AbstractState _newState : newStates){
			if(!(context.get("currentState") as ArrayList<AbstractState>).contains(_newState))
				(context.get("currentState") as ArrayList<AbstractState>).add(_newState)
		}
		
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
	
	/**
	 * Returns the current state of the machine. It corresponds to the current set of active states.
	 */
	def public ArrayList<AbstractState> getCurrentState(Hashtable<String, Object> context, EList<String> events){
		val ArrayList<AbstractState> currentState = new ArrayList<AbstractState>
			
			var _it = context.keySet.iterator
			while(_it.hasNext){
				var String _key = _it.next
				var Object _value = context.get(_key)
				if(_key.startsWith("currentState"))
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