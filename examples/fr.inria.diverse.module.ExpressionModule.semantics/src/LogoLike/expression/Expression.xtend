package LogoLike.expression

import commons.*

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import ExpressionModule.Expression

@Aspect(className=Expression)
public class ExpressionAspect {
	def Object eval (Context context) {
		return 0 
	}
}
