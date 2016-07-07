package UML.statemachine
import commons.*

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import java.util.Hashtable
import static extension UML.statemachine.RegionAspect.*
import static extension UML.statemachine.ProgramAspect.*
import StateMachineModule.State
// *.*
// ASPECT
@Aspect(className=State)
class StateAspect {
	
	def public void entryState(Hashtable<String, Object> context){
		if(_self.entry != null)
			_self.entry.eval(context)
			
		_self.ownedRegions.forEach[ _region | _region.initRegion(context)]
	}
	
	def public void evalState(Hashtable<String, Object> context) {
		if(_self.doActivity != null){
			var Runnable _runnable = new Runnable{
				override run(){
					 synchronized (_self) {
					 	_self.doActivity.eval(context)
					 }
				}
			}
		 	var Thread _thread = new Thread(_runnable)
			_thread.start
		}
	}
	
	def public void exitState(Hashtable<String, Object> context){
		if(_self.exit != null)
			_self.exit.eval(context)
//		_self.ownedRegions.forEach[_region | _region.saveDeepHistoryState(context)]
		_self.ownedRegions.forEach[_region | _region.saveHistoryState(context)]
	}
}
