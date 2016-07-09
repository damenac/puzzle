/**
 */
package CommonBehavior.BasicBehavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CommonBehavior.BasicBehavior.Behavior#getContext <em>Context</em>}</li>
 *   <li>{@link CommonBehavior.BasicBehavior.Behavior#isIsReentrant <em>Is Reentrant</em>}</li>
 *   <li>{@link CommonBehavior.BasicBehavior.Behavior#getRedefinedBehavior <em>Redefined Behavior</em>}</li>
 *   <li>{@link CommonBehavior.BasicBehavior.Behavior#getSpecification <em>Specification</em>}</li>
 *   <li>{@link CommonBehavior.BasicBehavior.Behavior#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link CommonBehavior.BasicBehavior.Behavior#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link CommonBehavior.BasicBehavior.Behavior#getPostcondition <em>Postcondition</em>}</li>
 * </ul>
 * </p>
 *
 * @see CommonBehavior.BasicBehavior.BasicBehaviorPackage#getBehavior()
 * @model abstract="true"
 * @generated
 */
public interface Behavior extends CommonBehavior.BasicBehavior.Class {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(BehavioredClassifier)
	 * @see CommonBehavior.BasicBehavior.BasicBehaviorPackage#getBehavior_Context()
	 * @model
	 * @generated
	 */
	BehavioredClassifier getContext();

	/**
	 * Sets the value of the '{@link CommonBehavior.BasicBehavior.Behavior#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(BehavioredClassifier value);

	/**
	 * Returns the value of the '<em><b>Is Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Reentrant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Reentrant</em>' attribute.
	 * @see #setIsReentrant(boolean)
	 * @see CommonBehavior.BasicBehavior.BasicBehaviorPackage#getBehavior_IsReentrant()
	 * @model
	 * @generated
	 */
	boolean isIsReentrant();

	/**
	 * Sets the value of the '{@link CommonBehavior.BasicBehavior.Behavior#isIsReentrant <em>Is Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reentrant</em>' attribute.
	 * @see #isIsReentrant()
	 * @generated
	 */
	void setIsReentrant(boolean value);

	/**
	 * Returns the value of the '<em><b>Redefined Behavior</b></em>' reference list.
	 * The list contents are of type {@link CommonBehavior.BasicBehavior.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Behavior</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Behavior</em>' reference list.
	 * @see CommonBehavior.BasicBehavior.BasicBehaviorPackage#getBehavior_RedefinedBehavior()
	 * @model
	 * @generated
	 */
	EList<Behavior> getRedefinedBehavior();

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CommonBehavior.BasicBehavior.BehavioralFeature#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' reference.
	 * @see #setSpecification(BehavioralFeature)
	 * @see CommonBehavior.BasicBehavior.BasicBehaviorPackage#getBehavior_Specification()
	 * @see CommonBehavior.BasicBehavior.BehavioralFeature#getMethod
	 * @model opposite="method"
	 * @generated
	 */
	BehavioralFeature getSpecification();

	/**
	 * Sets the value of the '{@link CommonBehavior.BasicBehavior.Behavior#getSpecification <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(BehavioralFeature value);

	/**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link CommonBehavior.BasicBehavior.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see CommonBehavior.BasicBehavior.BasicBehaviorPackage#getBehavior_OwnedParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getOwnedParameter();

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link CommonBehavior.BasicBehavior.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference list.
	 * @see CommonBehavior.BasicBehavior.BasicBehaviorPackage#getBehavior_Precondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getPrecondition();

	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' containment reference list.
	 * The list contents are of type {@link CommonBehavior.BasicBehavior.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postcondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcondition</em>' containment reference list.
	 * @see CommonBehavior.BasicBehavior.BasicBehaviorPackage#getBehavior_Postcondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getPostcondition();

} // Behavior
