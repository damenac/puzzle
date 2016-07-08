/**
 */
package Actions.IntermediateActions;

import Actions.BasicActions.Action;
import Actions.BasicActions.OutputPin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Self Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Actions.IntermediateActions.ReadSelfAction#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see Actions.IntermediateActions.IntermediateActionsPackage#getReadSelfAction()
 * @model
 * @generated
 */
public interface ReadSelfAction extends Action {
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
	 * @see Actions.IntermediateActions.IntermediateActionsPackage#getReadSelfAction_Result()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link Actions.IntermediateActions.ReadSelfAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

} // ReadSelfAction
