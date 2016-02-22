package Flowcharts.flowchart

import commons.*

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import java.util.Hashtable
import FlowchartModule.End

@Aspect(className=End)
public class EndAspect extends NodeAspect {
	@OverrideAspectMethod
	def void eval(Hashtable<String, Object> context){
		System.exit(0)
	}
}
