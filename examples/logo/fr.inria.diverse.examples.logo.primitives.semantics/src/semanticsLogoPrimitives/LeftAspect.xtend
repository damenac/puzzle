package semanticsLogoPrimitives

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable
import Primitives.Left

@Aspect(className=Left)
public class LeftAspect extends PrimitiveAspect{
 
	@OverrideAspectMethod
	def void evalInstruction (Hashtable<String, Object> context) {
		var int param = (-1)  * (_self.angle.eval(context) as Integer).intValue
		println("LEFT " + param)
		(context.get('turtle') as Turtle).rotate(param)
	}
}