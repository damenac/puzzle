package logo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import kmLogo.ParameterCall
import java.util.Hashtable

import static extension logo.ParameterAspect.*

@Aspect(className=ParameterCall)
public class ParameterCallAspect extends ExpressionAspect{

	@OverrideAspectMethod
	def Object eval (Hashtable<String, Object> context) {
		return _self.parameter.eval(context)
	}

}