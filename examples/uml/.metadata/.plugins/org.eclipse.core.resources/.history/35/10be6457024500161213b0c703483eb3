/**
 */
package Classes.Kernel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Kernel.Namespace#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link Classes.Kernel.Namespace#getMember <em>Member</em>}</li>
 *   <li>{@link Classes.Kernel.Namespace#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link Classes.Kernel.Namespace#getElementImport <em>Element Import</em>}</li>
 *   <li>{@link Classes.Kernel.Namespace#getPackageImport <em>Package Import</em>}</li>
 *   <li>{@link Classes.Kernel.Namespace#getOwnedRule <em>Owned Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Kernel.KernelPackage#getNamespace()
 * @model
 * @generated
 */
public interface Namespace extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Imported Member</b></em>' reference list.
	 * The list contents are of type {@link Classes.Kernel.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Member</em>' reference list.
	 * @see Classes.Kernel.KernelPackage#getNamespace_ImportedMember()
	 * @model
	 * @generated
	 */
	EList<PackageableElement> getImportedMember();

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link Classes.Kernel.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see Classes.Kernel.KernelPackage#getNamespace_Member()
	 * @model
	 * @generated
	 */
	EList<NamedElement> getMember();

	/**
	 * Returns the value of the '<em><b>Owned Member</b></em>' containment reference list.
	 * The list contents are of type {@link Classes.Kernel.NamedElement}.
	 * It is bidirectional and its opposite is '{@link Classes.Kernel.NamedElement#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Member</em>' containment reference list.
	 * @see Classes.Kernel.KernelPackage#getNamespace_OwnedMember()
	 * @see Classes.Kernel.NamedElement#getNamespace
	 * @model opposite="namespace" containment="true"
	 * @generated
	 */
	EList<NamedElement> getOwnedMember();

	/**
	 * Returns the value of the '<em><b>Element Import</b></em>' containment reference list.
	 * The list contents are of type {@link Classes.Kernel.ElementImport}.
	 * It is bidirectional and its opposite is '{@link Classes.Kernel.ElementImport#getImportingNamespace <em>Importing Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Import</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Import</em>' containment reference list.
	 * @see Classes.Kernel.KernelPackage#getNamespace_ElementImport()
	 * @see Classes.Kernel.ElementImport#getImportingNamespace
	 * @model opposite="importingNamespace" containment="true"
	 * @generated
	 */
	EList<ElementImport> getElementImport();

	/**
	 * Returns the value of the '<em><b>Package Import</b></em>' containment reference list.
	 * The list contents are of type {@link Classes.Kernel.PackageImport}.
	 * It is bidirectional and its opposite is '{@link Classes.Kernel.PackageImport#getImportingNamespace <em>Importing Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Import</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Import</em>' containment reference list.
	 * @see Classes.Kernel.KernelPackage#getNamespace_PackageImport()
	 * @see Classes.Kernel.PackageImport#getImportingNamespace
	 * @model opposite="importingNamespace" containment="true"
	 * @generated
	 */
	EList<PackageImport> getPackageImport();

	/**
	 * Returns the value of the '<em><b>Owned Rule</b></em>' containment reference list.
	 * The list contents are of type {@link Classes.Kernel.Constraint}.
	 * It is bidirectional and its opposite is '{@link Classes.Kernel.Constraint#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Rule</em>' containment reference list.
	 * @see Classes.Kernel.KernelPackage#getNamespace_OwnedRule()
	 * @see Classes.Kernel.Constraint#getContext
	 * @model opposite="context" containment="true"
	 * @generated
	 */
	EList<Constraint> getOwnedRule();

} // Namespace
