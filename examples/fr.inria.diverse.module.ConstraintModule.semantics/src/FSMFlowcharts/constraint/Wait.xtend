package FSMFlowcharts.constraint

import commons.*

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import java.util.Hashtable
import ConstraintModule.Wait

@Aspect(className=Wait)
class WaitAspect extends StatementAspect {
	
	@OverrideAspectMethod
	def public void eval(Hashtable<String, Object> context){
		synchronized(_self){
			_self.wait(_self.miliseconds)
		}
	}
}
