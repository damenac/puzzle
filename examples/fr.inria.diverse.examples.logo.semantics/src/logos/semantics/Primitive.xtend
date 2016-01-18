package logos.semantics


import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import Logo.Primitive

@Aspect(className=Primitive) 
public class PrimitiveAspect extends InstructionAspect{  
	@OverrideAspectMethod
	def int eval (Context context) {
		return 0
	} 
 
} 
