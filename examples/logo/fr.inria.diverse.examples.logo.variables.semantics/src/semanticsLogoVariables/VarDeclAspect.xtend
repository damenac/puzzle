package semanticsLogoVariables

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.util.Hashtable
import Variables.VarDecl

@Aspect(className=VarDecl)
class VarDeclAspect {
	
	def void evalInstruction(Hashtable<String, Object> context){
		var Hashtable<String, Object> variablesTable = context.get('variables') as Hashtable<String, Object>
		variablesTable.put(_self.name, _self.expr.eval(context))
	}
}