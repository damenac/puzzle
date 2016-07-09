/**
 */
package Activities.FundamentalActivities;

import Activities.IntermediateActivities.ParameterSet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Activities.FundamentalActivities.Behavior#getOwnedParameterSet <em>Owned Parameter Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getBehavior()
 * @model abstract="true"
 * @generated
 */
public interface Behavior extends Activities.IntermediateActivities.Class {
	/**
	 * Returns the value of the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * The list contents are of type {@link Activities.IntermediateActivities.ParameterSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameter Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameter Set</em>' containment reference list.
	 * @see Activities.FundamentalActivities.FundamentalActivitiesPackage#getBehavior_OwnedParameterSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterSet> getOwnedParameterSet();

} // Behavior
