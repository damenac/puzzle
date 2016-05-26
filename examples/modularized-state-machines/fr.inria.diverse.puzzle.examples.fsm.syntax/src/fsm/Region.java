/**
 */
package fsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fsm.Region#getSubvertex <em>Subvertex</em>}</li>
 *   <li>{@link fsm.Region#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link fsm.Region#getOwnerStateMachine <em>Owner State Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @see fsm.FsmPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Subvertex</b></em>' containment reference list.
	 * The list contents are of type {@link fsm.AbstractState}.
	 * It is bidirectional and its opposite is '{@link fsm.AbstractState#getOwnerRegion <em>Owner Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subvertex</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subvertex</em>' containment reference list.
	 * @see fsm.FsmPackage#getRegion_Subvertex()
	 * @see fsm.AbstractState#getOwnerRegion
	 * @model opposite="ownerRegion" containment="true"
	 * @generated
	 */
	EList<AbstractState> getSubvertex();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link fsm.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see fsm.FsmPackage#getRegion_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Owner State Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fsm.StateMachine#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner State Machine</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner State Machine</em>' container reference.
	 * @see #setOwnerStateMachine(StateMachine)
	 * @see fsm.FsmPackage#getRegion_OwnerStateMachine()
	 * @see fsm.StateMachine#getRegions
	 * @model opposite="regions" transient="false"
	 * @generated
	 */
	StateMachine getOwnerStateMachine();

	/**
	 * Sets the value of the '{@link fsm.Region#getOwnerStateMachine <em>Owner State Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner State Machine</em>' container reference.
	 * @see #getOwnerStateMachine()
	 * @generated
	 */
	void setOwnerStateMachine(StateMachine value);

} // Region
