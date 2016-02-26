package fr.inria.diverse.puzzle.xyz.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import xyz.Y
import static extension fr.inria.diverse.puzzle.xyz.semantics.ZAspect.*

@Aspect(className=Y)
class YAspect {
	
	def void eval(){
		println('Evaluating Y')
		_self.zes.forEach[ z | z.eval()]
	}
}