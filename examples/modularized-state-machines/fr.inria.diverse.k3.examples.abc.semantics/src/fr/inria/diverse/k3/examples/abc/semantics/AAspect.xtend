package fr.inria.diverse.k3.examples.abc.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
	
import ABC.A
import ABC.B
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import ABC.C

@Aspect(className=A)
abstract class AAspect {
	def abstract void eval()
}

//@Aspect(className=B)
//class BAspect extends AAspect{
//	
//	@OverrideAspectMethod
//	def void eval(){
//		println('Evaluating B')
//	}
//}

@Aspect(className=C)
class CAspect extends AAspect{
	
	@OverrideAspectMethod
	def void eval(){
		println('Evaluating C')
	}
}