/**
 */
package Activities.ExtraStructuredActivities;

import Activities.BasicActivities.ObjectNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Activities.ExtraStructuredActivities.ExpansionNode#getRegionAsInput <em>Region As Input</em>}</li>
 *   <li>{@link Activities.ExtraStructuredActivities.ExpansionNode#getRegionAsOutput <em>Region As Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see Activities.ExtraStructuredActivities.ExtraStructuredActivitiesPackage#getExpansionNode()
 * @model
 * @generated
 */
public interface ExpansionNode extends ObjectNode {
	/**
	 * Returns the value of the '<em><b>Region As Input</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Activities.ExtraStructuredActivities.ExpansionRegion#getInputElement <em>Input Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region As Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region As Input</em>' reference.
	 * @see #setRegionAsInput(ExpansionRegion)
	 * @see Activities.ExtraStructuredActivities.ExtraStructuredActivitiesPackage#getExpansionNode_RegionAsInput()
	 * @see Activities.ExtraStructuredActivities.ExpansionRegion#getInputElement
	 * @model opposite="inputElement"
	 * @generated
	 */
	ExpansionRegion getRegionAsInput();

	/**
	 * Sets the value of the '{@link Activities.ExtraStructuredActivities.ExpansionNode#getRegionAsInput <em>Region As Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region As Input</em>' reference.
	 * @see #getRegionAsInput()
	 * @generated
	 */
	void setRegionAsInput(ExpansionRegion value);

	/**
	 * Returns the value of the '<em><b>Region As Output</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Activities.ExtraStructuredActivities.ExpansionRegion#getOutputElement <em>Output Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region As Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region As Output</em>' reference.
	 * @see #setRegionAsOutput(ExpansionRegion)
	 * @see Activities.ExtraStructuredActivities.ExtraStructuredActivitiesPackage#getExpansionNode_RegionAsOutput()
	 * @see Activities.ExtraStructuredActivities.ExpansionRegion#getOutputElement
	 * @model opposite="outputElement"
	 * @generated
	 */
	ExpansionRegion getRegionAsOutput();

	/**
	 * Sets the value of the '{@link Activities.ExtraStructuredActivities.ExpansionNode#getRegionAsOutput <em>Region As Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region As Output</em>' reference.
	 * @see #getRegionAsOutput()
	 * @generated
	 */
	void setRegionAsOutput(ExpansionRegion value);

} // ExpansionNode
