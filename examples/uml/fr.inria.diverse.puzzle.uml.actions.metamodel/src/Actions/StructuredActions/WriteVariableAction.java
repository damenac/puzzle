/**
 */
package Actions.StructuredActions;

import Actions.BasicActions.InputPin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write Variable Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Actions.StructuredActions.WriteVariableAction#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see Actions.StructuredActions.StructuredActionsPackage#getWriteVariableAction()
 * @model
 * @generated
 */
public interface WriteVariableAction extends VariableAction {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(InputPin)
	 * @see Actions.StructuredActions.StructuredActionsPackage#getWriteVariableAction_Value()
	 * @model containment="true"
	 * @generated
	 */
	InputPin getValue();

	/**
	 * Sets the value of the '{@link Actions.StructuredActions.WriteVariableAction#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(InputPin value);

} // WriteVariableAction
