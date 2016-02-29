package logo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import kmLogo.If

import static extension logo.BlockAspect.*
import static extension logo.ExpressionAspect.*
import java.util.Hashtable

@Aspect(className=If)
public class IfAspect extends ControlStructureAspect {

	@OverrideAspectMethod
	def void eval (Hashtable<String, Object> context) {
		if (_self.condition.eval(context) != 0) {
			_self.thenPart.eval(context)
		}
		else{
			_self.elsePart.eval(context)
		}
	}

}