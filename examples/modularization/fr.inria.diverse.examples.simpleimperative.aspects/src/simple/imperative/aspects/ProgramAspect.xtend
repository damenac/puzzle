package simple.imperative.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import java.util.Hashtable
import simpleimperative.Program
import simpleimperative.Statement

import static extension simple.imperative.aspects.StatementAspect.*

@Aspect(className=Program)
class ProgramAspect {
	
	def void eval(Hashtable<String, Object> context){
		for(Statement _statement : _self.statements){
			_statement.eval(context)
		}
	}
}
