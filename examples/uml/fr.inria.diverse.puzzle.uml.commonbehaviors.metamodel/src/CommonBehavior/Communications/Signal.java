/**
 */
package CommonBehavior.Communications;

import CommonBehavior.BasicBehavior.Classifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CommonBehavior.Communications.Signal#getOwnedAttribute <em>Owned Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see CommonBehavior.Communications.CommunicationsPackage#getSignal()
 * @model
 * @generated
 */
public interface Signal extends Classifier {
	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link CommonBehavior.Communications.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see CommonBehavior.Communications.CommunicationsPackage#getSignal_OwnedAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getOwnedAttribute();

} // Signal
