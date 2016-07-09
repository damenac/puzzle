/**
 */
package Activities.BasicActivities;

import Activities.FundamentalActivities.ActivityGroup;
import Activities.FundamentalActivities.ActivityNode;

import Activities.IntermediateActivities.ActivityPartition;
import Activities.IntermediateActivities.InterruptibleActivityRegion;
import Activities.IntermediateActivities.ValueSpecification;

import Activities.StructuredActivities.StructuredActivityNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Activities.BasicActivities.ActivityEdge#getTarget <em>Target</em>}</li>
 *   <li>{@link Activities.BasicActivities.ActivityEdge#getSource <em>Source</em>}</li>
 *   <li>{@link Activities.BasicActivities.ActivityEdge#getRedefinedEdge <em>Redefined Edge</em>}</li>
 *   <li>{@link Activities.BasicActivities.ActivityEdge#getInGroup <em>In Group</em>}</li>
 *   <li>{@link Activities.BasicActivities.ActivityEdge#getGuard <em>Guard</em>}</li>
 *   <li>{@link Activities.BasicActivities.ActivityEdge#getInPartition <em>In Partition</em>}</li>
 *   <li>{@link Activities.BasicActivities.ActivityEdge#getWeight <em>Weight</em>}</li>
 *   <li>{@link Activities.BasicActivities.ActivityEdge#getInterrupts <em>Interrupts</em>}</li>
 *   <li>{@link Activities.BasicActivities.ActivityEdge#getInStructuredNode <em>In Structured Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see Activities.BasicActivities.BasicActivitiesPackage#getActivityEdge()
 * @model abstract="true"
 * @generated
 */
public interface ActivityEdge extends RedefinableElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Activities.FundamentalActivities.ActivityNode#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ActivityNode)
	 * @see Activities.BasicActivities.BasicActivitiesPackage#getActivityEdge_Target()
	 * @see Activities.FundamentalActivities.ActivityNode#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	ActivityNode getTarget();

	/**
	 * Sets the value of the '{@link Activities.BasicActivities.ActivityEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ActivityNode value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Activities.FundamentalActivities.ActivityNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ActivityNode)
	 * @see Activities.BasicActivities.BasicActivitiesPackage#getActivityEdge_Source()
	 * @see Activities.FundamentalActivities.ActivityNode#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	ActivityNode getSource();

	/**
	 * Sets the value of the '{@link Activities.BasicActivities.ActivityEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ActivityNode value);

	/**
	 * Returns the value of the '<em><b>Redefined Edge</b></em>' reference list.
	 * The list contents are of type {@link Activities.BasicActivities.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Edge</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Edge</em>' reference list.
	 * @see Activities.BasicActivities.BasicActivitiesPackage#getActivityEdge_RedefinedEdge()
	 * @model
	 * @generated
	 */
	EList<ActivityEdge> getRedefinedEdge();

	/**
	 * Returns the value of the '<em><b>In Group</b></em>' reference list.
	 * The list contents are of type {@link Activities.FundamentalActivities.ActivityGroup}.
	 * It is bidirectional and its opposite is '{@link Activities.FundamentalActivities.ActivityGroup#getContainedEdge <em>Contained Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Group</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Group</em>' reference list.
	 * @see Activities.BasicActivities.BasicActivitiesPackage#getActivityEdge_InGroup()
	 * @see Activities.FundamentalActivities.ActivityGroup#getContainedEdge
	 * @model opposite="containedEdge"
	 * @generated
	 */
	EList<ActivityGroup> getInGroup();

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(ValueSpecification)
	 * @see Activities.BasicActivities.BasicActivitiesPackage#getActivityEdge_Guard()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueSpecification getGuard();

	/**
	 * Sets the value of the '{@link Activities.BasicActivities.ActivityEdge#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>In Partition</b></em>' reference list.
	 * The list contents are of type {@link Activities.IntermediateActivities.ActivityPartition}.
	 * It is bidirectional and its opposite is '{@link Activities.IntermediateActivities.ActivityPartition#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Partition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Partition</em>' reference list.
	 * @see Activities.BasicActivities.BasicActivitiesPackage#getActivityEdge_InPartition()
	 * @see Activities.IntermediateActivities.ActivityPartition#getEdge
	 * @model opposite="edge"
	 * @generated
	 */
	EList<ActivityPartition> getInPartition();

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' containment reference.
	 * @see #setWeight(ValueSpecification)
	 * @see Activities.BasicActivities.BasicActivitiesPackage#getActivityEdge_Weight()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueSpecification getWeight();

	/**
	 * Sets the value of the '{@link Activities.BasicActivities.ActivityEdge#getWeight <em>Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' containment reference.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Interrupts</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Activities.IntermediateActivities.InterruptibleActivityRegion#getInterruptingEdge <em>Interrupting Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interrupts</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interrupts</em>' reference.
	 * @see #setInterrupts(InterruptibleActivityRegion)
	 * @see Activities.BasicActivities.BasicActivitiesPackage#getActivityEdge_Interrupts()
	 * @see Activities.IntermediateActivities.InterruptibleActivityRegion#getInterruptingEdge
	 * @model opposite="interruptingEdge"
	 * @generated
	 */
	InterruptibleActivityRegion getInterrupts();

	/**
	 * Sets the value of the '{@link Activities.BasicActivities.ActivityEdge#getInterrupts <em>Interrupts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interrupts</em>' reference.
	 * @see #getInterrupts()
	 * @generated
	 */
	void setInterrupts(InterruptibleActivityRegion value);

	/**
	 * Returns the value of the '<em><b>In Structured Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Activities.StructuredActivities.StructuredActivityNode#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Structured Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Structured Node</em>' container reference.
	 * @see #setInStructuredNode(StructuredActivityNode)
	 * @see Activities.BasicActivities.BasicActivitiesPackage#getActivityEdge_InStructuredNode()
	 * @see Activities.StructuredActivities.StructuredActivityNode#getEdge
	 * @model opposite="edge" transient="false"
	 * @generated
	 */
	StructuredActivityNode getInStructuredNode();

	/**
	 * Sets the value of the '{@link Activities.BasicActivities.ActivityEdge#getInStructuredNode <em>In Structured Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Structured Node</em>' container reference.
	 * @see #getInStructuredNode()
	 * @generated
	 */
	void setInStructuredNode(StructuredActivityNode value);

} // ActivityEdge
