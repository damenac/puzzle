package fsmaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.util.Hashtable
import fsm.Expression

@Aspect(className=Expression)
public class ExpressionAspect {

	def Object eval (Hashtable<String, Object> context) {
		return 0 
	}
}