package flowchart

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable

import static extension flowchart.ExpressionAspect.*

@Aspect(className=Flowchart)
public class FlowchartAspect {

	def void eval() {
	}
}

@Aspect(className=Node)
public class NodeAspect {

	def void eval(Hashtable<String, Object> context) {
	}
}

@Aspect(className=Arc)
public class ArcAspect {

	def void eval(Hashtable<String, Object> context) {
	}
}

@Aspect(className=Subflow)
public class SubflowAspect {

	def void eval(Hashtable<String, Object> context) {
	}
}

@Aspect(className=Action)
public class ActionAspect {

	def void eval(Hashtable<String, Object> context) {
	}
}

@Aspect(className=Decision)
public class DecisionAspect {

	def void eval(Hashtable<String, Object> context) {
	}
}


@Aspect(className=Expression)
public class ExpressionAspect {

	def Object eval(Hashtable<String, Object> context) {
		return 0 
	}

}

@Aspect(className=Literal)
public class LiteralAspect extends ExpressionAspect{

	@OverrideAspectMethod
	def Object eval (Hashtable<String, Object> context) {
		return 0
	}
}

@Aspect(className=IntegerLit)
public class IntegerLitAspect extends LiteralAspect{

	@OverrideAspectMethod
	def Object eval (Hashtable<String, Object> context) {
		return _self.value
	}
}

@Aspect(className=StringLit)
public class StringLitAspect extends LiteralAspect{

	@OverrideAspectMethod
	def Object eval (Hashtable<String, Object> context) {
		return _self.value
	}
}

@Aspect(className=BoolLit)
public class BoolLitAspect extends LiteralAspect{

	@OverrideAspectMethod
	def Object eval (Hashtable<String, Object> context) {
		println("coucou!!!")
		return _self.value
	}
}

@Aspect(className=ArithmeticExpression)
public class ArithmeticExpressionAspect extends ExpressionAspect{

	@OverrideAspectMethod
	def Object eval (Hashtable<String, Object> context) {
		var int result = 0
		if(_self.operator == ArithmeticOperator.PLUS){
			result = (_self.left.eval(context) as Integer) + (_self.right.eval(context) as Integer)
		}
		else if(_self.operator == ArithmeticOperator.MINUS){
			result = (_self.left.eval(context) as Integer) - (_self.right.eval(context) as Integer)
		}
		else if(_self.operator == ArithmeticOperator.MULT){
			result = (_self.left.eval(context) as Integer) * (_self.right.eval(context) as Integer)
		}
		else if(_self.operator == ArithmeticOperator.DIV){
			result = (_self.left.eval(context) as Integer) / (_self.right.eval(context) as Integer)
		}
		return result
	}
}

@Aspect(className=RelationalExpression)
public class RelationalExpressionAspect extends ExpressionAspect{

	@OverrideAspectMethod
	def Object eval (Hashtable<String, Object> context) {
		var boolean result = false
		if(_self.operator == RelationalOperator.EQUALS){
			result = (_self.left.eval(context) as Integer) == (_self.right.eval(context) as Integer)
		}
		else if(_self.operator == RelationalOperator.NOT_EQUAL){
			result = (_self.left.eval(context) as Integer) != (_self.right.eval(context) as Integer)
		}
		else if(_self.operator == RelationalOperator.LESS_THAN){
			result = (_self.left.eval(context) as Integer) < (_self.right.eval(context) as Integer)
		}
		else if(_self.operator == RelationalOperator.GREATER_THAN){
			result = (_self.left.eval(context) as Integer) > (_self.right.eval(context) as Integer)
		}
		else if(_self.operator == RelationalOperator.LESS_THAN_OR_EQUAL_TO){
			result = (_self.left.eval(context) as Integer) <= (_self.right.eval(context) as Integer)
		}
		else if(_self.operator == RelationalOperator.GREATER_THAN_OR_EQUAL_TO){
			result = (_self.left.eval(context) as Integer) >= (_self.right.eval(context) as Integer)
		}
		return result
	}
}

@Aspect(className=Constraint)
public class ConstraintAspect {
	
	def boolean evalConstraint(Hashtable<String, Object> context){
		return false
	}
}

@Aspect(className=RelationalConstraint)
public class RelationalConstraintAspect extends ConstraintAspect {

	@OverrideAspectMethod	
	def boolean evalConstraint(Hashtable<String, Object> context){
		return _self.expression.eval(context) as Boolean
	}
}