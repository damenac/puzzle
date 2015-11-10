package Flowchart.expression

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import java.util.Hashtable
import ExpressionModule.BoolLit
import FSMFlowchart.expression.LiteralAspect

@Aspect(className=BoolLit)
public class BoolLitAspect extends LiteralAspect{
	@OverrideAspectMethod
	def Object eval (Hashtable<String, Object> context) {
		println("coucou!!!")
		return _self.value
	}
}
