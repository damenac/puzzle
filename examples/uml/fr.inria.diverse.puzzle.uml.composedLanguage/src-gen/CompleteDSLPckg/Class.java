/**
 */
package CompleteDSLPckg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.Class#getNestedClassifier <em>Nested Classifier</em>}</li>
 *   <li>{@link CompleteDSLPckg.Class#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link CompleteDSLPckg.Class#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link CompleteDSLPckg.Class#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link CompleteDSLPckg.Class#getOwnedReception <em>Owned Reception</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Classifier, BehavioredClassifier, StructuredClassifier, EncapsulatedClassifier {
	/**
	 * Returns the value of the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Classifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Classifier</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getClass_NestedClassifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Classifier> getNestedClassifier();

	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Operation}.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.Operation#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getClass_OwnedOperation()
	 * @see CompleteDSLPckg.Operation#getClass_
	 * @model opposite="class" containment="true"
	 * @generated
	 */
	EList<Operation> getOwnedOperation();

	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getClass_SuperClass()
	 * @model
	 * @generated
	 */
	EList<Class> getSuperClass();

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Property}.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.Property#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Attribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getClass_OwnedAttribute()
	 * @see CompleteDSLPckg.Property#getClass_
	 * @model opposite="class"
	 * @generated
	 */
	EList<Property> getOwnedAttribute();

	/**
	 * Returns the value of the '<em><b>Owned Reception</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Reception}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Reception</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Reception</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getClass_OwnedReception()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reception> getOwnedReception();

} // Class
