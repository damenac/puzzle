/**
 */
package CompleteDSLPckg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.Namespace#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link CompleteDSLPckg.Namespace#getMember <em>Member</em>}</li>
 *   <li>{@link CompleteDSLPckg.Namespace#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link CompleteDSLPckg.Namespace#getElementImport <em>Element Import</em>}</li>
 *   <li>{@link CompleteDSLPckg.Namespace#getPackageImport <em>Package Import</em>}</li>
 *   <li>{@link CompleteDSLPckg.Namespace#getOwnedRule <em>Owned Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getNamespace()
 * @model
 * @generated
 */
public interface Namespace extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Imported Member</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Member</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getNamespace_ImportedMember()
	 * @model
	 * @generated
	 */
	EList<PackageableElement> getImportedMember();

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getNamespace_Member()
	 * @model
	 * @generated
	 */
	EList<NamedElement> getMember();

	/**
	 * Returns the value of the '<em><b>Owned Member</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.NamedElement}.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.NamedElement#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Member</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getNamespace_OwnedMember()
	 * @see CompleteDSLPckg.NamedElement#getNamespace
	 * @model opposite="namespace" containment="true"
	 * @generated
	 */
	EList<NamedElement> getOwnedMember();

	/**
	 * Returns the value of the '<em><b>Element Import</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.ElementImport}.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.ElementImport#getImportingNamespace <em>Importing Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Import</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Import</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getNamespace_ElementImport()
	 * @see CompleteDSLPckg.ElementImport#getImportingNamespace
	 * @model opposite="importingNamespace" containment="true"
	 * @generated
	 */
	EList<ElementImport> getElementImport();

	/**
	 * Returns the value of the '<em><b>Package Import</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.PackageImport}.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.PackageImport#getImportingNamespace <em>Importing Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Import</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Import</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getNamespace_PackageImport()
	 * @see CompleteDSLPckg.PackageImport#getImportingNamespace
	 * @model opposite="importingNamespace" containment="true"
	 * @generated
	 */
	EList<PackageImport> getPackageImport();

	/**
	 * Returns the value of the '<em><b>Owned Rule</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Constraint}.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.Constraint#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Rule</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getNamespace_OwnedRule()
	 * @see CompleteDSLPckg.Constraint#getContext
	 * @model opposite="context" containment="true"
	 * @generated
	 */
	EList<Constraint> getOwnedRule();

} // Namespace
