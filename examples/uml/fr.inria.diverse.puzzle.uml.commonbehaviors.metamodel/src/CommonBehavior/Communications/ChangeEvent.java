/**
 */
package CommonBehavior.Communications;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CommonBehavior.Communications.ChangeEvent#getChangeExpression <em>Change Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see CommonBehavior.Communications.CommunicationsPackage#getChangeEvent()
 * @model
 * @generated
 */
public interface ChangeEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Change Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Expression</em>' reference.
	 * @see #setChangeExpression(ValueSpecification)
	 * @see CommonBehavior.Communications.CommunicationsPackage#getChangeEvent_ChangeExpression()
	 * @model required="true"
	 * @generated
	 */
	ValueSpecification getChangeExpression();

	/**
	 * Sets the value of the '{@link CommonBehavior.Communications.ChangeEvent#getChangeExpression <em>Change Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Expression</em>' reference.
	 * @see #getChangeExpression()
	 * @generated
	 */
	void setChangeExpression(ValueSpecification value);

} // ChangeEvent
