/**
 */
package CompleteDSLPckg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.StructuredActivityNode#isMustIsolate <em>Must Isolate</em>}</li>
 *   <li>{@link CompleteDSLPckg.StructuredActivityNode#getActivity <em>Activity</em>}</li>
 *   <li>{@link CompleteDSLPckg.StructuredActivityNode#getVariable <em>Variable</em>}</li>
 *   <li>{@link CompleteDSLPckg.StructuredActivityNode#getNode <em>Node</em>}</li>
 *   <li>{@link CompleteDSLPckg.StructuredActivityNode#getStructuredNodeInput <em>Structured Node Input</em>}</li>
 *   <li>{@link CompleteDSLPckg.StructuredActivityNode#getEdge <em>Edge</em>}</li>
 *   <li>{@link CompleteDSLPckg.StructuredActivityNode#getStructuredNodeOutput <em>Structured Node Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getStructuredActivityNode()
 * @model
 * @generated
 */
public interface StructuredActivityNode extends Namespace, ExecutableNode, ActivityGroup, Action {
	/**
	 * Returns the value of the '<em><b>Must Isolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Must Isolate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Isolate</em>' attribute.
	 * @see #setMustIsolate(boolean)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getStructuredActivityNode_MustIsolate()
	 * @model
	 * @generated
	 */
	boolean isMustIsolate();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.StructuredActivityNode#isMustIsolate <em>Must Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Isolate</em>' attribute.
	 * @see #isMustIsolate()
	 * @generated
	 */
	void setMustIsolate(boolean value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Activity)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getStructuredActivityNode_Activity()
	 * @model
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.StructuredActivityNode#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getStructuredActivityNode_Variable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariable();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getStructuredActivityNode_Node()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityNode> getNode();

	/**
	 * Returns the value of the '<em><b>Structured Node Input</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.InputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured Node Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured Node Input</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getStructuredActivityNode_StructuredNodeInput()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputPin> getStructuredNodeInput();

	/**
	 * Returns the value of the '<em><b>Edge</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getStructuredActivityNode_Edge()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityEdge> getEdge();

	/**
	 * Returns the value of the '<em><b>Structured Node Output</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured Node Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured Node Output</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getStructuredActivityNode_StructuredNodeOutput()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputPin> getStructuredNodeOutput();

} // StructuredActivityNode
