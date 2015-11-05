package logo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import kmLogo.Instruction

// *.*
// ASPECT
 @Aspect(className=Instruction) 
class InstructionAspect {
 
	def public int eval (Context context ) {
		return 0
	}  
}