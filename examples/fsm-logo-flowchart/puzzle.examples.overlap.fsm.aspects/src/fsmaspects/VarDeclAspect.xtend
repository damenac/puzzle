package fsmaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable
import fsm.VarDecl

import static extension fsmaspects.ExpressionAspect.*

@Aspect(className=VarDecl)
class VarDeclAspect extends StatementAspect {
	
	@OverrideAspectMethod
	def void eval(Hashtable<String, Object> context){
		context.put(_self.key, _self.expression.eval(context))
	}
}