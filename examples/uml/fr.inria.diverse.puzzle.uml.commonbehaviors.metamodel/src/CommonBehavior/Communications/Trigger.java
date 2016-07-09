/**
 */
package CommonBehavior.Communications;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CommonBehavior.Communications.Trigger#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see CommonBehavior.Communications.CommunicationsPackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Event)
	 * @see CommonBehavior.Communications.CommunicationsPackage#getTrigger_Event()
	 * @model required="true"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link CommonBehavior.Communications.Trigger#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

} // Trigger
