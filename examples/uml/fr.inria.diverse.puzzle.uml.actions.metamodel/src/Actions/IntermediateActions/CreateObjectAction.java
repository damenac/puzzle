/**
 */
package Actions.IntermediateActions;

import Actions.BasicActions.Action;
import Actions.BasicActions.Classifier;
import Actions.BasicActions.OutputPin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Actions.IntermediateActions.CreateObjectAction#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link Actions.IntermediateActions.CreateObjectAction#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see Actions.IntermediateActions.IntermediateActionsPackage#getCreateObjectAction()
 * @model
 * @generated
 */
public interface CreateObjectAction extends Action {
	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' reference.
	 * @see #setClassifier(Classifier)
	 * @see Actions.IntermediateActions.IntermediateActionsPackage#getCreateObjectAction_Classifier()
	 * @model required="true"
	 * @generated
	 */
	Classifier getClassifier();

	/**
	 * Sets the value of the '{@link Actions.IntermediateActions.CreateObjectAction#getClassifier <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier</em>' reference.
	 * @see #getClassifier()
	 * @generated
	 */
	void setClassifier(Classifier value);

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
	 * @see Actions.IntermediateActions.IntermediateActionsPackage#getCreateObjectAction_Result()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link Actions.IntermediateActions.CreateObjectAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

} // CreateObjectAction
