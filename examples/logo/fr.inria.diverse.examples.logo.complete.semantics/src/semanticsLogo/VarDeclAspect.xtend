package semanticsLogo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable

import static extension semanticsLogo.ExpressionAspect.*
import Logo.VarDecl

@Aspect(className=VarDecl)
class VarDeclAspect extends InstructionAspect {
	
	@OverrideAspectMethod
	def void eval(Hashtable<String, Object> context){
		context.put(_self.name, _self.expr.eval(context))
	}
}