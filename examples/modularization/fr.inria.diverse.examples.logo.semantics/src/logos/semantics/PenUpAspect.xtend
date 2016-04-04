package logos.semantics


import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import Logo.PenUp
import java.util.Hashtable

@Aspect(className=PenUp)
public class PenUpAspect extends PrimitiveAspect{
	
	@OverrideAspectMethod
	def int eval (Hashtable<String, Object> context) {
		println("PENUP")
		(context.get("turtle") as Turtle).setPenUp(true)
		return 0
	}
}
