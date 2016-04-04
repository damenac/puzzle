package logos.semantics


import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import Logo.Right
import java.util.Hashtable

@Aspect(className=Right)
public class RightAspect extends PrimitiveAspect{
	
	@OverrideAspectMethod
	def int eval (Hashtable<String, Object> context) {
		var int param = _self.angle.eval(context) as Integer
		println("RIGHT " + param)
		(context.get('turtle') as Turtle).rotate(param)
		return 0
	}
}
