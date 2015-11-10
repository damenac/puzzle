package Logo.expression

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import ExpressionModule.Expression

@Aspect(className=Expression)
public class ExpressionAspect extends InstructionAspect{
	@OverrideAspectMethod
	def Object eval (Context context) {
		return 0 
	}
}
