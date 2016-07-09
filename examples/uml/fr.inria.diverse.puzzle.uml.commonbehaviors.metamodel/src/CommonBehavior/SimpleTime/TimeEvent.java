/**
 */
package CommonBehavior.SimpleTime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CommonBehavior.SimpleTime.TimeEvent#isIsRelative <em>Is Relative</em>}</li>
 *   <li>{@link CommonBehavior.SimpleTime.TimeEvent#getWhen <em>When</em>}</li>
 * </ul>
 * </p>
 *
 * @see CommonBehavior.SimpleTime.SimpleTimePackage#getTimeEvent()
 * @model
 * @generated
 */
public interface TimeEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Relative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Relative</em>' attribute.
	 * @see #setIsRelative(boolean)
	 * @see CommonBehavior.SimpleTime.SimpleTimePackage#getTimeEvent_IsRelative()
	 * @model
	 * @generated
	 */
	boolean isIsRelative();

	/**
	 * Sets the value of the '{@link CommonBehavior.SimpleTime.TimeEvent#isIsRelative <em>Is Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Relative</em>' attribute.
	 * @see #isIsRelative()
	 * @generated
	 */
	void setIsRelative(boolean value);

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference.
	 * @see #setWhen(TimeExpression)
	 * @see CommonBehavior.SimpleTime.SimpleTimePackage#getTimeEvent_When()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeExpression getWhen();

	/**
	 * Sets the value of the '{@link CommonBehavior.SimpleTime.TimeEvent#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(TimeExpression value);

} // TimeEvent
