package fsmaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable
import fsm.Literal
import fsm.IntegerLit
import fsm.StringLit
import fsm.BoolLit

@Aspect(className=Literal)
public class LiteralAspect extends ExpressionAspect{

	@OverrideAspectMethod
	def Object eval (Hashtable<String, Object> context) {
		if(_self instanceof IntegerLit)
			return (_self as IntegerLit).value
		else if(_self instanceof StringLit)
			return (_self as StringLit).value
		else if(_self instanceof BoolLit)
			return (_self as BoolLit).value
		else 
			return 0
	}
}