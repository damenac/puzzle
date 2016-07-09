/**
 */
package Activities.StructuredActivities;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Activities.StructuredActivities.SequenceNode#getExecutableNode <em>Executable Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see Activities.StructuredActivities.StructuredActivitiesPackage#getSequenceNode()
 * @model
 * @generated
 */
public interface SequenceNode extends StructuredActivityNode {
	/**
	 * Returns the value of the '<em><b>Executable Node</b></em>' containment reference list.
	 * The list contents are of type {@link Activities.StructuredActivities.ExecutableNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executable Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executable Node</em>' containment reference list.
	 * @see Activities.StructuredActivities.StructuredActivitiesPackage#getSequenceNode_ExecutableNode()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExecutableNode> getExecutableNode();

} // SequenceNode
