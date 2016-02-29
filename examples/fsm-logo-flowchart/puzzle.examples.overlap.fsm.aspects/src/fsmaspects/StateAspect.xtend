package fsmaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.util.Hashtable

import static extension fsmaspects.ProgramAspect.*
import fsm.State
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

// *.*
// ASPECT
@Aspect(className=State)
class StateAspect extends AbstractStateAspect {
	
	def public void entryState(Hashtable<String, Object> context){
		if(_self.entry != null)
			_self.entry.eval(context)
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
	
	@OverrideAspectMethod
	def public void exitState(Hashtable<String, Object> context){
		if(_self.exit != null)
			_self.exit.eval(context)
	}
}