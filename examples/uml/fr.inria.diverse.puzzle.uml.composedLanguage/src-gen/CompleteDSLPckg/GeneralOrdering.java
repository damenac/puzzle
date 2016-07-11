/**
 */
package CompleteDSLPckg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Ordering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.GeneralOrdering#getAfter <em>After</em>}</li>
 *   <li>{@link CompleteDSLPckg.GeneralOrdering#getBefore <em>Before</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getGeneralOrdering()
 * @model
 * @generated
 */
public interface GeneralOrdering extends NamedElement {
	/**
	 * Returns the value of the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After</em>' reference.
	 * @see #setAfter(OccurenceSpecification)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getGeneralOrdering_After()
	 * @model required="true"
	 * @generated
	 */
	OccurenceSpecification getAfter();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.GeneralOrdering#getAfter <em>After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After</em>' reference.
	 * @see #getAfter()
	 * @generated
	 */
	void setAfter(OccurenceSpecification value);

	/**
	 * Returns the value of the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before</em>' reference.
	 * @see #setBefore(OccurenceSpecification)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getGeneralOrdering_Before()
	 * @model required="true"
	 * @generated
	 */
	OccurenceSpecification getBefore();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.GeneralOrdering#getBefore <em>Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before</em>' reference.
	 * @see #getBefore()
	 * @generated
	 */
	void setBefore(OccurenceSpecification value);

} // GeneralOrdering
