/**
 */
package Actions.CompleteActions;

import Actions.BasicActions.Action;
import Actions.BasicActions.Classifier;
import Actions.BasicActions.InputPin;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reclassify Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Actions.CompleteActions.ReclassifyObjectAction#isIsReplaceAll <em>Is Replace All</em>}</li>
 *   <li>{@link Actions.CompleteActions.ReclassifyObjectAction#getObject <em>Object</em>}</li>
 *   <li>{@link Actions.CompleteActions.ReclassifyObjectAction#getOldClassifier <em>Old Classifier</em>}</li>
 *   <li>{@link Actions.CompleteActions.ReclassifyObjectAction#getNewClassifier <em>New Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see Actions.CompleteActions.CompleteActionsPackage#getReclassifyObjectAction()
 * @model
 * @generated
 */
public interface ReclassifyObjectAction extends Action {
	/**
	 * Returns the value of the '<em><b>Is Replace All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Replace All</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Replace All</em>' attribute.
	 * @see #setIsReplaceAll(boolean)
	 * @see Actions.CompleteActions.CompleteActionsPackage#getReclassifyObjectAction_IsReplaceAll()
	 * @model
	 * @generated
	 */
	boolean isIsReplaceAll();

	/**
	 * Sets the value of the '{@link Actions.CompleteActions.ReclassifyObjectAction#isIsReplaceAll <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Replace All</em>' attribute.
	 * @see #isIsReplaceAll()
	 * @generated
	 */
	void setIsReplaceAll(boolean value);

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
	 * @see Actions.CompleteActions.CompleteActionsPackage#getReclassifyObjectAction_Object()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InputPin getObject();

	/**
	 * Sets the value of the '{@link Actions.CompleteActions.ReclassifyObjectAction#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(InputPin value);

	/**
	 * Returns the value of the '<em><b>Old Classifier</b></em>' reference list.
	 * The list contents are of type {@link Actions.BasicActions.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Classifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Classifier</em>' reference list.
	 * @see Actions.CompleteActions.CompleteActionsPackage#getReclassifyObjectAction_OldClassifier()
	 * @model
	 * @generated
	 */
	EList<Classifier> getOldClassifier();

	/**
	 * Returns the value of the '<em><b>New Classifier</b></em>' reference list.
	 * The list contents are of type {@link Actions.BasicActions.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Classifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Classifier</em>' reference list.
	 * @see Actions.CompleteActions.CompleteActionsPackage#getReclassifyObjectAction_NewClassifier()
	 * @model
	 * @generated
	 */
	EList<Classifier> getNewClassifier();

} // ReclassifyObjectAction
