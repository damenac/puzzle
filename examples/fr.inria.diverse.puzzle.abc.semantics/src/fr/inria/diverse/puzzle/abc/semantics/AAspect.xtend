package fr.inria.diverse.puzzle.abc.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import abc.A

import static extension fr.inria.diverse.puzzle.abc.semantics.BAspect.*

@Aspect(className=A)
class AAspect {
	 
	def void eval(){
		println('Evaluating A')
		_self.bes.forEach[ b | b.eval() ]
	}
}