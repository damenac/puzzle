package logos.semantics


import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import Logo.Repeat
import java.util.Hashtable

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
