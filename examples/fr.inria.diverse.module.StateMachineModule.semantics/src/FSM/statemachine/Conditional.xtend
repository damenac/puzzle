package FSM.statemachine

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import java.util.Hashtable
import StateMachineModule.Conditional

import static extension statemachine.ProgramAspect.*
@Aspect(className=Conditional)
class ConditionalAspect extends StatementAspect {
	
	@OverrideAspectMethod
	def void eval(Hashtable<String, Object> context){
		if(_self.condition.eval(context) as Boolean){
			_self.body.eval(context)
		}
	}
}
