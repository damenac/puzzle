/**
 */
package CompleteDSLPckg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occurence Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.OccurenceSpecification#getToBefore <em>To Before</em>}</li>
 *   <li>{@link CompleteDSLPckg.OccurenceSpecification#getToAfter <em>To After</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getOccurenceSpecification()
 * @model
 * @generated
 */
public interface OccurenceSpecification extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>To Before</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.GeneralOrdering}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Before</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Before</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getOccurenceSpecification_ToBefore()
	 * @model
	 * @generated
	 */
	EList<GeneralOrdering> getToBefore();

	/**
	 * Returns the value of the '<em><b>To After</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.GeneralOrdering}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To After</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To After</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getOccurenceSpecification_ToAfter()
	 * @model
	 * @generated
	 */
	EList<GeneralOrdering> getToAfter();

} // OccurenceSpecification
