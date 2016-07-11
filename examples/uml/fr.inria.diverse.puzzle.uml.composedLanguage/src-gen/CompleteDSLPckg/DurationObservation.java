/**
 */
package CompleteDSLPckg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.DurationObservation#isFirstEvent <em>First Event</em>}</li>
 *   <li>{@link CompleteDSLPckg.DurationObservation#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getDurationObservation()
 * @model
 * @generated
 */
public interface DurationObservation extends Observation {
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
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getDurationObservation_FirstEvent()
	 * @model
	 * @generated
	 */
	boolean isFirstEvent();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.DurationObservation#isFirstEvent <em>First Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Event</em>' attribute.
	 * @see #isFirstEvent()
	 * @generated
	 */
	void setFirstEvent(boolean value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getDurationObservation_Event()
	 * @model required="true" upper="2"
	 * @generated
	 */
	EList<NamedElement> getEvent();

} // DurationObservation
