/**
 */
package Interactions.BasicInteractions;

import Interactions.Fragments.PartDecomposition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lifeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Interactions.BasicInteractions.Lifeline#getCoveredBy <em>Covered By</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.Lifeline#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.Lifeline#getRepresents <em>Represents</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.Lifeline#getSelector <em>Selector</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.Lifeline#getDecomposedAs <em>Decomposed As</em>}</li>
 * </ul>
 * </p>
 *
 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getLifeline()
 * @model
 * @generated
 */
public interface Lifeline extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Covered By</b></em>' reference list.
	 * The list contents are of type {@link Interactions.BasicInteractions.InteractionFragment}.
	 * It is bidirectional and its opposite is '{@link Interactions.BasicInteractions.InteractionFragment#getCovered <em>Covered</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Covered By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covered By</em>' reference list.
	 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getLifeline_CoveredBy()
	 * @see Interactions.BasicInteractions.InteractionFragment#getCovered
	 * @model opposite="covered"
	 * @generated
	 */
	EList<InteractionFragment> getCoveredBy();

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Interactions.BasicInteractions.Interaction#getLifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction</em>' container reference.
	 * @see #setInteraction(Interaction)
	 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getLifeline_Interaction()
	 * @see Interactions.BasicInteractions.Interaction#getLifeline
	 * @model opposite="lifeline" required="true" transient="false"
	 * @generated
	 */
	Interaction getInteraction();

	/**
	 * Sets the value of the '{@link Interactions.BasicInteractions.Lifeline#getInteraction <em>Interaction</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction</em>' container reference.
	 * @see #getInteraction()
	 * @generated
	 */
	void setInteraction(Interaction value);

	/**
	 * Returns the value of the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represents</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represents</em>' reference.
	 * @see #setRepresents(ConnectableElement)
	 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getLifeline_Represents()
	 * @model
	 * @generated
	 */
	ConnectableElement getRepresents();

	/**
	 * Sets the value of the '{@link Interactions.BasicInteractions.Lifeline#getRepresents <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents</em>' reference.
	 * @see #getRepresents()
	 * @generated
	 */
	void setRepresents(ConnectableElement value);

	/**
	 * Returns the value of the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' containment reference.
	 * @see #setSelector(ValueSpecification)
	 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getLifeline_Selector()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getSelector();

	/**
	 * Sets the value of the '{@link Interactions.BasicInteractions.Lifeline#getSelector <em>Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' containment reference.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Decomposed As</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposed As</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposed As</em>' reference.
	 * @see #setDecomposedAs(PartDecomposition)
	 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getLifeline_DecomposedAs()
	 * @model
	 * @generated
	 */
	PartDecomposition getDecomposedAs();

	/**
	 * Sets the value of the '{@link Interactions.BasicInteractions.Lifeline#getDecomposedAs <em>Decomposed As</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decomposed As</em>' reference.
	 * @see #getDecomposedAs()
	 * @generated
	 */
	void setDecomposedAs(PartDecomposition value);

} // Lifeline
