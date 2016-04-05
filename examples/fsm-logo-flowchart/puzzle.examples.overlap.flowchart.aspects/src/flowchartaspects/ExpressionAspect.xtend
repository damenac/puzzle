package flowchartaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.util.Hashtable
import flowchartpck.Expression

import static extension flowchartaspects.LiteralAspect.*
import static extension flowchartaspects.ArithmeticExpressionAspect.*
import static extension flowchartaspects.RelationalExpressionAspect.*
import static extension flowchartaspects.VarReferenceAspect.*

import flowchartpck.Literal
import flowchartpck.ArithmeticExpression
import flowchartpck.RelationalExpression
import flowchartpck.VarReference

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