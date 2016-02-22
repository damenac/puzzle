/**
 */
package ConstraintModule.util;

import ConstraintModule.*;

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
 * @see ConstraintModule.ConstraintModulePackage
 * @generated
 */
public class ConstraintModuleSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConstraintModulePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintModuleSwitch() {
		if (modelPackage == null) {
			modelPackage = ConstraintModulePackage.eINSTANCE;
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
			case ConstraintModulePackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintModulePackage.RELATIONAL_CONSTRAINT: {
				RelationalConstraint relationalConstraint = (RelationalConstraint)theEObject;
				T result = caseRelationalConstraint(relationalConstraint);
				if (result == null) result = caseConstraint(relationalConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintModulePackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintModulePackage.PROGRAM: {
				Program program = (Program)theEObject;
				T result = caseProgram(program);
				if (result == null) result = caseStatement(program);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintModulePackage.CONDITIONAL: {
				Conditional conditional = (Conditional)theEObject;
				T result = caseConditional(conditional);
				if (result == null) result = caseStatement(conditional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintModulePackage.LOOP: {
				Loop loop = (Loop)theEObject;
				T result = caseLoop(loop);
				if (result == null) result = caseStatement(loop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintModulePackage.VAR_DECL: {
				VarDecl varDecl = (VarDecl)theEObject;
				T result = caseVarDecl(varDecl);
				if (result == null) result = caseStatement(varDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintModulePackage.VAR_REFERENCE: {
				VarReference varReference = (VarReference)theEObject;
				T result = caseVarReference(varReference);
				if (result == null) result = caseExpression(varReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintModulePackage.CONSOLE_OUTPUT: {
				ConsoleOutput consoleOutput = (ConsoleOutput)theEObject;
				T result = caseConsoleOutput(consoleOutput);
				if (result == null) result = caseStatement(consoleOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintModulePackage.PRINTLN: {
				Println println = (Println)theEObject;
				T result = casePrintln(println);
				if (result == null) result = caseConsoleOutput(println);
				if (result == null) result = caseStatement(println);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintModulePackage.PRINT: {
				Print print = (Print)theEObject;
				T result = casePrint(print);
				if (result == null) result = caseConsoleOutput(print);
				if (result == null) result = caseStatement(print);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintModulePackage.ASSIGNATION: {
				Assignation assignation = (Assignation)theEObject;
				T result = caseAssignation(assignation);
				if (result == null) result = caseStatement(assignation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintModulePackage.WAIT: {
				Wait wait = (Wait)theEObject;
				T result = caseWait(wait);
				if (result == null) result = caseStatement(wait);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintModulePackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintModulePackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relational Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relational Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationalConstraint(RelationalConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgram(Program object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditional(Conditional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoop(Loop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarDecl(VarDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarReference(VarReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Console Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Console Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsoleOutput(ConsoleOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Println</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Println</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrintln(Println object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Print</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Print</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrint(Print object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignation(Assignation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wait</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wait</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWait(Wait object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
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

} //ConstraintModuleSwitch
