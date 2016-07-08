/**
 */
package Actions.CompleteActions;

import Actions.BasicActions.InputPin;
import Actions.BasicActions.OutputPin;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Readls Classified Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Actions.CompleteActions.ReadlsClassifiedObjectAction#getResult <em>Result</em>}</li>
 *   <li>{@link Actions.CompleteActions.ReadlsClassifiedObjectAction#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see Actions.CompleteActions.CompleteActionsPackage#getReadlsClassifiedObjectAction()
 * @model
 * @generated
 */
public interface ReadlsClassifiedObjectAction extends EObject {
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
	 * @see Actions.CompleteActions.CompleteActionsPackage#getReadlsClassifiedObjectAction_Result()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link Actions.CompleteActions.ReadlsClassifiedObjectAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

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
	 * @see Actions.CompleteActions.CompleteActionsPackage#getReadlsClassifiedObjectAction_Object()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InputPin getObject();

	/**
	 * Sets the value of the '{@link Actions.CompleteActions.ReadlsClassifiedObjectAction#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(InputPin value);

} // ReadlsClassifiedObjectAction
