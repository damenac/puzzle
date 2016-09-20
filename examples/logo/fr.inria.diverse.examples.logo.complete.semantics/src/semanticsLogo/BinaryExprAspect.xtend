package semanticsLogo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable
import Logo.BinaryExpr
import Logo.ArithmeticExpr
import Logo.BooleanExpr

import static extension semanticsLogo.ArithmeticExprAspect.*
import static extension semanticsLogo.BooleanExprAspect.*

@Aspect(className=BinaryExpr)
public class BinaryExprAspect extends ExpressionAspect{

	@OverrideAspectMethod
	def Object eval (Hashtable<String, Object> context) {
		if(_self instanceof ArithmeticExpr){
			return (_self as ArithmeticExpr).eval(context)
		}
		else if(_self instanceof BooleanExpr){
			return (_self as BooleanExpr).eval(context)
		}
		else 
			return null
	}
}