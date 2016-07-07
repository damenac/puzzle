/**
 */
package AndTriggerModuleProv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AndTriggerModuleProv.AndTrigger#getLeft <em>Left</em>}</li>
 *   <li>{@link AndTriggerModuleProv.AndTrigger#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see AndTriggerModuleProv.AndTriggerModuleProvPackage#getAndTrigger()
 * @model
 * @generated
 */
public interface AndTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(Trigger)
	 * @see AndTriggerModuleProv.AndTriggerModuleProvPackage#getAndTrigger_Left()
	 * @model required="true"
	 * @generated
	 */
	Trigger getLeft();

	/**
	 * Sets the value of the '{@link AndTriggerModuleProv.AndTrigger#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Trigger value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(Trigger)
	 * @see AndTriggerModuleProv.AndTriggerModuleProvPackage#getAndTrigger_Right()
	 * @model required="true"
	 * @generated
	 */
	Trigger getRight();

	/**
	 * Sets the value of the '{@link AndTriggerModuleProv.AndTrigger#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Trigger value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean evalTrigger(Object events);

} // AndTrigger
