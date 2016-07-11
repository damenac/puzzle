/**
 */
package CompleteDSLPckg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.SignalEvent#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getSignalEvent()
 * @model
 * @generated
 */
public interface SignalEvent extends MessageEvent {
	/**
	 * Returns the value of the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' reference.
	 * @see #setSignal(Signal)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getSignalEvent_Signal()
	 * @model required="true"
	 * @generated
	 */
	Signal getSignal();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.SignalEvent#getSignal <em>Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' reference.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(Signal value);

} // SignalEvent
