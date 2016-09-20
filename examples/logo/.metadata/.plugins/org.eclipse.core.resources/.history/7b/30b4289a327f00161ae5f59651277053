package semanticsLogo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable

import Logo.Primitive
import Logo.Back
import Logo.Left
import Logo.Forward
import Logo.Right

import static extension semanticsLogo.BackAspect.*
import static extension semanticsLogo.ForwardAspect.*
import static extension semanticsLogo.LeftAspect.*
import static extension semanticsLogo.RightAspect.*

@Aspect(className=Primitive) 
public class PrimitiveAspect extends InstructionAspect {  

	@OverrideAspectMethod
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