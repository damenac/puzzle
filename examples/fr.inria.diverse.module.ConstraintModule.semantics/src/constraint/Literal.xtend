package constraint

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import java.util.Hashtable
import ConstraintModule.Literal

@Aspect(className=Literal)
public class LiteralAspect extends ExpressionAspect{
	@OverrideAspectMethod
	def Object eval (Hashtable<String, Object> context) {
		return 0
	}
}
