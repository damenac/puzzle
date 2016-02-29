package logo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import kmLogo.Repeat
import java.util.Hashtable

import static extension logo.BlockAspect.*
import static extension logo.ExpressionAspect.*

@Aspect(className=Repeat)
public class RepeatAspect extends ControlStructureAspect{

	@OverrideAspectMethod
	def int eval (Hashtable<String, Object> context) {
		var int time =  _self.condition.eval(context) as Integer
		while( time > 0){
			_self.block.eval(context)
			time = time - 1
		}
		return 0
	}
}