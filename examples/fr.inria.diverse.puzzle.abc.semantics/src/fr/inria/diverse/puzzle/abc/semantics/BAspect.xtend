package fr.inria.diverse.puzzle.abc.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
	
import abc.B

import static extension fr.inria.diverse.puzzle.abc.semantics.CAspect.*
import static extension fr.inria.diverse.puzzle.xyz.semantics.XAspect.*

@Aspect(className=B) 
class BAspect  {
	
	def void eval(){
		println('Evaluating B')
		_self.ces.forEach[ c | c.eval() ]
		_self.xes.forEach[ x | x.eval() ]
	}
}