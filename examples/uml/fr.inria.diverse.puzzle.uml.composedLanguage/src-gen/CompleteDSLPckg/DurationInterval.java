/**
 */
package CompleteDSLPckg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.DurationInterval#getDurationMax <em>Duration Max</em>}</li>
 *   <li>{@link CompleteDSLPckg.DurationInterval#getDurationMin <em>Duration Min</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getDurationInterval()
 * @model
 * @generated
 */
public interface DurationInterval extends Interval {
	/**
	 * Returns the value of the '<em><b>Duration Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration Max</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Max</em>' reference.
	 * @see #setDurationMax(Duration)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getDurationInterval_DurationMax()
	 * @model required="true"
	 * @generated
	 */
	Duration getDurationMax();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.DurationInterval#getDurationMax <em>Duration Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Max</em>' reference.
	 * @see #getDurationMax()
	 * @generated
	 */
	void setDurationMax(Duration value);

	/**
	 * Returns the value of the '<em><b>Duration Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration Min</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Min</em>' reference.
	 * @see #setDurationMin(Duration)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getDurationInterval_DurationMin()
	 * @model required="true"
	 * @generated
	 */
	Duration getDurationMin();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.DurationInterval#getDurationMin <em>Duration Min</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Min</em>' reference.
	 * @see #getDurationMin()
	 * @generated
	 */
	void setDurationMin(Duration value);

} // DurationInterval
