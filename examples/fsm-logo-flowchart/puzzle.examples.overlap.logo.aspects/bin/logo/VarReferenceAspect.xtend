package logo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable
import kmLogo.VarReference

@Aspect(className=VarReference)
public class VarReferenceAspect extends ExpressionAspect {

	@OverrideAspectMethod
	def Object eval (Hashtable<String, Object> context) {
		return context.get(_self.key)
	}
} 