package logo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import kmLogo.Instruction
import kmLogo.Primitive

import java.util.Hashtable

import static extension logo.PrimitiveAspect.*

// *.*
// ASPECT
 @Aspect(className=Instruction) 
class InstructionAspect {
 
	def public void eval (Hashtable<String, Object> context ) {
		if(_self instanceof Primitive)
			(_self as Primitive).eval(context)
	}  
}