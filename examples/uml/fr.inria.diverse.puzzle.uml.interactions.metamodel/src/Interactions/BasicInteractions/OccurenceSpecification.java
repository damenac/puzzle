/**
 */
package Interactions.BasicInteractions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occurence Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Interactions.BasicInteractions.OccurenceSpecification#getToBefore <em>To Before</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.OccurenceSpecification#getToAfter <em>To After</em>}</li>
 * </ul>
 * </p>
 *
 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getOccurenceSpecification()
 * @model
 * @generated
 */
public interface OccurenceSpecification extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>To Before</b></em>' reference list.
	 * The list contents are of type {@link Interactions.BasicInteractions.GeneralOrdering}.
	 * It is bidirectional and its opposite is '{@link Interactions.BasicInteractions.GeneralOrdering#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Before</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Before</em>' reference list.
	 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getOccurenceSpecification_ToBefore()
	 * @see Interactions.BasicInteractions.GeneralOrdering#getAfter
	 * @model opposite="after"
	 * @generated
	 */
	EList<GeneralOrdering> getToBefore();

	/**
	 * Returns the value of the '<em><b>To After</b></em>' reference list.
	 * The list contents are of type {@link Interactions.BasicInteractions.GeneralOrdering}.
	 * It is bidirectional and its opposite is '{@link Interactions.BasicInteractions.GeneralOrdering#getBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To After</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To After</em>' reference list.
	 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getOccurenceSpecification_ToAfter()
	 * @see Interactions.BasicInteractions.GeneralOrdering#getBefore
	 * @model opposite="before"
	 * @generated
	 */
	EList<GeneralOrdering> getToAfter();

} // OccurenceSpecification
