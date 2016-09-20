package semanticsLogoPrimitives

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable

import Primitives.Back

@Aspect(className=Back)
public class BackAspect extends PrimitiveAspect{
 
	@OverrideAspectMethod
	def void eval (Hashtable<String, Object> context) {
		var int param = -1 * (_self.steps.eval(context) as Integer).intValue
		println("BACK "+ param)
		(context.get('turtle') as Turtle).forward(param)
	}
}