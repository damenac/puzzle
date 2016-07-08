/**
 */
package Actions.StructuredActions;

import Actions.BasicActions.Action;
import Actions.BasicActions.InputPin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raise Exception Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Actions.StructuredActions.RaiseExceptionAction#getException <em>Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @see Actions.StructuredActions.StructuredActionsPackage#getRaiseExceptionAction()
 * @model
 * @generated
 */
public interface RaiseExceptionAction extends Action {
	/**
	 * Returns the value of the '<em><b>Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' containment reference.
	 * @see #setException(InputPin)
	 * @see Actions.StructuredActions.StructuredActionsPackage#getRaiseExceptionAction_Exception()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InputPin getException();

	/**
	 * Sets the value of the '{@link Actions.StructuredActions.RaiseExceptionAction#getException <em>Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception</em>' containment reference.
	 * @see #getException()
	 * @generated
	 */
	void setException(InputPin value);

} // RaiseExceptionAction
