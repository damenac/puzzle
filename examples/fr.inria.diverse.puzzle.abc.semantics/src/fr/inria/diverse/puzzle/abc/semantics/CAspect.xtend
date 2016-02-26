package fr.inria.diverse.puzzle.abc.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import abc.C

@Aspect(className=C) 
class CAspect {
	
	def public void eval(){
		println('Evaluating B')
	}
}