/**
 */
package CommonBehavior.BasicBehavior;

import CommonBehavior.Communications.Reception;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CommonBehavior.BasicBehavior.Class#getOwnedReception <em>Owned Reception</em>}</li>
 * </ul>
 * </p>
 *
 * @see CommonBehavior.BasicBehavior.BasicBehaviorPackage#getClass_()
 * @model abstract="true"
 * @generated
 */
public interface Class extends Classifier, BehavioredClassifier {
	/**
	 * Returns the value of the '<em><b>Owned Reception</b></em>' containment reference list.
	 * The list contents are of type {@link CommonBehavior.Communications.Reception}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Reception</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Reception</em>' containment reference list.
	 * @see CommonBehavior.BasicBehavior.BasicBehaviorPackage#getClass_OwnedReception()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reception> getOwnedReception();

} // Class
