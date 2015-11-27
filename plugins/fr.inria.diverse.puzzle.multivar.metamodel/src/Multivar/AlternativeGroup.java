/**
 */
package Multivar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Multivar.AlternativeGroup#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see Multivar.MultivarPackage#getAlternativeGroup()
 * @model
 * @generated
 */
public interface AlternativeGroup extends Relation {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link Multivar.LanguageFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see Multivar.MultivarPackage#getAlternativeGroup_Features()
	 * @model required="true"
	 * @generated
	 */
	EList<LanguageFeature> getFeatures();

} // AlternativeGroup
