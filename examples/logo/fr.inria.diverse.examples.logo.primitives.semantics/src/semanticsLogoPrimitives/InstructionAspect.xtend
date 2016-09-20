package semanticsLogoPrimitives

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.util.Hashtable

import Primitives.Instruction
import Primitives.Primitive

import static extension semanticsLogoPrimitives.PrimitiveAspect.*

// *.*
// ASPECT
 @Aspect(className=Instruction) 
class InstructionAspect {
 
	def public void eval (Hashtable<String, Object> context ) {
		if(_self instanceof Primitive)
			(_self as Primitive).eval(context)
	}  
}