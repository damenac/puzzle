package fr.inria.diverse.puzzle.examples.actionscripting.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable
import actionscripting.Conditional
import actionscripting.Statement

@Aspect(className=Conditional)
class ConditionalAspect extends StatementAspect {
	
	@OverrideAspectMethod
	def void evalStatement(Hashtable<String, Object> context){
		var Boolean conditionEval = _self.condition.eval(context) as Boolean
		if(conditionEval){
			for(Statement _statement : _self.body){
				_statement.evalStatement(context)
			}
		}
	}
}