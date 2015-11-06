/**
 */
package StateMachineModule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Console Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link StateMachineModule.ConsoleOutput#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see StateMachineModule.StateMachineModulePackage#getConsoleOutput()
 * @model
 * @generated
 */
public interface ConsoleOutput extends Statement {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see #setInput(String)
	 * @see StateMachineModule.StateMachineModulePackage#getConsoleOutput_Input()
	 * @model
	 * @generated
	 */
	String getInput();

	/**
	 * Sets the value of the '{@link StateMachineModule.ConsoleOutput#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(String value);

} // ConsoleOutput
