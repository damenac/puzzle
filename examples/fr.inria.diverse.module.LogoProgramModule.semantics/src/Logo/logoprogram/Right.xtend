package Logo.logoprogram

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import LogoProgramModule.Right

@Aspect(className=Right)
public class RightAspect extends PrimitiveAspect{
	@OverrideAspectMethod
	def int eval (Context context) {
		var int param = _self.angle.eval(context) as Integer
		println("RIGHT " + param)
		context.turtle.rotate(param)
		return 0
	}
}
