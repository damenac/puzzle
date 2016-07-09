/**
 */
package Activities.FundamentalActivities;

import Activities.BasicActivities.ActivityEdge;
import Activities.BasicActivities.RedefinableElement;

import Activities.IntermediateActivities.ActivityPartition;
import Activities.IntermediateActivities.InterruptibleActivityRegion;

import Activities.StructuredActivities.StructuredActivityNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Activities.FundamentalActivities.ActivityNode#getInGroup <em>In Group</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.ActivityNode#getRedefinedNode <em>Redefined Node</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.ActivityNode#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.ActivityNode#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.ActivityNode#getInPartition <em>In Partition</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.ActivityNode#getInInterruptibleRegion <em>In Interruptible Region</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.ActivityNode#getInStructuredNode <em>In Structured Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getActivityNode()
 * @model abstract="true"
 * @generated
 */
public interface ActivityNode extends NamedElement, RedefinableElement {
	/**
	 * Returns the value of the '<em><b>In Group</b></em>' reference list.
	 * The list contents are of type {@link Activities.FundamentalActivities.ActivityGroup}.
	 * It is bidirectional and its opposite is '{@link Activities.FundamentalActivities.ActivityGroup#getContainedNode <em>Contained Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Group</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Group</em>' reference list.
	 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getActivityNode_InGroup()
	 * @see Activities.FundamentalActivities.ActivityGroup#getContainedNode
	 * @model opposite="containedNode"
	 * @generated
	 */
	EList<ActivityGroup> getInGroup();

	/**
	 * Returns the value of the '<em><b>Redefined Node</b></em>' reference list.
	 * The list contents are of type {@link Activities.FundamentalActivities.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Node</em>' reference list.
	 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getActivityNode_RedefinedNode()
	 * @model
	 * @generated
	 */
	EList<ActivityNode> getRedefinedNode();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link Activities.BasicActivities.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link Activities.BasicActivities.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getActivityNode_Incoming()
	 * @see Activities.BasicActivities.ActivityEdge#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<ActivityEdge> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link Activities.BasicActivities.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link Activities.BasicActivities.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getActivityNode_Outgoing()
	 * @see Activities.BasicActivities.ActivityEdge#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<ActivityEdge> getOutgoing();

	/**
	 * Returns the value of the '<em><b>In Partition</b></em>' reference list.
	 * The list contents are of type {@link Activities.IntermediateActivities.ActivityPartition}.
	 * It is bidirectional and its opposite is '{@link Activities.IntermediateActivities.ActivityPartition#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Partition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Partition</em>' reference list.
	 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getActivityNode_InPartition()
	 * @see Activities.IntermediateActivities.ActivityPartition#getNode
	 * @model opposite="node"
	 * @generated
	 */
	EList<ActivityPartition> getInPartition();

	/**
	 * Returns the value of the '<em><b>In Interruptible Region</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Activities.IntermediateActivities.InterruptibleActivityRegion#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Interruptible Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Interruptible Region</em>' reference.
	 * @see #setInInterruptibleRegion(InterruptibleActivityRegion)
	 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getActivityNode_InInterruptibleRegion()
	 * @see Activities.IntermediateActivities.InterruptibleActivityRegion#getNode
	 * @model opposite="node"
	 * @generated
	 */
	InterruptibleActivityRegion getInInterruptibleRegion();

	/**
	 * Sets the value of the '{@link Activities.FundamentalActivities.ActivityNode#getInInterruptibleRegion <em>In Interruptible Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Interruptible Region</em>' reference.
	 * @see #getInInterruptibleRegion()
	 * @generated
	 */
	void setInInterruptibleRegion(InterruptibleActivityRegion value);

	/**
	 * Returns the value of the '<em><b>In Structured Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Activities.StructuredActivities.StructuredActivityNode#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Structured Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Structured Node</em>' container reference.
	 * @see #setInStructuredNode(StructuredActivityNode)
	 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getActivityNode_InStructuredNode()
	 * @see Activities.StructuredActivities.StructuredActivityNode#getNode
	 * @model opposite="node" transient="false"
	 * @generated
	 */
	StructuredActivityNode getInStructuredNode();

	/**
	 * Sets the value of the '{@link Activities.FundamentalActivities.ActivityNode#getInStructuredNode <em>In Structured Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Structured Node</em>' container reference.
	 * @see #getInStructuredNode()
	 * @generated
	 */
	void setInStructuredNode(StructuredActivityNode value);

} // ActivityNode
