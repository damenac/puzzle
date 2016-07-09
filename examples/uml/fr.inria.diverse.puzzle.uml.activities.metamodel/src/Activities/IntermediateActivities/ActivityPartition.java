/**
 */
package Activities.IntermediateActivities;

import Activities.BasicActivities.ActivityEdge;

import Activities.FundamentalActivities.ActivityGroup;
import Activities.FundamentalActivities.ActivityNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Activities.IntermediateActivities.ActivityPartition#getEdge <em>Edge</em>}</li>
 *   <li>{@link Activities.IntermediateActivities.ActivityPartition#getSubpartition <em>Subpartition</em>}</li>
 *   <li>{@link Activities.IntermediateActivities.ActivityPartition#getSuperPartition <em>Super Partition</em>}</li>
 *   <li>{@link Activities.IntermediateActivities.ActivityPartition#getRepresents <em>Represents</em>}</li>
 *   <li>{@link Activities.IntermediateActivities.ActivityPartition#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivityPartition()
 * @model
 * @generated
 */
public interface ActivityPartition extends ActivityGroup {
	/**
	 * Returns the value of the '<em><b>Edge</b></em>' reference list.
	 * The list contents are of type {@link Activities.BasicActivities.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link Activities.BasicActivities.ActivityEdge#getInPartition <em>In Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge</em>' reference list.
	 * @see Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivityPartition_Edge()
	 * @see Activities.BasicActivities.ActivityEdge#getInPartition
	 * @model opposite="inPartition"
	 * @generated
	 */
	EList<ActivityEdge> getEdge();

	/**
	 * Returns the value of the '<em><b>Subpartition</b></em>' containment reference list.
	 * The list contents are of type {@link Activities.IntermediateActivities.ActivityPartition}.
	 * It is bidirectional and its opposite is '{@link Activities.IntermediateActivities.ActivityPartition#getSuperPartition <em>Super Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subpartition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subpartition</em>' containment reference list.
	 * @see Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivityPartition_Subpartition()
	 * @see Activities.IntermediateActivities.ActivityPartition#getSuperPartition
	 * @model opposite="superPartition" containment="true"
	 * @generated
	 */
	EList<ActivityPartition> getSubpartition();

	/**
	 * Returns the value of the '<em><b>Super Partition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Activities.IntermediateActivities.ActivityPartition#getSubpartition <em>Subpartition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Partition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Partition</em>' container reference.
	 * @see #setSuperPartition(ActivityPartition)
	 * @see Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivityPartition_SuperPartition()
	 * @see Activities.IntermediateActivities.ActivityPartition#getSubpartition
	 * @model opposite="subpartition" transient="false"
	 * @generated
	 */
	ActivityPartition getSuperPartition();

	/**
	 * Sets the value of the '{@link Activities.IntermediateActivities.ActivityPartition#getSuperPartition <em>Super Partition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Partition</em>' container reference.
	 * @see #getSuperPartition()
	 * @generated
	 */
	void setSuperPartition(ActivityPartition value);

	/**
	 * Returns the value of the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represents</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represents</em>' reference.
	 * @see #setRepresents(Element)
	 * @see Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivityPartition_Represents()
	 * @model
	 * @generated
	 */
	Element getRepresents();

	/**
	 * Sets the value of the '{@link Activities.IntermediateActivities.ActivityPartition#getRepresents <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents</em>' reference.
	 * @see #getRepresents()
	 * @generated
	 */
	void setRepresents(Element value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference list.
	 * The list contents are of type {@link Activities.FundamentalActivities.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link Activities.FundamentalActivities.ActivityNode#getInPartition <em>In Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference list.
	 * @see Activities.IntermediateActivities.IntermediateActivitiesPackage#getActivityPartition_Node()
	 * @see Activities.FundamentalActivities.ActivityNode#getInPartition
	 * @model opposite="inPartition"
	 * @generated
	 */
	EList<ActivityNode> getNode();

} // ActivityPartition
