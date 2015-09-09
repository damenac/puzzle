/**
 */
package vm.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import vm.*;

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
 * @see vm.VmPackage
 * @generated
 */
public class VmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmSwitch() {
		if (modelPackage == null) {
			modelPackage = VmPackage.eINSTANCE;
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
			case VmPackage.PNAMED_ELEMENT: {
				PNamedElement pNamedElement = (PNamedElement)theEObject;
				T result = casePNamedElement(pNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmPackage.PFEATURE_MODEL: {
				PFeatureModel pFeatureModel = (PFeatureModel)theEObject;
				T result = casePFeatureModel(pFeatureModel);
				if (result == null) result = casePNamedElement(pFeatureModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmPackage.PFEATURE: {
				PFeature pFeature = (PFeature)theEObject;
				T result = casePFeature(pFeature);
				if (result == null) result = casePNamedElement(pFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmPackage.PFEATURE_GROUP: {
				PFeatureGroup pFeatureGroup = (PFeatureGroup)theEObject;
				T result = casePFeatureGroup(pFeatureGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmPackage.PCONSTRAINT: {
				PConstraint pConstraint = (PConstraint)theEObject;
				T result = casePConstraint(pConstraint);
				if (result == null) result = casePNamedElement(pConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmPackage.PBOOLEAN_EXPRESSION: {
				PBooleanExpression pBooleanExpression = (PBooleanExpression)theEObject;
				T result = casePBooleanExpression(pBooleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmPackage.PFEATURE_REF: {
				PFeatureRef pFeatureRef = (PFeatureRef)theEObject;
				T result = casePFeatureRef(pFeatureRef);
				if (result == null) result = casePBooleanExpression(pFeatureRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmPackage.PUNARY_EXPRESSION: {
				PUnaryExpression pUnaryExpression = (PUnaryExpression)theEObject;
				T result = casePUnaryExpression(pUnaryExpression);
				if (result == null) result = casePBooleanExpression(pUnaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmPackage.PBINARY_EXPRESSION: {
				PBinaryExpression pBinaryExpression = (PBinaryExpression)theEObject;
				T result = casePBinaryExpression(pBinaryExpression);
				if (result == null) result = casePBooleanExpression(pBinaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PNamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PNamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePNamedElement(PNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PFeature Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PFeature Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePFeatureModel(PFeatureModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PFeature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PFeature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePFeature(PFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PFeature Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PFeature Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePFeatureGroup(PFeatureGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PConstraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PConstraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePConstraint(PConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PBoolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PBoolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePBooleanExpression(PBooleanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PFeature Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PFeature Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePFeatureRef(PFeatureRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PUnary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PUnary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePUnaryExpression(PUnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PBinary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PBinary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePBinaryExpression(PBinaryExpression object) {
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

} //VmSwitch
