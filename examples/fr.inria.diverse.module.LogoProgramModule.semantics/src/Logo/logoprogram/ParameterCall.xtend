package Logo.logoprogram

import commons.*

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import LogoProgramModule.ParameterCall

import static extension logoprogram.ParameterAspect.*
@Aspect(className=ParameterCall)
public class ParameterCallAspect extends ExpressionAspect{
	@OverrideAspectMethod
	def Object eval (Context context) {
		return _self.parameter.eval(context)
	}
}
