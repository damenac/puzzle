package semanticsLogo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.util.Hashtable

import Logo.Instruction
import Logo.Primitive

import static extension semanticsLogo.PrimitiveAspect.*

// *.*
// ASPECT
 @Aspect(className=Instruction) 
class InstructionAspect {
 
	def public void eval (Hashtable<String, Object> context ) {
		if(_self instanceof Primitive)
			(_self as Primitive).eval(context)
	}  
}