/**
 */
package CompositeStructures.InternalStructures;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompositeStructures.InternalStructures.StructuredClassifier#getOwnedConnector <em>Owned Connector</em>}</li>
 *   <li>{@link CompositeStructures.InternalStructures.StructuredClassifier#getRole <em>Role</em>}</li>
 *   <li>{@link CompositeStructures.InternalStructures.StructuredClassifier#getStructuredOwnedAttribute <em>Structured Owned Attribute</em>}</li>
 *   <li>{@link CompositeStructures.InternalStructures.StructuredClassifier#getPart <em>Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompositeStructures.InternalStructures.InternalStructuresPackage#getStructuredClassifier()
 * @model
 * @generated
 */
public interface StructuredClassifier extends Classifier {
	/**
	 * Returns the value of the '<em><b>Owned Connector</b></em>' containment reference list.
	 * The list contents are of type {@link CompositeStructures.InternalStructures.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Connector</em>' containment reference list.
	 * @see CompositeStructures.InternalStructures.InternalStructuresPackage#getStructuredClassifier_OwnedConnector()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getOwnedConnector();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference list.
	 * The list contents are of type {@link CompositeStructures.InternalStructures.ConnectableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference list.
	 * @see CompositeStructures.InternalStructures.InternalStructuresPackage#getStructuredClassifier_Role()
	 * @model
	 * @generated
	 */
	EList<ConnectableElement> getRole();

	/**
	 * Returns the value of the '<em><b>Structured Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link CompositeStructures.InternalStructures.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured Owned Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured Owned Attribute</em>' containment reference list.
	 * @see CompositeStructures.InternalStructures.InternalStructuresPackage#getStructuredClassifier_StructuredOwnedAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getStructuredOwnedAttribute();

	/**
	 * Returns the value of the '<em><b>Part</b></em>' reference list.
	 * The list contents are of type {@link CompositeStructures.InternalStructures.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' reference list.
	 * @see CompositeStructures.InternalStructures.InternalStructuresPackage#getStructuredClassifier_Part()
	 * @model
	 * @generated
	 */
	EList<Property> getPart();

} // StructuredClassifier
