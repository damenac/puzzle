package fsmaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable


import static extension fsmaspects.ExpressionAspect.*
import static extension fsmaspects.ProgramAspect.*
import fsm.Loop

@Aspect(className=Loop)
class LoopAspect extends StatementAspect {
	
	@OverrideAspectMethod
	def void eval(Hashtable<String, Object> context){
		while(_self.guard.eval(context) as Boolean){
			_self.body.eval(context)
		}
	}
}