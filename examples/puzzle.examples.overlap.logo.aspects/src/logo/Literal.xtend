package logo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import kmLogo.Literal

@Aspect(className=Literal)
public class LiteralAspect extends ExpressionAspect{

	@OverrideAspectMethod
	def Object eval (Context context) {
		return 0
	}
}