/**
 */
package CompleteDSLPckg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.ConditionalNode#isIsDeterminate <em>Is Determinate</em>}</li>
 *   <li>{@link CompleteDSLPckg.ConditionalNode#isIsAssumed <em>Is Assumed</em>}</li>
 *   <li>{@link CompleteDSLPckg.ConditionalNode#getClause <em>Clause</em>}</li>
 *   <li>{@link CompleteDSLPckg.ConditionalNode#getTest <em>Test</em>}</li>
 *   <li>{@link CompleteDSLPckg.ConditionalNode#getBody <em>Body</em>}</li>
 *   <li>{@link CompleteDSLPckg.ConditionalNode#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getConditionalNode()
 * @model
 * @generated
 */
public interface ConditionalNode extends StructuredActivityNode {
	/**
	 * Returns the value of the '<em><b>Is Determinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Determinate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Determinate</em>' attribute.
	 * @see #setIsDeterminate(boolean)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getConditionalNode_IsDeterminate()
	 * @model
	 * @generated
	 */
	boolean isIsDeterminate();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.ConditionalNode#isIsDeterminate <em>Is Determinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Determinate</em>' attribute.
	 * @see #isIsDeterminate()
	 * @generated
	 */
	void setIsDeterminate(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Assumed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Assumed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Assumed</em>' attribute.
	 * @see #setIsAssumed(boolean)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getConditionalNode_IsAssumed()
	 * @model
	 * @generated
	 */
	boolean isIsAssumed();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.ConditionalNode#isIsAssumed <em>Is Assumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Assumed</em>' attribute.
	 * @see #isIsAssumed()
	 * @generated
	 */
	void setIsAssumed(boolean value);

	/**
	 * Returns the value of the '<em><b>Clause</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Clause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clause</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clause</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getConditionalNode_Clause()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Clause> getClause();

	/**
	 * Returns the value of the '<em><b>Test</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.ExecutableNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getConditionalNode_Test()
	 * @model required="true"
	 * @generated
	 */
	EList<ExecutableNode> getTest();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.ExecutableNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getConditionalNode_Body()
	 * @model required="true"
	 * @generated
	 */
	EList<ExecutableNode> getBody();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getConditionalNode_Result()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputPin> getResult();

} // ConditionalNode
