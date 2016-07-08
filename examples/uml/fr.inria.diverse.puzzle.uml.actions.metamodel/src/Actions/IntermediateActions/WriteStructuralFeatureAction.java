/**
 */
package Actions.IntermediateActions;

import Actions.BasicActions.InputPin;
import Actions.BasicActions.OutputPin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write Structural Feature Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Actions.IntermediateActions.WriteStructuralFeatureAction#getValue <em>Value</em>}</li>
 *   <li>{@link Actions.IntermediateActions.WriteStructuralFeatureAction#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see Actions.IntermediateActions.IntermediateActionsPackage#getWriteStructuralFeatureAction()
 * @model abstract="true"
 * @generated
 */
public interface WriteStructuralFeatureAction extends StructuralFeatureAction {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(InputPin)
	 * @see Actions.IntermediateActions.IntermediateActionsPackage#getWriteStructuralFeatureAction_Value()
	 * @model containment="true"
	 * @generated
	 */
	InputPin getValue();

	/**
	 * Sets the value of the '{@link Actions.IntermediateActions.WriteStructuralFeatureAction#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(InputPin value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(OutputPin)
	 * @see Actions.IntermediateActions.IntermediateActionsPackage#getWriteStructuralFeatureAction_Result()
	 * @model containment="true"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link Actions.IntermediateActions.WriteStructuralFeatureAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

} // WriteStructuralFeatureAction
