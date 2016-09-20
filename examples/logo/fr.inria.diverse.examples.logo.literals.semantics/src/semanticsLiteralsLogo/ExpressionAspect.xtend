package semanticsLiteralsLogo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.util.Hashtable
import LogoLiterals.Expression
import LogoLiterals.Literal

@Aspect(className=Expression)
public class ExpressionAspect {

	def Object eval(Hashtable<String, Object> context) {
		if(_self instanceof Literal)
			return (_self as Literal).eval(context)
		else
			return 0
	}
}