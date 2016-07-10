/**
 */
package StateMachines.ProtocolStateMachines;

import StateMachines.BehaviorStateMachines.StateMachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link StateMachines.ProtocolStateMachines.ProtocolStateMachine#getConformance <em>Conformance</em>}</li>
 * </ul>
 * </p>
 *
 * @see StateMachines.ProtocolStateMachines.ProtocolStateMachinesPackage#getProtocolStateMachine()
 * @model
 * @generated
 */
public interface ProtocolStateMachine extends StateMachine {
	/**
	 * Returns the value of the '<em><b>Conformance</b></em>' containment reference list.
	 * The list contents are of type {@link StateMachines.ProtocolStateMachines.ProtocolConformance}.
	 * It is bidirectional and its opposite is '{@link StateMachines.ProtocolStateMachines.ProtocolConformance#getSpecificMachine <em>Specific Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conformance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conformance</em>' containment reference list.
	 * @see StateMachines.ProtocolStateMachines.ProtocolStateMachinesPackage#getProtocolStateMachine_Conformance()
	 * @see StateMachines.ProtocolStateMachines.ProtocolConformance#getSpecificMachine
	 * @model opposite="specificMachine" containment="true"
	 * @generated
	 */
	EList<ProtocolConformance> getConformance();

} // ProtocolStateMachine
