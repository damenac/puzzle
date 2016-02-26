package fr.inria.diverse.puzzle.xyz.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import xyz.X

import static extension fr.inria.diverse.puzzle.xyz.semantics.YAspect.*

@Aspect(className=X)
class XAspect {
	
	def void eval(){
		println('Evaluating X')
		_self.yes.forEach[ y | y.eval()]
	}
}