package simple.imperative.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.util.Hashtable
import simpleimperative.Expression

@Aspect(className=Expression)
public class ExpressionAspect {
	
	def Object eval (Hashtable<String, Object> context) {
		return 0 
	}
}
