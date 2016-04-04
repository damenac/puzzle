package fsmaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.util.Hashtable
import fsm.Expression
import fsm.Literal
import fsm.ArithmeticExpression
import fsm.RelationalExpression
import fsm.VarReference

import static extension fsmaspects.LiteralAspect.*
import static extension fsmaspects.ArithmeticExpressionAspect.*
import static extension fsmaspects.RelationalExpressionAspect.*
import static extension fsmaspects.VarReferenceAspect.*


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