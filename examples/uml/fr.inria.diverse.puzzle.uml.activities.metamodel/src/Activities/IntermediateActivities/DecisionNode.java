/**
 */
package Activities.IntermediateActivities;

import Activities.BasicActivities.ControlNode;
import Activities.BasicActivities.ObjectFlow;

import Activities.FundamentalActivities.Behavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Activities.IntermediateActivities.DecisionNode#getDecisionInputFlow <em>Decision Input Flow</em>}</li>
 *   <li>{@link Activities.IntermediateActivities.DecisionNode#getDecisionInput <em>Decision Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see Activities.IntermediateActivities.IntermediateActivitiesPackage#getDecisionNode()
 * @model
 * @generated
 */
public interface DecisionNode extends ControlNode {
	/**
	 * Returns the value of the '<em><b>Decision Input Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision Input Flow</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Input Flow</em>' reference.
	 * @see #setDecisionInputFlow(ObjectFlow)
	 * @see Activities.IntermediateActivities.IntermediateActivitiesPackage#getDecisionNode_DecisionInputFlow()
	 * @model
	 * @generated
	 */
	ObjectFlow getDecisionInputFlow();

	/**
	 * Sets the value of the '{@link Activities.IntermediateActivities.DecisionNode#getDecisionInputFlow <em>Decision Input Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Input Flow</em>' reference.
	 * @see #getDecisionInputFlow()
	 * @generated
	 */
	void setDecisionInputFlow(ObjectFlow value);

	/**
	 * Returns the value of the '<em><b>Decision Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Input</em>' reference.
	 * @see #setDecisionInput(Behavior)
	 * @see Activities.IntermediateActivities.IntermediateActivitiesPackage#getDecisionNode_DecisionInput()
	 * @model
	 * @generated
	 */
	Behavior getDecisionInput();

	/**
	 * Sets the value of the '{@link Activities.IntermediateActivities.DecisionNode#getDecisionInput <em>Decision Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Input</em>' reference.
	 * @see #getDecisionInput()
	 * @generated
	 */
	void setDecisionInput(Behavior value);

} // DecisionNode
