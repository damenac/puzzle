/**
 */
package CompleteDSLPckg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.Interface#getNestedClassifier <em>Nested Classifier</em>}</li>
 *   <li>{@link CompleteDSLPckg.Interface#getRedefinedInterface <em>Redefined Interface</em>}</li>
 *   <li>{@link CompleteDSLPckg.Interface#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link CompleteDSLPckg.Interface#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link CompleteDSLPckg.Interface#getOwnedReception <em>Owned Reception</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends Classifier {
	/**
	 * Returns the value of the '<em><b>Nested Classifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Classifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Classifier</em>' containment reference.
	 * @see #setNestedClassifier(Classifier)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getInterface_NestedClassifier()
	 * @model containment="true"
	 * @generated
	 */
	Classifier getNestedClassifier();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.Interface#getNestedClassifier <em>Nested Classifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nested Classifier</em>' containment reference.
	 * @see #getNestedClassifier()
	 * @generated
	 */
	void setNestedClassifier(Classifier value);

	/**
	 * Returns the value of the '<em><b>Redefined Interface</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Interface</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Interface</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getInterface_RedefinedInterface()
	 * @model
	 * @generated
	 */
	EList<Interface> getRedefinedInterface();

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Property}.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.Property#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getInterface_OwnedAttribute()
	 * @see CompleteDSLPckg.Property#getInterface
	 * @model opposite="interface" containment="true"
	 * @generated
	 */
	EList<Property> getOwnedAttribute();

	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Operation}.
	 * It is bidirectional and its opposite is '{@link CompleteDSLPckg.Operation#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getInterface_OwnedOperation()
	 * @see CompleteDSLPckg.Operation#getInterface
	 * @model opposite="interface" containment="true"
	 * @generated
	 */
	EList<Operation> getOwnedOperation();

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
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getInterface_OwnedReception()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reception> getOwnedReception();

} // Interface
