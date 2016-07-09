/**
 */
package Activities.IntermediateActivities;

import Activities.BasicActivities.ActivityEdge;

import Activities.FundamentalActivities.ActivityGroup;
import Activities.FundamentalActivities.ActivityNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interruptible Activity Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Activities.IntermediateActivities.InterruptibleActivityRegion#getInterruptingEdge <em>Interrupting Edge</em>}</li>
 *   <li>{@link Activities.IntermediateActivities.InterruptibleActivityRegion#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see Activities.IntermediateActivities.IntermediateActivitiesPackage#getInterruptibleActivityRegion()
 * @model
 * @generated
 */
public interface InterruptibleActivityRegion extends ActivityGroup {
	/**
	 * Returns the value of the '<em><b>Interrupting Edge</b></em>' reference list.
	 * The list contents are of type {@link Activities.BasicActivities.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link Activities.BasicActivities.ActivityEdge#getInterrupts <em>Interrupts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interrupting Edge</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interrupting Edge</em>' reference list.
	 * @see Activities.IntermediateActivities.IntermediateActivitiesPackage#getInterruptibleActivityRegion_InterruptingEdge()
	 * @see Activities.BasicActivities.ActivityEdge#getInterrupts
	 * @model opposite="interrupts"
	 * @generated
	 */
	EList<ActivityEdge> getInterruptingEdge();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference list.
	 * The list contents are of type {@link Activities.FundamentalActivities.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link Activities.FundamentalActivities.ActivityNode#getInInterruptibleRegion <em>In Interruptible Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference list.
	 * @see Activities.IntermediateActivities.IntermediateActivitiesPackage#getInterruptibleActivityRegion_Node()
	 * @see Activities.FundamentalActivities.ActivityNode#getInInterruptibleRegion
	 * @model opposite="inInterruptibleRegion"
	 * @generated
	 */
	EList<ActivityNode> getNode();

} // InterruptibleActivityRegion
