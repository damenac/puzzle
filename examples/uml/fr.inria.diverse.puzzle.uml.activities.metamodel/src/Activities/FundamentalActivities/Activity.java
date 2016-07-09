/**
 */
package Activities.FundamentalActivities;

import Activities.BasicActivities.ActivityEdge;

import Activities.IntermediateActivities.ActivityPartition;

import Activities.StructuredActivities.StructuredActivityNode;
import Activities.StructuredActivities.Variable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Activities.FundamentalActivities.Activity#getNode <em>Node</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.Activity#getGroup <em>Group</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.Activity#getEdge <em>Edge</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.Activity#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.Activity#getPartition <em>Partition</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.Activity#isIsSingleExecution <em>Is Single Execution</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.Activity#getStructuredNode <em>Structured Node</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.Activity#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends Behavior {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link Activities.FundamentalActivities.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getActivity_Node()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityNode> getNode();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link Activities.FundamentalActivities.ActivityGroup}.
	 * It is bidirectional and its opposite is '{@link Activities.FundamentalActivities.ActivityGroup#getInActivity <em>In Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getActivity_Group()
	 * @see Activities.FundamentalActivities.ActivityGroup#getInActivity
	 * @model opposite="inActivity" containment="true"
	 * @generated
	 */
	EList<ActivityGroup> getGroup();

	/**
	 * Returns the value of the '<em><b>Edge</b></em>' containment reference list.
	 * The list contents are of type {@link Activities.BasicActivities.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge</em>' containment reference list.
	 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getActivity_Edge()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityEdge> getEdge();

	/**
	 * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #setIsReadOnly(boolean)
	 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getActivity_IsReadOnly()
	 * @model
	 * @generated
	 */
	boolean isIsReadOnly();

	/**
	 * Sets the value of the '{@link Activities.FundamentalActivities.Activity#isIsReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #isIsReadOnly()
	 * @generated
	 */
	void setIsReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Partition</b></em>' reference list.
	 * The list contents are of type {@link Activities.IntermediateActivities.ActivityPartition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition</em>' reference list.
	 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getActivity_Partition()
	 * @model
	 * @generated
	 */
	EList<ActivityPartition> getPartition();

	/**
	 * Returns the value of the '<em><b>Is Single Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Single Execution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Single Execution</em>' attribute.
	 * @see #setIsSingleExecution(boolean)
	 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getActivity_IsSingleExecution()
	 * @model
	 * @generated
	 */
	boolean isIsSingleExecution();

	/**
	 * Sets the value of the '{@link Activities.FundamentalActivities.Activity#isIsSingleExecution <em>Is Single Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Single Execution</em>' attribute.
	 * @see #isIsSingleExecution()
	 * @generated
	 */
	void setIsSingleExecution(boolean value);

	/**
	 * Returns the value of the '<em><b>Structured Node</b></em>' containment reference list.
	 * The list contents are of type {@link Activities.StructuredActivities.StructuredActivityNode}.
	 * It is bidirectional and its opposite is '{@link Activities.StructuredActivities.StructuredActivityNode#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured Node</em>' containment reference list.
	 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getActivity_StructuredNode()
	 * @see Activities.StructuredActivities.StructuredActivityNode#getActivity
	 * @model opposite="activity" containment="true"
	 * @generated
	 */
	EList<StructuredActivityNode> getStructuredNode();

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link Activities.StructuredActivities.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getActivity_Variable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariable();

} // Activity
