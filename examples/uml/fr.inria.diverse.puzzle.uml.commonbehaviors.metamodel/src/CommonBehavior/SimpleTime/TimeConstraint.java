/**
 */
package CommonBehavior.SimpleTime;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CommonBehavior.SimpleTime.TimeConstraint#isFirstEvent <em>First Event</em>}</li>
 *   <li>{@link CommonBehavior.SimpleTime.TimeConstraint#getTimeSpecification <em>Time Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see CommonBehavior.SimpleTime.SimpleTimePackage#getTimeConstraint()
 * @model
 * @generated
 */
public interface TimeConstraint extends IntervalConstraint {
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
	 * @see CommonBehavior.SimpleTime.SimpleTimePackage#getTimeConstraint_FirstEvent()
	 * @model
	 * @generated
	 */
	boolean isFirstEvent();

	/**
	 * Sets the value of the '{@link CommonBehavior.SimpleTime.TimeConstraint#isFirstEvent <em>First Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Event</em>' attribute.
	 * @see #isFirstEvent()
	 * @generated
	 */
	void setFirstEvent(boolean value);

	/**
	 * Returns the value of the '<em><b>Time Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Specification</em>' reference.
	 * @see #setTimeSpecification(TimeInterval)
	 * @see CommonBehavior.SimpleTime.SimpleTimePackage#getTimeConstraint_TimeSpecification()
	 * @model required="true"
	 * @generated
	 */
	TimeInterval getTimeSpecification();

	/**
	 * Sets the value of the '{@link CommonBehavior.SimpleTime.TimeConstraint#getTimeSpecification <em>Time Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Specification</em>' reference.
	 * @see #getTimeSpecification()
	 * @generated
	 */
	void setTimeSpecification(TimeInterval value);

} // TimeConstraint
