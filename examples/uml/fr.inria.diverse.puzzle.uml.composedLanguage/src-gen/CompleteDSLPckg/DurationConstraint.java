/**
 */
package CompleteDSLPckg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.DurationConstraint#isFirstEvent <em>First Event</em>}</li>
 *   <li>{@link CompleteDSLPckg.DurationConstraint#getDurationSpecification <em>Duration Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getDurationConstraint()
 * @model
 * @generated
 */
public interface DurationConstraint extends IntervalConstraint {
	/**
	 * Returns the value of the '<em><b>First Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Event</em>' attribute.
	 * @see #setFirstEvent(boolean)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getDurationConstraint_FirstEvent()
	 * @model
	 * @generated
	 */
	boolean isFirstEvent();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.DurationConstraint#isFirstEvent <em>First Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Event</em>' attribute.
	 * @see #isFirstEvent()
	 * @generated
	 */
	void setFirstEvent(boolean value);

	/**
	 * Returns the value of the '<em><b>Duration Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Specification</em>' reference.
	 * @see #setDurationSpecification(DurationInterval)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getDurationConstraint_DurationSpecification()
	 * @model required="true"
	 * @generated
	 */
	DurationInterval getDurationSpecification();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.DurationConstraint#getDurationSpecification <em>Duration Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Specification</em>' reference.
	 * @see #getDurationSpecification()
	 * @generated
	 */
	void setDurationSpecification(DurationInterval value);

} // DurationConstraint
