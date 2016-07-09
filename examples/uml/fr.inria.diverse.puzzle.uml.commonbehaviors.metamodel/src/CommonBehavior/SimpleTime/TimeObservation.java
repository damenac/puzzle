/**
 */
package CommonBehavior.SimpleTime;

import CommonBehavior.Communications.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CommonBehavior.SimpleTime.TimeObservation#isFirstEvent <em>First Event</em>}</li>
 *   <li>{@link CommonBehavior.SimpleTime.TimeObservation#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see CommonBehavior.SimpleTime.SimpleTimePackage#getTimeObservation()
 * @model
 * @generated
 */
public interface TimeObservation extends Observation {
	/**
	 * Returns the value of the '<em><b>First Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Event</em>' attribute.
	 * @see #setFirstEvent(boolean)
	 * @see CommonBehavior.SimpleTime.SimpleTimePackage#getTimeObservation_FirstEvent()
	 * @model
	 * @generated
	 */
	boolean isFirstEvent();

	/**
	 * Sets the value of the '{@link CommonBehavior.SimpleTime.TimeObservation#isFirstEvent <em>First Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Event</em>' attribute.
	 * @see #isFirstEvent()
	 * @generated
	 */
	void setFirstEvent(boolean value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(NamedElement)
	 * @see CommonBehavior.SimpleTime.SimpleTimePackage#getTimeObservation_Event()
	 * @model required="true"
	 * @generated
	 */
	NamedElement getEvent();

	/**
	 * Sets the value of the '{@link CommonBehavior.SimpleTime.TimeObservation#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(NamedElement value);

} // TimeObservation
