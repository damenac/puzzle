package logo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import kmLogo.Parameter
import java.util.Hashtable
import java.util.ArrayList

@Aspect(className=Parameter)
public class ParameterAspect {

	def int eval (Hashtable<String, Object> context) {
		return (context.get('stack') as ArrayList<Hashtable<String,Integer>>).last().get(_self.name)
	}

}
