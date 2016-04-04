package flowchartpck

import java.util.Hashtable
import flowchartpck.Node

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import static extension flowchartpck.ActionAspect.*
import static extension flowchartpck.DecisionAspect.*
import static extension flowchartpck.EndAspect.*

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