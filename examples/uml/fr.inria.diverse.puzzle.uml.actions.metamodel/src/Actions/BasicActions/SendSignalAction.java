/**
 */
package Actions.BasicActions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Signal Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Actions.BasicActions.SendSignalAction#getTarget <em>Target</em>}</li>
 *   <li>{@link Actions.BasicActions.SendSignalAction#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @see Actions.BasicActions.BasicActionsPackage#getSendSignalAction()
 * @model
 * @generated
 */
public interface SendSignalAction extends InvocationAction {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(InputPin)
	 * @see Actions.BasicActions.BasicActionsPackage#getSendSignalAction_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InputPin getTarget();

	/**
	 * Sets the value of the '{@link Actions.BasicActions.SendSignalAction#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(InputPin value);

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
	 * @see Actions.BasicActions.BasicActionsPackage#getSendSignalAction_Signal()
	 * @model required="true"
	 * @generated
	 */
	Signal getSignal();

	/**
	 * Sets the value of the '{@link Actions.BasicActions.SendSignalAction#getSignal <em>Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' reference.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(Signal value);

} // SendSignalAction
