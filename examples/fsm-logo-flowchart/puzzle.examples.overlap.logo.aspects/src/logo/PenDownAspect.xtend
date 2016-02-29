package logo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import kmLogo.PenDown
import java.util.Hashtable

@Aspect(className=PenDown)
public class PenDownAspect extends PrimitiveAspect{

	@OverrideAspectMethod
	def int eval (Hashtable<String, Object> context) {
		println("PENDOWN")
		(context.get('turtle') as Turtle).setPenUp(false)
		return 0
	}
}