/**
 */
package StateMachines.ProtocolStateMachines;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Conformance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link StateMachines.ProtocolStateMachines.ProtocolConformance#getSpecificMachine <em>Specific Machine</em>}</li>
 *   <li>{@link StateMachines.ProtocolStateMachines.ProtocolConformance#getGeneralMachine <em>General Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @see StateMachines.ProtocolStateMachines.ProtocolStateMachinesPackage#getProtocolConformance()
 * @model
 * @generated
 */
public interface ProtocolConformance extends DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Specific Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link StateMachines.ProtocolStateMachines.ProtocolStateMachine#getConformance <em>Conformance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific Machine</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Machine</em>' container reference.
	 * @see #setSpecificMachine(ProtocolStateMachine)
	 * @see StateMachines.ProtocolStateMachines.ProtocolStateMachinesPackage#getProtocolConformance_SpecificMachine()
	 * @see StateMachines.ProtocolStateMachines.ProtocolStateMachine#getConformance
	 * @model opposite="conformance" required="true" transient="false"
	 * @generated
	 */
	ProtocolStateMachine getSpecificMachine();

	/**
	 * Sets the value of the '{@link StateMachines.ProtocolStateMachines.ProtocolConformance#getSpecificMachine <em>Specific Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Machine</em>' container reference.
	 * @see #getSpecificMachine()
	 * @generated
	 */
	void setSpecificMachine(ProtocolStateMachine value);

	/**
	 * Returns the value of the '<em><b>General Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Machine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Machine</em>' reference.
	 * @see #setGeneralMachine(ProtocolStateMachine)
	 * @see StateMachines.ProtocolStateMachines.ProtocolStateMachinesPackage#getProtocolConformance_GeneralMachine()
	 * @model required="true"
	 * @generated
	 */
	ProtocolStateMachine getGeneralMachine();

	/**
	 * Sets the value of the '{@link StateMachines.ProtocolStateMachines.ProtocolConformance#getGeneralMachine <em>General Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Machine</em>' reference.
	 * @see #getGeneralMachine()
	 * @generated
	 */
	void setGeneralMachine(ProtocolStateMachine value);

} // ProtocolConformance
