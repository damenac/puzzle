package semanticsLogo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.util.Hashtable

import static extension semanticsLogo.LiteralAspect.*
import Logo.Literal
import Logo.BinaryExpr
import Logo.Expression

@Aspect(className=Expression)
public class ExpressionAspect {

	def Object eval(Hashtable<String, Object> context) {
		if(_self instanceof Literal)
			return (_self as Literal).eval(context)
		else if(_self instanceof BinaryExpr)
			return (_self as BinaryExpr).eval(context)
		else if(_self instanceof Logo.VarReference)
			return (_self as Logo.VarReference).eval(context)
		else 
			return 0 
	}
}