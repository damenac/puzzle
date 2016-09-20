/**
 */
package CompleteDSLPckg.util;

import CompleteDSLPckg.ArithmeticExpr;
import CompleteDSLPckg.Back;
import CompleteDSLPckg.BinaryExpr;
import CompleteDSLPckg.BooleanExpr;
import CompleteDSLPckg.CompleteDSLPckgPackage;
import CompleteDSLPckg.Expression;
import CompleteDSLPckg.Forward;
import CompleteDSLPckg.Instruction;
import CompleteDSLPckg.Left;
import CompleteDSLPckg.Literal;
import CompleteDSLPckg.LogoProgram;
import CompleteDSLPckg.Primitive;
import CompleteDSLPckg.Right;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see CompleteDSLPckg.CompleteDSLPckgPackage
 * @generated
 */
public class CompleteDSLPckgSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CompleteDSLPckgPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompleteDSLPckgSwitch() {
		if (modelPackage == null) {
			modelPackage = CompleteDSLPckgPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CompleteDSLPckgPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteDSLPckgPackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = caseExpression(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteDSLPckgPackage.INTEGER: {
				CompleteDSLPckg.Integer integer = (CompleteDSLPckg.Integer)theEObject;
				T result = caseInteger(integer);
				if (result == null) result = caseLiteral(integer);
				if (result == null) result = caseExpression(integer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteDSLPckgPackage.VOID: {
				CompleteDSLPckg.Void void_ = (CompleteDSLPckg.Void)theEObject;
				T result = caseVoid(void_);
				if (result == null) result = caseLiteral(void_);
				if (result == null) result = caseExpression(void_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteDSLPckgPackage.DOUBLE: {
				CompleteDSLPckg.Double double_ = (CompleteDSLPckg.Double)theEObject;
				T result = caseDouble(double_);
				if (result == null) result = caseLiteral(double_);
				if (result == null) result = caseExpression(double_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteDSLPckgPackage.STRING: {
				CompleteDSLPckg.String string = (CompleteDSLPckg.String)theEObject;
				T result = caseString(string);
				if (result == null) result = caseLiteral(string);
				if (result == null) result = caseExpression(string);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteDSLPckgPackage.BOOLEAN: {
				CompleteDSLPckg.Boolean boolean_ = (CompleteDSLPckg.Boolean)theEObject;
				T result = caseBoolean(boolean_);
				if (result == null) result = caseLiteral(boolean_);
				if (result == null) result = caseExpression(boolean_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteDSLPckgPackage.LOGO_PROGRAM: {
				LogoProgram logoProgram = (LogoProgram)theEObject;
				T result = caseLogoProgram(logoProgram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteDSLPckgPackage.INSTRUCTION: {
				Instruction instruction = (Instruction)theEObject;
				T result = caseInstruction(instruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteDSLPckgPackage.PRIMITIVE: {
				Primitive primitive = (Primitive)theEObject;
				T result = casePrimitive(primitive);
				if (result == null) result = caseInstruction(primitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteDSLPckgPackage.FORWARD: {
				Forward forward = (Forward)theEObject;
				T result = caseForward(forward);
				if (result == null) result = casePrimitive(forward);
				if (result == null) result = caseInstruction(forward);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteDSLPckgPackage.BACK: {
				Back back = (Back)theEObject;
				T result = caseBack(back);
				if (result == null) result = casePrimitive(back);
				if (result == null) result = caseInstruction(back);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteDSLPckgPackage.LEFT: {
				Left left = (Left)theEObject;
				T result = caseLeft(left);
				if (result == null) result = casePrimitive(left);
				if (result == null) result = caseInstruction(left);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteDSLPckgPackage.RIGHT: {
				Right right = (Right)theEObject;
				T result = caseRight(right);
				if (result == null) result = casePrimitive(right);
				if (result == null) result = caseInstruction(right);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteDSLPckgPackage.BINARY_EXPR: {
				BinaryExpr binaryExpr = (BinaryExpr)theEObject;
				T result = caseBinaryExpr(binaryExpr);
				if (result == null) result = caseExpression(binaryExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteDSLPckgPackage.ARITHMETIC_EXPR: {
				ArithmeticExpr arithmeticExpr = (ArithmeticExpr)theEObject;
				T result = caseArithmeticExpr(arithmeticExpr);
				if (result == null) result = caseBinaryExpr(arithmeticExpr);
				if (result == null) result = caseExpression(arithmeticExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompleteDSLPckgPackage.BOOLEAN_EXPR: {
				BooleanExpr booleanExpr = (BooleanExpr)theEObject;
				T result = caseBooleanExpr(booleanExpr);
				if (result == null) result = caseBinaryExpr(booleanExpr);
				if (result == null) result = caseExpression(booleanExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger(CompleteDSLPckg.Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Void</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Void</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoid(CompleteDSLPckg.Void object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble(CompleteDSLPckg.Double object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString(CompleteDSLPckg.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(CompleteDSLPckg.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logo Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logo Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogoProgram(LogoProgram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstruction(Instruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitive(Primitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForward(Forward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Back</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Back</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBack(Back object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeft(Left object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRight(Right object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryExpr(BinaryExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmeticExpr(ArithmeticExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanExpr(BooleanExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CompleteDSLPckgSwitch
