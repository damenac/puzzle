package flowchart.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.util.Hashtable

import flowchartpck.Arc

@Aspect(className=Arc)
public class ArcAspect {

	def void eval(Hashtable<String, Object> context) {
	}
}