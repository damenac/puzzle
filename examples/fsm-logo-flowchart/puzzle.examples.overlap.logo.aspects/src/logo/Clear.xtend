package logo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import kmLogo.Clear

@Aspect(className=Clear)
public class ClearAspect extends PrimitiveAspect{
	
	@OverrideAspectMethod
	def int eval (Context context) {
		println("CLEAR")
		context.turtle.reset
		return 0
	}

}