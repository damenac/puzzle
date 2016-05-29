/**
 */
package CompleteDSLPckg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.Region#getSubvertex <em>Subvertex</em>}</li>
 *   <li>{@link CompleteDSLPckg.Region#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link CompleteDSLPckg.Region#getOwnerStateMachine <em>Owner State Machine</em>}</li>
 *   <li>{@link CompleteDSLPckg.Region#getOwnerState <em>Owner State</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Subvertex</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.AbstractState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subvertex</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subvertex</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getRegion_Subvertex()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractState> getSubvertex();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getRegion_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Owner State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner State Machine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner State Machine</em>' reference.
	 * @see #setOwnerStateMachine(StateMachine)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getRegion_OwnerStateMachine()
	 * @model
	 * @generated
	 */
	StateMachine getOwnerStateMachine();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.Region#getOwnerStateMachine <em>Owner State Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner State Machine</em>' reference.
	 * @see #getOwnerStateMachine()
	 * @generated
	 */
	void setOwnerStateMachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Owner State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner State</em>' reference.
	 * @see #setOwnerState(State)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getRegion_OwnerState()
	 * @model
	 * @generated
	 */
	State getOwnerState();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.Region#getOwnerState <em>Owner State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner State</em>' reference.
	 * @see #getOwnerState()
	 * @generated
	 */
	void setOwnerState(State value);

} // Region
