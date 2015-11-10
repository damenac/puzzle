package FlowchartLike.flowchart

import commons.*

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import java.util.Hashtable
import FlowchartModule.Arc

@Aspect(className=Arc)
public class ArcAspect {
	def void eval(Hashtable<String, Object> context) {
	}
}
