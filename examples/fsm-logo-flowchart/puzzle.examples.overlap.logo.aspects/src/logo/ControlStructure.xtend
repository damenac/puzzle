package logo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import kmLogo.ControlStructure

@Aspect(className=ControlStructure)
public class ControlStructureAspect extends InstructionAspect{
	@OverrideAspectMethod
	def int eval (Context context) {
		return 0
	}
}
