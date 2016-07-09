/**
 */
package Activities.BasicActivities;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Activities.BasicActivities.Pin#isIsControl <em>Is Control</em>}</li>
 * </ul>
 * </p>
 *
 * @see Activities.BasicActivities.BasicActivitiesPackage#getPin()
 * @model abstract="true"
 * @generated
 */
public interface Pin extends ObjectNode {
	/**
	 * Returns the value of the '<em><b>Is Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Control</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Control</em>' attribute.
	 * @see #setIsControl(boolean)
	 * @see Activities.BasicActivities.BasicActivitiesPackage#getPin_IsControl()
	 * @model
	 * @generated
	 */
	boolean isIsControl();

	/**
	 * Sets the value of the '{@link Activities.BasicActivities.Pin#isIsControl <em>Is Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Control</em>' attribute.
	 * @see #isIsControl()
	 * @generated
	 */
	void setIsControl(boolean value);

} // Pin
