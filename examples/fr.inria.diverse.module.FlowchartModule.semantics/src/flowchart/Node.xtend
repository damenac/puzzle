package flowchart
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import java.util.Hashtable
import FlowchartModule.Node

@Aspect(className=Node)
public class NodeAspect {
	def void eval(Hashtable<String, Object> context) {
		
	}
}
