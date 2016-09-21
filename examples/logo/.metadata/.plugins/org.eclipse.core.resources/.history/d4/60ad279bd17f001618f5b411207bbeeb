package semanticsLogoVariables

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.util.Hashtable
import Variables.VarReference

@Aspect(className=VarReference)
public class VarReferenceAspect {
 
	def Object eval (Hashtable<String, Object> context) {
		var Hashtable<String, Object> variablesTable = context.get('variables') as Hashtable<String, Object>
		return variablesTable.get(_self.ref.name)
	}
} 