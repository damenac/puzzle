/**
 */
package Actions.CompleteActions;

import Actions.BasicActions.OutputPin;

import Actions.IntermediateActions.CreateLinkAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Link Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Actions.CompleteActions.CreateLinkObjectAction#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see Actions.CompleteActions.CompleteActionsPackage#getCreateLinkObjectAction()
 * @model
 * @generated
 */
public interface CreateLinkObjectAction extends CreateLinkAction {
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
	 * @see Actions.CompleteActions.CompleteActionsPackage#getCreateLinkObjectAction_Result()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link Actions.CompleteActions.CreateLinkObjectAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

} // CreateLinkObjectAction
