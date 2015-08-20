/**
 */
package rhapsody;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rhapsody.Region#getSubvertex <em>Subvertex</em>}</li>
 *   <li>{@link rhapsody.Region#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link rhapsody.Region#getOwnerState <em>Owner State</em>}</li>
 * </ul>
 * </p>
 *
 * @see rhapsody.RhapsodyPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Subvertex</b></em>' containment reference list.
	 * The list contents are of type {@link rhapsody.AbstractState}.
	 * It is bidirectional and its opposite is '{@link rhapsody.AbstractState#getOwnerRegion <em>Owner Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subvertex</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subvertex</em>' containment reference list.
	 * @see rhapsody.RhapsodyPackage#getRegion_Subvertex()
	 * @see rhapsody.AbstractState#getOwnerRegion
	 * @model opposite="ownerRegion" containment="true"
	 * @generated
	 */
	EList<AbstractState> getSubvertex();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link rhapsody.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see rhapsody.RhapsodyPackage#getRegion_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Owner State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link rhapsody.State#getOwnedRegions <em>Owned Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner State</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner State</em>' container reference.
	 * @see #setOwnerState(State)
	 * @see rhapsody.RhapsodyPackage#getRegion_OwnerState()
	 * @see rhapsody.State#getOwnedRegions
	 * @model opposite="ownedRegions" transient="false"
	 * @generated
	 */
	State getOwnerState();

	/**
	 * Sets the value of the '{@link rhapsody.Region#getOwnerState <em>Owner State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner State</em>' container reference.
	 * @see #getOwnerState()
	 * @generated
	 */
	void setOwnerState(State value);

} // Region
