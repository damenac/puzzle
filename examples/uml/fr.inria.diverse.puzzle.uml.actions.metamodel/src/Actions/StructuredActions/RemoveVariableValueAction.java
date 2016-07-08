/**
 */
package Actions.StructuredActions;

import Actions.BasicActions.InputPin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Variable Value Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Actions.StructuredActions.RemoveVariableValueAction#getRemoveAt <em>Remove At</em>}</li>
 * </ul>
 * </p>
 *
 * @see Actions.StructuredActions.StructuredActionsPackage#getRemoveVariableValueAction()
 * @model
 * @generated
 */
public interface RemoveVariableValueAction extends WriteVariableAction {
	/**
	 * Returns the value of the '<em><b>Remove At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remove At</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove At</em>' containment reference.
	 * @see #setRemoveAt(InputPin)
	 * @see Actions.StructuredActions.StructuredActionsPackage#getRemoveVariableValueAction_RemoveAt()
	 * @model containment="true"
	 * @generated
	 */
	InputPin getRemoveAt();

	/**
	 * Sets the value of the '{@link Actions.StructuredActions.RemoveVariableValueAction#getRemoveAt <em>Remove At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove At</em>' containment reference.
	 * @see #getRemoveAt()
	 * @generated
	 */
	void setRemoveAt(InputPin value);

} // RemoveVariableValueAction
