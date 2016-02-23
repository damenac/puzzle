/**
 */
package PuzzleADL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PuzzleADL.LanguageArchitecture#getLanguageModules <em>Language Modules</em>}</li>
 *   <li>{@link PuzzleADL.LanguageArchitecture#getInterfaceBindings <em>Interface Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see PuzzleADL.PuzzleADLPackage#getLanguageArchitecture()
 * @model
 * @generated
 */
public interface LanguageArchitecture extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Language Modules</b></em>' containment reference list.
	 * The list contents are of type {@link PuzzleADL.LanguageModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Modules</em>' containment reference list.
	 * @see PuzzleADL.PuzzleADLPackage#getLanguageArchitecture_LanguageModules()
	 * @model containment="true"
	 * @generated
	 */
	EList<LanguageModule> getLanguageModules();

	/**
	 * Returns the value of the '<em><b>Interface Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link PuzzleADL.InterfaceBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Bindings</em>' containment reference list.
	 * @see PuzzleADL.PuzzleADLPackage#getLanguageArchitecture_InterfaceBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceBinding> getInterfaceBindings();

} // LanguageArchitecture
