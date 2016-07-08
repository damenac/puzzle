/**
 */
package Actions.CompleteActions;

import Actions.BasicActions.Action;
import Actions.BasicActions.OutputPin;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accept Event Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Actions.CompleteActions.AcceptEventAction#isIsUnmarshall <em>Is Unmarshall</em>}</li>
 *   <li>{@link Actions.CompleteActions.AcceptEventAction#getResult <em>Result</em>}</li>
 *   <li>{@link Actions.CompleteActions.AcceptEventAction#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see Actions.CompleteActions.CompleteActionsPackage#getAcceptEventAction()
 * @model
 * @generated
 */
public interface AcceptEventAction extends Action {
	/**
	 * Returns the value of the '<em><b>Is Unmarshall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Unmarshall</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unmarshall</em>' attribute.
	 * @see #setIsUnmarshall(boolean)
	 * @see Actions.CompleteActions.CompleteActionsPackage#getAcceptEventAction_IsUnmarshall()
	 * @model
	 * @generated
	 */
	boolean isIsUnmarshall();

	/**
	 * Sets the value of the '{@link Actions.CompleteActions.AcceptEventAction#isIsUnmarshall <em>Is Unmarshall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unmarshall</em>' attribute.
	 * @see #isIsUnmarshall()
	 * @generated
	 */
	void setIsUnmarshall(boolean value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link Actions.BasicActions.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see Actions.CompleteActions.CompleteActionsPackage#getAcceptEventAction_Result()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputPin> getResult();

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link Actions.CompleteActions.Trigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference list.
	 * @see Actions.CompleteActions.CompleteActionsPackage#getAcceptEventAction_Trigger()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Trigger> getTrigger();

} // AcceptEventAction
