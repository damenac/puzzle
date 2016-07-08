/**
 */
package Actions.BasicActions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Actions.BasicActions.ValuePin#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see Actions.BasicActions.BasicActionsPackage#getValuePin()
 * @model
 * @generated
 */
public interface ValuePin extends InputPin {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(ValueSpecification)
	 * @see Actions.BasicActions.BasicActionsPackage#getValuePin_Value()
	 * @model required="true"
	 * @generated
	 */
	ValueSpecification getValue();

	/**
	 * Sets the value of the '{@link Actions.BasicActions.ValuePin#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueSpecification value);

} // ValuePin
