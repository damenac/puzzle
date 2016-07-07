/**
 */
package NotTriggerModuleProv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NotTriggerModuleProv.NotTrigger#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see NotTriggerModuleProv.NotTriggerModuleProvPackage#getNotTrigger()
 * @model
 * @generated
 */
public interface NotTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' reference.
	 * @see #setTrigger(Trigger)
	 * @see NotTriggerModuleProv.NotTriggerModuleProvPackage#getNotTrigger_Trigger()
	 * @model required="true"
	 * @generated
	 */
	Trigger getTrigger();

	/**
	 * Sets the value of the '{@link NotTriggerModuleProv.NotTrigger#getTrigger <em>Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(Trigger value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean evalTrigger(Object events);

} // NotTrigger
