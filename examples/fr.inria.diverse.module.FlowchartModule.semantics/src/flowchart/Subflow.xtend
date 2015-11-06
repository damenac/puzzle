package flowchart
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import java.util.Hashtable
import FlowchartModule.Subflow

@Aspect(className=Subflow)
public class SubflowAspect {
	def void eval(Hashtable<String, Object> context) {
	}
}
