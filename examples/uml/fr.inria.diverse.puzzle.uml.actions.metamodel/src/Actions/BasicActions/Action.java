/**
 */
package Actions.BasicActions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Actions.BasicActions.Action#getContext <em>Context</em>}</li>
 *   <li>{@link Actions.BasicActions.Action#getInput <em>Input</em>}</li>
 *   <li>{@link Actions.BasicActions.Action#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see Actions.BasicActions.BasicActionsPackage#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Classifier)
	 * @see Actions.BasicActions.BasicActionsPackage#getAction_Context()
	 * @model
	 * @generated
	 */
	Classifier getContext();

	/**
	 * Sets the value of the '{@link Actions.BasicActions.Action#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Classifier value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link Actions.BasicActions.InputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see Actions.BasicActions.BasicActionsPackage#getAction_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputPin> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link Actions.BasicActions.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see Actions.BasicActions.BasicActionsPackage#getAction_Output()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputPin> getOutput();

} // Action
