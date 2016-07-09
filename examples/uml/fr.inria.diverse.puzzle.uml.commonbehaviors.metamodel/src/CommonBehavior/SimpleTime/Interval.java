/**
 */
package CommonBehavior.SimpleTime;

import CommonBehavior.Communications.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CommonBehavior.SimpleTime.Interval#getMax <em>Max</em>}</li>
 *   <li>{@link CommonBehavior.SimpleTime.Interval#getMin <em>Min</em>}</li>
 * </ul>
 * </p>
 *
 * @see CommonBehavior.SimpleTime.SimpleTimePackage#getInterval()
 * @model
 * @generated
 */
public interface Interval extends ValueSpecification {
	/**
	 * Returns the value of the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' reference.
	 * @see #setMax(ValueSpecification)
	 * @see CommonBehavior.SimpleTime.SimpleTimePackage#getInterval_Max()
	 * @model required="true"
	 * @generated
	 */
	ValueSpecification getMax();

	/**
	 * Sets the value of the '{@link CommonBehavior.SimpleTime.Interval#getMax <em>Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' reference.
	 * @see #setMin(ValueSpecification)
	 * @see CommonBehavior.SimpleTime.SimpleTimePackage#getInterval_Min()
	 * @model required="true"
	 * @generated
	 */
	ValueSpecification getMin();

	/**
	 * Sets the value of the '{@link CommonBehavior.SimpleTime.Interval#getMin <em>Min</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(ValueSpecification value);

} // Interval
