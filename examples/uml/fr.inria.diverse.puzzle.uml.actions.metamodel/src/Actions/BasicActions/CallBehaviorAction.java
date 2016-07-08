/**
 */
package Actions.BasicActions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Behavior Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Actions.BasicActions.CallBehaviorAction#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see Actions.BasicActions.BasicActionsPackage#getCallBehaviorAction()
 * @model
 * @generated
 */
public interface CallBehaviorAction extends CallAction {
	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' reference.
	 * @see #setBehavior(Behavior)
	 * @see Actions.BasicActions.BasicActionsPackage#getCallBehaviorAction_Behavior()
	 * @model required="true"
	 * @generated
	 */
	Behavior getBehavior();

	/**
	 * Sets the value of the '{@link Actions.BasicActions.CallBehaviorAction#getBehavior <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(Behavior value);

} // CallBehaviorAction
