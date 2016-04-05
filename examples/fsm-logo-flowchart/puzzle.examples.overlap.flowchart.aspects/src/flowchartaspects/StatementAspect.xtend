package flowchartaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import java.util.Hashtable
import flowchartpck.Statement

import flowchartpck.Program
import flowchartpck.Conditional
import flowchartpck.Loop
import flowchartpck.Println
import flowchartpck.Print
import flowchartpck.Assignation
import flowchartpck.Wait
import flowchartpck.VarDecl

import static extension flowchartaspects.ConditionalAspect.*
import static extension flowchartaspects.LoopAspect.*
import static extension flowchartaspects.PrintlnAspect.*
import static extension flowchartaspects.PrintAspect.*
import static extension flowchartaspects.AssignationAspect.*
import static extension flowchartaspects.WaitAspect.*
import static extension flowchartaspects.VarDeclAspect.*

@Aspect(className=Statement)
class StatementAspect {
	
	def void eval(Hashtable<String, Object> context){
		if(_self instanceof Program){
			(_self as Program).eval(context)
		}
		else if(_self instanceof Conditional){
			(_self as Conditional).eval(context)
		}
		else if(_self instanceof Loop){
			(_self as Loop).eval(context)
		}
		else if(_self instanceof Println){
			(_self as Println).eval(context)
		}
		else if(_self instanceof Print){
			(_self as Print).eval(context)
		}
		else if(_self instanceof Assignation){
			(_self as Assignation).eval(context)
		}
		else if(_self instanceof Wait){
			(_self as Wait).eval(context)
		}
		else if(_self instanceof VarDecl){
			(_self as VarDecl).eval(context)
		}
	}
}