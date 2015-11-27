/**
 */
package Multivar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Multivar.LanguageFeature#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link Multivar.LanguageFeature#getModule <em>Module</em>}</li>
 *   <li>{@link Multivar.LanguageFeature#getDepends <em>Depends</em>}</li>
 *   <li>{@link Multivar.LanguageFeature#getExcludes <em>Excludes</em>}</li>
 *   <li>{@link Multivar.LanguageFeature#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see Multivar.MultivarPackage#getLanguageFeature()
 * @model
 * @generated
 */
public interface LanguageFeature extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see Multivar.MultivarPackage#getLanguageFeature_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link Multivar.LanguageFeature#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' attribute.
	 * @see #setModule(String)
	 * @see Multivar.MultivarPackage#getLanguageFeature_Module()
	 * @model
	 * @generated
	 */
	String getModule();

	/**
	 * Sets the value of the '{@link Multivar.LanguageFeature#getModule <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' attribute.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(String value);

	/**
	 * Returns the value of the '<em><b>Depends</b></em>' reference list.
	 * The list contents are of type {@link Multivar.LanguageFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends</em>' reference list.
	 * @see Multivar.MultivarPackage#getLanguageFeature_Depends()
	 * @model
	 * @generated
	 */
	EList<LanguageFeature> getDepends();

	/**
	 * Returns the value of the '<em><b>Excludes</b></em>' reference list.
	 * The list contents are of type {@link Multivar.LanguageFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Excludes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excludes</em>' reference list.
	 * @see Multivar.MultivarPackage#getLanguageFeature_Excludes()
	 * @model
	 * @generated
	 */
	EList<LanguageFeature> getExcludes();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link Multivar.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see Multivar.MultivarPackage#getLanguageFeature_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getChildren();

} // LanguageFeature
