package LogoLike.expression

import commons.*

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import ExpressionModule.IntegerLit

@Aspect(className=IntegerLit)
public class IntegerLitAspect extends LiteralAspect{
	@OverrideAspectMethod
	def Object eval (Context context) {
		return _self.value
	}
}
