package fr.inria.diverse.puzzle.examples.expressions.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import ExpressionPck.IntegerLit
import java.util.Hashtable

@Aspect(className=IntegerLit)
public class IntegerLitAspect extends LiteralAspect{
	
	@OverrideAspectMethod
	def Object eval (Hashtable<String, Object> context) {
		return _self.value
	}
}
