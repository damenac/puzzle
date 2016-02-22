package FSMFlowcharts.constraint

import commons.*

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import java.util.Hashtable
import ConstraintModule.Println

@Aspect(className=Println)
class PrintlnAspect extends StatementAspect {
	
	@OverrideAspectMethod
	def public void eval(Hashtable<String, Object> context){
		println(_self.input)
	}
}
