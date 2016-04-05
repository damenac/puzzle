package flowchartaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import flowchartpck.Flowchart
import flowchartpck.Start

import static extension flowchartaspects.StartAspect.*

import java.util.Hashtable
import fr.inria.diverse.k3.al.annotationprocessor.Main

@Aspect(className=Flowchart)
public class FlowchartAspect {

	@Main
	def void exec() {
		var Hashtable<String, Object> context = new Hashtable<String, Object>()
		var Start start = _self.nodes.findFirst[ node | node instanceof Start ] as Start
		start.eval(context)
	}
}