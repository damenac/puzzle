package logo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.util.Hashtable
import kmLogo.VarDecl

import static extension logo.ExpressionAspect.*

@Aspect(className=VarDecl)
class VarDeclAspect {
	
	def void eval(Hashtable<String, Object> context){
		context.put(_self.key, _self.expression.eval(context))
	}
}