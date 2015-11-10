package Logo.logoprogram

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import LogoProgramModule.Forward

@Aspect(className=Forward)
public class ForwardAspect extends PrimitiveAspect{
	@OverrideAspectMethod
	def int eval (Context context) {
		var int param = _self.steps.eval(context) as Integer
		println("FORWARD " + param)
		context.turtle.forward(param)
		return 0
	}
}
