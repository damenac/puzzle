package fr.inria.diverse.puzzle.pqr.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
	
import pqr.P
import fr.inria.diverse.puzzle.abc.semantics.BAspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

@Aspect(className=P)
class PAspect extends BAspect {
	
	@OverrideAspectMethod
	def void eval(){
		println("Evaluating P")
		_self.super_eval
	}
}