/**
 */
package Activities.FundamentalActivities;

import Activities.BasicActivities.ActivityEdge;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Activities.FundamentalActivities.ActivityGroup#getSubgroup <em>Subgroup</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.ActivityGroup#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.ActivityGroup#getInActivity <em>In Activity</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.ActivityGroup#getContainedNode <em>Contained Node</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.ActivityGroup#getContainedEdge <em>Contained Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getActivityGroup()
 * @model abstract="true"
 * @generated
 */
public interface ActivityGroup extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Subgroup</b></em>' containment reference list.
	 * The list contents are of type {@link Activities.FundamentalActivities.ActivityGroup}.
	 * It is bidirectional and its opposite is '{@link Activities.FundamentalActivities.ActivityGroup#getSuperGroup <em>Super Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subgroup</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subgroup</em>' containment reference list.
	 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getActivityGroup_Subgroup()
	 * @see Activities.FundamentalActivities.ActivityGroup#getSuperGroup
	 * @model opposite="superGroup" containment="true"
	 * @generated
	 */
	EList<ActivityGroup> getSubgroup();

	/**
	 * Returns the value of the '<em><b>Super Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Activities.FundamentalActivities.ActivityGroup#getSubgroup <em>Subgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Group</em>' container reference.
	 * @see #setSuperGroup(ActivityGroup)
	 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getActivityGroup_SuperGroup()
	 * @see Activities.FundamentalActivities.ActivityGroup#getSubgroup
	 * @model opposite="subgroup" transient="false"
	 * @generated
	 */
	ActivityGroup getSuperGroup();

	/**
	 * Sets the value of the '{@link Activities.FundamentalActivities.ActivityGroup#getSuperGroup <em>Super Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Group</em>' container reference.
	 * @see #getSuperGroup()
	 * @generated
	 */
	void setSuperGroup(ActivityGroup value);

	/**
	 * Returns the value of the '<em><b>In Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Activities.FundamentalActivities.Activity#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Activity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Activity</em>' container reference.
	 * @see #setInActivity(Activity)
	 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getActivityGroup_InActivity()
	 * @see Activities.FundamentalActivities.Activity#getGroup
	 * @model opposite="group" transient="false"
	 * @generated
	 */
	Activity getInActivity();

	/**
	 * Sets the value of the '{@link Activities.FundamentalActivities.ActivityGroup#getInActivity <em>In Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Activity</em>' container reference.
	 * @see #getInActivity()
	 * @generated
	 */
	void setInActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Contained Node</b></em>' reference list.
	 * The list contents are of type {@link Activities.FundamentalActivities.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link Activities.FundamentalActivities.ActivityNode#getInGroup <em>In Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Node</em>' reference list.
	 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getActivityGroup_ContainedNode()
	 * @see Activities.FundamentalActivities.ActivityNode#getInGroup
	 * @model opposite="inGroup"
	 * @generated
	 */
	EList<ActivityNode> getContainedNode();

	/**
	 * Returns the value of the '<em><b>Contained Edge</b></em>' reference list.
	 * The list contents are of type {@link Activities.BasicActivities.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link Activities.BasicActivities.ActivityEdge#getInGroup <em>In Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Edge</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Edge</em>' reference list.
	 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getActivityGroup_ContainedEdge()
	 * @see Activities.BasicActivities.ActivityEdge#getInGroup
	 * @model opposite="inGroup"
	 * @generated
	 */
	EList<ActivityEdge> getContainedEdge();

} // ActivityGroup
