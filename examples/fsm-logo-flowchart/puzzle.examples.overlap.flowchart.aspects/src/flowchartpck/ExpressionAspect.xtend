package flowchartpck

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.util.Hashtable
import flowchartpck.Expression

import static extension flowchartpck.LiteralAspect.*
import static extension flowchartpck.ArithmeticExpressionAspect.*
import static extension flowchartpck.RelationalExpressionAspect.*
import static extension flowchartpck.VarReferenceAspect.*

@Aspect(className=Expression)
public class ExpressionAspect {

	def Object eval(Hashtable<String, Object> context) {
		if(_self instanceof Literal)
			return (_self as Literal).eval(context)
		else if(_self instanceof ArithmeticExpression)
			return (_self as ArithmeticExpression).eval(context)
		else if(_self instanceof RelationalExpression)
			return (_self as RelationalExpression).eval(context)
		else if(_self instanceof VarReference)
			return (_self as VarReference).eval(context)
		else 
			return 0 
	}
}