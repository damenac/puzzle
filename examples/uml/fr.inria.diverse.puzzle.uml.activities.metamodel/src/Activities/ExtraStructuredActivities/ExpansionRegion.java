/**
 */
package Activities.ExtraStructuredActivities;

import Activities.StructuredActivities.StructuredActivityNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Activities.ExtraStructuredActivities.ExpansionRegion#getMode <em>Mode</em>}</li>
 *   <li>{@link Activities.ExtraStructuredActivities.ExpansionRegion#getInputElement <em>Input Element</em>}</li>
 *   <li>{@link Activities.ExtraStructuredActivities.ExpansionRegion#getOutputElement <em>Output Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see Activities.ExtraStructuredActivities.ExtraStructuredActivitiesPackage#getExpansionRegion()
 * @model
 * @generated
 */
public interface ExpansionRegion extends StructuredActivityNode {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link Activities.ExtraStructuredActivities.ExpansionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see Activities.ExtraStructuredActivities.ExpansionKind
	 * @see #setMode(ExpansionKind)
	 * @see Activities.ExtraStructuredActivities.ExtraStructuredActivitiesPackage#getExpansionRegion_Mode()
	 * @model
	 * @generated
	 */
	ExpansionKind getMode();

	/**
	 * Sets the value of the '{@link Activities.ExtraStructuredActivities.ExpansionRegion#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see Activities.ExtraStructuredActivities.ExpansionKind
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ExpansionKind value);

	/**
	 * Returns the value of the '<em><b>Input Element</b></em>' reference list.
	 * The list contents are of type {@link Activities.ExtraStructuredActivities.ExpansionNode}.
	 * It is bidirectional and its opposite is '{@link Activities.ExtraStructuredActivities.ExpansionNode#getRegionAsInput <em>Region As Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Element</em>' reference list.
	 * @see Activities.ExtraStructuredActivities.ExtraStructuredActivitiesPackage#getExpansionRegion_InputElement()
	 * @see Activities.ExtraStructuredActivities.ExpansionNode#getRegionAsInput
	 * @model opposite="regionAsInput" required="true"
	 * @generated
	 */
	EList<ExpansionNode> getInputElement();

	/**
	 * Returns the value of the '<em><b>Output Element</b></em>' reference list.
	 * The list contents are of type {@link Activities.ExtraStructuredActivities.ExpansionNode}.
	 * It is bidirectional and its opposite is '{@link Activities.ExtraStructuredActivities.ExpansionNode#getRegionAsOutput <em>Region As Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Element</em>' reference list.
	 * @see Activities.ExtraStructuredActivities.ExtraStructuredActivitiesPackage#getExpansionRegion_OutputElement()
	 * @see Activities.ExtraStructuredActivities.ExpansionNode#getRegionAsOutput
	 * @model opposite="regionAsOutput"
	 * @generated
	 */
	EList<ExpansionNode> getOutputElement();

} // ExpansionRegion
