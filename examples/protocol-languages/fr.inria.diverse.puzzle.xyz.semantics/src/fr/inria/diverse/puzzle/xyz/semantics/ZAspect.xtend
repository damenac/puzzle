package fr.inria.diverse.puzzle.xyz.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import xyz.Z

@Aspect(className=Z)
class ZAspect {
	
	def void eval(){
		println('Evaluating Z')
	}
}