package fr.inria.diverse.k3.examples.abc.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
	
import ABC.B


@Aspect(className=B)
class BAspect extends AAspect{
	
	@OverrideAspectMethod
	def void eval(){
		println('Evaluating B')
	}
}