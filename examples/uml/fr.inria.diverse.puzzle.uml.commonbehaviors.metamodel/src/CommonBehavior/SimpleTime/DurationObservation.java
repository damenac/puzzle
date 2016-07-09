/**
 */
package CommonBehavior.SimpleTime;

import CommonBehavior.Communications.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CommonBehavior.SimpleTime.DurationObservation#getFirstEvent <em>First Event</em>}</li>
 *   <li>{@link CommonBehavior.SimpleTime.DurationObservation#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see CommonBehavior.SimpleTime.SimpleTimePackage#getDurationObservation()
 * @model
 * @generated
 */
public interface DurationObservation extends Observation {
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
	 * @see CommonBehavior.SimpleTime.SimpleTimePackage#getDurationObservation_FirstEvent()
	 * @model upper="2"
	 * @generated
	 */
	EList<Boolean> getFirstEvent();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference list.
	 * The list contents are of type {@link CommonBehavior.Communications.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference list.
	 * @see CommonBehavior.SimpleTime.SimpleTimePackage#getDurationObservation_Event()
	 * @model required="true" upper="2"
	 * @generated
	 */
	EList<NamedElement> getEvent();

} // DurationObservation
