/**
 */
package Actions.CompleteActions;

import Actions.BasicActions.Action;
import Actions.BasicActions.InputPin;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reply Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Actions.CompleteActions.ReplyAction#getReturnInformation <em>Return Information</em>}</li>
 *   <li>{@link Actions.CompleteActions.ReplyAction#getReplyValue <em>Reply Value</em>}</li>
 *   <li>{@link Actions.CompleteActions.ReplyAction#getReplyToCall <em>Reply To Call</em>}</li>
 * </ul>
 * </p>
 *
 * @see Actions.CompleteActions.CompleteActionsPackage#getReplyAction()
 * @model
 * @generated
 */
public interface ReplyAction extends Action {
	/**
	 * Returns the value of the '<em><b>Return Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Information</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Information</em>' containment reference.
	 * @see #setReturnInformation(InputPin)
	 * @see Actions.CompleteActions.CompleteActionsPackage#getReplyAction_ReturnInformation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InputPin getReturnInformation();

	/**
	 * Sets the value of the '{@link Actions.CompleteActions.ReplyAction#getReturnInformation <em>Return Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Information</em>' containment reference.
	 * @see #getReturnInformation()
	 * @generated
	 */
	void setReturnInformation(InputPin value);

	/**
	 * Returns the value of the '<em><b>Reply Value</b></em>' containment reference list.
	 * The list contents are of type {@link Actions.BasicActions.InputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reply Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply Value</em>' containment reference list.
	 * @see Actions.CompleteActions.CompleteActionsPackage#getReplyAction_ReplyValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputPin> getReplyValue();

	/**
	 * Returns the value of the '<em><b>Reply To Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reply To Call</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply To Call</em>' reference.
	 * @see #setReplyToCall(Trigger)
	 * @see Actions.CompleteActions.CompleteActionsPackage#getReplyAction_ReplyToCall()
	 * @model required="true"
	 * @generated
	 */
	Trigger getReplyToCall();

	/**
	 * Sets the value of the '{@link Actions.CompleteActions.ReplyAction#getReplyToCall <em>Reply To Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reply To Call</em>' reference.
	 * @see #getReplyToCall()
	 * @generated
	 */
	void setReplyToCall(Trigger value);

} // ReplyAction
