/**
 */
package CommonBehavior.BasicBehavior;

import CommonBehavior.Communications.CallConcurrencyFeature;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CommonBehavior.BasicBehavior.BehavioralFeature#getMethod <em>Method</em>}</li>
 *   <li>{@link CommonBehavior.BasicBehavior.BehavioralFeature#getConcurrency <em>Concurrency</em>}</li>
 * </ul>
 * </p>
 *
 * @see CommonBehavior.BasicBehavior.BasicBehaviorPackage#getBehavioralFeature()
 * @model abstract="true"
 * @generated
 */
public interface BehavioralFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference list.
	 * The list contents are of type {@link CommonBehavior.BasicBehavior.Behavior}.
	 * It is bidirectional and its opposite is '{@link CommonBehavior.BasicBehavior.Behavior#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference list.
	 * @see CommonBehavior.BasicBehavior.BasicBehaviorPackage#getBehavioralFeature_Method()
	 * @see CommonBehavior.BasicBehavior.Behavior#getSpecification
	 * @model opposite="specification"
	 * @generated
	 */
	EList<Behavior> getMethod();

	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' attribute.
	 * The literals are from the enumeration {@link CommonBehavior.Communications.CallConcurrencyFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concurrency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency</em>' attribute.
	 * @see CommonBehavior.Communications.CallConcurrencyFeature
	 * @see #setConcurrency(CallConcurrencyFeature)
	 * @see CommonBehavior.BasicBehavior.BasicBehaviorPackage#getBehavioralFeature_Concurrency()
	 * @model
	 * @generated
	 */
	CallConcurrencyFeature getConcurrency();

	/**
	 * Sets the value of the '{@link CommonBehavior.BasicBehavior.BehavioralFeature#getConcurrency <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency</em>' attribute.
	 * @see CommonBehavior.Communications.CallConcurrencyFeature
	 * @see #getConcurrency()
	 * @generated
	 */
	void setConcurrency(CallConcurrencyFeature value);

} // BehavioralFeature
