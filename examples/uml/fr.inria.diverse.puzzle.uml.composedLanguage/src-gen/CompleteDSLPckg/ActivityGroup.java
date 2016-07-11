/**
 */
package CompleteDSLPckg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompleteDSLPckg.ActivityGroup#getSubgroup <em>Subgroup</em>}</li>
 *   <li>{@link CompleteDSLPckg.ActivityGroup#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link CompleteDSLPckg.ActivityGroup#getInActivity <em>In Activity</em>}</li>
 *   <li>{@link CompleteDSLPckg.ActivityGroup#getContainedNode <em>Contained Node</em>}</li>
 *   <li>{@link CompleteDSLPckg.ActivityGroup#getContainedEdge <em>Contained Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getActivityGroup()
 * @model abstract="true"
 * @generated
 */
public interface ActivityGroup extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Subgroup</b></em>' containment reference list.
	 * The list contents are of type {@link CompleteDSLPckg.ActivityGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subgroup</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subgroup</em>' containment reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getActivityGroup_Subgroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityGroup> getSubgroup();

	/**
	 * Returns the value of the '<em><b>Super Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Group</em>' reference.
	 * @see #setSuperGroup(ActivityGroup)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getActivityGroup_SuperGroup()
	 * @model
	 * @generated
	 */
	ActivityGroup getSuperGroup();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.ActivityGroup#getSuperGroup <em>Super Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Group</em>' reference.
	 * @see #getSuperGroup()
	 * @generated
	 */
	void setSuperGroup(ActivityGroup value);

	/**
	 * Returns the value of the '<em><b>In Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Activity</em>' reference.
	 * @see #setInActivity(Activity)
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getActivityGroup_InActivity()
	 * @model
	 * @generated
	 */
	Activity getInActivity();

	/**
	 * Sets the value of the '{@link CompleteDSLPckg.ActivityGroup#getInActivity <em>In Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Activity</em>' reference.
	 * @see #getInActivity()
	 * @generated
	 */
	void setInActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Contained Node</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Node</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getActivityGroup_ContainedNode()
	 * @model
	 * @generated
	 */
	EList<ActivityNode> getContainedNode();

	/**
	 * Returns the value of the '<em><b>Contained Edge</b></em>' reference list.
	 * The list contents are of type {@link CompleteDSLPckg.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Edge</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Edge</em>' reference list.
	 * @see CompleteDSLPckg.CompleteDSLPckgPackage#getActivityGroup_ContainedEdge()
	 * @model
	 * @generated
	 */
	EList<ActivityEdge> getContainedEdge();

} // ActivityGroup
