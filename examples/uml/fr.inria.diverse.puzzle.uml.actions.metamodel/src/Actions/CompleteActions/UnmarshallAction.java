/**
 */
package Actions.CompleteActions;

import Actions.BasicActions.Action;
import Actions.BasicActions.Classifier;
import Actions.BasicActions.InputPin;
import Actions.BasicActions.OutputPin;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unmarshall Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Actions.CompleteActions.UnmarshallAction#getObject <em>Object</em>}</li>
 *   <li>{@link Actions.CompleteActions.UnmarshallAction#getUnmarshallType <em>Unmarshall Type</em>}</li>
 *   <li>{@link Actions.CompleteActions.UnmarshallAction#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see Actions.CompleteActions.CompleteActionsPackage#getUnmarshallAction()
 * @model
 * @generated
 */
public interface UnmarshallAction extends Action {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(InputPin)
	 * @see Actions.CompleteActions.CompleteActionsPackage#getUnmarshallAction_Object()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InputPin getObject();

	/**
	 * Sets the value of the '{@link Actions.CompleteActions.UnmarshallAction#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(InputPin value);

	/**
	 * Returns the value of the '<em><b>Unmarshall Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unmarshall Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unmarshall Type</em>' reference.
	 * @see #setUnmarshallType(Classifier)
	 * @see Actions.CompleteActions.CompleteActionsPackage#getUnmarshallAction_UnmarshallType()
	 * @model required="true"
	 * @generated
	 */
	Classifier getUnmarshallType();

	/**
	 * Sets the value of the '{@link Actions.CompleteActions.UnmarshallAction#getUnmarshallType <em>Unmarshall Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unmarshall Type</em>' reference.
	 * @see #getUnmarshallType()
	 * @generated
	 */
	void setUnmarshallType(Classifier value);

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
	 * @see Actions.CompleteActions.CompleteActionsPackage#getUnmarshallAction_Result()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OutputPin> getResult();

} // UnmarshallAction
