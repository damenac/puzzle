package flowchart

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

@Aspect(className=Expression)
public class ExpressionAspect {

	def Object eval() {
		return 0 
	}

}

@Aspect(className=Literal)
public class LiteralAspect extends ExpressionAspect{

	@OverrideAspectMethod
	def Object eval () {
		return 0
	}
}

@Aspect(className=IntegerLit)
public class IntegerLitAspect extends LiteralAspect{

	@OverrideAspectMethod
	def Object eval () {
		return _self.value
	}
}

@Aspect(className=StringLit)
public class StringLitAspect extends LiteralAspect{

	@OverrideAspectMethod
	def Object eval () {
		return _self.value
	}
}

@Aspect(className=BoolLit)
public class BoolLitAspect extends LiteralAspect{

	@OverrideAspectMethod
	def Object eval () {
		return _self.value
	}
}

@Aspect(className=ArithmeticExpression)
public class ArithmeticExpressionAspect extends ExpressionAspect{

	@OverrideAspectMethod
	def Object eval () {
		var int result = 0
		if(_self.operator == ArithmeticOperator.PLUS){
			result = (_self.left.eval() as Integer) + (_self.right.eval() as Integer)
		}
		else if(_self.operator == ArithmeticOperator.MINUS){
			result = (_self.left.eval() as Integer) - (_self.right.eval() as Integer)
		}
		else if(_self.operator == ArithmeticOperator.MULT){
			result = (_self.left.eval() as Integer) * (_self.right.eval() as Integer)
		}
		else if(_self.operator == ArithmeticOperator.DIV){
			result = (_self.left.eval() as Integer) / (_self.right.eval() as Integer)
		}
		return result
	}
}

@Aspect(className=RelationalExpression)
public class RelationalExpressionAspect extends ExpressionAspect{

	@OverrideAspectMethod
	def Object eval () {
		var boolean result = false
		if(_self.operator == RelationalOperator.EQUALS){
			result = (_self.left.eval() as Integer) == (_self.right.eval() as Integer)
		}
		else if(_self.operator == RelationalOperator.NOT_EQUAL){
			result = (_self.left.eval() as Integer) != (_self.right.eval() as Integer)
		}
		else if(_self.operator == RelationalOperator.LESS_THAN){
			result = (_self.left.eval() as Integer) < (_self.right.eval() as Integer)
		}
		else if(_self.operator == RelationalOperator.GREATER_THAN){
			result = (_self.left.eval() as Integer) > (_self.right.eval() as Integer)
		}
		else if(_self.operator == RelationalOperator.LESS_THAN_OR_EQUAL_TO){
			result = (_self.left.eval() as Integer) <= (_self.right.eval() as Integer)
		}
		else if(_self.operator == RelationalOperator.GREATER_THAN_OR_EQUAL_TO){
			result = (_self.left.eval() as Integer) >= (_self.right.eval() as Integer)
		}
		return result
	}
}