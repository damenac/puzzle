/**
 */
package Multivar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Group Child</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Multivar.OrGroupChild#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see Multivar.MultivarPackage#getOrGroupChild()
 * @model
 * @generated
 */
public interface OrGroupChild extends Relation {
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
	 * @see Multivar.MultivarPackage#getOrGroupChild_Features()
	 * @model required="true"
	 * @generated
	 */
	EList<LanguageFeature> getFeatures();

} // OrGroupChild
