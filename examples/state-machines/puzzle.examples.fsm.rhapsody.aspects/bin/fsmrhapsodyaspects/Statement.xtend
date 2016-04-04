package fsmrhapsodyaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import java.util.Hashtable
import fsm.Statement

@Aspect(className=Statement)
abstract class StatementAspect {
	
	def abstract void eval(Hashtable<String, Object> context)
}