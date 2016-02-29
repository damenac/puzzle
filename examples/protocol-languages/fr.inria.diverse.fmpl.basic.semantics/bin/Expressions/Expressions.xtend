package Expressions

import fmpl.ArithmeticExpression
import fmpl.Automata
import fmpl.Cond
import fmpl.Exec
import fmpl.Expression
import fmpl.Init
import fmpl.IntegerLit
import fmpl.Literal
import fmpl.Policy
import fmpl.Read
import fmpl.Relational
import fmpl.State
import fmpl.StringLit
import fmpl.Transition
import fmpl.VarDeclaration
import fmpl.VarReference
import fmpl.Write
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import java.util.Hashtable

import static extension Expressions.ArithmeticExpressionAspect.*
import static extension Expressions.AutomataAspect.*
import static extension Expressions.ExpressionAspect.*
import static extension Expressions.LiteralAspect.*
import static extension Expressions.VarReferenceAspect.*

//class Expressions{
//	public def run(String modelPath,String[] messages) {
//
//		//load the model
//		var injector = new BasicStandaloneSetup.createInjectorAndDoEMFRegistration();
//		var resourceSet = injector.getInstance(	typeof(XtextResourceSet));
//		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
//		resourceSet.packageRegistry.put(FmplPackage.eNS_URI, FmplPackage.eINSTANCE);
//		var resource = resourceSet.getResource(	URI.createFileURI(modelPath), true);
//		var model =  resource.getContents().get(0);
//
//		
//	
//	}
//
//	def static void main(String[] args) {
//
//		val String[] messages=#{"100101","100111","110011","111011","110111"}
//		val String modelPath="/Volumes/JetMini/Documents/Workspaces/runtime-EclipseApplication/Examples/test.basic"
//		new Expressions().run(modelPath,messages)
//
//	}
//}



@Aspect(className=Policy)
class PolicyAspect  {

	def public void eval(Hashtable<String, Object> context,String message) {
			for (Expression _expression : _self.statements) {
				_expression.eval(context,message)
		}
	}
}

@Aspect(className=Expression)
abstract class ExpressionAspect {

	def abstract public void eval(Hashtable<String, Object> context,String message)
	def abstract public Object value(Hashtable<String, Object> context,String message)
	
}

@Aspect(className=Literal)
abstract class LiteralAspect extends ExpressionAspect {
		def abstract public Object value(Hashtable<String, Object> context,String message) 
	
}

@Aspect(className=IntegerLit)
class IntegerAspect extends LiteralAspect {
	def public Object value(Hashtable<String, Object> context,String message) {
		return new Integer(_self.value)
	}
}

@Aspect(className=StringLit)
class StringAspect extends LiteralAspect {

	def public Object value(Hashtable<String, Object> context,String message) {
		return new String(_self.value)
	}
}

@Aspect(className=ArithmeticExpression)
class ArithmeticExpressionAspect extends ExpressionAspect {

	def public Object value(Hashtable<String, Object> context,String message) {

		// Obtaining the value of the left hand expression
		var Object leftValue = null
		if (_self.left instanceof ArithmeticExpression)
			leftValue = (_self.left as ArithmeticExpression).value(context,message)
		else if (_self.left instanceof Literal)
			leftValue = (_self.left as Literal).value(context,message)
		else if (_self.left instanceof VarReference)
			leftValue = (_self.left as VarReference).value(context,message)

		// Obtaining the value of the right hand expression
		var Object rightValue = null
		if (_self.right instanceof ArithmeticExpression)
			rightValue = (_self.right as ArithmeticExpression).value(context,message)
		else if (_self.right instanceof Literal)
			rightValue = (_self.right as Literal).value(context,message)
		else if (_self.right instanceof VarReference)
			rightValue = (_self.right as VarReference).value(context,message)

		// Performing the operation
		var int result
		if (_self.operator.value == 0) {
			result = (leftValue as Integer).intValue + (rightValue as Integer).intValue
		} else if (_self.operator.value == 1) {
			result = (leftValue as Integer).intValue - (rightValue as Integer).intValue
		} else if (_self.operator.value == 2) {
			result = (leftValue as Integer).intValue * (rightValue as Integer).intValue
		} else {
			result = (leftValue as Integer).intValue / (rightValue as Integer).intValue
		}
		return new Integer(result)
	}
}

@Aspect(className=Automata)
class AutomataAspect {

	public static State currentState = null;
 
	def public static State getCurrentState() {
		return _self.currentState;
	}

	def public void setCurrentState(State st) {
		_self.currentState = st
	}

}

 
@Aspect(className=Exec)
class ExecAspect extends ExpressionAspect {


