package fr.inria.diverse.puzzle.examples.expr.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main

import ExpressionPck.Expression
import ExpressionPck.IntegerLit
import ExpressionPck.StringLit
import ExpressionPck.BoolLit
import ExpressionPck.ArithmeticExpression
import ExpressionPck.RelationalExpression
import ExpressionPck.VarRef
import java.util.Hashtable

import static extension fr.inria.diverse.puzzle.examples.expr.semantics.IntegerLitAspect.*
import static extension fr.inria.diverse.puzzle.examples.expr.semantics.StringLitAspect.*
import static extension fr.inria.diverse.puzzle.examples.expr.semantics.BoolLitAspect.*
import static extension fr.inria.diverse.puzzle.examples.expr.semantics.ArithmeticExpressionAspect.*
import static extension fr.inria.diverse.puzzle.examples.expr.semantics.RelationalExpressionAspect.*
import static extension fr.inria.diverse.puzzle.examples.expr.semantics.VarRefAspect.*

@Aspect(className=Expression)
public class ExpressionAspect {
	
	@Main
	def Object eval (Hashtable<String, Object> context) {
		if(_self instanceof IntegerLit){
			return (_self as IntegerLit).eval(context)
		}
		else if(_self instanceof StringLit){
			return (_self as StringLit).eval(context)
		}
		else if(_self instanceof BoolLit){
			return (_self as BoolLit).eval(context)
		}
		else if(_self instanceof ArithmeticExpression){
			return (_self as ArithmeticExpression).eval(context)
		}
		else if(_self instanceof RelationalExpression){
			return (_self as RelationalExpression).eval(context)
		}
		else if(_self instanceof VarRef){
			return (_self as VarRef).eval(context)
		}
		else return null
	}
}