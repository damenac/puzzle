/**
 */
package StateMachines.BehaviorStateMachines;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudostate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link StateMachines.BehaviorStateMachines.Pseudostate#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see StateMachines.BehaviorStateMachines.BehaviorStateMachinesPackage#getPseudostate()
 * @model
 * @generated
 */
public interface Pseudostate extends Vertex {
	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link StateMachines.BehaviorStateMachines.State#getConnectionPoint <em>Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see StateMachines.BehaviorStateMachines.BehaviorStateMachinesPackage#getPseudostate_State()
	 * @see StateMachines.BehaviorStateMachines.State#getConnectionPoint
	 * @model opposite="connectionPoint" transient="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link StateMachines.BehaviorStateMachines.Pseudostate#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // Pseudostate
