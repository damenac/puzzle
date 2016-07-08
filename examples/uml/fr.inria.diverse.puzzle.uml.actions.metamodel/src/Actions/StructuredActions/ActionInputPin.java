/**
 */
package Actions.StructuredActions;

import Actions.BasicActions.Action;
import Actions.BasicActions.InputPin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Input Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Actions.StructuredActions.ActionInputPin#getFromAction <em>From Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see Actions.StructuredActions.StructuredActionsPackage#getActionInputPin()
 * @model
 * @generated
 */
public interface ActionInputPin extends InputPin {
	/**
	 * Returns the value of the '<em><b>From Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Action</em>' containment reference.
	 * @see #setFromAction(Action)
	 * @see Actions.StructuredActions.StructuredActionsPackage#getActionInputPin_FromAction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Action getFromAction();

	/**
	 * Sets the value of the '{@link Actions.StructuredActions.ActionInputPin#getFromAction <em>From Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Action</em>' containment reference.
	 * @see #getFromAction()
	 * @generated
	 */
	void setFromAction(Action value);

} // ActionInputPin