	def public void eval(Hashtable<String, Object> context,String message) {
		
		var from = (_self.transition as Transition).from as State
		var to = (_self.transition as Transition).to as State

		var auto = (_self.transition as Transition).eContainer as Automata
		
		if(auto.getCurrentState()==null){
			System.err.println("It looks like you didn't init your automata")
		}else if (auto.getCurrentState().equals(from)) {
			auto.setCurrentState(to);
			println("The transition " + (_self.transition as Transition).name + " has been fired")
		}
	}

}

@Aspect(className=Cond)
class CondAspect extends ExpressionAspect{
	def public void eval(Hashtable<String, Object> context,String message) {
		
		if(_self.^if.value(context,message) as Boolean){
			_self.then.eval(context,message)
		}
	}
}

@Aspect(className=Init)
class InitAspect extends ExpressionAspect {

	def public void eval(Hashtable<String, Object> context,String message) {
		_self.automata.currentState = _self.automata.init;
		println("Automata "+_self.automata.name+" initialized")
	}
}

@Aspect(className=Relational)
class RelationalAspect extends ExpressionAspect {

	def public Object value(Hashtable<String, Object> context,String message) {

		// Obtaining the value of the left hand expression
		var Object leftValue = null
		if (_self.left instanceof ArithmeticExpression)
			leftValue = (_self.left as ArithmeticExpression).value(context,message)
		else if (_self.left instanceof Literal)
			leftValue = (_self.left as Literal).value(context,message)
		else if (_self.left instanceof VarReference)
			leftValue = (_self.left as VarReference).value(context,message)
		else if (_self.left instanceof Relational) {
			leftValue = (_self.left as Relational).value(context,message)
		}

		// Obtaining the value of the right hand expression
		var Object rightValue = null
		if (_self.right instanceof ArithmeticExpression)
			rightValue = (_self.right as ArithmeticExpression).value(context,message)
		else if (_self.right instanceof Literal)
			rightValue = (_self.right as Literal).value(context,message)
		else if (_self.right instanceof VarReference)
			rightValue = (_self.right as VarReference).value(context,message)
		else if (_self.right instanceof Relational) {
			rightValue = (_self.left as Relational).value(context,message)
		}

		// Performing the operation
		var boolean result
		if (_self.operator.value == 0) {
			result = (leftValue as Integer).intValue > (rightValue as Integer).intValue
		} else if (_self.operator.value == 1) {
			result = (leftValue as Integer).intValue == (rightValue as Integer).intValue
		} else if (_self.operator.value == 2) {
			result = (leftValue as Integer).intValue < (rightValue as Integer).intValue
		} else if (_self.operator.value == 3) {
			result = (leftValue as Integer).intValue >= (rightValue as Integer).intValue
		} else if (_self.operator.value == 4) {
			result = (leftValue as Integer).intValue <= (rightValue as Integer).intValue
		} else if (_self.operator.value == 5) {
			result = (leftValue as Boolean).booleanValue && (rightValue as Boolean).booleanValue
		}
		return new Boolean(result)
	}
}

@Aspect(className=Write)
class WriteAspect extends ExpressionAspect{

	def public void eval(Hashtable<String, Object> context,String message) {
		var origVal=context.get(_self.^var.name.name) as Integer;
		var string=Integer.toString(origVal,2)
		var String left=""
		if(string.length>_self.length){
			throw new IllegalStateException("You can not write into the var "+_self.^var.name.name);
		}else if(string.length<_self.length){
			
			for(var i =0;i<_self.length-string.length;i++){
				left+="0";
			}
		}
		string=left+string;
		
		message.replace(message.substring(_self.initBit,_self.initBit+_self.length),string);
	}
}

@Aspect(className=Read)
class ReadAspect extends ExpressionAspect{
	
	//binary to decimal
	def public Object value(Hashtable<String, Object> context,String message) {
		
		var subtring=message.substring(_self.initBit,_self.length+_self.initBit)
		//we subpose le 
		//TODO Add this as a number.class
		var res=0;
		for(var i=0;i<=subtring.length-1;i++){
			var value=subtring.substring(i,i+1)
			if(value=='1'){
				res+=Math.pow(2,(subtring.length-i-1)).intValue;
			}
		}
		//println(message)
		//println(subtring+"-"+res);
		res
	}
	
}

@Aspect(className=VarDeclaration)
class VarDeclarationAspect extends ExpressionAspect {

	def public void eval(Hashtable<String, Object> context,String message) {
		context.put(_self.name, _self.expr.value(context,message))
	}
}

@Aspect(className=VarReference)
class VarReferenceAspect extends ExpressionAspect {

	def public Object value(Hashtable<String, Object> context,String message) {
		return context.get(_self.name.name)
	}
}
