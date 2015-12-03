package logo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import kmLogo.Block

@Aspect(className=Block)
public class BlockAspect extends InstructionAspect{

	int res = 0
	@OverrideAspectMethod
	def int eval (Context context) {
		_self.instructions.forEach[instruction | _self.res = instruction.eval(context)]
		return 0
	}
	
}