/**
 */
package CompleteDSLPckg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.ActivityNode#getInGroup <em>In Group</em>}</li>
 *   <li>{@link CompleteDSLPckg.ActivityNode#getRedefinedNode <em>Redefined Node</em>}</li>
 *   <li>{@link CompleteDSLPckg.ActivityNode#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link CompleteDSLPckg.ActivityNode#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link CompleteDSLPckg.ActivityNode#getInPartition <em>In Partition</em>}</li>
 *   <li>{@link CompleteDSLPckg.ActivityNode#getInInterruptibleRegion <em>In Interruptible Region</em>}</li>
 *   <li>{@link CompleteDSLPckg.ActivityNode#getInStructuredNode <em>In Structured Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getActivityNode()
 * @model abstract="true"
 * @generated
 */
public interface ActivityNode extends NamedElement, RedefinableElement {
	/**
	 * Returns the value of the '<em><b>In Group</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.ActivityGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Group</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Group</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getActivityNode_InGroup()
	 * @model
	 * @generated
	 */
	EList<ActivityGroup> getInGroup();

	/**
	 * Returns the value of the '<em><b>Redefined Node</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Node</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getActivityNode_RedefinedNode()
	 * @model
	 * @generated
	 */
	EList<ActivityNode> getRedefinedNode();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getActivityNode_Incoming()
	 * @model
	 * @generated
	 */
	EList<ActivityEdge> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getActivityNode_Outgoing()
	 * @model
	 * @generated
	 */
	EList<ActivityEdge> getOutgoing();

	/**
	 * Returns the value of the '<em><b>In Partition</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.ActivityPartition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Partition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Partition</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getActivityNode_InPartition()
	 * @model
	 * @generated
	 */
	EList<ActivityPartition> getInPartition();

	/**
	 * Returns the value of the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Interruptible Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Interruptible Region</em>' reference.
	 * @see #setInInterruptibleRegion(InterruptibleActivityRegion)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getActivityNode_InInterruptibleRegion()
	 * @model
	 * @generated
	 */
	InterruptibleActivityRegion getInInterruptibleRegion();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.ActivityNode#getInInterruptibleRegion <em>In Interruptible Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Interruptible Region</em>' reference.
	 * @see #getInInterruptibleRegion()
	 * @generated
	 */
	void setInInterruptibleRegion(InterruptibleActivityRegion value);

	/**
	 * Returns the value of the '<em><b>In Structured Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Structured Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Structured Node</em>' reference.
	 * @see #setInStructuredNode(StructuredActivityNode)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getActivityNode_InStructuredNode()
	 * @model
	 * @generated
	 */
	StructuredActivityNode getInStructuredNode();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.ActivityNode#getInStructuredNode <em>In Structured Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Structured Node</em>' reference.
	 * @see #getInStructuredNode()
	 * @generated
	 */
	void setInStructuredNode(StructuredActivityNode value);

} // ActivityNode
