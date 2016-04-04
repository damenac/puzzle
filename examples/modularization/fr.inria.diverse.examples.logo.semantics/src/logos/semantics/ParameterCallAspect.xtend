package logos.semantics


import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import Logo.ParameterCall
import java.util.Hashtable

@Aspect(className=ParameterCall)
public class ParameterCallAspect {

	def Object eval (Hashtable<String, Object> context) {
		return _self.parameter.eval(context)
	}
}
