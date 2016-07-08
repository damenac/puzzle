/**
 */
package Actions.BasicActions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Actions.BasicActions.OpaqueAction#getBody <em>Body</em>}</li>
 *   <li>{@link Actions.BasicActions.OpaqueAction#getLanguage <em>Language</em>}</li>
 *   <li>{@link Actions.BasicActions.OpaqueAction#getInputValue <em>Input Value</em>}</li>
 *   <li>{@link Actions.BasicActions.OpaqueAction#getOutputValue <em>Output Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see Actions.BasicActions.BasicActionsPackage#getOpaqueAction()
 * @model
 * @generated
 */
public interface OpaqueAction extends Action {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute list.
	 * @see Actions.BasicActions.BasicActionsPackage#getOpaqueAction_Body()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getBody();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute list.
	 * @see Actions.BasicActions.BasicActionsPackage#getOpaqueAction_Language()
	 * @model
	 * @generated
	 */
	EList<String> getLanguage();

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
	 * @see Actions.BasicActions.BasicActionsPackage#getOpaqueAction_InputValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputPin> getInputValue();

	/**
	 * Returns the value of the '<em><b>Output Value</b></em>' containment reference list.
	 * The list contents are of type {@link Actions.BasicActions.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Value</em>' containment reference list.
	 * @see Actions.BasicActions.BasicActionsPackage#getOpaqueAction_OutputValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputPin> getOutputValue();

} // OpaqueAction
