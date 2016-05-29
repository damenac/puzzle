/**
 */
package hfsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hfsm.Region#getOwnerState <em>Owner State</em>}</li>
 *   <li>{@link hfsm.Region#getSubvertex <em>Subvertex</em>}</li>
 * </ul>
 * </p>
 *
 * @see hfsm.HfsmPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owner State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner State</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner State</em>' reference.
	 * @see #setOwnerState(State)
	 * @see hfsm.HfsmPackage#getRegion_OwnerState()
	 * @model
	 * @generated
	 */
	State getOwnerState();

	/**
	 * Sets the value of the '{@link hfsm.Region#getOwnerState <em>Owner State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner State</em>' reference.
	 * @see #getOwnerState()
	 * @generated
	 */
	void setOwnerState(State value);

	/**
	 * Returns the value of the '<em><b>Subvertex</b></em>' containment reference list.
	 * The list contents are of type {@link hfsm.AbstractState}.
	 * It is bidirectional and its opposite is '{@link hfsm.AbstractState#getOwnerRegion <em>Owner Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subvertex</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subvertex</em>' containment reference list.
	 * @see hfsm.HfsmPackage#getRegion_Subvertex()
	 * @see hfsm.AbstractState#getOwnerRegion
	 * @model opposite="ownerRegion" containment="true"
	 * @generated
	 */
	EList<AbstractState> getSubvertex();

} // Region
