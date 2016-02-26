/**
 */
package fmpl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fmpl.Init#getAutomata <em>Automata</em>}</li>
 * </ul>
 * </p>
 *
 * @see fmpl.FmplPackage#getInit()
 * @model
 * @generated
 */
public interface Init extends Expression {
	/**
	 * Returns the value of the '<em><b>Automata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Automata</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automata</em>' reference.
	 * @see #setAutomata(Automata)
	 * @see fmpl.FmplPackage#getInit_Automata()
	 * @model required="true"
	 * @generated
	 */
	Automata getAutomata();

	/**
	 * Sets the value of the '{@link fmpl.Init#getAutomata <em>Automata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automata</em>' reference.
	 * @see #getAutomata()
	 * @generated
	 */
	void setAutomata(Automata value);

} // Init
