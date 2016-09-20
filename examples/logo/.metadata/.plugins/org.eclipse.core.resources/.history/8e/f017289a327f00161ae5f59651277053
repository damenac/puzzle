package semanticsLogo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable

import static extension semanticsLogo.ExpressionAspect.*
import Logo.Right

@Aspect(className=Right)
public class RightAspect extends PrimitiveAspect{

	@OverrideAspectMethod
	def void eval (Hashtable<String, Object> context) {
		var int param = (_self.angle.eval(context) as Integer).intValue
		println("RIGHT " + param)
		(context.get('turtle') as Turtle).rotate(param)
	} 
}