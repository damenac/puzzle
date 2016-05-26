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
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.AbstractState#getOwnerRegion <em>Owner Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subvertex</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subvertex</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getRegion_Subvertex()
	 * @see CompleteDSLPckg.AbstractState#getOwnerRegion
	 * @model opposite="ownerRegion" containment="true"
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
	 * Returns the value of the '<em><b>Owner State Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.StateMachine#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner State Machine</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner State Machine</em>' container reference.
	 * @see #setOwnerStateMachine(StateMachine)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getRegion_OwnerStateMachine()
	 * @see CompleteDSLPckg.StateMachine#getRegions
	 * @model opposite="regions" transient="false"
	 * @generated
	 */
	StateMachine getOwnerStateMachine();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.Region#getOwnerStateMachine <em>Owner State Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner State Machine</em>' container reference.
	 * @see #getOwnerStateMachine()
	 * @generated
	 */
	void setOwnerStateMachine(StateMachine value);

} // Region
