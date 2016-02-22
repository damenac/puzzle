package Flowcharts.flowchart

import commons.*

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import java.util.Hashtable
import FlowchartModule.Node

@Aspect(className=Node)
public abstract class NodeAspect {
	def abstract void eval(Hashtable<String, Object> context)
}
