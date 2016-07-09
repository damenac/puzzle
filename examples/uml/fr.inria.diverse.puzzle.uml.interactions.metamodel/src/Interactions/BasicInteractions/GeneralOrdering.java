/**
 */
package Interactions.BasicInteractions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Ordering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Interactions.BasicInteractions.GeneralOrdering#getAfter <em>After</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.GeneralOrdering#getBefore <em>Before</em>}</li>
 * </ul>
 * </p>
 *
 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getGeneralOrdering()
 * @model
 * @generated
 */
public interface GeneralOrdering extends NamedElement {
	/**
	 * Returns the value of the '<em><b>After</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Interactions.BasicInteractions.OccurenceSpecification#getToBefore <em>To Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After</em>' reference.
	 * @see #setAfter(OccurenceSpecification)
	 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getGeneralOrdering_After()
	 * @see Interactions.BasicInteractions.OccurenceSpecification#getToBefore
	 * @model opposite="toBefore" required="true"
	 * @generated
	 */
	OccurenceSpecification getAfter();

	/**
	 * Sets the value of the '{@link Interactions.BasicInteractions.GeneralOrdering#getAfter <em>After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After</em>' reference.
	 * @see #getAfter()
	 * @generated
	 */
	void setAfter(OccurenceSpecification value);

	/**
	 * Returns the value of the '<em><b>Before</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Interactions.BasicInteractions.OccurenceSpecification#getToAfter <em>To After</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before</em>' reference.
	 * @see #setBefore(OccurenceSpecification)
	 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getGeneralOrdering_Before()
	 * @see Interactions.BasicInteractions.OccurenceSpecification#getToAfter
	 * @model opposite="toAfter" required="true"
	 * @generated
	 */
	OccurenceSpecification getBefore();

	/**
	 * Sets the value of the '{@link Interactions.BasicInteractions.GeneralOrdering#getBefore <em>Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before</em>' reference.
	 * @see #getBefore()
	 * @generated
	 */
	void setBefore(OccurenceSpecification value);

} // GeneralOrdering
