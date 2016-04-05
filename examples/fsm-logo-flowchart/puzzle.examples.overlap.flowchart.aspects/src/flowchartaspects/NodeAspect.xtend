package flowchartaspects

import java.util.Hashtable
import flowchartpck.Node

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import static extension flowchartaspects.ActionAspect.*
import static extension flowchartaspects.DecisionAspect.*
import static extension flowchartaspects.EndAspect.*

import flowchartpck.Action
import flowchartpck.Decision
import flowchartpck.End

@Aspect(className=Node)
public class NodeAspect {

	def void eval(Hashtable<String, Object> context){
		if(_self instanceof Action){
			(_self as Action).eval(context)
		}
		else if(_self instanceof Decision){
			(_self as Decision).eval(context)
		}
		else if(_self instanceof End){
			(_self as End).eval(context)
		}
	}
}