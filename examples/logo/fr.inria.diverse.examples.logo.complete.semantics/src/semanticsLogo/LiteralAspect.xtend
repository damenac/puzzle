package semanticsLogo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable
import Logo.Literal

@Aspect(className=Literal)
public class LiteralAspect extends ExpressionAspect{

	@OverrideAspectMethod
	def Object eval (Hashtable<String, Object> context) {
		if(_self instanceof Logo.Integer)
			return (_self as Logo.Integer).value
		else if(_self instanceof Logo.String)
			return (_self as Logo.String).value
		else if(_self instanceof Logo.Boolean)
			return (_self as Logo.Boolean).value
		else 
			return 0
	}
}