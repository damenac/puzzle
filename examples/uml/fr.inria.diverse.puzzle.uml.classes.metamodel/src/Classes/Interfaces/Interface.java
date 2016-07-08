/**
 */
package Classes.Interfaces;

import Classes.Kernel.Classifier;
import Classes.Kernel.Operation;
import Classes.Kernel.Property;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Interfaces.Interface#getNestedClassifier <em>Nested Classifier</em>}</li>
 *   <li>{@link Classes.Interfaces.Interface#getRedefinedInterface <em>Redefined Interface</em>}</li>
 *   <li>{@link Classes.Interfaces.Interface#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link Classes.Interfaces.Interface#getOwnedOperation <em>Owned Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Interfaces.InterfacesPackage#getInterface()
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
	 * @see Classes.Interfaces.InterfacesPackage#getInterface_NestedClassifier()
	 * @model containment="true"
	 * @generated
	 */
	Classifier getNestedClassifier();

	/**
	 * Sets the value of the '{@link Classes.Interfaces.Interface#getNestedClassifier <em>Nested Classifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nested Classifier</em>' containment reference.
	 * @see #getNestedClassifier()
	 * @generated
	 */
	void setNestedClassifier(Classifier value);

	/**
	 * Returns the value of the '<em><b>Redefined Interface</b></em>' reference list.
	 * The list contents are of type {@link Classes.Interfaces.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Interface</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Interface</em>' reference list.
	 * @see Classes.Interfaces.InterfacesPackage#getInterface_RedefinedInterface()
	 * @model
	 * @generated
	 */
	EList<Interface> getRedefinedInterface();

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link Classes.Kernel.Property}.
	 * It is bidirectional and its opposite is '{@link Classes.Kernel.Property#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see Classes.Interfaces.InterfacesPackage#getInterface_OwnedAttribute()
	 * @see Classes.Kernel.Property#getInterface
	 * @model opposite="interface" containment="true"
	 * @generated
	 */
	EList<Property> getOwnedAttribute();

	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link Classes.Kernel.Operation}.
	 * It is bidirectional and its opposite is '{@link Classes.Kernel.Operation#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see Classes.Interfaces.InterfacesPackage#getInterface_OwnedOperation()
	 * @see Classes.Kernel.Operation#getInterface
	 * @model opposite="interface" containment="true"
	 * @generated
	 */
	EList<Operation> getOwnedOperation();

} // Interface
