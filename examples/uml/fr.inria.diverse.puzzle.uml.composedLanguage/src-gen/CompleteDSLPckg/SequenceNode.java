/**
 */
package CompleteDSLPckg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.SequenceNode#getExecutableNode <em>Executable Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getSequenceNode()
 * @model
 * @generated
 */
public interface SequenceNode extends StructuredActivityNode {
	/**
	 * Returns the value of the '<em><b>Executable Node</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.ExecutableNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executable Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executable Node</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getSequenceNode_ExecutableNode()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExecutableNode> getExecutableNode();

} // SequenceNode
