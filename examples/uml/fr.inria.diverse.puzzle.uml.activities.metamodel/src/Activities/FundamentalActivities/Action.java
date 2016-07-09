/**
 */
package Activities.FundamentalActivities;

import Activities.CompleteStructuredActivities.InputPin;

import Activities.IntermediateActivities.Constraint;

import Activities.StructuredActivities.OutputPin;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Activities.FundamentalActivities.Action#isIsLocallyReentrant <em>Is Locally Reentrant</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.Action#getLocalPrecondition <em>Local Precondition</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.Action#getLocalPostcondition <em>Local Postcondition</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.Action#getInput <em>Input</em>}</li>
 *   <li>{@link Activities.FundamentalActivities.Action#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends ActivityNode {
	/**
	 * Returns the value of the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Locally Reentrant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Locally Reentrant</em>' attribute.
	 * @see #setIsLocallyReentrant(boolean)
	 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getAction_IsLocallyReentrant()
	 * @model
	 * @generated
	 */
	boolean isIsLocallyReentrant();

	/**
	 * Sets the value of the '{@link Activities.FundamentalActivities.Action#isIsLocallyReentrant <em>Is Locally Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Locally Reentrant</em>' attribute.
	 * @see #isIsLocallyReentrant()
	 * @generated
	 */
	void setIsLocallyReentrant(boolean value);

	/**
	 * Returns the value of the '<em><b>Local Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link Activities.IntermediateActivities.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Precondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Precondition</em>' containment reference list.
	 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getAction_LocalPrecondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getLocalPrecondition();

	/**
	 * Returns the value of the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * The list contents are of type {@link Activities.IntermediateActivities.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Postcondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Postcondition</em>' containment reference list.
	 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getAction_LocalPostcondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getLocalPostcondition();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link Activities.CompleteStructuredActivities.InputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getAction_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputPin> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link Activities.StructuredActivities.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getAction_Output()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputPin> getOutput();

} // Action
