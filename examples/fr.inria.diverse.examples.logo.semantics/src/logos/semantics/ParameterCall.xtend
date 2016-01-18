package logos.semantics


import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import Logo.ParameterCall

@Aspect(className=ParameterCall)
public class ParameterCallAspect {

	def Object eval (Context context) {
		return _self.parameter.eval(context)
	}
}
