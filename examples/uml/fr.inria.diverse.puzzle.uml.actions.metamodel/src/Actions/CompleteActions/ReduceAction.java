/**
 */
package Actions.CompleteActions;

import Actions.BasicActions.Action;
import Actions.BasicActions.Behavior;
import Actions.BasicActions.InputPin;
import Actions.BasicActions.OutputPin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reduce Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Actions.CompleteActions.ReduceAction#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link Actions.CompleteActions.ReduceAction#getResult <em>Result</em>}</li>
 *   <li>{@link Actions.CompleteActions.ReduceAction#getCollection <em>Collection</em>}</li>
 *   <li>{@link Actions.CompleteActions.ReduceAction#getReducer <em>Reducer</em>}</li>
 * </ul>
 * </p>
 *
 * @see Actions.CompleteActions.CompleteActionsPackage#getReduceAction()
 * @model
 * @generated
 */
public interface ReduceAction extends Action {
	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see #setIsOrdered(boolean)
	 * @see Actions.CompleteActions.CompleteActionsPackage#getReduceAction_IsOrdered()
	 * @model
	 * @generated
	 */
	boolean isIsOrdered();

	/**
	 * Sets the value of the '{@link Actions.CompleteActions.ReduceAction#isIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #isIsOrdered()
	 * @generated
	 */
	void setIsOrdered(boolean value);

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
	 * @see Actions.CompleteActions.CompleteActionsPackage#getReduceAction_Result()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link Actions.CompleteActions.ReduceAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference.
	 * @see #setCollection(InputPin)
	 * @see Actions.CompleteActions.CompleteActionsPackage#getReduceAction_Collection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InputPin getCollection();

	/**
	 * Sets the value of the '{@link Actions.CompleteActions.ReduceAction#getCollection <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' containment reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(InputPin value);

	/**
	 * Returns the value of the '<em><b>Reducer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reducer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reducer</em>' reference.
	 * @see #setReducer(Behavior)
	 * @see Actions.CompleteActions.CompleteActionsPackage#getReduceAction_Reducer()
	 * @model required="true"
	 * @generated
	 */
	Behavior getReducer();

	/**
	 * Sets the value of the '{@link Actions.CompleteActions.ReduceAction#getReducer <em>Reducer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reducer</em>' reference.
	 * @see #getReducer()
	 * @generated
	 */
	void setReducer(Behavior value);

} // ReduceAction
