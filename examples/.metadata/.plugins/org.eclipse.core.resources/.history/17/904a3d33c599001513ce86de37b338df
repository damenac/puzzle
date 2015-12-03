package flowchart

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable
import flowchartpck.Start


@Aspect(className=Start)
public class StartAspect extends NodeAspect {

	@OverrideAspectMethod
	def void eval(Hashtable<String, Object> context){
		_self.outgoing.forEach[ arc | arc.target.eval(context)]
	}
}