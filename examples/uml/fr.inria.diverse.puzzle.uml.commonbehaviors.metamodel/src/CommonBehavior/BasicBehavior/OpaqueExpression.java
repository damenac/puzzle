/**
 */
package CommonBehavior.BasicBehavior;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CommonBehavior.BasicBehavior.OpaqueExpression#getResult <em>Result</em>}</li>
 *   <li>{@link CommonBehavior.BasicBehavior.OpaqueExpression#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see CommonBehavior.BasicBehavior.BasicBehaviorPackage#getOpaqueExpression()
 * @model
 * @generated
 */
public interface OpaqueExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' reference.
	 * @see #setResult(Parameter)
	 * @see CommonBehavior.BasicBehavior.BasicBehaviorPackage#getOpaqueExpression_Result()
	 * @model
	 * @generated
	 */
	Parameter getResult();

	/**
	 * Sets the value of the '{@link CommonBehavior.BasicBehavior.OpaqueExpression#getResult <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Parameter value);

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' reference.
	 * @see #setBehavior(Behavior)
	 * @see CommonBehavior.BasicBehavior.BasicBehaviorPackage#getOpaqueExpression_Behavior()
	 * @model
	 * @generated
	 */
	Behavior getBehavior();

	/**
	 * Sets the value of the '{@link CommonBehavior.BasicBehavior.OpaqueExpression#getBehavior <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(Behavior value);

} // OpaqueExpression
