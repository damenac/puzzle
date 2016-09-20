package semanticsLogo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import java.util.Hashtable

@Aspect(className=Logo.VarReference)
public class VarReference extends ExpressionAspect {

	@OverrideAspectMethod
	def Object eval (Hashtable<String, Object> context) {
		return context.get(_self.ref.name)
	}
} 