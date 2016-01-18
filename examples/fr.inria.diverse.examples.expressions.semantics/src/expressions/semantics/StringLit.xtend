package expressions.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import ExpressionPck.StringLit

@Aspect(className=StringLit)
public class StringLitAspect extends LiteralAspect{
	@OverrideAspectMethod
	def Object eval (Context context) {
		return _self.value
	}
}
