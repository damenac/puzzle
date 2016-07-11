/**
 */
package StateMachines.BehaviorStateMachines;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link StateMachines.BehaviorStateMachines.Region#getSubvertex <em>Subvertex</em>}</li>
 *   <li>{@link StateMachines.BehaviorStateMachines.Region#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link StateMachines.BehaviorStateMachines.Region#getTransition <em>Transition</em>}</li>
 *   <li>{@link StateMachines.BehaviorStateMachines.Region#getState <em>State</em>}</li>
 *   <li>{@link StateMachines.BehaviorStateMachines.Region#getExtendedRegion <em>Extended Region</em>}</li>
 * </ul>
 * </p>
 *
 * @see StateMachines.BehaviorStateMachines.BehaviorStateMachinesPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends Namespace, RedefinableElement {
	/**
	 * Returns the value of the '<em><b>Subvertex</b></em>' containment reference list.
	 * The list contents are of type {@link StateMachines.BehaviorStateMachines.Vertex}.
	 * It is bidirectional and its opposite is '{@link StateMachines.BehaviorStateMachines.Vertex#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subvertex</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subvertex</em>' containment reference list.
	 * @see StateMachines.BehaviorStateMachines.BehaviorStateMachinesPackage#getRegion_Subvertex()
	 * @see StateMachines.BehaviorStateMachines.Vertex#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<Vertex> getSubvertex();

	/**
	 * Returns the value of the '<em><b>State Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link StateMachines.BehaviorStateMachines.StateMachine#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine</em>' container reference.
	 * @see #setStateMachine(StateMachine)
	 * @see StateMachines.BehaviorStateMachines.BehaviorStateMachinesPackage#getRegion_StateMachine()
	 * @see StateMachines.BehaviorStateMachines.StateMachine#getRegion
	 * @model opposite="region" transient="false"
	 * @generated
	 */
	StateMachine getStateMachine();

	/**
	 * Sets the value of the '{@link StateMachines.BehaviorStateMachines.Region#getStateMachine <em>State Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine</em>' container reference.
	 * @see #getStateMachine()
	 * @generated
	 */
	void setStateMachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link StateMachines.BehaviorStateMachines.Transition}.
	 * It is bidirectional and its opposite is '{@link StateMachines.BehaviorStateMachines.Transition#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see StateMachines.BehaviorStateMachines.BehaviorStateMachinesPackage#getRegion_Transition()
	 * @see StateMachines.BehaviorStateMachines.Transition#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<Transition> getTransition();

	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link StateMachines.BehaviorStateMachines.State#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see StateMachines.BehaviorStateMachines.BehaviorStateMachinesPackage#getRegion_State()
	 * @see StateMachines.BehaviorStateMachines.State#getRegion
	 * @model opposite="region" transient="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link StateMachines.BehaviorStateMachines.Region#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Extended Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Region</em>' reference.
	 * @see #setExtendedRegion(Region)
	 * @see StateMachines.BehaviorStateMachines.BehaviorStateMachinesPackage#getRegion_ExtendedRegion()
	 * @model
	 * @generated
	 */
	Region getExtendedRegion();

	/**
	 * Sets the value of the '{@link StateMachines.BehaviorStateMachines.Region#getExtendedRegion <em>Extended Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Region</em>' reference.
	 * @see #getExtendedRegion()
	 * @generated
	 */
	void setExtendedRegion(Region value);

} // Region
