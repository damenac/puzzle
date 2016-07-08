/**
 */
package Actions.IntermediateActions;

import Actions.BasicActions.InputPin;

import Actions.CompleteActions.QualifierValue;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link End Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Actions.IntermediateActions.LinkEndData#getValue <em>Value</em>}</li>
 *   <li>{@link Actions.IntermediateActions.LinkEndData#getEnd <em>End</em>}</li>
 *   <li>{@link Actions.IntermediateActions.LinkEndData#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see Actions.IntermediateActions.IntermediateActionsPackage#getLinkEndData()
 * @model abstract="true"
 * @generated
 */
public interface LinkEndData extends Element {
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
	 * @see Actions.IntermediateActions.IntermediateActionsPackage#getLinkEndData_Value()
	 * @model
	 * @generated
	 */
	InputPin getValue();

	/**
	 * Sets the value of the '{@link Actions.IntermediateActions.LinkEndData#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(InputPin value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(Property)
	 * @see Actions.IntermediateActions.IntermediateActionsPackage#getLinkEndData_End()
	 * @model required="true"
	 * @generated
	 */
	Property getEnd();

	/**
	 * Sets the value of the '{@link Actions.IntermediateActions.LinkEndData#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Property value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link Actions.CompleteActions.QualifierValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference list.
	 * @see Actions.IntermediateActions.IntermediateActionsPackage#getLinkEndData_Qualifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<QualifierValue> getQualifier();

} // LinkEndData
