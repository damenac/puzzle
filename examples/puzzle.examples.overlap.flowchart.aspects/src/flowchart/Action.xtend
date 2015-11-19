package flowchart

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.util.Hashtable
import flowchartpck.Action

@Aspect(className=Action)
public class ActionAspect {

	def void eval(Hashtable<String, Object> context) {
	}
}
