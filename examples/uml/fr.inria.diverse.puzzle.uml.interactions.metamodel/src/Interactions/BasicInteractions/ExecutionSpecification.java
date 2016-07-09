/**
 */
package Interactions.BasicInteractions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Interactions.BasicInteractions.ExecutionSpecification#getStart <em>Start</em>}</li>
 *   <li>{@link Interactions.BasicInteractions.ExecutionSpecification#getFinish <em>Finish</em>}</li>
 * </ul>
 * </p>
 *
 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getExecutionSpecification()
 * @model abstract="true"
 * @generated
 */
public interface ExecutionSpecification extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(OccurenceSpecification)
	 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getExecutionSpecification_Start()
	 * @model required="true"
	 * @generated
	 */
	OccurenceSpecification getStart();

	/**
	 * Sets the value of the '{@link Interactions.BasicInteractions.ExecutionSpecification#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(OccurenceSpecification value);

	/**
	 * Returns the value of the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finish</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finish</em>' reference.
	 * @see #setFinish(OccurenceSpecification)
	 * @see Interactions.BasicInteractions.BasicInteractionsPackage#getExecutionSpecification_Finish()
	 * @model required="true"
	 * @generated
	 */
	OccurenceSpecification getFinish();

	/**
	 * Sets the value of the '{@link Interactions.BasicInteractions.ExecutionSpecification#getFinish <em>Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish</em>' reference.
	 * @see #getFinish()
	 * @generated
	 */
	void setFinish(OccurenceSpecification value);

} // ExecutionSpecification
