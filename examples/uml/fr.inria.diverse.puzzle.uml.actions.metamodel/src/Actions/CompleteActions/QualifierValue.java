/**
 */
package Actions.CompleteActions;

import Actions.BasicActions.InputPin;

import Actions.IntermediateActions.Element;
import Actions.IntermediateActions.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualifier Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Actions.CompleteActions.QualifierValue#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link Actions.CompleteActions.QualifierValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see Actions.CompleteActions.CompleteActionsPackage#getQualifierValue()
 * @model
 * @generated
 */
public interface QualifierValue extends Element {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' reference.
	 * @see #setQualifier(Property)
	 * @see Actions.CompleteActions.CompleteActionsPackage#getQualifierValue_Qualifier()
	 * @model required="true"
	 * @generated
	 */
	Property getQualifier();

	/**
	 * Sets the value of the '{@link Actions.CompleteActions.QualifierValue#getQualifier <em>Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(Property value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(InputPin)
	 * @see Actions.CompleteActions.CompleteActionsPackage#getQualifierValue_Value()
	 * @model required="true"
	 * @generated
	 */
	InputPin getValue();

	/**
	 * Sets the value of the '{@link Actions.CompleteActions.QualifierValue#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(InputPin value);

} // QualifierValue
