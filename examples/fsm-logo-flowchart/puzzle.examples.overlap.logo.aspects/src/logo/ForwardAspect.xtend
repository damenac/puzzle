package logo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import kmLogo.Forward
import java.util.Hashtable

import static extension logo.ExpressionAspect.*

@Aspect(className=Forward)
public class ForwardAspect extends PrimitiveAspect{

	@OverrideAspectMethod
	def int eval (Hashtable<String, Object> context) {
		var int param = _self.steps.eval(context) as Integer
		println("FORWARD " + param)
		(context.get('turtle') as Turtle).forward(param)
		return 0
	}
}