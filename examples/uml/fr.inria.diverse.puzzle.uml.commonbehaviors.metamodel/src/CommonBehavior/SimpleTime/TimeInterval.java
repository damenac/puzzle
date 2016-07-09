/**
 */
package CommonBehavior.SimpleTime;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CommonBehavior.SimpleTime.TimeInterval#getTimeMax <em>Time Max</em>}</li>
 *   <li>{@link CommonBehavior.SimpleTime.TimeInterval#getTimeMin <em>Time Min</em>}</li>
 * </ul>
 * </p>
 *
 * @see CommonBehavior.SimpleTime.SimpleTimePackage#getTimeInterval()
 * @model
 * @generated
 */
public interface TimeInterval extends Interval {
	/**
	 * Returns the value of the '<em><b>Time Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Max</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Max</em>' reference.
	 * @see #setTimeMax(TimeExpression)
	 * @see CommonBehavior.SimpleTime.SimpleTimePackage#getTimeInterval_TimeMax()
	 * @model required="true"
	 * @generated
	 */
	TimeExpression getTimeMax();

	/**
	 * Sets the value of the '{@link CommonBehavior.SimpleTime.TimeInterval#getTimeMax <em>Time Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Max</em>' reference.
	 * @see #getTimeMax()
	 * @generated
	 */
	void setTimeMax(TimeExpression value);

	/**
	 * Returns the value of the '<em><b>Time Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Min</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Min</em>' reference.
	 * @see #setTimeMin(TimeExpression)
	 * @see CommonBehavior.SimpleTime.SimpleTimePackage#getTimeInterval_TimeMin()
	 * @model required="true"
	 * @generated
	 */
	TimeExpression getTimeMin();

	/**
	 * Sets the value of the '{@link CommonBehavior.SimpleTime.TimeInterval#getTimeMin <em>Time Min</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Min</em>' reference.
	 * @see #getTimeMin()
	 * @generated
	 */
	void setTimeMin(TimeExpression value);

} // TimeInterval
