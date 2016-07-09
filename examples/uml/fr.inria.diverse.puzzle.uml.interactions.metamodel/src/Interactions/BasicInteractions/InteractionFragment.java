/**
 */
package Interactions.BasicInteractions;

import Interactions.Fragments.InteractionOperand;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Interactions.BasicInteractions.InteractionFragment#getCovered <em>Covered</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.InteractionFragment#getGeneralOrdering <em>General Ordering</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.InteractionFragment#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getInteractionFragment()
 * @model abstract="true"
 * @generated
 */
public interface InteractionFragment extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Covered</b></em>' reference list.
	 * The list contents are of type {@link Interactions.BasicInteractions.Lifeline}.
	 * It is bidirectional and its opposite is '{@link Interactions.BasicInteractions.Lifeline#getCoveredBy <em>Covered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Covered</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covered</em>' reference list.
	 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getInteractionFragment_Covered()
	 * @see Interactions.BasicInteractions.Lifeline#getCoveredBy
	 * @model opposite="coveredBy"
	 * @generated
	 */
	EList<Lifeline> getCovered();

	/**
	 * Returns the value of the '<em><b>General Ordering</b></em>' containment reference list.
	 * The list contents are of type {@link Interactions.BasicInteractions.GeneralOrdering}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Ordering</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Ordering</em>' containment reference list.
	 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getInteractionFragment_GeneralOrdering()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeneralOrdering> getGeneralOrdering();

	/**
	 * Returns the value of the '<em><b>Enclosing Operand</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Interactions.Fragments.InteractionOperand#getFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enclosing Operand</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclosing Operand</em>' container reference.
	 * @see #setEnclosingOperand(InteractionOperand)
	 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getInteractionFragment_EnclosingOperand()
	 * @see Interactions.Fragments.InteractionOperand#getFragment
	 * @model opposite="fragment" transient="false"
	 * @generated
	 */
	InteractionOperand getEnclosingOperand();

	/**
	 * Sets the value of the '{@link Interactions.BasicInteractions.InteractionFragment#getEnclosingOperand <em>Enclosing Operand</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosing Operand</em>' container reference.
	 * @see #getEnclosingOperand()
	 * @generated
	 */
	void setEnclosingOperand(InteractionOperand value);

} // InteractionFragment
