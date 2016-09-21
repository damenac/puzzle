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

@Aspect(className=Primitive) 
public class PrimitiveAspect {  

	def void eval (Hashtable<String, Object> context) {
		if(_self instanceof Back)
			(_self as Back).eval(context)
		else if(_self instanceof Forward)
			(_self as Forward).eval(context)
		else if(_self instanceof Left)
			(_self as Left).eval(context)
		else if(_self instanceof Right)
			(_self as Right).eval(context)
	} 
} 