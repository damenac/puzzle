/**
 */
package StateMachines.BehaviorStateMachines;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Point Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link StateMachines.BehaviorStateMachines.ConnectionPointReference#getExit <em>Exit</em>}</li>
 *   <li>{@link StateMachines.BehaviorStateMachines.ConnectionPointReference#getEntry <em>Entry</em>}</li>
 *   <li>{@link StateMachines.BehaviorStateMachines.ConnectionPointReference#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see StateMachines.BehaviorStateMachines.BehaviorStateMachinesPackage#getConnectionPointReference()
 * @model
 * @generated
 */
public interface ConnectionPointReference extends Vertex {
	/**
	 * Returns the value of the '<em><b>Exit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit</em>' reference.
	 * @see #setExit(Pseudostate)
	 * @see StateMachines.BehaviorStateMachines.BehaviorStateMachinesPackage#getConnectionPointReference_Exit()
	 * @model
	 * @generated
	 */
	Pseudostate getExit();

	/**
	 * Sets the value of the '{@link StateMachines.BehaviorStateMachines.ConnectionPointReference#getExit <em>Exit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit</em>' reference.
	 * @see #getExit()
	 * @generated
	 */
	void setExit(Pseudostate value);

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' reference.
	 * @see #setEntry(Pseudostate)
	 * @see StateMachines.BehaviorStateMachines.BehaviorStateMachinesPackage#getConnectionPointReference_Entry()
	 * @model
	 * @generated
	 */
	Pseudostate getEntry();

	/**
	 * Sets the value of the '{@link StateMachines.BehaviorStateMachines.ConnectionPointReference#getEntry <em>Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(Pseudostate value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link StateMachines.BehaviorStateMachines.State#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see StateMachines.BehaviorStateMachines.BehaviorStateMachinesPackage#getConnectionPointReference_State()
	 * @see StateMachines.BehaviorStateMachines.State#getConnection
	 * @model opposite="connection" transient="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link StateMachines.BehaviorStateMachines.ConnectionPointReference#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // ConnectionPointReference
