/**
 */
package CommonBehavior.SimpleTime;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CommonBehavior.SimpleTime.DurationConstraint#getFirstEvent <em>First Event</em>}</li>
 *   <li>{@link CommonBehavior.SimpleTime.DurationConstraint#getDurationSpecification <em>Duration Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see CommonBehavior.SimpleTime.SimpleTimePackage#getDurationConstraint()
 * @model
 * @generated
 */
public interface DurationConstraint extends IntervalConstraint {
	/**
	 * Returns the value of the '<em><b>First Event</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Event</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Event</em>' attribute list.
	 * @see CommonBehavior.SimpleTime.SimpleTimePackage#getDurationConstraint_FirstEvent()
	 * @model upper="2"
	 * @generated
	 */
	EList<Boolean> getFirstEvent();

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
	 * @see CommonBehavior.SimpleTime.SimpleTimePackage#getDurationConstraint_DurationSpecification()
	 * @model required="true"
	 * @generated
	 */
	DurationInterval getDurationSpecification();

	/**
	 * Sets the value of the '{@link CommonBehavior.SimpleTime.DurationConstraint#getDurationSpecification <em>Duration Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Specification</em>' reference.
	 * @see #getDurationSpecification()
	 * @generated
	 */
	void setDurationSpecification(DurationInterval value);

} // DurationConstraint
