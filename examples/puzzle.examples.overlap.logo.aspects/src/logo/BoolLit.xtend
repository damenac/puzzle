package logo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import kmLogo.BoolLit

@Aspect(className=BoolLit)
public class BoolLitAspect extends LiteralAspect{

	@OverrideAspectMethod
	def Object eval (Context context) {
		return _self.value
	}
}