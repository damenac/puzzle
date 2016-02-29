package logo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import kmLogo.Primitive
import java.util.Hashtable

@Aspect(className=Primitive) 
public class PrimitiveAspect extends InstructionAspect {  

	@OverrideAspectMethod
	def int eval (Hashtable<String, Object> context) {
		return 0
	} 
 
} 