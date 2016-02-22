package FSMFlowcharts.constraint

import commons.*

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import java.util.Hashtable
import ConstraintModule.Print

@Aspect(className=Print)
class PrintAspect extends StatementAspect {
	
	@OverrideAspectMethod
	def public void eval(Hashtable<String, Object> context){
		print(_self.input)
	}
}
