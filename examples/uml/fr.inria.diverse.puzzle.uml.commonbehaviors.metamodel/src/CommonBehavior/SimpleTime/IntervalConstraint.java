/**
 */
package CommonBehavior.SimpleTime;

import CommonBehavior.BasicBehavior.Constraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CommonBehavior.SimpleTime.IntervalConstraint#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see CommonBehavior.SimpleTime.SimpleTimePackage#getIntervalConstraint()
 * @model
 * @generated
 */
public interface IntervalConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' reference.
	 * @see #setSpecification(Interval)
	 * @see CommonBehavior.SimpleTime.SimpleTimePackage#getIntervalConstraint_Specification()
	 * @model required="true"
	 * @generated
	 */
	Interval getSpecification();

	/**
	 * Sets the value of the '{@link CommonBehavior.SimpleTime.IntervalConstraint#getSpecification <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(Interval value);

} // IntervalConstraint
