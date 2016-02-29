package logo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import kmLogo.Clear
import java.util.Hashtable

@Aspect(className=Clear)
public class ClearAspect extends PrimitiveAspect{
	
	@OverrideAspectMethod
	def int eval (Hashtable<String, Object> context) {
		println("CLEAR")
		(context.get('turtle') as Turtle).reset
		return 0
	}

}