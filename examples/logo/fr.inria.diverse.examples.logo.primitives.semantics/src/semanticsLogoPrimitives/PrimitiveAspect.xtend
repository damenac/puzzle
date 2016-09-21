package semanticsLogoPrimitives

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.util.Hashtable

import Primitives.Primitive
import Primitives.Back
import Primitives.Left
import Primitives.Forward
import Primitives.Right

import static extension semanticsLogoPrimitives.BackAspect.*
import static extension semanticsLogoPrimitives.ForwardAspect.*
import static extension semanticsLogoPrimitives.LeftAspect.*
import static extension semanticsLogoPrimitives.RightAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

@Aspect(className=Primitive) 
public class PrimitiveAspect extends InstructionAspect {  

	@OverrideAspectMethod
	def void evalInstruction (Hashtable<String, Object> context) {
		if(_self instanceof Back)
			(_self as Back).evalInstruction(context)
		else if(_self instanceof Forward)
			(_self as Forward).evalInstruction(context)
		else if(_self instanceof Left)
			(_self as Left).evalInstruction(context)
		else if(_self instanceof Right)
			(_self as Right).evalInstruction(context)
	} 
} 