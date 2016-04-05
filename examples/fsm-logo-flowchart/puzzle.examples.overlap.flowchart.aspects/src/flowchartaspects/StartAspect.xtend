package flowchartaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable
import flowchartpck.Start
import flowchartpck.Arc

@Aspect(className=Start)
public class StartAspect extends NodeAspect {

	@OverrideAspectMethod
	def void eval(Hashtable<String, Object> context){
		println('Initiating execution of the flowchart')
		for(Arc arc : _self.outgoing){
			arc.target.eval(context)
		}
	}
}