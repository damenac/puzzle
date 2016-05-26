package fr.inria.diverse.puzzle.examples.fsm.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
	 
import fsm.StateMachine
import java.util.Hashtable

import static extension fr.inria.diverse.puzzle.examples.fsm.semantics.RegionAspect.*
import java.util.ArrayList
import fsm.AbstractState
import java.util.Scanner
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.BasicEList
import fr.inria.diverse.k3.al.annotationprocessor.Main

@Aspect(className=StateMachine) 
class StateMachineAspect {
	
	@Main
	def public void eval(){
		println("\nExecuting the state machine. Please enter the events to process...\n")
		
		val Hashtable<String, Object> context = new Hashtable<String, Object>
		
		_self.regions.forEach[ _region | 
			_region.initRegion(context)
		]
		println("")
		
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
		
		while(true){
			var Scanner in = new Scanner(System.in);
			print(" \n\n INPUT ---> Next event: ")
			var String[] eventsChain = in.nextLine.split(",")
			val EList<String> events = new BasicEList<String>()
			for(String _event : eventsChain){
				events.add(_event)
			}
			
			_self.regions.forEach[ _region | _region.step(context, events)]

			print("    step: ---> current active state (s): ")
			_it = context.keySet.iterator
			while(_it.hasNext){
				var String _key = _it.next
				var Object _value = context.get(_key)
				if(_key.startsWith("currentState"))
					(_value as ArrayList<AbstractState>).forEach[ _vertex |
						print( _vertex.name + " ")]
			}
					
			_it = context.keySet.iterator
			variablesString = ""
			while(_it.hasNext){
				var String _key = _it.next
				var Object _value = context.get(_key)
				if(!_key.startsWith("currentState"))
					variablesString += "              - " + _key + ": " + _value + "\n"
			}
			if(!variablesString.equals("")){
				println("\n          ---> current variables' values: ")
				println(variablesString)
			}
			println
		}
	}
}