package logo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import kmLogo.Right
import java.util.Hashtable

import static extension logo.ExpressionAspect.*


@Aspect(className=Right)
public class RightAspect extends PrimitiveAspect{

	@OverrideAspectMethod
	def void eval (Hashtable<String, Object> context) {
		var int param = _self.angle.eval(context) as Integer
		println("RIGHT " + param)
		(context.get('turtle') as Turtle).rotate(param)
	} 
}