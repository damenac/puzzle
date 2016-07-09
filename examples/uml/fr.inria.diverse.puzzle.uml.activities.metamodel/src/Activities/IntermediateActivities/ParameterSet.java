/**
 */
package Activities.IntermediateActivities;

import Activities.BasicActivities.Parameter;

import Activities.FundamentalActivities.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Activities.IntermediateActivities.ParameterSet#getParameter <em>Parameter</em>}</li>
 *   <li>{@link Activities.IntermediateActivities.ParameterSet#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see Activities.IntermediateActivities.IntermediateActivitiesPackage#getParameterSet()
 * @model
 * @generated
 */
public interface ParameterSet extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference list.
	 * The list contents are of type {@link Activities.BasicActivities.Parameter}.
	 * It is bidirectional and its opposite is '{@link Activities.BasicActivities.Parameter#getParameterSet <em>Parameter Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference list.
	 * @see Activities.IntermediateActivities.IntermediateActivitiesPackage#getParameterSet_Parameter()
	 * @see Activities.BasicActivities.Parameter#getParameterSet
	 * @model opposite="parameterSet" required="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link Activities.IntermediateActivities.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see Activities.IntermediateActivities.IntermediateActivitiesPackage#getParameterSet_Condition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getCondition();

} // ParameterSet
