package LogoLike.logoprogram

import commons.*

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import LogoProgramModule.Primitive

@Aspect(className=Primitive) 
public class PrimitiveAspect extends InstructionAspect{  
	@OverrideAspectMethod
	def int eval (Context context) {
		return 0
	} 
 
} 
