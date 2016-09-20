package expressions.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import ExpressionPck.BoolLit
import java.util.Hashtable

@Aspect(className=BoolLit)
public class BoolLitAspect extends LiteralAspect{
	
	@OverrideAspectMethod
	def Object eval (Hashtable<String, Object> context) {
		return _self.value
	}
}
