package semanticsLogoControlStructures

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable
import ControlStructures.Block
import ControlStructures.Instruction

@Aspect(className=Block)
class BlockAspect extends ControlStructureAspect {
	
	@OverrideAspectMethod
	def void eval(Hashtable<String, Object> context){
		for(Instruction instruction : _self.instructions){
			println(instruction)
			instruction.eval(context)
		}
	}
}