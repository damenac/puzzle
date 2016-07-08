/**
 */
package Actions.IntermediateActions;

import Actions.BasicActions.Action;
import Actions.BasicActions.InputPin;
import Actions.BasicActions.OutputPin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Identity Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Actions.IntermediateActions.TestIdentityAction#getResult <em>Result</em>}</li>
 *   <li>{@link Actions.IntermediateActions.TestIdentityAction#getFirst <em>First</em>}</li>
 *   <li>{@link Actions.IntermediateActions.TestIdentityAction#getSecond <em>Second</em>}</li>
 * </ul>
 * </p>
 *
 * @see Actions.IntermediateActions.IntermediateActionsPackage#getTestIdentityAction()
 * @model
 * @generated
 */
public interface TestIdentityAction extends Action {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(OutputPin)
	 * @see Actions.IntermediateActions.IntermediateActionsPackage#getTestIdentityAction_Result()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link Actions.IntermediateActions.TestIdentityAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

	/**
	 * Returns the value of the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' containment reference.
	 * @see #setFirst(InputPin)
	 * @see Actions.IntermediateActions.IntermediateActionsPackage#getTestIdentityAction_First()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InputPin getFirst();

	/**
	 * Sets the value of the '{@link Actions.IntermediateActions.TestIdentityAction#getFirst <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' containment reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(InputPin value);

	/**
	 * Returns the value of the '<em><b>Second</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' containment reference.
	 * @see #setSecond(InputPin)
	 * @see Actions.IntermediateActions.IntermediateActionsPackage#getTestIdentityAction_Second()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InputPin getSecond();

	/**
	 * Sets the value of the '{@link Actions.IntermediateActions.TestIdentityAction#getSecond <em>Second</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' containment reference.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(InputPin value);

} // TestIdentityAction
