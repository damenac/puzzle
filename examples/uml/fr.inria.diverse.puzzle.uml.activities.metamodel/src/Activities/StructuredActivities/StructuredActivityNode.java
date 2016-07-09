/**
 */
package Activities.StructuredActivities;

import Activities.BasicActivities.ActivityEdge;

import Activities.CompleteStructuredActivities.InputPin;

import Activities.FundamentalActivities.Action;
import Activities.FundamentalActivities.Activity;
import Activities.FundamentalActivities.ActivityGroup;
import Activities.FundamentalActivities.ActivityNode;
import Activities.FundamentalActivities.Namespace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Activities.StructuredActivities.StructuredActivityNode#getActivity <em>Activity</em>}</li>
 *   <li>{@link Activities.StructuredActivities.StructuredActivityNode#getVariable <em>Variable</em>}</li>
 *   <li>{@link Activities.StructuredActivities.StructuredActivityNode#getNode <em>Node</em>}</li>
 *   <li>{@link Activities.StructuredActivities.StructuredActivityNode#getStructuredNodeInput <em>Structured Node Input</em>}</li>
 *   <li>{@link Activities.StructuredActivities.StructuredActivityNode#getEdge <em>Edge</em>}</li>
 *   <li>{@link Activities.StructuredActivities.StructuredActivityNode#isMustIsolate <em>Must Isolate</em>}</li>
 *   <li>{@link Activities.StructuredActivities.StructuredActivityNode#getStructuredNodeOutput <em>Structured Node Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see Activities.StructuredActivities.StructuredActivitiesPackage#getStructuredActivityNode()
 * @model
 * @generated
 */
public interface StructuredActivityNode extends Namespace, ExecutableNode, ActivityGroup, Action {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Activities.FundamentalActivities.Activity#getStructuredNode <em>Structured Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' container reference.
	 * @see #setActivity(Activity)
	 * @see Activities.StructuredActivities.StructuredActivitiesPackage#getStructuredActivityNode_Activity()
	 * @see Activities.FundamentalActivities.Activity#getStructuredNode
	 * @model opposite="structuredNode" transient="false"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link Activities.StructuredActivities.StructuredActivityNode#getActivity <em>Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' container reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

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
	 * @see Activities.StructuredActivities.StructuredActivitiesPackage#getStructuredActivityNode_Variable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariable();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link Activities.FundamentalActivities.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link Activities.FundamentalActivities.ActivityNode#getInStructuredNode <em>In Structured Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see Activities.StructuredActivities.StructuredActivitiesPackage#getStructuredActivityNode_Node()
	 * @see Activities.FundamentalActivities.ActivityNode#getInStructuredNode
	 * @model opposite="inStructuredNode" containment="true"
	 * @generated
	 */
	EList<ActivityNode> getNode();

	/**
	 * Returns the value of the '<em><b>Structured Node Input</b></em>' containment reference list.
	 * The list contents are of type {@link Activities.CompleteStructuredActivities.InputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured Node Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured Node Input</em>' containment reference list.
	 * @see Activities.StructuredActivities.StructuredActivitiesPackage#getStructuredActivityNode_StructuredNodeInput()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputPin> getStructuredNodeInput();

	/**
	 * Returns the value of the '<em><b>Edge</b></em>' containment reference list.
	 * The list contents are of type {@link Activities.BasicActivities.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link Activities.BasicActivities.ActivityEdge#getInStructuredNode <em>In Structured Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge</em>' containment reference list.
	 * @see Activities.StructuredActivities.StructuredActivitiesPackage#getStructuredActivityNode_Edge()
	 * @see Activities.BasicActivities.ActivityEdge#getInStructuredNode
	 * @model opposite="inStructuredNode" containment="true"
	 * @generated
	 */
	EList<ActivityEdge> getEdge();

	/**
	 * Returns the value of the '<em><b>Must Isolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Must Isolate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Isolate</em>' attribute.
	 * @see #setMustIsolate(boolean)
	 * @see Activities.StructuredActivities.StructuredActivitiesPackage#getStructuredActivityNode_MustIsolate()
	 * @model
	 * @generated
	 */
	boolean isMustIsolate();

	/**
	 * Sets the value of the '{@link Activities.StructuredActivities.StructuredActivityNode#isMustIsolate <em>Must Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Isolate</em>' attribute.
	 * @see #isMustIsolate()
	 * @generated
	 */
	void setMustIsolate(boolean value);

	/**
	 * Returns the value of the '<em><b>Structured Node Output</b></em>' containment reference list.
	 * The list contents are of type {@link Activities.StructuredActivities.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured Node Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured Node Output</em>' containment reference list.
	 * @see Activities.StructuredActivities.StructuredActivitiesPackage#getStructuredActivityNode_StructuredNodeOutput()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputPin> getStructuredNodeOutput();

} // StructuredActivityNode
