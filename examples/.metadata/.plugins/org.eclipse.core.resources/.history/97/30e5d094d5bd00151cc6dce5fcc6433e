package Logo.logoprogram

import commons.*

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import LogoProgramModule.PenUp

@Aspect(className=PenUp)
public class PenUpAspect extends PrimitiveAspect{
	@OverrideAspectMethod
	def int eval (Context context) {
		println("PENUP")
		context.turtle.setPenUp(true)
		return 0
	}
}
