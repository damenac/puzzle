/**
 */
package Interactions.BasicInteractions;

import Interactions.Fragments.Gate;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Interactions.BasicInteractions.Interaction#getFragment <em>Fragment</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.Interaction#getLifeline <em>Lifeline</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.Interaction#getAction <em>Action</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.Interaction#getFormalGate <em>Formal Gate</em>}</li>
 * </ul>
 * </p>
 *
 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getInteraction()
 * @model
 * @generated
 */
public interface Interaction extends Behavior, InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Fragment</b></em>' containment reference list.
	 * The list contents are of type {@link Interactions.BasicInteractions.InteractionFragment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragment</em>' containment reference list.
	 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getInteraction_Fragment()
	 * @model containment="true"
	 * @generated
	 */
	EList<InteractionFragment> getFragment();

	/**
	 * Returns the value of the '<em><b>Lifeline</b></em>' containment reference list.
	 * The list contents are of type {@link Interactions.BasicInteractions.Lifeline}.
	 * It is bidirectional and its opposite is '{@link Interactions.BasicInteractions.Lifeline#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lifeline</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifeline</em>' containment reference list.
	 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getInteraction_Lifeline()
	 * @see Interactions.BasicInteractions.Lifeline#getInteraction
	 * @model opposite="interaction" containment="true"
	 * @generated
	 */
	EList<Lifeline> getLifeline();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link Interactions.BasicInteractions.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getInteraction_Action()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * Returns the value of the '<em><b>Formal Gate</b></em>' containment reference list.
	 * The list contents are of type {@link Interactions.Fragments.Gate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Gate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Gate</em>' containment reference list.
	 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getInteraction_FormalGate()
	 * @model containment="true"
	 * @generated
	 */
	EList<Gate> getFormalGate();

} // Interaction
