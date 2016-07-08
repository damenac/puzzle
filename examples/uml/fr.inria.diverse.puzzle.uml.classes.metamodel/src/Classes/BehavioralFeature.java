/**
 */
package Classes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.BehavioralFeature#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link Classes.BehavioralFeature#getRaisedException <em>Raised Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.ClassesPackage#getBehavioralFeature()
 * @model abstract="true"
 * @generated
 */
public interface BehavioralFeature extends Feature, Namespace {
	/**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link Classes.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see Classes.ClassesPackage#getBehavioralFeature_OwnedParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getOwnedParameter();

	/**
	 * Returns the value of the '<em><b>Raised Exception</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raised Exception</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raised Exception</em>' reference.
	 * @see #setRaisedException(Type)
	 * @see Classes.ClassesPackage#getBehavioralFeature_RaisedException()
	 * @model
	 * @generated
	 */
	Type getRaisedException();

	/**
	 * Sets the value of the '{@link Classes.BehavioralFeature#getRaisedException <em>Raised Exception</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raised Exception</em>' reference.
	 * @see #getRaisedException()
	 * @generated
	 */
	void setRaisedException(Type value);

} // BehavioralFeature
