package fsmaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.util.Hashtable
import fsm.Statement
import fsm.Program
import fsm.Conditional
import fsm.Loop
import fsm.Println
import fsm.Assignation
import fsm.Print
import fsm.Wait
import fsm.VarDecl

import static extension fsmaspects.ConditionalAspect.*
import static extension fsmaspects.LoopAspect.*
import static extension fsmaspects.PrintlnAspect.*
import static extension fsmaspects.PrintAspect.*
import static extension fsmaspects.AssignationAspect.*
import static extension fsmaspects.WaitAspect.*
import static extension fsmaspects.VarDeclAspect.*


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