/**
 */
package StateMachineModule;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link StateMachineModule.State#getDoActivity <em>Do Activity</em>}</li>
 *   <li>{@link StateMachineModule.State#getEntry <em>Entry</em>}</li>
 *   <li>{@link StateMachineModule.State#getExit <em>Exit</em>}</li>
 *   <li>{@link StateMachineModule.State#getOwnedRegions <em>Owned Regions</em>}</li>
 * </ul>
 * </p>
 *
 * @see StateMachineModule.StateMachineModulePackage#getState()
 * @model
 * @generated
 */
public interface State extends AbstractState {
	/**
	 * Returns the value of the '<em><b>Do Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Activity</em>' containment reference.
	 * @see #setDoActivity(Program)
	 * @see StateMachineModule.StateMachineModulePackage#getState_DoActivity()
	 * @model containment="true"
	 * @generated
	 */
	Program getDoActivity();

	/**
	 * Sets the value of the '{@link StateMachineModule.State#getDoActivity <em>Do Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Activity</em>' containment reference.
	 * @see #getDoActivity()
	 * @generated
	 */
	void setDoActivity(Program value);

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference.
	 * @see #setEntry(Program)
	 * @see StateMachineModule.StateMachineModulePackage#getState_Entry()
	 * @model containment="true"
	 * @generated
	 */
	Program getEntry();

	/**
	 * Sets the value of the '{@link StateMachineModule.State#getEntry <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' containment reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(Program value);

	/**
	 * Returns the value of the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit</em>' containment reference.
	 * @see #setExit(Program)
	 * @see StateMachineModule.StateMachineModulePackage#getState_Exit()
	 * @model containment="true"
	 * @generated
	 */
	Program getExit();

	/**
	 * Sets the value of the '{@link StateMachineModule.State#getExit <em>Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit</em>' containment reference.
	 * @see #getExit()
	 * @generated
	 */
	void setExit(Program value);

	/**
	 * Returns the value of the '<em><b>Owned Regions</b></em>' containment reference list.
	 * The list contents are of type {@link StateMachineModule.Region}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Regions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Regions</em>' containment reference list.
	 * @see StateMachineModule.StateMachineModulePackage#getState_OwnedRegions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Region> getOwnedRegions();

} // State
