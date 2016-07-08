/**
 */
package Classes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Package#getURI <em>URI</em>}</li>
 *   <li>{@link Classes.Package#getNestedPackage <em>Nested Package</em>}</li>
 *   <li>{@link Classes.Package#getNestingPackage <em>Nesting Package</em>}</li>
 *   <li>{@link Classes.Package#getPackagedElement <em>Packaged Element</em>}</li>
 *   <li>{@link Classes.Package#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link Classes.Package#getPackageMerge <em>Package Merge</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.ClassesPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends Namespace, PackageableElement {
	/**
	 * Returns the value of the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URI</em>' attribute.
	 * @see #setURI(String)
	 * @see Classes.ClassesPackage#getPackage_URI()
	 * @model
	 * @generated
	 */
	String getURI();

	/**
	 * Sets the value of the '{@link Classes.Package#getURI <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI</em>' attribute.
	 * @see #getURI()
	 * @generated
	 */
	void setURI(String value);

	/**
	 * Returns the value of the '<em><b>Nested Package</b></em>' containment reference list.
	 * The list contents are of type {@link Classes.Package}.
	 * It is bidirectional and its opposite is '{@link Classes.Package#getNestingPackage <em>Nesting Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Package</em>' containment reference list.
	 * @see Classes.ClassesPackage#getPackage_NestedPackage()
	 * @see Classes.Package#getNestingPackage
	 * @model opposite="nestingPackage" containment="true"
	 * @generated
	 */
	EList<Package> getNestedPackage();

	/**
	 * Returns the value of the '<em><b>Nesting Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Classes.Package#getNestedPackage <em>Nested Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nesting Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nesting Package</em>' container reference.
	 * @see #setNestingPackage(Package)
	 * @see Classes.ClassesPackage#getPackage_NestingPackage()
	 * @see Classes.Package#getNestedPackage
	 * @model opposite="nestedPackage" transient="false"
	 * @generated
	 */
	Package getNestingPackage();

	/**
	 * Sets the value of the '{@link Classes.Package#getNestingPackage <em>Nesting Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nesting Package</em>' container reference.
	 * @see #getNestingPackage()
	 * @generated
	 */
	void setNestingPackage(Package value);

	/**
	 * Returns the value of the '<em><b>Packaged Element</b></em>' containment reference list.
	 * The list contents are of type {@link Classes.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packaged Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packaged Element</em>' containment reference list.
	 * @see Classes.ClassesPackage#getPackage_PackagedElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageableElement> getPackagedElement();

	/**
	 * Returns the value of the '<em><b>Owned Type</b></em>' containment reference list.
	 * The list contents are of type {@link Classes.Type}.
	 * It is bidirectional and its opposite is '{@link Classes.Type#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Type</em>' containment reference list.
	 * @see Classes.ClassesPackage#getPackage_OwnedType()
	 * @see Classes.Type#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<Type> getOwnedType();

	/**
	 * Returns the value of the '<em><b>Package Merge</b></em>' containment reference list.
	 * The list contents are of type {@link Classes.PackageMerge}.
	 * It is bidirectional and its opposite is '{@link Classes.PackageMerge#getReceivingPackage <em>Receiving Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Merge</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Merge</em>' containment reference list.
	 * @see Classes.ClassesPackage#getPackage_PackageMerge()
	 * @see Classes.PackageMerge#getReceivingPackage
	 * @model opposite="receivingPackage" containment="true"
	 * @generated
	 */
	EList<PackageMerge> getPackageMerge();

} // Package
