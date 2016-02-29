package fsmaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable
import fsm.IntegerLit

@Aspect(className=IntegerLit)
public class IntegerLitAspect extends LiteralAspect {

	@OverrideAspectMethod
	def Object eval (Hashtable<String, Object> context) {
		return _self.value
	} 
}