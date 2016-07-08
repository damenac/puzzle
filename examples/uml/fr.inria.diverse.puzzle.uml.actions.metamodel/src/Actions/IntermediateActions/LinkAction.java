/**
 */
package Actions.IntermediateActions;

import Actions.BasicActions.Action;
import Actions.BasicActions.InputPin;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Actions.IntermediateActions.LinkAction#getInputValue <em>Input Value</em>}</li>
 *   <li>{@link Actions.IntermediateActions.LinkAction#getEndData <em>End Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see Actions.IntermediateActions.IntermediateActionsPackage#getLinkAction()
 * @model
 * @generated
 */
public interface LinkAction extends Action {
	/**
	 * Returns the value of the '<em><b>Input Value</b></em>' containment reference list.
	 * The list contents are of type {@link Actions.BasicActions.InputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Value</em>' containment reference list.
	 * @see Actions.IntermediateActions.IntermediateActionsPackage#getLinkAction_InputValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InputPin> getInputValue();

	/**
	 * Returns the value of the '<em><b>End Data</b></em>' containment reference list.
	 * The list contents are of type {@link Actions.IntermediateActions.LinkEndData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Data</em>' containment reference list.
	 * @see Actions.IntermediateActions.IntermediateActionsPackage#getLinkAction_EndData()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<LinkEndData> getEndData();

} // LinkAction
