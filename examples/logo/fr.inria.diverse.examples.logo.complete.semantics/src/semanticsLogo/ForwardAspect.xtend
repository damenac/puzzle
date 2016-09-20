package semanticsLogo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable

import static extension semanticsLogo.ExpressionAspect.*
import Logo.Forward

@Aspect(className=Forward)
public class ForwardAspect extends PrimitiveAspect{

	@OverrideAspectMethod
	def void eval (Hashtable<String, Object> context) {
		var int param = (_self.steps.eval(context) as Integer).intValue
		println("FORWARD " + param)
		(context.get('turtle') as Turtle).forward(param)
	} 
}