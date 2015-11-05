package flowchart

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable

import flowchartpck.RelationalExpression
import flowchartpck.RelationalOperator

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