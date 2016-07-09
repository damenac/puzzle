/**
 */
package CommonBehavior.BasicBehavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviored Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CommonBehavior.BasicBehavior.BehavioredClassifier#getOwnedBehavior <em>Owned Behavior</em>}</li>
 *   <li>{@link CommonBehavior.BasicBehavior.BehavioredClassifier#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see CommonBehavior.BasicBehavior.BasicBehaviorPackage#getBehavioredClassifier()
 * @model
 * @generated
 */
public interface BehavioredClassifier extends Classifier {
	/**
	 * Returns the value of the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * The list contents are of type {@link CommonBehavior.BasicBehavior.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Behavior</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Behavior</em>' containment reference list.
	 * @see CommonBehavior.BasicBehavior.BasicBehaviorPackage#getBehavioredClassifier_OwnedBehavior()
	 * @model containment="true"
	 * @generated
	 */
	EList<Behavior> getOwnedBehavior();

	/**
	 * Returns the value of the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier Behavior</em>' reference.
	 * @see #setClassifierBehavior(Behavior)
	 * @see CommonBehavior.BasicBehavior.BasicBehaviorPackage#getBehavioredClassifier_ClassifierBehavior()
	 * @model
	 * @generated
	 */
	Behavior getClassifierBehavior();

	/**
	 * Sets the value of the '{@link CommonBehavior.BasicBehavior.BehavioredClassifier#getClassifierBehavior <em>Classifier Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier Behavior</em>' reference.
	 * @see #getClassifierBehavior()
	 * @generated
	 */
	void setClassifierBehavior(Behavior value);

} // BehavioredClassifier
