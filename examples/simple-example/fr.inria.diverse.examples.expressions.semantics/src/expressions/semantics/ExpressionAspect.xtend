package expressions.semantics


import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import ExpressionPck.Expression
import java.util.Hashtable

@Aspect(className=Expression)
public class ExpressionAspect {
	
	def Object eval (Hashtable<String, Object> context) {
		return 0 
	}
}
