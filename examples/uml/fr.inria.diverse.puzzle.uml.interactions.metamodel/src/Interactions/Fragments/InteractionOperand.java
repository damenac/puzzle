/**
 */
package Interactions.Fragments;

import Interactions.BasicInteractions.InteractionFragment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Interactions.Fragments.InteractionOperand#getFragment <em>Fragment</em>}</li>
 *   <li>{@link Interactions.Fragments.InteractionOperand#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @see Interactions.Fragments.FragmentsPackage#getInteractionOperand()
 * @model
 * @generated
 */
public interface InteractionOperand extends Namespace {
	/**
	 * Returns the value of the '<em><b>Fragment</b></em>' containment reference list.
	 * The list contents are of type {@link Interactions.BasicInteractions.InteractionFragment}.
	 * It is bidirectional and its opposite is '{@link Interactions.BasicInteractions.InteractionFragment#getEnclosingOperand <em>Enclosing Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragment</em>' containment reference list.
	 * @see Interactions.Fragments.FragmentsPackage#getInteractionOperand_Fragment()
	 * @see Interactions.BasicInteractions.InteractionFragment#getEnclosingOperand
	 * @model opposite="enclosingOperand" containment="true"
	 * @generated
	 */
	EList<InteractionFragment> getFragment();

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(InteractionConstraint)
	 * @see Interactions.Fragments.FragmentsPackage#getInteractionOperand_Guard()
	 * @model containment="true"
	 * @generated
	 */
	InteractionConstraint getGuard();

	/**
	 * Sets the value of the '{@link Interactions.Fragments.InteractionOperand#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(InteractionConstraint value);

} // InteractionOperand
